import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
//this demo is on progress bar
import javax.swing.JLabel;
import javax.swing.JTextField;
class ProgressBar extends JFrame implements Runnable 
{
	JLabel l;
	JTextField f;
	@Override
	public void run() {
		l=new JLabel("");
		f=new JTextField(15);
		f.setEnabled(false);
		f.setBackground(Color.BLACK);
		Font ff=new Font("Times New Roman",0,19);
		f.setFont(ff);
		add(l);
		add(f);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		display();			
	}
	void display()
	{
		for(int i=60;i>=0;i--)
		{
			try
			{
				Thread.sleep(1000);
				String s=Integer.toString(i);
				f.setText("time remaining"+s);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
public class Demo3 {
public static void main(String[] args) {
	ProgressBar p=new ProgressBar();
	Thread t=new Thread(p);
	t.start();
}
}
