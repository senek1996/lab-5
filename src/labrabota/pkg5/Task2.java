/*
 * Эта прога перемещает окружность методом из класса Circle.
 */
package labrabota.pkg5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task2 {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        Circle obj=new Circle();
        obj.moveCircleRandom();
    }
    
}
