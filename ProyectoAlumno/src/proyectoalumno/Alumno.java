package proyectoalumno;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Alumno {
private static int referencia=5500;
String nome,curso;
int idade;
public Alumno(){
this.referencia=this.referencia +1;
}
public Alumno(String nom,String curs,int idad){
this.idade=idad;
this.curso=curs;
this.nome=nom;
this.referencia=this.referencia +1;

}
public Alumno cambiarValor(){
this.nome=JOptionPane.showInputDialog("Introduce o nome");
this.curso=JOptionPane.showInputDialog("Introduce o curso");
this.idade= Integer.parseInt(JOptionPane.showInputDialog("Introduce a idade")); 

return this;
}    

public String visualizaDatos(){

    String respuesta="";
    
    respuesta= "Nome alumno: "+this.nome+"\n Curso: "+this.curso+"\n Idade: "+ this.idade+"\n Referencia: "+this.referencia;
return respuesta;

}







}
