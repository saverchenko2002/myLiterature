import java.io.IOException;
import java.io.InputStream;

public class Day1 {
    public Day1(int d) throws IOException {
        double c = d;
        System.out.println((int) c);
        Double f = 4.2;
        System.out.println(f.intValue());
        done : {
            for (int i=0; i<6; i++)
                if(i==3)
                    break done;
                else System.out.println(i);
        }
        System.out.println("Java правит интернетом!");      //Первая программа на Java. (Первая?)
        double a = 10;
        char ignore;
        char str = (char) System.in.read();
        System.out.println("symbol " + str);
        System.out.println();
        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');
        char dc = (char) System.in.read();
        System.out.println("symbol " + dc);

        int counter = 0;
        for (counter = 1; counter <= 4; counter++) {
            switch (counter) {
                case 1:
                    System.out.println("case 1 worked");
                case 2:
                    System.out.println("case 2 worked");
                case 3:
                    System.out.println("case 3 worked");
                case 4:
                    System.out.println("case 4 worked");

            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) continue;
            System.out.println();
        }
    }
}
