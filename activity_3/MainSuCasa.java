package activity_3;

import javax.swing.*;

public class MainSuCasa {
    public static void main(String[] args) {
        SuCasa suCasa = new SuCasa();
        suCasa.setHouseCost(Integer.parseInt(JOptionPane.showInputDialog("How much does the house cost?")));
        suCasa.setTypeOfFurniture(Integer.parseInt(JOptionPane.showInputDialog("Property type: \n1.Used \n2.New")));
        suCasa.commission();
        suCasa.showMessage();
    }
}
