public class Runner {

    public static void main(String[]args) {
        Car Honda = new Car(2012, " Honda " , 100000, " 4 " );
        System.out.println(Honda.toString());
        Honda.setMiles(100001);
        System.out.println(Honda.toString());
        Rectangle Jeff = new Rectangle(5, 5);
        System.out.println(Jeff.getArea());
        System.out.println(Jeff.getDiagonal());
        System.out.println(Jeff.isSquare());
        }
}
