/*
 * Эта прог-а вычисляет радиус окружности по методу из класса Circle
 */

package labrabota.pkg5;


public class Task1 {
    public static void main(String[] args) {

        Circle obj = new Circle();
        double r;
        r=obj.r;

        System.out.println("Длина окружности с радиусом " + r + " равна " + obj.Cirlen(r));
    }
}
