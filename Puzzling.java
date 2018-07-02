import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;


public class Puzzling {
    public void sumGreater(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum =0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if( arr[i]>10){
                newArr.add(arr[i]);
            }
        }
        System.out.println("Sum: "+sum+" Gt10: "+newArr);
    }
    public void shuffleGreater(ArrayList<String> arr){
        Collections.shuffle(arr);
        ArrayList<String> newArr = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
            if ((arr.get(i)).length()>5){
                newArr.add(arr.get(i));
            }
        }
        System.out.println(newArr);
    } 
    public void alphabet(){
        ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
        Collections.shuffle(arr);
        boolean check = false;
        for(Character i = 0; i<5; i++){
            if (arr.get(0) == vowels.get(i)){
                check = true;
            }
        }
        if (check){
            System.out.println("It's a vowel, Last: "+ arr.get(25));
        }
        else {
            System.out.println( "First: "+arr.get(0)+" Last: "+ arr.get(25));
        }

    }
    public void getRandoms(){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0; i<10; i++){
            newArr.add(r.nextInt(46)+55);
        }
        System.out.println(newArr);
    }
    public void getRandomSort(){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0; i<10; i++){
            newArr.add(r.nextInt(46)+55);
        }
        Collections.sort(newArr);

        System.out.println(newArr+ " Min: "+newArr.get(0)+" Max: "+newArr.get(9));
    }
    public void randomString(){
        ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        String newStr = "";
        Random r = new Random();
        for (int i=0; i<5; i++){
            newStr = newStr + arr.get(r.nextInt(26));
        }
        System.out.println(newStr);
    }
    public void randomStrings(){
        ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        ArrayList<String> newArr = new ArrayList<String>();
        String newStr = "";
        Random r = new Random();
        for (int i=0; i<10; i++){
            for (int j=0; j<5; j++){
                newStr = newStr + arr.get(r.nextInt(26));
            }
            newArr.add(newStr);
            newStr = "";
        }
        System.out.println(newArr);
    }
}