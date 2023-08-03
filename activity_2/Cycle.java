package activity_2;

import javax.swing.*;

public class Cycle {
    private int n1;
    private int n2;

    public void showCycle() {
        for (int i = n1; i <= n2; i++) {
            if (i != 5) {
                JOptionPane.showMessageDialog(null, (i));
            }
        }
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}