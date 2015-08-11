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
public class valida {
  
    public static void validar( String login,String password)throws ReprobadoExcepcion{
          
        if(!(login.equals("examen")&& password.equals("aprobado")) ) throw new ReprobadoExcepcion();
        
    }
    }
    

