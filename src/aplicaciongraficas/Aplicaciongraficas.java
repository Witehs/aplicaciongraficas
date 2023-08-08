
package aplicaciongraficas;
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
        setBounds(500, 300, 500, 200);
        setResizable(false);
    }
}
