package activity_13;

import javax.swing.*;

public class Cars {
    private Integer refsChev;
    private Integer refsMazda;
    private Integer refsRenault;
    private Integer typeOfCar;

    String chevroletSparkGT = "Modelo: Chevrolet Spark GT 2019\n" +
            "            Motor: S-TEC II 1.2 litros, 16 válvulas DOHC\n" +
            "            Potencia: 81 caballos @ 6.400 rpm\n" +
            "            Torque: 108 Nm @ 4.800 rpm\n" +
            "            Transmisión: Mecánica de 5 velocidades\n" +
            "            Versiones y precios base: (Febrero/2018)\n" +
            "            -LS 2019: $34.900.000\n" +
            "            -LT 2019: $36.900.000\n" +
            "            -LTZ 2019: $39.900.000";
    String chevroletcaptiva = "alert(`Motor: 1.5 litros turbo\n" +
            "            Potencia: 144 hp @ 5,200 RPM\n" +
            "            Par: 184 lb-pie @ 1,600 RPM\n" +
            "            Transmisión: CVT\n" +
            "            Tracción: Delantera\n" +
            "            Frenos: Disco/disco\n" +
            "            Peso: 1,630 kg\n" +
            "            Aceleración: N.D\n" +
            "            Velocidad máxima: 180 km/h";
    String mazda2 = "alert(`Marca\tMazda\n" +
            "            Modelo\t2\n" +
            "            Año\t2023\n" +
            "            Versión\tGRAND TOURING LX\n" +
            "            Color\tGris\n" +
            "            Tipo de combustible\tGasolina\n" +
            "            Puertas\t5\n" +
            "            Transmisión\tAutomática";
    String mazda6 = "alert(`Marca\tMazda\n" +
            "            Modelo\t6\n" +
            "            Año\t2012\n" +
            "            Versión\tL5NA1 TP\n" +
            "            Color\tBlanco\n" +
            "            Tipo de combustible\tGasolina\n" +
            "            Puertas\t4\n" +
            "            Transmisión\tAutomática";
    String renaultDusterOroch = "Marca\tRenault\n" +
            "            Modelo\tDuster Oroch\n" +
            "            Año\t2023\n" +
            "            Versión\tCargo 4x4\n" +
            "            Color\tGris\n" +
            "            Tipo de combustible\tGasolina\n" +
            "            Puertas\t4\n" +
            "            Transmisión\tMecánica\n" +
            "            Motor\tH5Ht 1.3L Turbo";
    String renaultSandero = "Marca\tRenault\n" +
            "            Modelo\tSandero\n" +
            "            Año\t2017\n" +
            "            Versión\t1.6 Dynamique\n" +
            "            Tipo de combustible\tGasolina\n" +
            "            Puertas\t5\n" +
            "            Transmisión\tAutomática";

    public void chevrolet(){
        if(refsChev==1){
            JOptionPane.showMessageDialog(null,chevroletSparkGT);
        } else{
            JOptionPane.showMessageDialog(null,chevroletcaptiva);
        }
    }

    public void mazda(){
        if(refsMazda==1){
            JOptionPane.showMessageDialog(null,mazda2);
        } else {
            JOptionPane.showMessageDialog(null,mazda6);
        }
    }

    public void renault(){
        if(refsRenault==1){
            JOptionPane.showMessageDialog(null,renaultSandero);
        } else {
            JOptionPane.showMessageDialog(null,renaultDusterOroch);
        }
    }

    public Integer getRefsChev() {
        return refsChev;
    }

    public void setRefsChev(Integer refsChev) {
        this.refsChev = refsChev;
    }

    public Integer getRefsMazda() {
        return refsMazda;
    }

    public void setRefsMazda(Integer refsMazda) {
        this.refsMazda = refsMazda;
    }

    public Integer getRefsRenault() {
        return refsRenault;
    }

    public void setRefsRenault(Integer refsRenault) {
        this.refsRenault = refsRenault;
    }

    public Integer getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(Integer typeOfCar) {
        this.typeOfCar = typeOfCar;
    }
}
