import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * @author Justin Johnson
 * Simulates a toy store where customer can buy a toys for children of certain ages. 
 * Store checks if toy is age appropriate and can also purchase card and balloon with toy
 * 
**/

public class Birthday {


	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company\nto choose gifts for young children");
		double total = 0;

		//repeats until no more toy is entered
		do {
			String name = JOptionPane.showInputDialog("Enter the name of the child");
			int age = Integer.parseInt(JOptionPane.showInputDialog("How old is the child?"));

			Toy a = pickToy(age);

			a.addCard(JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No"));
			a.addBalloon(JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No"));	
			JOptionPane.showMessageDialog(null, "the gift for "+name+a);
			total+=a.getCost();

		} while (JOptionPane.showInputDialog("Do you want another toy? Yes or No").equalsIgnoreCase("yes"));

		DecimalFormat dollar = new DecimalFormat("#,##0.00");	//format cost
		JOptionPane.showMessageDialog(null, "the total cost of your order is " + dollar.format(total));
		JOptionPane.showMessageDialog(null, "Order number is " + ((int)(Math.random()*89999)+10000)+"\nProgrammer: Justin Johnson");
	}

	private static Toy pickToy(int age) {
		Toy a = new Toy();
		a.setAge(age);
		String toy;
		//repeats toy choice until valid
		do {
			toy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
			a.setToy(toy);
			if (a.getToy().equals(""))
				JOptionPane.showMessageDialog(null, "Invalid choice\nPlease choose again");
		} while (a.getToy().equals(""));
		a.setCost(toy);
		
		if (a.ageOK())
			JOptionPane.showMessageDialog(null, "Good choice!");

		//picks another toy
		else {
			String ans = JOptionPane.showInputDialog("Toy is not age-appropriate\nDo you want to buy a different toy? Yes or No");
			if (ans.equalsIgnoreCase("yes"))
				a = pickToy(age);
		}

		return a;
	}

}