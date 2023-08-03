package constructor_2;

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

    public Cycle(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
}
