package activity_1;

import javax.swing.*;

public class Numbers {
    private int start;
    private int end;
    public void showCycle() {
        for (int i = start; i <= end; i++) {
            JOptionPane.showMessageDialog(null, (i));
        }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
