package seaBattle;
import java.util.Scanner;

public class SeaBattleGame {
    private static final int boardSize = 10;
    private static final int[] SHIPS = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    private char[][] player1Board;
    private char[][] player2Board;
    private String player1Name;
    private String player2Name;
    private Scanner scanner;

    public SeaBattleGame() {
        player1Board = new char[boardSize][boardSize];
        player2Board = new char[boardSize][boardSize];
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Добро пожаловать в игру \"Морской бой\"!");

        initializeBoards();
        setPlayerNames();

        placeShips(player1Board, player1Name);
        placeShips(player2Board, player2Name);

        boolean gameOver = false;
        String currentPlayer = player1Name;
        char[][] currentPlayerBoard = player1Board;
        String otherPlayer = player2Name;
        char[][] otherPlayerBoard = player2Board;

        while (!gameOver) {
            System.out.println(currentPlayer + ", ваш ход!");
            System.out.println("Введите координаты выстрела (номер клетки по горизонтали и вертикали):");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (isHit(otherPlayerBoard, x, y)) {
                System.out.println("Попадание!");
                currentPlayerBoard[x][y] = 'X';
                otherPlayerBoard[x][y] = 'X';
            } else {
                System.out.println("Мимо!");
                currentPlayerBoard[x][y] = '*';
                char[][] temp = currentPlayerBoard;
                currentPlayerBoard = otherPlayerBoard;
                otherPlayerBoard = temp;
                String tempName = currentPlayer;
                currentPlayer = otherPlayer;
                otherPlayer = tempName;
            }

            printBoard(currentPlayerBoard);

            if (isGameOver(otherPlayerBoard)) {
                System.out.println("Поздравляем, " + currentPlayer + "! Вы победили!");
                gameOver = true;
            }
        }
    }

    private void initializeBoards() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                player1Board[i][j] = '-';
                player2Board[i][j] = '-';
            }
        }
    }

    private void setPlayerNames() {
        System.out.print("Введите имя первого игрока: ");
        player1Name = scanner.next();
        System.out.print("Введите имя второго игрока: ");
        player2Name = scanner.next();
    }

    private void placeShips(char[][] board, String playerName) {
        System.out.println(playerName + ", расставьте свои корабли на игровом поле.");

        for (int shipLength : SHIPS) {
            printBoard(board);
            System.out.println("Расставьте корабль длиной " + shipLength + " клеток.");
            for (int i = 0; i < shipLength; i++) {
                System.out.print("Введите координаты (номер клетки по горизонтали и вертикали): ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                board[x][y] = 'S';
            }
        }
    }

    private boolean isHit(char[][] board, int x, int y) {
        return board[x][y] == 'S';
    }

    private boolean isGameOver(char[][] board) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == 'S') {
                    return false;
                }
            }
        }
        return true;
    }

    private void printBoard(char[][] board) {
        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < boardSize; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SeaBattleGame game = new SeaBattleGame();
        game.start();
    }
}