package activity_9;

import javax.swing.*;

public class Vote {
    private Integer election;
    private int ana = 0;
    private int diego = 0;
    private int total;

    public void vot(){
        for (int vote = 1; vote <=10 ; vote++) {
            if(election==1){
                ana++;
            } else if (election==2) {
                diego++;
            } else {
                JOptionPane.showMessageDialog(null,"Please, select a correct option");
                election--;
                total--;
            }
        }
    }

    public void result(){
        if(ana>diego){
            JOptionPane.showMessageDialog(null, "The winner is: Ana Maria Suarez\nThe loser is: Diego Acero" );
        } else if (diego>ana) {
            JOptionPane.showMessageDialog(null, "The winner is: Diego Acero \nThe loser is: Ana Maria Suarez" );
        } else{
            JOptionPane.showMessageDialog(null, "It was a draw" );
        }
    }

    public Integer getElection() {
        return election;
    }

    public void setElection(Integer election) {
        this.election = election;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
