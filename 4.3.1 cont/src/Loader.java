import java.util.Scanner;

public class Loader {


    public static void main(String[] args) {
        int trackCapacity = 12;
        int containerCapacity = 27;


        Scanner scanner = new Scanner(System.in);

        int boxAmount = scanner.nextInt();
        int containerAmount = (int)Math.ceil((boxAmount / ((float) containerCapacity)));
        int trackAmount = (int)Math.ceil(containerAmount / ((float) trackCapacity));

        int numberOfBox = 0;
        int numberOfContainer = 0;
        for (int n = 0; n < trackAmount; n++) {
            System.out.println("Грузовик " + (n + 1) + ":");
            int l = Math.min((containerAmount - numberOfContainer), trackCapacity);
            for (int i = 0; i < l; i++) {
                System.out.println("\tКонтейнер " + ++numberOfContainer + ":");
                int o = Math.min(boxAmount - numberOfBox, containerCapacity);
                for (int j = 0; j < o; j++) {
                    System.out.println("\t\tЯщик " + ++numberOfBox);
                }
            }
        }
    }
}
