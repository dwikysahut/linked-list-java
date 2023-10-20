/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author dwikyhutomo
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListData llData=new LinkedListData();
        llData.insertLast(10);
        llData.insertLast(20);
        llData.insertLast(30);
        llData.insertLast(70);
        llData.addFirst(40);
        llData.addAfter(88,30);
        llData.addBefore(77,30);
        
        llData.display();
        System.out.println("setelah hapus last");
        llData.deleteLast();
        llData.display();
        
    }
    
}
