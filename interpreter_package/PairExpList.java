package interpreter_package;

public class PairExpList extends ExpList { 
    public Exp head; 
    public ExpList tail; 
    public PairExpList(Exp h, ExpList t) {
        head=h; 
        tail=t;
    }
}
