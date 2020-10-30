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
public class CareTaker {
    
    private ArrayList<Object> object_list = new ArrayList<>(5);
    
    
    public void commit(Originator obj)
    {
        object_list.add(obj.createMemento());
        
        if(object_list.size()>6)
        {
            object_list.remove(0);
        }
    }
    
   public void undo(Originator obj)
   {
       if((object_list.size()-2)>=0)
       {
           obj.undo(object_list.get(object_list.size()-2));
           object_list.remove(object_list.size()-1);
       }
       else
           System.out.println("\nNothing to undo");
   }

    
    
}
