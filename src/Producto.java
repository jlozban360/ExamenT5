public class Producto
{
    private String codigo;

    public Producto( String codigo ) throws IllegalArgumentException {
        setCodigo( codigo );
    }

    public String getCodigo( ) {
        return codigo;
    }

    public void setCodigo( String codigo ) throws IllegalArgumentException
    {
        char[ ] charArray = codigo.toCharArray( );
        char[ ] abecedario = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',  'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z' };
        char[ ] numeros = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        boolean error = false;

        for( int i = 0; i < 6; i++ ) {
            switch( i )
            {
                case 0, 1:
                {
                    for( int j = 0; j < abecedario.length; j++ ) {
                        if( charArray[ i ] != abecedario[ j ] ) {
                            error = true;
                        }
                        else
                        {
                            error = false;
                            break;
                        }
                    }

                    if( error ) throw new IllegalArgumentException( "El formato no es correcto en las letras." );

                    break;
                }
                case 2:
                {
                    if( charArray[ i ] != '-')
                       error = true;

                    if( error ) throw new IllegalArgumentException( "El formato no es correcto en el guión." );

                    break;
                }
                case 3, 5:
                {
                    for( int j = 0; j < numeros.length; j++ ) {
                        if( charArray[ i ] != numeros[ j ] ) {
                            error = true;
                        }
                        else
                        {
                            error = false;
                            break;
                        }
                    }

                    if( error ) throw new IllegalArgumentException( "El formato no es correcto en los números finales." );

                    break;
                }
            }
        }

        this.codigo = codigo;
    }
}
