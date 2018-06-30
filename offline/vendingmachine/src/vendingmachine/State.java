package vendingmachine;

public interface State {
void grantPermission(StateContext stc);
void requestPermission(StateContext stc);
String getStatus();
}
