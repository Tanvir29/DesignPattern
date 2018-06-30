/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

public class Accepted implements States {

 
	
    /**
     *
     * @return
     */
    @Override
	public String getStatus() {
		return "Request received";
	}

    @Override
	public void grantPermission(StateCntxt stc) {
		System.out.println("Invalid state");
	}

    /**
     *
     * @param stc
     */
    @Override
	public void requestPermission(StateCntxt stc) {
		System.out.println("Requesting Permission");
		stc.setState(stc.getRequestedState());
	}

}
