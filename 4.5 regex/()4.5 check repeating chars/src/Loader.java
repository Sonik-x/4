public class Loader {
    public static void main(String[] args) {
        String input = "";
        for (int i = 0; i < 30000; i++) {     //так опытным путём выяснилось, что система может напечатать строку из символов до 8195 и не больше =)
            input += (char)i;                   //при этом программа запускается с любым числом, но после 65536 начинает отдавать true
        }
        System.out.println(System.currentTimeMillis()); //поскольку я сильно сомневаюсь, что кому-то в жизни может пригодиться такой алгоритм для проверки строк длиннее 30000 символов...
        System.out.println(hasDuplicateChars(input));   //массив символов победил
        System.out.println(System.currentTimeMillis());
    }

    public static boolean hasDuplicateSymbols(String string) {   //строка без повторений 1000 символов 19мс, 3000 20мс, 8195 30мс, 30000 191мс, 65536 794мс
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++){
                if(string.charAt(i) == string.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicateChars(String string) {   //строка без повторений 1000 6мс, 3000 8мс, 8195 19мс, 30000 184мс, 65536 809мс
        char[] chars = new char[string.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = string.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++){
                if(chars[i] == chars[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //думаю, на шарпе можно было бы написать что-то вот такое, ибо каждая строка - уже массив символов
            //но увы
    /* public static boolean hasDuplicateSymbolsForeach(String string) {
        for (char ch : string){
            (укоротить строку)
            for (char cha : string){
                if (ch == cha){
                    return true;
                }
            }
        }
        return false;
    } */


}
