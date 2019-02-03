package goods;

public class Gizmo {
    public static void main(String[] args) {
        Widget widget = new Widget();
        System.out.println("Public variable i: " +widget.i);
        System.out.println("Protected variable j: " +widget.j);
        System.out.println("No Access Defined variable x: " +widget.x);
        //Cannot access privately defined variable y in class Widget.
        //System.out.println("Private variable y: " +widget.y);
    }
}
