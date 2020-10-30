/*
Create a 2player game of snake and ladder with user having the ability to undo 5 moves.
 */
package snakeandladder_memento;

/**
 *
 * @author Jereen
 */
public class SnakeAndLadder_Memento {

 
    public static void main(String[] args) {
        
        CareTaker ct = new CareTaker();
        Originator og = new Originator();
        System.out.println("\t\tSnake and Ladder");
        
        og.move1(0);
        og.move2(0);
        ct.commit(og);
        og.disp();
        
        og.move1(1);
        og.move2(4);
        ct.commit(og);
        og.disp();
        
        og.move1(3);
        og.move2(6);
        ct.commit(og);
        og.disp();
        
        og.move1(4);
        og.move2(7);
        ct.commit(og);
        og.disp();
        
        og.move1(10);
        og.move2(8);
        ct.commit(og);
        og.disp();
        
        og.move1(12);
        og.move2(12);
        ct.commit(og);
        og.disp();
        
        og.move1(15);
        og.move2(14);
        ct.commit(og);
        og.disp();
        
        og.move1(17);
        og.move2(20);
        ct.commit(og);
        og.disp();
        
        ct.undo(og);
        og.disp();
        
        ct.undo(og);
        og.disp();
        
        ct.undo(og);
        og.disp();
        
        ct.undo(og);
        og.disp();
        
        ct.undo(og);
        og.disp();
        
        ct.undo(og);
        og.disp();
    }
    
}
