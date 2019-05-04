
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int salarySum = 0;

        String[] textSplitted = text.split("\\s");
        for (String str : textSplitted) {
            if (str.matches("[0-9]+")) {
                salarySum += Integer.parseInt(str);
            }
        }

        System.out.println(salarySum);
    }
}