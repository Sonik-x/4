
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int salarySum = 0;
        String pattern = " рубл";



        while (text.contains(pattern)) {

            int salaryEndIndex = text.indexOf(pattern);
            String salaryPart = text.substring(0, salaryEndIndex);
            String salary = salaryPart.substring(salaryPart.lastIndexOf(' ') + 1);
            salarySum += Integer.parseInt(salary);
            text = text.substring(salaryEndIndex + pattern.length());
        }
        System.out.println(salarySum);


    }
}