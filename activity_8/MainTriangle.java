package activity_8;

import javax.swing.*;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.setSide1(Double.parseDouble(JOptionPane.showInputDialog("Write the first side of the triangle")));
        triangle.setSide2(Double.parseDouble(JOptionPane.showInputDialog("Write the second side of the triangle")));
        triangle.setSide3(Double.parseDouble(JOptionPane.showInputDialog("Write the third side of the triangle")));
        triangle.equilateral();
    }
}
