import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ut5_1
{
    static Set<Integer> listaNumeros = new TreeSet<>();

    public static void main( String[ ] args )
    {
        int randomNumber = 0;

        for( int i = 0; i < 6; i++ )
        {
            int numero = buscarNumeroRandom( );

            while( listaNumeros.contains( numero ) ) {
                numero = buscarNumeroRandom();
            }

            listaNumeros.add( buscarNumeroRandom( ) );
        }

        System.out.print( "Apuesta: [");
        int i = 0;
        for( Integer aux: listaNumeros ) {
            i++;
            if( i < 6 )
                System.out.printf( "%d, ", aux );
            else
                System.out.printf( "%d", aux );
        }
        System.out.println( "]" );

        //Pintar matriz
        int counter = 0;
        for( int j = 0; j < 50 ; j++ )
        {
            if( j == 0 )
                System.out.printf( "     " );
            else if( j > 9 ) {
                if( listaNumeros.contains( j ) )
                    System.out.printf( "XX   ", j );
                else
                    System.out.printf( "%d   ", j );
            }
            else
            {
                if( !listaNumeros.contains( j ) )
                    System.out.printf( " %d   ", j );
                else
                    System.out.printf( "XX   ", j );
            }

            if( counter == 9 ) {
                counter = 0;
                System.out.println( );
            }
            else
                counter++;
        }
    }

    private static int buscarNumeroRandom( )
    {
        int randomNumber = 0;
        Random r1 = new Random( );
        randomNumber = r1.nextInt( 50 ) + 1;
        return randomNumber;
    }
}
