package EXAMPLES;

public class AgeValidation{
    public static boolean isValidAdult(String ageStr){
        try{
            int age=Integer.parseInt(ageStr);
            return age>=18;
        }catch(Exception e){
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isValidAdult("20"));
        System.out.println(isValidAdult("17"));
        System.out.println(isValidAdult("abc"));
    }
}