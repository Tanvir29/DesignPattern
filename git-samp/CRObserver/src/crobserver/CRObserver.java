/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crobserver;

/**
 *
 * @author User
 */
public class CRObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create subject
        Info topic = new Info();
//create observers
        Observer obj1 = new Registered("Obj1");
        Observer obj2 = new Registered("Obj2");
        Observer obj3 = new Registered("Obj3");
//register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
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
