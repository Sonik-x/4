import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        //String text = "Солев      Соль  Солевич     ";
        text = text.trim();

        String[] textSpl = text.split("\\s+");
        System.out.println("Фамилия: " + textSpl[0]);
        if (textSpl.length > 1) {
            System.out.println("Имя: " + textSpl[1]);
        }
        if (textSpl.length > 2) {
            System.out.println("Отчество: " + textSpl[2]);
        }
    }
}
