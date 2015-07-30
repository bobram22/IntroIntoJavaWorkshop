import javax.swing.JOptionPane;

public class QUESTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer= JOptionPane.showInputDialog("how was your day");
String hop=	JOptionPane.showInputDialog(null, answer +" I say quite interesting why is that?");
 JOptionPane.showInputDialog(null,hop +" Well say i have a question if you do not mind me asking");
String bop= JOptionPane.showInputDialog("No matter what you answered i will still ask where is it that you live and please this is for my intteligence so answer truthfuly");
	JOptionPane.showMessageDialog(null, "well thanks improve " + answer+  " day and if " + bop+  " is true living space also where you live, sleep with eyes open" );
	}
}
