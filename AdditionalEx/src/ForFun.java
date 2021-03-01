/*
import java.util.Random;
import java.util.Scanner;

public class ForFun {
    public static Scanner scanner = new Scanner(System.in);

    //////////////////////////////////////////////////////////// series: 1-2+3-4+5-6..........
    public static void mainm(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter limit for the serie --> ");
        int setLimit = scanner.nextInt();
        int sum = 1;

        for (int start = 0; start <= setLimit; start++) {
            if (start % 2 == 0) {
                sum += start;
                System.out.print(start);
                if(start < setLimit)
                    System.out.print(" + ");
                else if(start == setLimit)
                    System.out.println();
            } else {
                sum -= start;
                System.out.print(start);
                if(start < setLimit)
                    System.out.print(" - ");
                else if(start == setLimit)
                    System.out.println();
            }
        }
        System.out.println("The sum is: " + sum);
    }
/////////////////////////////////////////////////////////////// Tic-Tac-Toe




    public static char playerSign, computerSign;
    public static int pos, forFirst = 0;
    public static char table [][] = new char[3][3];
    public static boolean player = true, computer = false;
    public static Random random = new Random();

    public static void main(String[] args) {
        selectSign();
        printTable();

    }

    public static void selectSign(){
        System.out.println("Tic-Tac-Toe Game");
        System.out.println("Valid signs to play 'X' and 'O'");
        System.out.print("Please select sign to play: ");
        playerSign = scanner.next().charAt(0);
        if(playerSign != 'O' || playerSign != 'X') {
            switch (playerSign) {
                case 'X':
                    computerSign = 'O';
                    System.out.println("Computer plays with '" + computerSign + "'");
                    break;
                case 'O':
                    computerSign = 'X';
                    System.out.println("Computer plays with '" + computerSign + "'");
                    break;
                default:
                    System.out.println("Invalid sign!");
                    selectSign();
            }
        }
    }

    public static void printTable(){
        if(forFirst == 0){
            for(int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    table[i][j] = ' ';
                }
            }
            forFirst++;
        }
        System.out.println();
        System.out.println("┎-----------┒");
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + table[i][j] + " ");
                if(j==2)
                    System.out.println("|");
                if (j == 2 && i<2) {
                    System.out.println("|-----------|");
                }
            }
        }
        System.out.println("┗-----------┛");
        defineWinner();
        if(player == true){
            System.out.println("Your move: ");
            player = false;
            PlayerMove();
        }else{
            System.out.println("Computer Moved: ");
            player = true;
            ComputerMove();
        }
    }

    public static void PlayerMove() {
        while(true) {
            System.out.println("Select position to put sign (1-9): ");
            pos = scanner.nextInt();
            if (0 < pos && pos < 10) {
                switch (pos) {
                    case 1:
                        if(table[0][0] == ' ') {
                        table[0][0] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 2:
                        if(table[0][1] == ' ') {
                        table[0][1] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 3:
                        if(table[0][2] == ' ') {
                        table[0][2] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 4:
                        if(table[1][0] == ' ') {
                        table[1][0] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 5:
                        if(table[1][1] == ' ') {
                        table[1][1] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 6:
                        if(table[1][2] == ' ') {
                        table[1][2] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 7:
                        if(table[2][0] == ' ') {
                        table[2][0] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 8:
                        if(table[2][1] == ' ') {
                        table[2][1] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                    case 9:
                        if(table[2][2] == ' ') {
                        table[2][2] = playerSign;
                        printTable();
                    }else{
                        System.out.println("This position is busy!");
                        continue;
                    }
                }
            } else {
                System.out.println("Invalid position!");
                continue;

            }
        }
    }

    public static void ComputerMove() {
        while (true) {
            int i = random.nextInt(3);
            int j = random.nextInt(3);

            if (table[i][j] == ' ') {
                table[i][j] = computerSign;
                computer = true;
            } else {
                continue;
            }
            if (computer == true) {
                printTable();
            }
        }
    }

    public static void defineWinner(){
        // top
        if(table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == playerSign){
            System.out.println("You win!");
            System.exit(0);
        }else if(table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == computerSign) {
            System.out.println("Computer wins!");
            System.exit(0);
        }
            //middle left-right
        else if(table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == playerSign){
                System.out.println("You win!");
                System.exit(0);
            }else if(table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == computerSign){
                System.out.println("Computer wins!");
                System.exit(0);

            //down
        }else if(table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == playerSign){
            System.out.println("You win!");
            System.exit(0);
        }else if(table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == computerSign) {
            System.out.println("Computer wins!");
            System.exit(0);

            //left-side
        }else if(table[0][0] == table[1][0] && table[1][0] == table[2][0] && table[2][0] == playerSign){
            System.out.println("You win!");
            System.exit(0);
        }else if(table[0][0] == table[1][0] && table[1][0] == table[2][0] && table[2][0] == computerSign) {
            System.out.println("Computer wins!");
            System.exit(0);
        }
            //middle up-down
        else if(table[0][1] == table[1][1] && table[1][1] == table[2][1] && table[2][1] == playerSign){
                System.out.println("You win!");
                System.exit(0);
            }else if(table[0][1] == table[1][1] && table[1][1] == table[2][1] && table[2][1] == computerSign){
                System.out.println("Computer wins!");
                System.exit(0);
            }

            //right-side
         else if(table[0][2] == table[1][2] && table[1][2] == table[2][2] && table[2][2] == playerSign){
            System.out.println("You win!");
            System.exit(0);
        }else if(table[0][2] == table[1][2] && table[1][2] == table[2][2] && table[2][2] == computerSign){
            System.out.println("Computer wins");
            System.exit(0);

            //left diagonal
        }else if(table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == playerSign){
            System.out.println("You win!");
            System.exit(0);
        }else if(table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == computerSign){
            System.out.println("Computer wins!");
            System.exit(0);

            //right diagonal
        }else if(table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == playerSign){
            System.out.println("You win!");
            System.exit(0);
        }else if(table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == computerSign){
            System.out.println("Computer wins!");
            System.exit(0);
    }

         // else end of game
        int countFreePlaces = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(table[i][j] != ' ')
                countFreePlaces++;
            }
        }
        if(countFreePlaces == 9 ){
            System.out.println("Nobody wins! :)");
            System.exit(0);
        }
    }

        }


*/
