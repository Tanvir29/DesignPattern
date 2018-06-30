package vendingmachine;

public class GrantedState implements State{
	@Override
	public String getStatus() {
		
		return "Request received";
	}

	@Override
	public void grantPermission(StateContext stc) {
		
		System.out.println("Invalid State");
	}

	@Override
	public void requestPermission(StateContext stc) {
		System.out.println("Invalid State");
	}

}
