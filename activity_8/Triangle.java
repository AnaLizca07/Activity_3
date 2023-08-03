package activity_8;

import javax.swing.*;

public class Triangle {
    private Double side1;
    private Double side2;
    private Double side3;

    public void equilateral(){
        if(side1.equals(side2) && side1.equals(side3)){
            JOptionPane.showMessageDialog(null,("Your triangle is equilateral"));
        } else {
            JOptionPane.showMessageDialog(null,("Your triangle isn`t equilateral"));
        }
    }

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    public Double getSide3() {
        return side3;
    }

    public void setSide3(Double side3) {
        this.side3 = side3;
    }
}
