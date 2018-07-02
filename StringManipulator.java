public class StringManipulator {
    public String trimAndConcat(String str, String str2){
        String str3 = (str.trim() + str2.trim());
        return str3;
    }
    public Integer getIndexOrNull(String str, char i){
        Integer res = str.indexOf(i);
        if (res == -1){
            res = null;
        }
        return res;
    }
    public Integer getIndexOrNull(String str, String i){
        Integer res = str.indexOf(i);
        if (res == -1){
            res = null;
        }
        return res;
    }
    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String newStr = str1.substring(int1,int2) + str2;
        return newStr;
    }
}