package activity_7;

import javax.swing.*;

public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        library.setTypeOfService(Integer.parseInt(JOptionPane.showInputDialog("Choose the option you require: \n1.Delay \n2.Loss")));
        library.setQuantityOfBooks(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of copies")));

        if(library.getTypeOfService()==1){
            library.setTypeOfBook(Integer.parseInt(JOptionPane.showInputDialog("What kind of book is it? \n1.Book \n2.Magazine")));
            library.setDaysLate(Integer.parseInt(JOptionPane.showInputDialog("How many days late is it?")));
            library.ret();
        } else {
            library.loss();
        }
    }
}
