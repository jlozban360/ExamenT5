import java.util.*;

public class Haciendo_inventario
{
    static Set<String> listaProductos = new HashSet<>(150000);
    static Scanner sc = new Scanner( System.in );
    public static void main( String[ ] args ) {
        int valorIntroducido = -1;
        System.out.println( "Cuantos productos hay en el almacen: " );
        int numProductos = sc.nextInt( );
        sc.nextLine( );

        while( true )
        {
            //sc.nextLine( );
            System.out.println( "Nombre del producto: " );
            String line = sc.nextLine( );

            if( line.equals( "0" ) ) break;
            listaProductos.add( line.toLowerCase() );
        }

        int productosCount = 0;
        for( String aux: listaProductos )
            productosCount++;

        System.out.println( "Hay un total de " + productosCount + " productos" );
    }
}
