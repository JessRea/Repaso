/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author T-107
 */
public class ReprobadoExcepcion extends Exception{
    
    public ReprobadoExcepcion(){
      super ("Estás reprobado");
      
      Reprobado jFrame= new Reprobado();
      jFrame.setVisible(true);
    } 
    
}
