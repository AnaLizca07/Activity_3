package activity_5;

import javax.swing.*;

public class Stickers {
    private Integer stickerSize;
    private Integer numberOfStickers;
    private int total;

    public void bigSize(){
        if (numberOfStickers >= 10) {
            total = numberOfStickers * 6000;
            JOptionPane.showMessageDialog(null,("You have to pay: "+total));
        } else {
            JOptionPane.showMessageDialog(null,("The minimum is 10 stickers, please, enter a valid quantity"));
        }
    }

    public void smallSize(){
        if (numberOfStickers>=10) {
            total = numberOfStickers * 4000;
            JOptionPane.showMessageDialog(null,("You have to pay: "+total));
        } else {
            JOptionPane.showMessageDialog(null,("The minimum is 10 stickers, please, enter a valid quantity"));
        }
    }

    public Integer getStickerSize() {
        return stickerSize;
    }

    public void setStickerSize(Integer stickerSize) {
        this.stickerSize = stickerSize;
    }

    public Integer getNumberOfStickers() {
        return numberOfStickers;
    }

    public void setNumberOfStickers(Integer numberOfStickers) {
        this.numberOfStickers = numberOfStickers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
