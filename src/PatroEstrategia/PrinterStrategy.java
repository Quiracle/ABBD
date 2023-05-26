package PatroEstrategia;

import PatroEstrategia.SimpleStrategy;

public class PrinterStrategy extends SimpleStrategy<String> {
    public void processElement(String e){
        System.out.println("Element "+e);
    }
}
