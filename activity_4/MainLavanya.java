package activity_4;

import javax.swing.*;

public class MainLavanya {
    public static void main(String[] args) {
        Lavanya lavanya = new Lavanya();

        lavanya.setService(Integer.parseInt(JOptionPane.showInputDialog("Choose your service: " + "\n 1.Laundry \n 2.Drying")));
        lavanya.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("How many clothes " + "are they?")));

        if(lavanya.getService() == 1){
            lavanya.setLaundry(Integer.parseInt(JOptionPane.showInputDialog("1.Dry cleaning \n2.Regular wash")));
            lavanya.washType();
        } else {
            lavanya.ironing();
        }
    }
}
