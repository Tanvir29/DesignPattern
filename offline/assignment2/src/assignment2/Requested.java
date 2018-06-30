
package assignment2;

public class Requested implements States {

 
	
	
    @Override
	public String getStatus() {
		System.out.println("Requested Permission");
		return null;
	}

    @Override
	public void grantPermission(StateCntxt stc) {
		System.out.println("Granting Permission");
		stc.setState(stc.getGrantedState());
	}

	public void requestPermission(StateCntxt stc) {
		// TODO Auto-generated method stub
		System.out.println("Permission already requested");
	}

}
