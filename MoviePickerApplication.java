import javax.swing.JFrame;

public class MoviePickerApplication {

	/**
	 * Sets the width of the frame to 500 pixels
	 */
	public static int FRAME_WIDTH = 500;

	/**
	 * Sets the height of the frame to 300 pixels
	 */
	public static int FRAME_HEIGHT = 300;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame roster = new JFrame("What movie should we watch?");
		// Adds picker to the window.
		roster.add(new Picker());
		roster.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		roster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		roster.setVisible(true);
	}

}
