package activity_12;

import javax.swing.*;

public class Champions {
    private String team1;
    private String team2;
    private Integer marker1;
    private Integer marker2;
    private String date1;
    private String date2;
    private String date3;
    String first;
    String second;

    public void ranking(){
        if(marker1>marker2){
            first = team1;
            second = team2;
            JOptionPane.showMessageDialog(null,"First place: " + first +
                    "\nSecond place: "+ second);
        } else if (marker1<marker2) {
            first = team2;
            second = team1;
            JOptionPane.showMessageDialog(null,"First place: " + first +
                    "\nSecond place: "+ second);
        } else{
            JOptionPane.showMessageDialog(null,"It was av draw");
        }
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public Integer getMarker1() {
        return marker1;
    }

    public void setMarker1(Integer marker1) {
        this.marker1 = marker1;
    }

    public Integer getMarker2() {
        return marker2;
    }

    public void setMarker2(Integer marker2) {
        this.marker2 = marker2;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }
}
