package activity_12;

import javax.swing.*;

public class MainChampions {
    public static void main(String[] args) {
        Champions champions = new Champions();

        champions.setTeam1(JOptionPane.showInputDialog("Enter the name of the first team"));
        champions.setMarker1(Integer.parseInt(JOptionPane.showInputDialog("Enter the marker of the first team")));
        champions.setTeam2(JOptionPane.showInputDialog("Enter the name of the second team"));
        champions.setMarker2(Integer.parseInt(JOptionPane.showInputDialog("Enter the marker of the second team")));
        champions.setDate1(JOptionPane.showInputDialog("Enter the first date"));
        champions.setDate2(JOptionPane.showInputDialog("Enter the second date"));
        champions.setDate3(JOptionPane.showInputDialog("Enter the third date"));

        champions.ranking();
    }
}
