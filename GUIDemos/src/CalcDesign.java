import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calculator extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	
	public Calculator() {
		setTitle("Calculator");
		setSize(500, 120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(2,2));
		add(p1,BorderLayout.NORTH);
		//the first parameter is what u want to add
		//second parameter where u want to add
		//add method that we are using here is of JFrame class
		//the default layout is border
		p2=new JPanel();
		p2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		//this line tell us how the components inside the panel
		//must be arranged
		add(p2,BorderLayout.SOUTH);
		//tell us where the panel should come
		
		//panel 1 design
		l1=new JLabel("Enter First Number");
		p1.add(l1);
		t1=new JTextField(100);
		p1.add(t1);
		l2=new JLabel("Enter Second Number");
		p1.add(l2);
		t2=new JTextField(100);
		p1.add(t2);
		
		//panel 2 design
		b1=new JButton("Add");
		b1.addActionListener(this);
		//over here i am mapping my event handler
		//the this over here refers to the current class
		//we can say this only if ur class implements ActionListener
		p2.add(b1);
		b2=new JButton("Sub");
		b2.addActionListener(this);
		/*in case ur class is not implementing ActionListener then u will have
		 * to do the below code to all buttons one by
		 * b2.addActionListener(new ActionListener() {
		 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});*/
		p2.add(b2);
		b3=new JButton("Mul");
		b3.addActionListener(this);
		p2.add(b3);
		b4=new JButton("Div");
		b4.addActionListener(this);
		p2.add(b4);
		setVisible(true);
	}

	//event handler
	//this method is raised by action lister
	@Override
	public void actionPerformed(ActionEvent e) {
		int a,b;
		JButton bt=(JButton)e.getSource();
		//the action event has the information about the source
		//the getSource method returns Object(this is the parent)
		//since this is only raised by a button i will convert it to a JButton
		if(bt.getText().equals("Add"))
		{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			String result="The sum is"+(a+b);
			JOptionPane.showMessageDialog(rootPane,result,"Calculator",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	
	
}
public class CalcDesign {
public static void main(String[] args) {
	Calculator c=new Calculator();
}
}
