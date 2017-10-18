import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> integerQueue = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Podaj 10 liczb.");

        boolean stop;

        do {
            do {
                try {
                    integerQueue.offer(scanner.nextInt());
                    scanner.nextLine();
                    count++;
                    stop = false;
                } catch (InputMismatchException e) {
                    System.out.println("Podaj prawidłową wartość liczbową: ");
                    scanner.nextLine();
                    stop = true;
                }
            } while (stop);
        } while (count < 10);

        do {
            sum += integerQueue.peek();
            stringBuilder.append(integerQueue.poll() + " + ");

        } while (integerQueue.size() > 0);

        System.out.println(stringBuilder.substring(0, stringBuilder.lastIndexOf("+")) + "= " + sum);

    }
}