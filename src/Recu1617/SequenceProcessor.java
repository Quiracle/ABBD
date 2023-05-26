package Recu1617;

import java.util.Iterator;

//TEMPLATE METHOD, podem implementar aquest metode per a fer molts tipus de processadors, i tot tindran
//aquest esquema
public abstract class SequenceProcessor<E> {

    protected abstract void processElement(E element);
    public void processSequence(Iterator<E> it){
        while(it.hasNext()){
            var element = it.next();
            processElement(element);
        }
    }

    //HOOK METHODS,cada fill pot decidir si implementar aquestes funcions o no
    protected void initProcess(){}

    public void endProcess(){}
}

