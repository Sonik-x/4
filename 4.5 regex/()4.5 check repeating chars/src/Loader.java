import java.util.HashSet;

public class Loader {
    public static void main(String[] args) {
        String input = "";
        for (int i = 0; i < 65536; i++) {     //так опытным путём выяснилось, что система может напечатать строку из символов до 8195 и не больше =)
            input += (char)i;                   //при этом программа запускается с любым числом, но после 65536 начинает отдавать true
        }
        System.out.println(System.currentTimeMillis()); //поскольку я сильно сомневаюсь, что кому-то в жизни может пригодиться такой алгоритм для проверки строк длиннее 30000 символов...
        System.out.println(hasDuplicateCharsHash(input));   //массив символов победил
        System.out.println(System.currentTimeMillis());
    }


    public static boolean hasDuplicateCharsHash(String string) {   //строка без повторений 1000 0,..мс, 3000 1мс, 8195 2мс, 30000 7мс, 65536 17мс
        char[] chars = string.toCharArray();
        HashSet<Character> charsSet = new HashSet<>();
        for (char ch : chars){
            charsSet.add(ch);
        }
        if (charsSet.size() < chars.length){
            return true;
        }

        return false;
    }
}
