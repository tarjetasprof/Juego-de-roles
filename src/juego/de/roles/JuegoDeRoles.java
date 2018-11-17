/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.de.roles;

import javax.swing.JOptionPane;
import java.util.Random;

/** @author guille
 */
public class JuegoDeRoles {

    /**
     * @param args the command line arguments
     */

   
               
    public static void main (String[] args) {
        // TODO code application logic here
    
      JOptionPane.showMessageDialog(null,"Bienvenido " +  "a la "+ "GUERRA DE LOS ELEMENTOS\n" 
                                       + "          La batalla del agua y del fuego.");
        
        Fuego jugador1 = new Fuego();
        Agua jugador2 = new Agua();
        
        while(jugador1.vida () > 0 && jugador2.vida () > 0);   
        
        JOptionPane.showMessageDialog(null,"¡Batalla! ");
               System.out.println("¡Batalla!"); 

                          
           
                Random aleatorio = new Random();
                int n = aleatorio.nextInt(10);
            
                int GolpeF= n * jugador1.minPower;
                int GolpeA= n * jugador2.minPower;                                        
                JOptionPane.showMessageDialog(null,"Fuego obtuvo "+ GolpeF + " y Agua obtuvo "+ GolpeA);
                               
                if (GolpeF > GolpeA){
                    jugador2.vida= jugador2.vida -1;
                    System.out.println("¡Ganó el Fuego!");
                    JOptionPane.showMessageDialog(null,"¡Fuego ganó la batalla!");
                    JOptionPane.showMessageDialog(null,"Agua tiene "+jugador2.vida+" vidas");
                }else 
                    jugador1.vida= jugador1.vida -1;
                    System.out.println("¡Ganó el Agua!");
                    JOptionPane.showMessageDialog(null,"¡El Agua ganó la batalla!");
                    JOptionPane.showMessageDialog(null,"Fuego tiene "+jugador1.vida+" vidas");
            
                int GolpeF2= n * jugador1.maxPower;
                int GolpeA2= n * jugador2.maxPower;                                        
                JOptionPane.showMessageDialog(null,"Fuego obtuvo "+ GolpeF2 + " y Agua obtuvo "+ GolpeA2);

                
                if (GolpeF2 > GolpeA2){
                    jugador2.vida= jugador2.vida -1;
                    System.out.println("Ganó el Fuego");
                    JOptionPane.showMessageDialog(null,"Fuego ganó la batalla");
                    JOptionPane.showMessageDialog(null,"Agua tiene "+jugador2.vida+ " vidas.");
                }else 
                    jugador1.vida= jugador1.vida -1;
                    System.out.println("¡Ganó el Agua!");
                    JOptionPane.showMessageDialog(null,"¡El Agua ganó la batalla!");
                    JOptionPane.showMessageDialog(null,"Fuego tiene "+jugador1.vida+ " vidas."); 
            }
          
  
  
            }
            