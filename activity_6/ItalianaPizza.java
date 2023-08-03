package activity_6;

import javax.swing.*;

public class ItalianaPizza {
    private Integer menu;
    private Integer amount;
    private String sauce;
    private int total;

    public void pizza(){
        if(sauce.equalsIgnoreCase("yes")){
            total = (amount * 7000) + 3000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        } else if (sauce.equalsIgnoreCase("no")) {
            total = amount * 7000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }

    public void sandwich(){
        if(sauce.equalsIgnoreCase("yes")){
            total = (amount * 5000) + 3000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        } else if (sauce.equalsIgnoreCase("no")) {
            total = amount * 5000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }

    public void salad(){
        if(sauce.equalsIgnoreCase("yes")){
            total = (amount * 15000) + 3000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        } else if (sauce.equalsIgnoreCase("no")) {
            total = amount * 15000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
