
package snake.game;


import javax.swing.*;

public class Snake extends JFrame {
    Snake(){
        Board b= new Board();
        add(b);
        pack();
        setLocationRelativeTo(null);
        setTitle("Snake Game");
        setResizable(false);
    }
    
    public static void main(String[] args){
        new Snake().setVisible(true);
    }
    
}
