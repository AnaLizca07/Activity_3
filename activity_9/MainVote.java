package activity_9;

import javax.swing.*;

public class MainVote {
    public static void main(String[] args) {
        Vote vote = new Vote();

        while (vote.getTotal()<10){
            vote.setElection(Integer.parseInt(JOptionPane.showInputDialog("Vote for your favorite: " +
                    "\n1.Ana Maria Suarez \n2.Diego Acero")));
            vote.vot();
            vote.setTotal(vote.getTotal()+1);
        }
        vote.result();
    }
}
