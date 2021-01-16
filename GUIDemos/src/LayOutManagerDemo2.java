import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel; 

class BorderLayoutDemo extends JFrame
{
	JPanel p;
	JMenuBar menubar;
	JMenuItem newfile,openfile,savefile,cutedit,copyedit,pasteedit,helpcontent,helpreadme;
	public BorderLayoutDemo() {
		p=new JPanel(new BorderLayout());
		
		//create a Menu Bar.
		menubar=new JMenuBar();
		
		//now u need to create menu that is to be displayed on the menu bar
		JMenu filemenu=new JMenu("File");
		JMenu editmenu=new JMenu("Edit");
		JMenu helpmenu=new JMenu("Help");
		
		//add the created menu to the menu bar.
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(helpmenu);
		
		//to add items to the menu this is called as menu items
		newfile=new JMenuItem("NEW");
		openfile=new JMenuItem("OPEN");
		savefile=new JMenuItem("SAVE");
		cutedit=new JMenuItem("CUT");
		copyedit=new JMenuItem("COPY");
		pasteedit=new JMenuItem("PASTE");
		helpcontent=new JMenuItem("HELP CONTENT");
		helpreadme=new JMenuItem("README");
		
		//add the menu items to the menu
		
		filemenu.add(newfile);
		filemenu.add(openfile);
		filemenu.add(savefile);
		editmenu.add(cutedit);
		editmenu.add(copyedit);
		editmenu.add(pasteedit);
		helpmenu.add(helpcontent);
		helpmenu.add(helpreadme);
		
		p.add(menubar,BorderLayout.NORTH);
		add(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		//Border layout arranges the components based upon directions
		/*
		 * 1)North,South,East,West,center
		 */
		TextArea t=new TextArea();
		p.add(t, BorderLayout.CENTER);
	}
}
public class LayOutManagerDemo2 {
public static void main(String[] args) {
	BorderLayoutDemo bld=new BorderLayoutDemo();
	bld.setVisible(true);
}
}
