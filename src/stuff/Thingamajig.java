package stuff;

import goods.Widget;

public class Thingamajig extends Widget {
    public static void main(String[] args) {
        Widget widget = new Widget();
        System.out.println("Public variable i: " +widget.i);
        //Cannot access protected variable j in class Widget.
        //System.out.println("Protected variable j: " +widget.j);
        //Cannot access variable y that has no defined access in class Widget.
        //System.out.println("No Access Defined variable x: " +widget.x);
        //Cannot access privately defined variable y in class Widget.
        //System.out.println("Private variable y: " +widget.y);
    }
}
