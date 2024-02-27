import java.util.*;

public class Ut5_2
{
    static Scanner sc = new Scanner( System.in );

    public static void main( String[ ] args )
    {
        List<Integer> lista = new ArrayList<>();
        int valorIntroducido = 0;

        while( valorIntroducido >= 0 )
        {
            valorIntroducido = sc.nextInt();
            lista.add( valorIntroducido );
        }

        Iterator<Integer> i = lista.iterator( );
        int sumaValues = 0;
        int totalValues = 0;

        while( i.hasNext( ) )
        {
            sumaValues += i.next( );
            totalValues++;
        }

        double resultadoMedia = ( double ) sumaValues / totalValues;

        System.out.printf( "La media de edad es: %.2f\n", resultadoMedia );

        int encimaMedia = 0;
        int debajoMedia = 0;

        for( Integer aux: lista )
        {
            if( aux > resultadoMedia )
                encimaMedia++;
            else
                debajoMedia++;
        }

        System.out.printf( "Hay %d personas por debajo de la media\n", encimaMedia );
        System.out.printf( "Hay %d personas por encima de la media\n", debajoMedia );
    }
}
