package JavaObject;

public class Mouse extends Animal {

    public Mouse(String myName, int myId) {
        super(myName, myId);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("A little mouse eating");
    }
}