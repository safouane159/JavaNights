


public class OverRiddingVsHidding {


    public static void main(String[] args) {
        System.out.println("hello world");
        Bear bear = new Bear();
        Bear.speak();
        Panda panda = new Panda();
        Panda.speak();

    }
}

class Bear {

public static void speak(){
    System.out.println("im a bear");
}

}
class Panda extends Bear {


    public  static void speak(){
        System.out.println("im a panda");
    }


}