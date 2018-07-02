import java.util.ArrayList;
import java.util.Arrays;
public class Basics {
    public void print1To255() {
        for(int i = 1; i<256; i++){
            System.out.println(i);
        }
    }
    public void printOddTo255() {
        for(int i = 1; i<256; i=i+2){
            System.out.println(i);
        }
    }
    public void printSumTo255() {
        int sum = 0;
        for(int i = 0; i<256; i++){
            sum += i;
            System.out.println("Number: "+i+" Sum: "+sum);
        }
    }
    public void printArray(int[] theArray ){
        for (int i: theArray){
            System.out.println(i);
        }
    }
    public void printMax(int[] theArray ){
        int max = theArray[0];
        for (int i = 0; i < theArray.length; i++){
            if (max < theArray[i] ){
                max = theArray[i];
            }
        }
        System.out.println(max);
    }
    public void printAvg(int[] theArray){
        int sum = 0;
        for (int i = 0; i < theArray.length; i++){
            sum += theArray[i];
        }
        double avg = sum/theArray.length;
        System.out.println(avg);
    }
    public void arrayOfOdds(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i<256; i=i+2){
            arr.add(i);
        }
        System.out.println(arr);
    }
    public void greaterThanY(int[] arr, int y){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i: arr){
            if (i > y){
                newArr.add(i);
            }
        }
        System.out.println(newArr);
    }
    public void squareArr(int[]arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            newArr.add(arr[i] * arr[i]);
        }
        System.out.println(newArr);
    }
    public void removeNegatives(int[]arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>=0){
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }
    public void minMaxAvg(int[] arr){
        ArrayList<Object> newArr = new ArrayList<Object>();
        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max = arr[i];   
            }
            if (arr[i]<min){
                min = arr[i];
            }
            sum += arr[i];
        }
        double avg = sum/arr.length;
        newArr.add(min);
        newArr.add(max);
        newArr.add(avg);
        System.out.println(newArr);
    }
    public void shiftArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                arr[i] = 0;
            }
            else {
                arr[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}