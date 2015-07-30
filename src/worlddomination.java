import javax.swing.JOptionPane;

public class worlddomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Can you code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equals("yes")) {
			System.out.println("You shall rule the world");
		} else {
			// 3. Otherwise, wish them good luck washing dishes.
System.out.println("good luck washing thoses dishes");
		}
	}
}
  