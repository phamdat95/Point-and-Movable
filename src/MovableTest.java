public class MovableTest {
    public static void main(String[] args) {
        Movable movable = new Movable(1,1,1,1);
        System.out.println(movable.toString());
        movable.move();
        System.out.println(movable.toString());
        movable.setXSpeed(2);
        movable.setYSpeed(2);
        movable.move();
        System.out.println(movable.toString());
        movable.setSpeed(3,3);
        movable.move();
        System.out.println(movable.toString() + "\n");

        Movable movable1 = new Movable(1,1);
        System.out.println(movable1.toString());
        movable1.move();
        System.out.println(movable1.toString());
        movable1.setXSpeed(4);
        movable1.setYSpeed(4);
        movable1.move();
        System.out.println(movable1.toString());
        movable1.setSpeed(5,5);
        movable1.move();
        System.out.println(movable1.toString() + "\n");

        Movable movable2 = new Movable();
        System.out.println(movable2.toString());
        movable2.move();
        System.out.println(movable2.toString());
    }
}
