
package assignment2;


public class Assignment2 {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StateCntxt scntx=new StateCntxt();
        scntx.acceptApplication();
        scntx.requestPermission();
        scntx.grantPermission();
        System.out.println(scntx.getStatus());
    }
    
}
