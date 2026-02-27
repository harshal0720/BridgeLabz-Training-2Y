package EXAMPLES;

import java.util.Scanner;
public class CharacterCount{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        int letters=0,digits=0,special=0;
        for(char c:input.toCharArray()){
            if(Character.isLetter(c)) letters++;
            else if(Character.isDigit(c)) digits++;
            else if(Character.isWhitespace(c)){}
            else special++;
        }
        System.out.println("Total letters = "+letters);
        System.out.println("Total digits = "+digits);
        System.out.println("Total special characters = "+special);
    }
}