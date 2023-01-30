/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Battle.main;

import Battle.classes.Fighter;
import Battle.classes.Fight;

public class Main {
    
    //Dois Arrays para uso no metodo main.
    public static Fighter f[] = new Fighter[3];
    public static Fight l[] = new Fight[3];
    
    public static void main(String[] args) {
        
        //Nome das categorias em português-BR propositalmente.
        //Dois lutadores foram criados.
        f[0] = new Fighter();
        f[0].register("Pedro", "Brasil", 18, 1.72,66, 0, 0, 0);
        f[0].introduceFighter();
        
        f[1] = new Fighter();
        f[1].register("Steven", "USA", 18, 1.70, 66, 0, 0, 0);
        f[1].introduceFighter();
        
        //Uma luta foi criada.
        l[0] = new Fight();
        l[0].arrangeFight(f[0], f[1], 2);
        l[0].startFight();
        
        //status() para verificar mudanças.
        //Tambem poderia ser usado o metodo .introduceFighter().
        f[0].status();
        f[1].status();
        
    }
  
}
