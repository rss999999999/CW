/*assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""))*/;

public class isogram {
    public static boolean  isIsogram(String str) {
           str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++){
                for (int j = i+1; j < str.length(); j++){
                    if (str.charAt(i) == str.charAt(j)){
                        return false;
                    }
                }
            }
            return true;
    }
}