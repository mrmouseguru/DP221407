package buoi2.association;

public class A {
    //field
    private String name;
    private B bRemote;

    //function, method
    A(){}

    A(B bRemote){//beRemote local
        this.bRemote = bRemote;
    }

    public void print() {
        bRemote.printName();
    }

}
