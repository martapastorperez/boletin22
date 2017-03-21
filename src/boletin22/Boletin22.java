
package boletin22;

import javax.swing.JOptionPane;


public class Boletin22 {

    public static void main(String[] args) {
        Libreria libre=new Libreria();
       
       
    int op=0;
    libre.leer();
      do{
  
            try{
        op = Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1. Introduce  \n2.visualizar \n3.buscar \n4. borra \n5. escribir \n6. salir"));
        
            }catch(Exception e){
                System.out.println(e.getMessage());
                op = 0;
            }
                switch (op) {

            case 1:
                libre.añadir();
                break;
            case 2:
                libre.visualizar();
                break;
            case 3:
                libre.buscar();
            case 4:
               libre.borrar();
                break;
            case 5:
                libre.escribirLibreria();
                break;
            case 6:
                System.exit(0);
        
                }
    }while (op<6);
}

    }

    

