
package WAR.Decorador;

/**
 *
 * @author kai
 */
public abstract class DecoradorCafe implements Cafe{
    
    private final Cafe cafe;

    public DecoradorCafe(Cafe cafe) {
        this.cafe = cafe;
    }
    

}
