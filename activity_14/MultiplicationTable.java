package activity_14;

public class MultiplicationTable {
    private Integer number;
    public void mult() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * number);
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
