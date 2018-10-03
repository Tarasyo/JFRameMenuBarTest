import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Week3 extends JFrame implements ActionListener{

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
		Item1.addActionListener(this);
		Item1.setActionCommand("Open item");
		
		JMenuItem Item2 = new JMenuItem("Close");
		myMenu1.add(Item2);
		Item2.addActionListener(this);
		Item2.setActionCommand("Close App");
		
		
		
		// Menu Items for the second menu option
		JMenuItem ItemM1 = new JMenuItem("Copy");
		myMenu2.add(ItemM1);
		ItemM1.addActionListener(this);
		ItemM1.setActionCommand("Copy");
		
		JMenuItem ItemM2 = new JMenuItem("Cut");
		myMenu2.add(ItemM2);
		ItemM2.addActionListener(this);
		ItemM2.setActionCommand("Cut");
		
		JMenuItem ItemM3 = new JMenuItem("Paste");
		myMenu2.add(ItemM3);
		ItemM3.addActionListener(this);
		ItemM3.setActionCommand("Paste");
		
		
		
		this.validate(); 
		this.repaint(); //Organise all the objects 
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("Open item")){
			
			System.out.println("The file is running"); 
			
		}
		
		else if(e.getActionCommand().equals("Close App")) {
			
			System.exit(0);
		}
		
		else if(e.getActionCommand().equals("Copy")) {
			System.out.println("Your file have been coped");
		}
		else if(e.getActionCommand().equals("Cut")) {
			System.out.println("Your file have been cuted");
		}
		else if(e.getActionCommand().equals("Paste")) {
			System.out.println("Your file have been Pasted");
		}
		
	}

}
