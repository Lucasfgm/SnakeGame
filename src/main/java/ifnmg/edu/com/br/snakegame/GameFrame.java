package ifnmg.edu.com.br.snakegame;

import javax.swing.JFrame;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */
public class GameFrame extends JFrame{
    
   GameFrame(){
       
       GamePanel panel = new GamePanel();
       this.add(panel);
       this.setTitle("Snake Game");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);
               
   }
    
}
