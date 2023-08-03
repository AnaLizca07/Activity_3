package activity_3;

import javax.swing.*;

public class SuCasa {
    private Integer houseCost;
    private Integer typeOfFurniture;
    private int commission1;

    public void commission(){
        if(typeOfFurniture == 1) {
            commission1 = (int) (houseCost * 0.10);
        }
        else {
            commission1 = (int) (houseCost * 0.12);
        }
    }

    public void showMessage(){
        JOptionPane.showMessageDialog(null,("The owner receives: " + (houseCost-commission1) +
                "\nThe real estate receives: "+ commission1));
    }

    public Integer getHouseCost() {
        return houseCost;
    }

    public void setHouseCost(Integer houseCost) {
        this.houseCost = houseCost;
    }

    public Integer getTypeOfFurniture() {
        return typeOfFurniture;
    }

    public void setTypeOfFurniture(Integer typeOfFurniture) {
        this.typeOfFurniture = typeOfFurniture;
    }

    public int getCommission1() {
        return commission1;
    }

    public void setCommission1(int commission1) {
        this.commission1 = commission1;
    }
}
