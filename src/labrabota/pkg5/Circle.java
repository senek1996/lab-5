/*
 * Эта прог-а вычисляет радиус окружности по методу из класса Circle
 */
package labrabota.pkg5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Circle {

    // свойства класса

    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус
    // методы класса
    // выводит на экран параметры окружности

    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
    }

    // перемещает центр, движение окружности

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }

    // масштабируем, выполняем преобразование подобия с коэффициентом k

    public void zoomCircle(double k) {
        r = r * k;
    }

    //длина окружности (задача 1)

    public double Cirlen(double r) {
        return 2 * 3.141592 * r;
    }

    //перемещение окружности (задача 2)

    public void moveCircleRandom() {
        x = (int) (Math.random() * 199) - 99;
        y = (int) (Math.random() * 199) - 99;
        System.out.print("Окружность перемещена. Ее центр: (" + x + ";" + y + ").");
    }

    //конструктор (Задача 3)

    Circle() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s1 = null;
        String s2 = null;
        String s3 = null;
        double r, x, y;

        System.out.print("Введите радиус: \n");
        

        try {
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            r = Double.parseDouble(s1);
            System.out.print("Введите координаты х и у: \n");
            s2 = bufferedReader.readLine(); //читаем строку с клавиатуры
            x = Double.parseDouble(s2);
            s3 = bufferedReader.readLine(); //читаем строку с клавиатуры
            y = Double.parseDouble(s3);
        } catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
        //занесение в объект
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    //вычисление расстояний между центрами окружностей (задача 4)
    public double rasst(double x1,double x2,double y1,double y2) {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    //Опеределение касания окружностей в одной точке
    public boolean kas (double r1 ,double r2,double rasst){
         if (r1== r2 + rasst || r2==r1+rasst || rasst==r1+r2 )
             return true;
         else return false;
 
     }
}
