import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
            String s = "my.name.is.pl.nagaraju.text";
            System.out.println(reverseWords(s));
    }

    static String reverseWords(String str) {
        // code here
        String[] arr = str.split("\\.");
        String result = "";

        for(int i=arr.length-1; i>=0; i--) {
            result += arr[i];
            if(i!=0) result += '.';
        }


        return result;

    }
}