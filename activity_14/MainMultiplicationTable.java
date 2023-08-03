package activity_14;

import java.util.Scanner;

public class MainMultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        Scanner lector = new Scanner(System.in);
        System.out.println("Type a number to see its multiplication table");
        multiplicationTable.setNumber(lector.nextInt());
        multiplicationTable.mult();
    }
}
