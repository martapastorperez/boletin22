
package boletin22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Libreria extends Libro{
    PrintWriter escribir;
    Scanner scan;
    File fichero = new File("boletin22.txt");
    ArrayList<Libro> lista=new ArrayList();
    
 public String pedirTitulo(){
     return(JOptionPane.showInputDialog("Introduce el titulo del libro: "));
 }
 public String pedirAutor(){
      return(JOptionPane.showInputDialog("Introduce el autor del libro: "));
 }
  public int pedirUnidades(){   
     return(Integer.parseInt(JOptionPane.showInputDialog("Introduce las unidades del libro: ")));
      
 }
    public float pedirPrecio(){      
       return(Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro: ")));
 }      
  
    
 public void añadir(){
     lista.add(new Libro(pedirTitulo(),pedirAutor(), (int) pedirPrecio(),pedirUnidades()));
 }
 

public void buscar(){
    boolean atopado=false;
      String elemBus=JOptionPane.showInputDialog("titulo del libro que buscas:");
      for(int i=0;i<lista.size();i++){
            if(lista.get(i).getTitulo().equals(elemBus)){
              atopado=true;
        
        System.out.println("El libro "+getTitulo()+" esta, su precio es:  "+getPrecio());
            }
            else if(atopado==false)
        System.out.println("O libro "+getTitulo()+" non esta");
      }
  

}
public void visualizar(){
     for(int i=0; i<lista.size();i++)
         System.out.println(lista.get(i));
}
public void borrar(){
     for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getUnidades()==0){
                lista.remove(i);
            }
     }
}
 public void escribirLibreria(){
        try{
             escribir = new PrintWriter(new File("boletin22.txt"));
            for(int i = 0; i<lista.size(); i++){
                escribir.println(lista.get(i).getTitulo()+","+lista.get(i).getAutor()+","+lista.get(i).getPrecio()+","+lista.get(i).getUnidades());
            }
        }catch(Exception ex){
            System.out.println(ex + "Error");
        }finally{
             escribir.close();
        }
    }
  
    public void leer() {
        try {
            
            scan = new Scanner(fichero);

            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {

            scan.close();
        }

    }
}
