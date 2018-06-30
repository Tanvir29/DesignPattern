/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

public class Granted implements States{

    
    @Override
	public String getStatus() {
		
		return "Request received";
	}

    @Override
	public void grantPermission(StateCntxt stc) {
		
		System.out.println("Invalid State");
	}

    @Override
	public void requestPermission(StateCntxt stc) {
		System.out.println("Invalid State");
	}

}
