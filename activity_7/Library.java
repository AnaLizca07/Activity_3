package activity_7;

import javax.swing.*;

public class Library {
    private Integer typeOfService;
    private Integer daysLate;
    private Integer typeOfBook;
    private Integer quantityOfBooks;
    private int total;

    public void ret(){
        switch (typeOfBook){
            case 1: {
                total = (daysLate * 600) * quantityOfBooks;
                JOptionPane.showMessageDialog(null,("You have to pay:")+total);

            }break;
            case 2:
                total = (daysLate * 500) * quantityOfBooks;
                JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }

    public void loss(){
        total = quantityOfBooks*10000;
        JOptionPane.showMessageDialog(null,("You have to pay:")+total);
    }

    public Integer getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(Integer typeOfService) {
        this.typeOfService = typeOfService;
    }

    public Integer getDaysLate() {
        return daysLate;
    }

    public void setDaysLate(Integer daysLate) {
        this.daysLate = daysLate;
    }

    public Integer getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(Integer typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    public Integer getQuantityOfBooks() {
        return quantityOfBooks;
    }

    public void setQuantityOfBooks(Integer quantityOfBooks) {
        this.quantityOfBooks = quantityOfBooks;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
