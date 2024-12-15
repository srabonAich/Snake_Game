
package snakegame;

import javax.swing.*;


public class SnakeGame extends JFrame{

    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();//refreshes the frame
        
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SnakeGame();
    }
    
}
