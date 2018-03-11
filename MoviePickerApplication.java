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
		JFrame picker = new JFrame("What movie should we watch?");
		// Adds picker to the window.
		picker.add(new Picker());
		picker.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		picker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		picker.setVisible(true);
	}

}
