import java.util.Scanner;

public class Random {

    public static void main(String [] args){
        Random random= new Random();
        random.even(30);
        random.upperCase();
    }

    public String  upperCase(){

        String letter = "bisi";

        String upperCase = letter.toUpperCase();

        System.out.println(upperCase);

        return upperCase;
    }

    public Boolean even(int number){

        if (number % 2 == 0){
            System.out.println("true");
        }

        return true;
    }

}
