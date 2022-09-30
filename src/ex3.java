import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String point = scanner.nextLine();
        String[] mass = point.split("");
        StringBuilder newWord = new StringBuilder();

        for (int i = (point.length() - 1); i >= 0; i--) {
            newWord.append(mass[i]);
        }
        System.out.println(newWord);
        if (newWord.toString().equals(point)) {
            System.out.println(point + " - палиндром");
        } else {
            System.out.println(point + " - не палиндром");
        }
    }
}
