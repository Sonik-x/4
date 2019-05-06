import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //String input = "+7 (962) 383 772 8";

        input = input.replaceAll("[^0-9]+", "");

        //DecimalFormat formatter = new DecimalFormat("+# ### ###-##-##"); - это не работает! (увы)

        if(input.length() == 11 && (input.charAt(0) == '7' || input.charAt(0) == '8') && input.charAt(1) == '9'){
            printRussianNumber10num(input.substring(1));
        } else if (input.length() == 10 && input.charAt(0) == '9'){
            printRussianNumber10num(input);
        } else {
            System.out.println("Некорректный номер");
        }


    }

    public static void printRussianNumber10num(String input){
        System.out.println("+7 " + input.substring(0, 3) + " " + input.substring(3, 6) + "-" + input.substring(6, 8) + "-" + input.substring(8));
    }
}
