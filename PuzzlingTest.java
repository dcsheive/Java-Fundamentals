import java.util.ArrayList;
import java.util.Arrays;

public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling p = new Puzzling();
        // int[] arr = {3,5,1,2,7,9,8,13,25,32};
        // p.sumGreater(arr);
        ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        p.shuffleGreater(arr2);
        p.alphabet();
        p.getRandoms();
        p.getRandomSort();
        p.randomString();
        p.randomStrings();

    }
}