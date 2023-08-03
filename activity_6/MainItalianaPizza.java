package activity_6;

import javax.swing.*;

public class MainItalianaPizza {
    public static void main(String[] args) {
        ItalianaPizza italianaPizza = new ItalianaPizza();

        italianaPizza.setMenu(Integer.parseInt(JOptionPane.showInputDialog("1.Pizza = $7.000 \n2.Sandwich = $5.000 \n3.Salad = $15.000")));
        italianaPizza.setAmount(Integer.parseInt(JOptionPane.showInputDialog("How many pieces do you want?")));
        italianaPizza.setSauce(JOptionPane.showInputDialog("Do you want sauce?"));

        if (italianaPizza.getMenu() == 1) {
            italianaPizza.pizza();
        } else if (italianaPizza.getMenu() == 2) {
            italianaPizza.sandwich();
        } else if (italianaPizza.getMenu() == 3) {
            italianaPizza.salad();
        } else {
            JOptionPane.showMessageDialog(null, ("Choose a valid option"));
        }
    }
}
