package activity_10;

import javax.swing.*;

public class MainExam {
    public static void main(String[] args) {
        Exam exam = new Exam();

        exam.setQuestion1(Boolean.parseBoolean(JOptionPane.showInputDialog("Question 1. Write true or false accordingly: " +
                "\nDo humans have skin?")));
        exam.ver1();
        exam.setQuestion2(JOptionPane.showInputDialog("Question 2. Write A,B or C accordingly:\nWhat color belongs to the Colombian flag?" +
                "\nA.Blue\nB.Green\nC.Brown"));
        exam.ver2();
        exam.setQuestion3(Boolean.parseBoolean(JOptionPane.showInputDialog("Question 3. Write true or false accordingly: " +
                "\nThe capital of Colombia is Armenia")));
        exam.ver3();
        exam.setQuestion4(JOptionPane.showInputDialog("Question 4. Write A,B or C accordingly:\nHow many stars does the US flag have?" +
                "\nA.30\nB.45\nC.50"));
        exam.ver4();
        exam.setQuestion5(Boolean.parseBoolean(JOptionPane.showInputDialog("Question 5. Write true or false accordingly: " +
                "\nThe water is blue")));
        exam.ver5();

        exam.note();

    }
}
