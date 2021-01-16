import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayOutMangerDemo1 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setTitle("LayoutManager");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//create a panel
	JPanel p=new JPanel();
	/*
	 * when a panel is created the default Layout is
	 * * Flow Layout
	 *	1)	 in this lay out the components are add one a after the other either
	 * 			Vertically or horizontally row
	 * 	2)		by default the component arrangement strat's from the center
	 * all layout class comes from awt package.
	 * 1)
	 */
	FlowLayout flow=new FlowLayout();
	p.setLayout(flow);
	f.add(p);
	
	f.setVisible(true);
}
}
