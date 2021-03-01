package MiniToto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();
        File lost = new File("D:\\losers.txt");
        File win = new File("D:\\winners.txt");
        PrintStream printLost = new PrintStream(lost);
        PrintStream printWin = new PrintStream(win);

        int choice;
        while(true) {
            try {
                System.out.println("Which type of toto playing to be used:");
                System.out.println("1. 5/35");
                System.out.println("2. 6/49");
                System.out.println("Your choice:");
                choice = Integer.parseInt(scanner.nextLine());
                if( !( choice == 1 || choice == 2) ){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.println("Invalid option!");
            }
        }

        Generatorlmpl generatorlmpl = new Generatorlmpl();

        boolean resultOfComparing;
        fiveSlashThirtyFive fvtf;
        sixSlashFourtyNine ssfn;

        switch (choice) {
            case 1:
                Queue<Integer> user1 = new LinkedList<>();

                user1.add(3);
                user1.add(4);
                user1.add(29);
                user1.add(15);
                user1.add(1);

                fvtf = new fiveSlashThirtyFive(String.valueOf(random.nextInt(100 - 50) + 50), user1);
                Queue<Integer> generated1 = generatorlmpl.generateNumbers(5);
                resultOfComparing = fvtf.compareNumbers(user1, generated1);

                if (resultOfComparing) {
                    printWin.println(fvtf.toString());
                } else {
                    printLost.println(fvtf.toString());
                }
                break;
            case 2:
                Queue<Integer> user2 = new LinkedList<>();
                user2.add(16);
                user2.add(21);
                user2.add(48);
                user2.add(1);
                user2.add(5);
                user2.add(14);

                ssfn = new sixSlashFourtyNine(String.valueOf(random.nextInt(100 - 50) + 50), user2);
                Queue<Integer> generated2 = generatorlmpl.generateNumbers(6);
                resultOfComparing = ssfn.compareNumbers(user2, generated2);

                if (resultOfComparing) {
                    printWin.println(ssfn.toString());
                } else {
                    printLost.println(ssfn.toString());
                }
                break;
        }

        printLost.close();
        printWin.close();

    }

}
