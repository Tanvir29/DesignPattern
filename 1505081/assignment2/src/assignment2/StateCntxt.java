/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

public class StateCntxt {
        private States accepted;
	private States requested;
	private States granted;
	private States state;
	public StateCntxt() {
		super();
		accepted=new Accepted();
		requested=new Requested();
		granted=new Granted();
	}
	public void acceptApplication(){
		state=accepted;
	}
	public void requestPermission(){
		state.requestPermission(this);
	}
	public void grantPermission(){
		state.grantPermission(this);
	}
	public String getStatus(){
		return state.getStatus();
	}
	public void setState(States s){
		state=s;
	}
	public States getAcceptedState(){
		return accepted;
	}
	public States getGrantedState(){
		return granted;
	}
	public States getRequestedState(){
		return requested;
	}
	
}
