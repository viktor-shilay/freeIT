package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    static String[][] field = new String[3][3];
    static String player1;
    static String player1Symbol;
    static String player2;
    static String player2Symbol;
    static boolean playerSwitch = true;             // player1 - true, player2 - false;

    public static void main(String[] args) {
        startGame();
        while (true) {
            System.out.println("Do you want to play again? Y-Yes, N-No: ");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equals("Y")) {
                playerSwitch = true;
                startGame();
            } else if (answer.equals("N")) {
                System.out.println("***********THE END***********");
                break;
            }
        }
    }

    public static void startGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player #1 enter your name:");
        player1 = scan.nextLine();
        System.out.println("Player #2 enter your name:");
        player2 = scan.nextLine();
        System.out.println(player1 + " what do you choose: X or O ?");
        while (true) {
            String symbol = scan.nextLine();
            if (symbol.equals("X")) {
                player1Symbol = "X";
                player2Symbol = "O";
                break;
            } else if (symbol.equals("O")) {
                player1Symbol = "O";
                player2Symbol = "X";
                break;
            }
            System.out.println("Enter X or O");
        }
        initializeField();
        System.out.println("**********LET'S GO!**********");

        for (int i = 0; i < 9; i++) {                                   //the game has 9 moves
            if (i > 3) {                                                //starting from 4 move, check the possibility of winning
                if (playerSwitch) {
                    playerTurn(player1, player1Symbol);
                    if (winCondition(player1Symbol)) {                  //check winning
                        System.out.println(player1 + " WON!");
                        break;
                    }
                    playerSwitch = false;
                } else {
                    playerTurn(player2, player2Symbol);
                    if (winCondition(player2Symbol)) {                  //check winning
                        System.out.println(player2 + " WON!");
                        break;
                    }
                    playerSwitch = true;
                }
            } else if (playerSwitch) {                                  //without check
                playerTurn(player1, player1Symbol);
                playerSwitch = false;
            } else {                                                    //without check
                playerTurn(player2, player2Symbol);
                playerSwitch = true;
            }
            if (i == 8) {                                              // last move == draw
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void playerTurn(String player, String symbol) {
        System.out.println(player + " your turn: \n Enter the coordinates [0-2][0-2]");
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int x = scan.nextInt();
        if (checkPosition(y, x)) {
            printField(y, x, symbol);
        } else {
            while (true) {
                System.out.println(" Enter the coordinates [0-2][0-2]");
                int anotherY = scan.nextInt();
                int anotherX = scan.nextInt();
                if (checkPosition(anotherY, anotherX)) {
                    printField(anotherY, anotherX, symbol);
                    break;
                }
            }
        }
    }

    public static void initializeField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == field[i].length - 1) {
                    field[i][j] = " ";
                    System.out.println(field[i][j]);
                    break;
                }
                field[i][j] = " ";
                System.out.print(field[i][j] + " | ");
            }
            if (i < field.length - 1) {
                System.out.println("——+———+——");
            }
        }
    }

    public static boolean checkPosition(int y, int x) {
        if (field[y][x].equals(" ")) {
            return true;
        } else {
            System.out.println("This position is taken. Choose another position: ");
        }
        return false;
    }

    public static void printField(int y, int x, String symbol) {
        field[y][x] = symbol;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == field[i].length - 1) {
                    System.out.println(field[i][j]);
                    break;
                }
                System.out.print(field[i][j] + " | ");
            }
            if (i < field.length - 1) {
                System.out.println("——+———+——");
            }
        }
    }

    public static boolean winCondition(String symbol) {
        for (int i = 0; i < 3; i++) {
            if ((field[i][0].equals(symbol) && field[i][1].equals(symbol) && field[i][2].equals(symbol)) ||
                    (field[0][i].equals(symbol) && field[1][i].equals(symbol) && field[2][i].equals(symbol))) {
                return true;
            }
        }
        if (field[0][0].equals(symbol) && field[1][1].equals(symbol) && field[2][2].equals(symbol)) {
            return true;
        }
        return field[2][0].equals(symbol) && field[1][1].equals(symbol) && field[0][2].equals(symbol);
    }
}