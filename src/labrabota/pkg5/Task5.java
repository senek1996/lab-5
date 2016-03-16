/*
 * Эта прога проверяет, касаются ли окр-ти в одной точке
 */
package labrabota.pkg5;

public class Task5 {

    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Circle obj2 = new Circle();
        if (obj1.kas(obj1.r,obj2.r,obj1.rasst(obj1.x, obj2.x, obj1.y, obj2.y))==true) {
            System.out.print("Пересекаются в одной точке");
        }
        else System.out.print("Не пересекаются в одной точке");
    }


}
