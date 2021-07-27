package entities;
import enums.MeuScan;
public class ConcretScan extends Device implements MeuScan{

    private String doc;



    public ConcretScan(String doc) {
        super(doc);

    }



    @Override
    public void processDic(String doc) {
        System.out.println("ConcretScan of Device " + doc);
    }

    @Override
    public String scan() {
        return "concretScan of scan";
    }
}
