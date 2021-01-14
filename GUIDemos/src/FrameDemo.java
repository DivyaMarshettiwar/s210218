import javax.swing.JFrame;

public class FrameDemo {
public static void main(String[] args) {
	JFrame frame=new JFrame();
	//this will help us in creating the Frame which will have max,min,close.
	//the frame is invisible to the user.
	
	//frame.setSize(500, 500);
	
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	//this will decide the size of frame
	
	//frame.setUndecorated(true);
	//the above is used for the purpose of gaming when we dont want to show
	//max,min,close buttons
	
	frame.setTitle("My first java application");
	//this is used to display the title of the frame
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//by default the close button will hide my application 
	//my application will be running in the back ground
	//to stop that u need to specify the above command.
	frame.setVisible(true);
	//this method helps us in viewing the frame
}
}
