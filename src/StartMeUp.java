import javax.swing.SwingUtilities;

public class StartMeUp {

	public static void main(String[] args) {

		GiveMeAGUI myGUI = new GiveMeAGUI();

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				myGUI.createAndShowGUI();
			}

		});

	}

}
