import java.text.DecimalFormat;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        String input = "71234567890";
        double num = 33.0;

        input = input.replaceAll("[^0-9]+", "");

        DecimalFormat formatter = new DecimalFormat("+# ### ###-##-##");

        if(input.length() == 11 && input.charAt(0) == '7'){
            System.out.println(formatter.format(Long.parseLong(input)));
        }
    }
}
