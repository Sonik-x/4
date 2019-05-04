import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        //String text = "Солев      Соль  Солевич  ";

        text = text.trim();
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        String surname = text;
        if (text.contains(" ")) {
            surname = text.substring(0, text.indexOf(" "));
        }
        System.out.println("Фамилия: " + surname);
        text = text.substring(surname.length());

        if (text.contains(" ")) {
            text = text.substring(1);
            String name = text;
            if (text.contains(" ")) {
                name = text.substring(0, text.indexOf(" "));
            }
            System.out.println("Имя: " + name);
            text = text.substring(name.length());
        }


        if (text.contains(" ")) {
            text = text.substring(1);
            String patronymic = text;
            if (text.contains(" ")) {
                patronymic = text.substring(0, text.indexOf(" "));
            }
            System.out.println("Отчество: " + patronymic);
        }


    }
}
