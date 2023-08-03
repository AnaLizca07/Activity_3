package activity_13;

import javax.swing.*;

public class MainCars {
    public static void main(String[] args) {
        Cars cars = new Cars();

        cars.setTypeOfCar(Integer.parseInt(JOptionPane.showInputDialog("Choose the car brand: \n1.Chevrolet" +
                "\n2.Mazda \n3.Renault")));

        if(cars.getTypeOfCar()==1){
            cars.setRefsChev(Integer.parseInt(JOptionPane.showInputDialog("1.Spark GT \n2.Captiva")));
            cars.chevrolet();
        } else if (cars.getTypeOfCar()==2) {
            cars.setRefsMazda(Integer.parseInt(JOptionPane.showInputDialog("1.Mazda 2 \n2.Mazda 6")));
            cars.mazda();
        } else {
            cars.setRefsRenault(Integer.parseInt(JOptionPane.showInputDialog("1.Sandero \n2.Duster Oroch")));
            cars.renault();
        }
    }
}
