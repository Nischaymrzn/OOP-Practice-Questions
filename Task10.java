// 10. Write a program that prompts the user to enter a sentence and reads it into a string. The program should consist of the following methods:
// a method named "countVowels" that reads a string and returns the number of vowels in the string
// a method named "countConsonants" that reads a string and returns the number of consonants in the string.
// Invoke the above methods and demonstrate them in the program.
import java.util.Scanner;
public class Task10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();

        System.out.println("The number of vowel in the Sentence is "+ countVowels(sentence));
        System.out.println("The number of consonant in the Sentence is "+ countConsonant(sentence));

        sc.close();


    }

    static int countVowels(String sentence){
        String lowerSentence=sentence.toLowerCase();
        int count=0;

        for(int i=0;i<lowerSentence.length();i++){
            char ch=lowerSentence.charAt(i);

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;

    }


    static int countConsonant(String sentence){
        String lowerSentence=sentence.toLowerCase();

        int count=0;

        for(int i=0;i<lowerSentence.length();i++){
            char ch=lowerSentence.charAt(i);

            if(Character.isLetter(ch) && !(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                count++;
            }
        }
        return count;

    }
}
