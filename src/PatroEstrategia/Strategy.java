package PatroEstrategia;

//PATRO ESTRATEGIA
public interface Strategy<E> {
    void processElement(E element);
    void initProcess();
    void endProcess();
}
