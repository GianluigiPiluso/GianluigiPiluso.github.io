import java.awt.BorderLayout;
import javax.swing.JFrame;

public class AppletFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpendereCalorie myApplet = new SpendereCalorie(); // define applet of interest
	    JFrame myFrame = new JFrame("Applet -> Applicazione"); // create frame with title
	    myFrame.setSize(240, 350);
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Call applet's init method (since Java App does not
	    // call it as a browser automatically does)
	    myApplet.init();

	    // add applet to the frame
	    myFrame.add(myApplet, BorderLayout.CENTER);
	    //myFrame.pack(); // set window to appropriate size (for its elements)
	    myFrame.setVisible(true); // usual step to make frame visible
	}//Fine - main
}//Fine - AppletFrame
