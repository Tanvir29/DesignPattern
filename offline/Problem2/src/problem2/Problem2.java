/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author User
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        //create subject
        News topic = new News();
//create observers
        Observer obj1 = new Subscribers("Obj1");
        Observer obj2 = new Subscribers("Obj2");
        Observer obj3 = new Subscribers("Obj3");
//register observers to the subject
        topic.subscribe(obj1);
        topic.subscribe(obj2);
        topic.subscribe(obj3);
//attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
//check if any update is available
        obj1.update();
//now send message to subject
        topic.postMessage("New Message");
    }
    
}
