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
public interface Subject {
    //methods to register and unregister observers
public void subscribe(Observer obj);
public void unsubscribe(Observer obj);
//method to notify observers of change
public void notifyObservers();
//method to get updates from subject
public Object getUpdate(Observer obj);
}
