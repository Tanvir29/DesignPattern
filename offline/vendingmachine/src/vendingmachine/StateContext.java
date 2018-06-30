package vendingmachine;

public class StateContext {
	private State accepted;
	private State requested;
	private State granted;
	private State state;
	public StateContext() {
		super();
		accepted=new AcceptedState();
		requested=new RequestedState();
		granted=new GrantedState();
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
	public void setState(State s){
		state=s;
	}
	public State getAcceptedState(){
		return accepted;
	}
	public State getGrantedState(){
		return granted;
	}
	public State getRequestedState(){
		return requested;
	}
	
}
