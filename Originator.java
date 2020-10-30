/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeandladder_memento;

import java.util.ArrayList;
/**
 *
 * @author Jereen
 */
public class Originator 
{
    private int pos1 = 0;
    private int pos2 = 0;
    
    public void move1(int s)
    {
        if(pos1!=s)
        {
            System.out.println("\nPlayer1 moved");
            pos1 = s;
        }
    }
    public void move2(int s)
    {
        if(pos2!=s)
        {
            System.out.println("Player2 moved");
            pos2 = s;
        }
    }
    public void undo(Object obj)
    {
        System.out.println("\nUndo Operation");
        Memento mem = (Memento) obj;
        pos1 = mem.p1;
        pos2 = mem.p2;
    }
    public Memento createMemento()
    {
        Memento m = new Memento(pos1,pos2);
        return m;
    }
    
    private class Memento
    {
        int p1,p2;
        public Memento(int pos1,int pos2)
        {
            p1 = pos1;
            p2 = pos2;
        }
    }
    public void disp()
    {
        System.out.println("Current Positions:\nPlayer1-> "+ pos1+"\nPlayer2->"+ pos2);
    }
}
