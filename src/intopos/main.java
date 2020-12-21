
package intopos;

/**
 *
 * @author asim
 */
public class main 
{
    public static void main(String[] args) 
    {
        InToPos obj=new InToPos();
        String expression="K+L-M*N+(O^P)*W/U/V*T+Q";
        
        System.out.println(obj.inToPos(expression));
        
        
    }
   
}
