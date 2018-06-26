import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejki {
    public static void main(String[] args) {
        Queue<Integer> liczby = new LinkedList<> ();
        Scanner sc = new Scanner (System.in);
        int suma =0;
        System.out.println ("Podaj 10 liczb:" );
        for (int i =0; i<10;i++) {
            int a = sc.nextInt ();
            liczby.offer (a);
            suma+=a;

        }
        int i =0;
        Iterator<Integer> iterator = liczby.iterator ( );
        while (iterator.hasNext ()){
            i++;
            if (i!=liczby.size ()){
                int a =iterator.next ();
                System.out.print (a+"+" );
            }else {
                int a = iterator.next ();
                System.out.print (a );
            }
        }

        System.out.print ("="+suma );
    }
}
