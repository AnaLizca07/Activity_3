package activity_11;

import javax.swing.*;

public class Weight {
    private Integer typeOfMoney;
    private Integer amountOfMoney;
    int service = 500;
    int moneyChange;

    public void change(){
        if(amountOfMoney-service==0){
            JOptionPane.showMessageDialog(null,"You don`t have change");
            JOptionPane.showMessageDialog(null,"Come back soon!😄");
        } else{
            moneyChange = amountOfMoney-service;
            JOptionPane.showMessageDialog(null,"Your change is: "+ moneyChange);
            JOptionPane.showMessageDialog(null,"Come back soon!😄");
        }
    }

    public void coinsCheck(){
        if(amountOfMoney==500||amountOfMoney==1000){
            change();
        } else{
            JOptionPane.showMessageDialog(null,"Please, enter a correct answer");
        }
    }

    public void billsCheck(){
        if(amountOfMoney==2000||amountOfMoney==5000){
            change();
        } else{
            JOptionPane.showMessageDialog(null,"Please, enter a correct answer");
        }
    }

    public Integer getTypeOfMoney() {
        return typeOfMoney;
    }

    public void setTypeOfMoney(Integer typeOfMoney) {
        this.typeOfMoney = typeOfMoney;
    }

    public Integer getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Integer amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
