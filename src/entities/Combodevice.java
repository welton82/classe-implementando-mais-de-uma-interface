package entities;

import enums.MeuScan;
import enums.Printer;

public class Combodevice extends Device implements MeuScan, Printer {

    public Combodevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDic(String doc) {
        System.out.println("Combo Processing " + doc);
    }

    @Override
    public String scan() {
        return "Combo Scan Result";
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo Print " + doc);
    }
}
