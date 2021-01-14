import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarDemo {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//create a Menu Bar.
	JMenuBar menubar=new JMenuBar();
	
	//now u need to create menu that is to be displayed on the menu bar
	JMenu filemenu=new JMenu("File");
	JMenu editmenu=new JMenu("Edit");
	JMenu helpmenu=new JMenu("Help");
	
	//add the created menu to the menu bar.
	menubar.add(filemenu);
	menubar.add(editmenu);
	menubar.add(helpmenu);
	
	//to add items to the menu this is called as menu items
	JMenuItem newfile=new JMenuItem("NEW");
	JMenuItem openfile=new JMenuItem("OPEN");
	JMenuItem savefile=new JMenuItem("SAVE");
	
	JMenuItem cutedit=new JMenuItem("CUT");
	JMenuItem copyedit=new JMenuItem("COPY");
	JMenuItem pasteedit=new JMenuItem("PASTE");
	
	JMenuItem helpcontent=new JMenuItem("HELP CONTENT");
	JMenuItem helpreadme=new JMenuItem("README");
	
	//add the menu items to the menu
	
	filemenu.add(newfile);
	filemenu.add(openfile);
	filemenu.add(savefile);
	editmenu.add(cutedit);
	editmenu.add(copyedit);
	editmenu.add(pasteedit);
	helpmenu.add(helpcontent);
	helpmenu.add(helpreadme);
	
	
	
	f.add(menubar);
	f.setVisible(true);
}
}
