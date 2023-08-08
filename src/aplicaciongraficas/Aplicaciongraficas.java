
package aplicaciongraficas;
import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;

public class Aplicaciongraficas {

    public static void main(String[] args) {
        // TODO code application logic here
        miMarco m1 = new miMarco();
        
        m1.setVisible(true);
        
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class miMarco extends JFrame{
   public miMarco(){
        //setSize(500, 300);
       Toolkit mipantalla = Toolkit.getDefaultToolkit();
       
       Dimension tamanoPantalla = mipantalla.getScreenSize();
        
       int alturaPantalla = tamanoPantalla.height;
       int anchoPantalla = tamanoPantalla.width;
       
       setSize(anchoPantalla/2, alturaPantalla/2);
       
       setLocation(anchoPantalla/4, alturaPantalla/4);
    }
}
