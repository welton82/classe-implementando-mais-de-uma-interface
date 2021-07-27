package aplication;

import entities.Combodevice;
import entities.ConcretPrint;
import entities.ConcretScan;

public class Program {
    public static void main(String[] args) {

        ConcretPrint c = new ConcretPrint("3340");
        ConcretScan s = new ConcretScan("55");
        Combodevice cb = new Combodevice("2003");
        System.out.println("\n  Concret Print");
        c.print("Carta");
        c.processDic("Escrecendo minha carta");

        System.out.println("\nConcret Scan");
        s.processDic("E-mail");
        System.out.println(s.scan());

        System.out.println("\nCombo Device");
        cb.processDic("Dissertação");
        cb.print("Dissertação");
        System.out.println(cb.scan());

    }   
}
