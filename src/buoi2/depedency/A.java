package buoi2.depedency;

public class A {
    //field
    private String name;
   

    //function, method
    A(){}

    A(B bRemote){//beRemote local
        bRemote.printName();;
    }

    public void print() {
        B bRemote = new B();
        bRemote.printName();
    }

    public void setBRemote(B bRemote) {
        bRemote.printName();;
        
    }

}
