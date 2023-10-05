package parameters;

import java.util.ArrayList;
import java.util.List;


    public class parameters {
        public static void main ( String [] args ) {
            List< Integer > list = new ArrayList< >( ) ;
            list.add(4) ;
            changeList(list) ;
            System.out.println ( list ) ;
        }

    public static void changeList(List <Integer> list) {
        list = new ArrayList<> () ;
        list.add(1) ;
    }
}
