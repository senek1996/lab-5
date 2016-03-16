/*
 * Эта прога вычисляет расстояние между центрами окружностей.
 */
package labrabota.pkg5;

public class Task4 {
   
    public static void main(String[] args) {
        Circle obj1=new Circle();
        Circle obj2=new Circle();
        double r=obj1.rasst(obj1.x, obj2.x, obj1.y, obj2.y);
        obj1.printCircle(); obj2.printCircle();
        System.out.print("Расстояние между окр-ми равно "+r);
    }
}
