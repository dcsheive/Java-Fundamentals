public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();
        String newStr = sm.trimAndConcat("   Apples   ","   Bananas   " );
        System.out.println(newStr);
        Integer newInt = sm.getIndexOrNull("Coding", 'o');
        System.out.println(newInt);
        newInt = sm.getIndexOrNull("Coding", 'a');
        System.out.println(newInt);
        newInt = sm.getIndexOrNull("Coding", "od");
        System.out.println(newInt);
        newInt = sm.getIndexOrNull("Coding", "da");
        System.out.println(newInt);
        String word = sm.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word);

    }
}