
/**
 *
 * @author RGH-LS12-07
 */
public class MultiProgramacionConcurrente {
    
    public static void main(String[] args){
        //llamado al formulario al metodo principal
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiProgramacion().setVisible(true);
            }
        });
    }
}
