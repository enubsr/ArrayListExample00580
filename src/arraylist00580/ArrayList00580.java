/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist00580;

import arraylist00580.ArrayList.ArrayIterator;

/**
 *
 * @author Enubs
 */
public class ArrayList00580 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arr = new ArrayList<>(10);
        arr.add(0, "dog");
        arr.add(1, "cat");
        arr.add(2, "lion");
        arr.add(3, "tiger");
        
        ArrayIterator iter = arr.new ArrayIterator();
        
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        
        
    }
    
}
