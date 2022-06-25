import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        int[][] mas = new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(mas[i][j] + " ");

            }
        }
    }
}