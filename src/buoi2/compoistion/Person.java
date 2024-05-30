package buoi2.compoistion;

public class Person {
    private String name;
    private Head headRemote;

    Person(){
        headRemote = new Head();
    }

    public void control() {
        headRemote.roate();
    }

}
