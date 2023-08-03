package activity_11;

import javax.swing.*;

public class MainWeight {
    public static void main(String[] args) {
        Weight weight = new Weight();

        weight.setTypeOfMoney(Integer.parseInt(JOptionPane.showInputDialog("Choose your type Of Money: \n1.Coins \n2.Bills")));
        weight.setAmountOfMoney( Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of money (Remember" +
                "that only: Bills of $2000 or $5000. Coins of 500 or 1000)")));

        if(weight.getTypeOfMoney()==1){
            weight.coinsCheck();
        } else if (weight.getTypeOfMoney()==2) {
            weight.billsCheck();
        } else {
            JOptionPane.showMessageDialog(null,"Please,enter a correct answer");
        }
    }
}
