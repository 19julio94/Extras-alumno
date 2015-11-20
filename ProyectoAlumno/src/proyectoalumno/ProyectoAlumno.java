
package proyectoalumno;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class ProyectoAlumno {

   
    public static void main(String[] args) {
   Alumno alu1=new Alumno();
   
  
   alu1.cambiarValor();
   alu1.visualizaDatos();
          
JOptionPane.showMessageDialog(null, alu1.visualizaDatos());
           
Alumno alu2=new Alumno();
   alu2.cambiarValor();
   alu2.visualizaDatos();
   JOptionPane.showMessageDialog(null, alu2.visualizaDatos());
           
           
           
    }
    
}
