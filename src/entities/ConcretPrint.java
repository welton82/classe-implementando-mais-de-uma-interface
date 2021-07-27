package entities;

import enums.Printer;

public class ConcretPrint extends Device implements Printer {



    public ConcretPrint(String doc) {
        super(doc);

    }

    @Override
    public void processDic(String doc) {
        System.out.println("Process ConcretPrint of Printer: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Process ConcretPrint of Device " + doc);
    }
}
