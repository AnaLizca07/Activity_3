package activity_10;

import javax.swing.*;

public class Exam {
    private Boolean question1;
    private String question2;
    private Boolean question3;
    private String question4;
    private Boolean question5;
    private int total =0;

    public void ver1(){
        if(question1){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver2(){
        if(question2.equalsIgnoreCase("a")){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver3(){
        if(!question3){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver4(){
        if(question4.equalsIgnoreCase("c")){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver5(){
        if(!question5){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void note(){
        JOptionPane.showMessageDialog(null,"Your score is: "+ total);

    }

    public Boolean getQuestion1() {
        return question1;
    }

    public void setQuestion1(Boolean question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public Boolean getQuestion3() {
        return question3;
    }

    public void setQuestion3(Boolean question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public Boolean getQuestion5() {
        return question5;
    }

    public void setQuestion5(Boolean question5) {
        this.question5 = question5;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
