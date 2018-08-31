import javax.swing.*;
import java.awt.event.*;

class swin extends JFrame implements ActionListener
	{
		JLabel lh,l1,l2,l3;
		JTextField t1,t2,t3;
		JButton b1,b2,b3,b4,b5;
		JProgressBar jb;
		
		swin()
			{
				setVisible(true);
				setSize(500,500);
				setLayout(null);
				setTitle("Swing"); 

				lh=new JLabel("Calculator");
				lh.setBounds(200,50,100,20);
				add(lh);

				l1=new JLabel("Enter the first value ");
				l1.setBounds(100,100,150,20);
				add(l1);

				l2=new JLabel("Enter the second value ");
				l2.setBounds(100,150,150,20);
				add(l2);

				l3=new JLabel("Result");
				l3.setBounds(100,200,150,20);
				add(l3);

				t1=new JTextField();
				t1.setBounds(250,100,80,20);
				add(t1);

				t2=new JTextField();
				t2.setBounds(250,150,80,20);
				add(t2);

				t3=new JTextField();
				t3.setBounds(250,200,80,20);
				add(t3);

				b1=new JButton("ADD");
				b1.setBounds(100,250,80,40);
				add(b1);
				b2=new JButton("SUB");
				b2.setBounds(200,250,80,40);
				add(b2);
				b3=new JButton("MUL");
				b3.setBounds(100,300,80,40);
				add(b3);
				b4=new JButton("DIV");
				b4.setBounds(200,300,80,40);
				add(b4);
				b5=new JButton("EXIT");
				b5.setBounds(150,350,80,40);
				add(b5);

				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
				b5.addActionListener(this);
			}
		public void actionPerformed(ActionEvent e)
			{
				String s1=t1.getText();
				String s2=t2.getText();
				float a=Float.parseFloat(s1);
				float b=Float.parseFloat(s2);
				float c=0;
			  	if(b1==e.getSource())
					{
						c=a+b;
					}
			  	else if(b2==e.getSource())
					{
						c=a-b;
					}
			  	else if(b3==e.getSource())
					{
						c=a*b;
					}
			  	else if(b4==e.getSource())
					{
						c=a/b;
					}
			  	else if(b5==e.getSource())
					{
						System.exit(0);
					}
				String res=String.valueOf(c);
				t3.setText(res);
			}		
		
	}
class swing
	{
		public static void main(String a[])
			{
				swin obj=new swin();
				
			}
	}