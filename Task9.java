// 9. Write a program that prompts the user to enter five integer values and reads them into an array. The program should consist of the following methods:
// a method named "max" that reads an array of integer values and returns the maximum value
// a method named "indexOfHighest" that returns the index of the highest element in an array of integers. If more than one such element exists, return the smallest index. 
//Invoke the above methods and demonstrate them in the program.
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        int[] myArray=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter the "+(i+1)+" number");
            myArray[i]=sc.nextInt();
        }
        System.out.println("The highest integer in the array is "+max(myArray));
        System.out.println("The index of highest element in array is "+indexofHighest(myArray));

        sc.close();


    }
    static int max(int[] myArray){
        int n=myArray[0];
        for(int i=0;i<5;i++){
            if(myArray[i]>n){
                n=myArray[i];
            }
        }
        return n;

    }
    static int indexofHighest(int[] myArray){
        int n=myArray[0];
        for(int i=0;i<5;i++){
            if(myArray[i]>myArray[n]){
                n=i;
            }
        }
        return n;

    }
}
