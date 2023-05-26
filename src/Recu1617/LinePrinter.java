package Recu1617;

public class LinePrinter extends SequenceProcessor<String>{

    @Override
    protected void processElement(String element) {
        System.out.println("Element "+element);
    }
}
