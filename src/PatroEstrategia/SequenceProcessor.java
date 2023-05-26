package PatroEstrategia;

import java.util.Iterator;

public class SequenceProcessor {
    public static <E> void processSequence(Iterator<E> it, Strategy<E> sequenceOps){
        sequenceOps.initProcess();
        while(it.hasNext()){
            var e = it.next();
            sequenceOps.processElement(e);
        }
        sequenceOps.endProcess();
    }
}
