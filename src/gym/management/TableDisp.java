/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gym.management;

/**
 *
 * @author Samarth
 */
import java.awt.*;


import javax.swing.*;



public class TableDisp extends JFrame {

	private JPanel pBook = new JPanel ();
	private JScrollPane scroller;
	private JTable table;
	public TableDisp(JTable j)
	{
	super("Table Display");
	//setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		setSize(1000,300);
		setLocation(100,300);
		pBook.setLayout (null);
		table=j;
		scroller = new JScrollPane (table);	//Adding Table to ScrollPane.
		scroller.setBounds (20, 50, 960, 200);	//Aligning ScrollPane.
		pBook.add(scroller);
		getContentPane().add (pBook, BorderLayout.CENTER);
		setVisible(true);
	}
	
}