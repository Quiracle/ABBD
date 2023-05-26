package Recu1617;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LineIterator implements Iterator<String> {
    private final BufferedReader reader;
    public String nextElement;
    public LineIterator(BufferedReader reader){
        this.reader= reader;
        computeNextElement();
    }

    private void computeNextElement(){
        try{
            nextElement = reader.readLine();
        }
        catch (IOException ex){
            nextElement=null;
        }
    }

    public boolean hasNext(){
        return nextElement!=null;
    }

    public String next(){
        if (nextElement==null){
            throw new NoSuchElementException("No more lines");
        }
        var next =nextElement;
        computeNextElement();
        return next;
    }
}
