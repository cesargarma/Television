package dam;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        System.out.println(tv);

        tv.turnOn();
        tv.changeChannel(69);
        tv.volume();
        System.out.println(tv);
        tv.turnOff();
        System.out.println(tv);
        tv.turnOn();
        System.out.println(tv);
    }
}
