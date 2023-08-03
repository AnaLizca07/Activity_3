package activity_15;

public class Patter {
    int numLines = 10;
    public void patt(){
        for (int i = 0; i < numLines; i++) {
            if(i%2 ==0){
                System.out.println("* * * * * * ==================================");
            } else{
                System.out.println(" * * * * * ==================================");
            }
        }
    }

    public int getNumLines() {
        return numLines;
    }

    public void setNumLines(int numLines) {
        this.numLines = numLines;
    }
}
