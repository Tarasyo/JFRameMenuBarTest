import javax.swing.*;

public class Week3 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Week3();

	}
	
	public Week3() {
		//JFrame window options
		this.setVisible(true);
		this.setSize(500,500);
		
		//Instantiation of the menu bar 
		JMenuBar myMenuBar = new JMenuBar();
		this.setJMenuBar(myMenuBar);
		
		
		// Menu options 
		JMenu myMenu1 = new JMenu("File");
		myMenuBar.add(myMenu1);
		JMenu myMenu2 = new JMenu("Edit");
		myMenuBar.add(myMenu2);
		
		// Menu Items for the first menu option
		JMenuItem Item1 = new JMenuItem("Open");
		myMenu1.add(Item1);
		JMenuItem Item2 = new JMenuItem("Close");
		myMenu1.add(Item2);
		
		// Menu Items for the second menu option
		JMenuItem ItemM1 = new JMenuItem("Copy");
		myMenu2.add(ItemM1);
		JMenuItem ItemM2 = new JMenuItem("Cut");
		myMenu2.add(ItemM2);
		JMenuItem ItemM3 = new JMenuItem("Paste");
		myMenu2.add(ItemM3);
		
		
		
		this.validate(); 
		this.repaint(); //Organise all the objects 
		
	}

}
