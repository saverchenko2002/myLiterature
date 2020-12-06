import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Day3 {
    static double[] data = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
    static double d;
    static void sergey(){
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {

            for (double datum : data) {
                raf.writeDouble(datum);
            }

            raf.seek(0);
            d=raf.readDouble();
            System.out.println("Первое значение: "+d );

            raf.seek(8*3);
            d=raf.readDouble();
            System.out.println("Второе значение: "+d );

        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    static void sergey2(){
        try {
            int i=0;
            int c =2;
            int g = c/i;
        }
        catch (ArithmeticException exc) {
            System.out.println("ошибка епта");
        }
        finally {
            System.out.println("файналли епта");
        }
    }

}
