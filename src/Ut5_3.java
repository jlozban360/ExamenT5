import java.time.LocalDate;
import java.util.*;

public class Ut5_3
{
    static Set<String> almacen = new LinkedHashSet<>();

    public static void main( String[ ] args ) throws IllegalArgumentException
    {
        Scanner sc = new Scanner( System.in );
        String valor_introducido = "";

        while( true )
        {
            System.out.println( "Introduce el código: " );
            String lineCode = sc.nextLine( );
            if( lineCode.equalsIgnoreCase( "fin" ) ) break;

            Producto p1 = new Producto( lineCode );

            System.out.println( "Introduce la fecha (yyyy-MM-dd): " );
            String lineDate = sc.nextLine();
            if( lineDate.equalsIgnoreCase( "fin" ) ) break;

            LocalDate fecha = LocalDate.parse( lineDate );

            if (almacen.contains( lineCode ) )
                System.out.println( "Producto existente, no se actualiza." );
            else {
                String formatString = lineCode + " " + lineDate;
                almacen.add( formatString );
                System.out.println( "Nuevo producto. Registrado" );
            }
        }

        System.out.println( "LISTADO DEL ALMACÉN" );
        for( String aux: almacen )
            System.out.println( "> " + aux );
    }
}
