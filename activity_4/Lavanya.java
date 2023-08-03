package activity_4;

import javax.swing.*;

public class Lavanya {
    private Integer service;
    private Integer laundry;
    private Integer quantity;
    private int total;

    public void washType(){
        if(laundry==1){
            total= (quantity*2000);
            JOptionPane.showMessageDialog(null,("You have to pay: "+total));
        } else {
            total = quantity*1500;
            JOptionPane.showMessageDialog(null,("You have to pay: "+total));
        }
    }

    public void ironing(){
        total = (quantity*1800)+3000;
        JOptionPane.showMessageDialog(null,("You have to pay: "+total));
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getLaundry() {
        return laundry;
    }

    public void setLaundry(Integer laundry) {
        this.laundry = laundry;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
