package vendingmachine;

public class AcceptedState implements State {
	
	@Override
	public String getStatus() {
		return "Request received";
	}

	@Override
	public void grantPermission(StateContext stc) {
		System.out.println("Invalid state");
	}

	@Override
	public void requestPermission(StateContext stc) {
		System.out.println("Requesting Permission");
		stc.setState(stc.getRequestedState());
	}

}
