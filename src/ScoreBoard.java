import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard implements ActionListener {
	//CHANGE FONTS FOR GRADE
	
	//example ...Scoreboard extends JFrame implements ActionListener GOOD
	//example ...Scoreboard extends JFrame implements ActionListener,  GOOD
	//example ...Scoreboard extends JFrame, JPanel implements ActionListener BAD
	
	//extends means inherit - use all vars and methods of the superclass
	//implements means you must use an "interface" (ActionListener)
	
	int homeScoreAmount = 0;
	int visitorScoreAmount = 0;
	
	JPanel titlePanel, scorePanel, buttonPanel;
	JLabel homeLabel, visitorLabel, homeScore, visitorScore;
	
	JButton resetButton;
	JButton addOneHome, addTwoHome, addThreeHome, addSixHome, minusOneHome;
	JButton addOneVisitor, addTwoVisitor, addThreeVisitor, addSixVisitor, minusOneVisitor;



	public Container createContentPane() {
		
		JPanel totalGUI = new JPanel();
		totalGUI.setBackground(Color.YELLOW);
		totalGUI.setSize(400, 300);
		totalGUI.setLayout(null);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(10, 10);
		titlePanel.setSize(330, 30);
		totalGUI.add(titlePanel);
		
		homeLabel = new JLabel("Home Team");
		homeLabel.setLocation(-15, 0);
		homeLabel.setSize(200, 30);
		homeLabel.setHorizontalAlignment(0);
		homeLabel.setForeground(Color.RED);
		titlePanel.add(homeLabel);
		
		visitorLabel = new JLabel("Visitor Team");
		visitorLabel.setLocation(160, 0 );
		visitorLabel.setSize(200, 30);
		visitorLabel.setHorizontalAlignment(0);
		visitorLabel.setForeground(Color.BLUE);
		titlePanel.add(visitorLabel);
		
		scorePanel = new JPanel(); // JPanel scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setBackground(Color.PINK);
		scorePanel.setLocation(10, 50);
		scorePanel.setSize(330, 30);
		totalGUI.add(scorePanel);
		
		homeScore = new JLabel("" + homeScoreAmount);
		homeScore.setLocation(-18, 0);
		homeScore.setSize(200, 30);
		homeScore.setHorizontalAlignment(0);
		scorePanel.add(homeScore);
		
		visitorScore = new JLabel("" + visitorScoreAmount);
		visitorScore.setLocation(160, 0);
		visitorScore.setSize(200, 30);
		visitorScore.setHorizontalAlignment(0);
		scorePanel.add(visitorScore);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(10, 90);
		buttonPanel.setSize(330, 210);
		totalGUI.add(buttonPanel);
		
		addOneHome = new JButton("+1");
		addOneHome.setFont(new Font("Courier New", Font.PLAIN, 12));
		addOneHome.setLocation(0, 0);
		addOneHome.setSize(160, 30);
		addOneHome.addActionListener(this);
		buttonPanel.add(addOneHome);
		
		addTwoHome = new JButton("+2");
		addTwoHome.setFont(new Font("Courier New", Font.PLAIN, 12));
		addTwoHome.setLocation(0, 35);
		addTwoHome.setSize(160, 30);
		addTwoHome.addActionListener(this);
		buttonPanel.add(addTwoHome);
		
		addThreeHome = new JButton("+3");
		addThreeHome.setFont(new Font("Courier New", Font.PLAIN, 12));
		addThreeHome.setLocation(0, 70);
		addThreeHome.setSize(160, 30);
		addThreeHome.addActionListener(this);
		buttonPanel.add(addThreeHome);
		
		addSixHome = new JButton("+6");
		addSixHome.setFont(new Font("Courier New", Font.PLAIN, 12));
		addSixHome.setLocation(0, 105);
		addSixHome.setSize(160, 30);
		addSixHome.addActionListener(this);
		buttonPanel.add(addSixHome);
		
		minusOneHome = new JButton("-1");
		minusOneHome.setFont(new Font("Courier New", Font.PLAIN, 12));
		minusOneHome.setLocation(0, 140);
		minusOneHome.setSize(160, 30);
		minusOneHome.addActionListener(this);
		buttonPanel.add(minusOneHome);
		
		addOneVisitor = new JButton("+1");
		addOneVisitor.setFont(new Font("Courier New", Font.PLAIN, 12));
		addOneVisitor.setLocation(170, 0);
		addOneVisitor.setSize(160, 30);
		addOneVisitor.addActionListener(this);
		buttonPanel.add(addOneVisitor);
		
		addTwoVisitor = new JButton("+2");
		addTwoVisitor.setFont(new Font("Courier New", Font.PLAIN, 12));
		addTwoVisitor.setLocation(170, 35);
		addTwoVisitor.setSize(160, 30);
		addTwoVisitor.addActionListener(this);
		buttonPanel.add(addTwoVisitor );
		
		addThreeVisitor = new JButton("+3");
		addThreeVisitor.setFont(new Font("Courier New", Font.PLAIN, 12));
		addThreeVisitor.setLocation(170, 70);
		addThreeVisitor.setSize(160, 30);
		addThreeVisitor.addActionListener(this);
		buttonPanel.add(addThreeVisitor);
		
		addSixVisitor = new JButton("+6");
		addSixVisitor.setFont(new Font("Courier New", Font.PLAIN, 12));
		addSixVisitor.setLocation(170, 105);
		addSixVisitor.setSize(160, 30);
		addSixVisitor.addActionListener(this);
		buttonPanel.add(addSixVisitor);
		
		minusOneVisitor = new JButton("-1");
		minusOneVisitor.setFont(new Font("Courier New", Font.PLAIN, 12));
		minusOneVisitor.setLocation(170, 140);
		minusOneVisitor.setSize(160, 30);
		minusOneVisitor.addActionListener(this);
		buttonPanel.add(minusOneVisitor);
		
		resetButton = new JButton("Reset");
		resetButton.setBackground(Color.RED);
		resetButton.setLocation(0, 180);
		resetButton.setSize(330, 30);
		resetButton.addActionListener(this);
		buttonPanel.add(resetButton);
		
		
		return totalGUI;
	}


	//this method came to us from the interface ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addOneHome) {
			homeScoreAmount = homeScoreAmount + 1;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == addTwoHome) {
			homeScoreAmount = homeScoreAmount + 2;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == addThreeHome) {
			homeScoreAmount = homeScoreAmount + 3;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == addSixHome) {
			homeScoreAmount = homeScoreAmount + 6;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == minusOneHome) {
			homeScoreAmount = homeScoreAmount - 1;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == addOneVisitor) {
			visitorScoreAmount = visitorScoreAmount + 1;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == addTwoVisitor) {
			visitorScoreAmount = visitorScoreAmount + 2;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == addThreeVisitor) {
			visitorScoreAmount = visitorScoreAmount + 3;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == addSixVisitor) {
			visitorScoreAmount = visitorScoreAmount + 6;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == minusOneVisitor) {
			visitorScoreAmount = visitorScoreAmount - 1;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == resetButton) {
			homeScoreAmount = 0;
			visitorScoreAmount = 0;
			homeScore.setText("" + homeScoreAmount);
			visitorScore.setText("" + visitorScoreAmount);
		}
		
		
	}

}
