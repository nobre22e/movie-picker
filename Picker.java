import java.util.Random;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Picker extends JPanel {
	protected Random rand = new Random();
	protected JTextField movieNum;
	protected JButton enter;
	protected JLabel result;
	protected JPanel enterPanel;
	protected JPanel resultPanel;

	public Picker() {
		super();
		setLayout(new BorderLayout());
		movieNum = new JTextField("How many movies to pick from?", 25);
		enter = new JButton("Pick for me");
		result = new JLabel();
		enterPanel = new JPanel();
		resultPanel = new JPanel();
		resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.X_AXIS));

		addEnterPanel();
		add(enterPanel, BorderLayout.NORTH);

		addResultPanel();
		add(resultPanel, BorderLayout.CENTER);
	}

	protected void addEnterPanel() {
		enterPanel.setBackground(new Color(218, 252, 143));
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = movieNum.getText();
				int num = Integer.parseInt(number);
				int movie = rand.nextInt(num) + 1;
				result.setText("Watch movie number " + movie);
				movieNum.selectAll();
				validate();
			}
		});
		enterPanel.add(movieNum);
		movieNum.selectAll();
		enterPanel.add(enter);
	}

	private void addResultPanel() {

		resultPanel.setBackground(new Color(218, 252, 143));
		result.setFont(new Font(result.getFont().getName(), Font.PLAIN, 20));

		resultPanel.add(Box.createHorizontalGlue());
		resultPanel.add(result);
		resultPanel.add(Box.createHorizontalGlue());
	}
}
