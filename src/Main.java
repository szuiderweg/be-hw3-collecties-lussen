import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Integer[] numeric = {0,1,2,3,4,5,6,7,8,9};
        String[] alphabetic ={"nul","een","twee","drie","vier","vijf","zes","zeven","acht","negen"};

        Translator vertaler = new Translator(numeric, alphabetic);  //create translator

        // create user input part
        boolean play = true;// check for another iteration of the while loop
        String ongeldig ="ongeldige invoer";// "invalid input" message
        String input; //placeholder for user to end or continue with the translator
        int number;//placeholder for the value entered by the user
        String result;//placeholder for the result returned by translator
        Scanner scanner = new Scanner(System.in);

        while (play)//start interaction with user
        {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            input = scanner.nextLine();// collect user input
            if (input.equals("x"))
            {
                play = false;//quit while loop when user types "x"
            }
            else if(input.equals("v"))
            {
                System.out.println("Type een cijfer in van 0 t/m 9"); //user typed 'V' to translate
                number = scanner.nextInt(); //scan user input
                scanner.nextLine();//move scanner to next line

                if(number <10 )//if number is a valid int
                {
                    result = vertaler.translate(number);// use as a keyvalue to retrieve its translation
                    System.out.println("De vertaling van "+number+" is "+result);
                }

                else
                {
                    System.out.println(ongeldig);//input is not an int from 0 to 9
                }

            }
            else
            {
                System.out.println(ongeldig);//user typed neither x or v
            }

        }
    }
}
