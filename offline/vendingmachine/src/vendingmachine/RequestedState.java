package vendingmachine;

public class RequestedState implements State {
	
	
	@Override
	public String getStatus() {
		System.out.println("Requested Permission");
		return null;
	}

	@Override
	public void grantPermission(StateContext stc) {
		System.out.println("Granting Permission");
		stc.setState(stc.getGrantedState());
	}

	@Override
	public void requestPermission(StateContext stc) {
		// TODO Auto-generated method stub
		System.out.println("Permission already requested");
	}

}
