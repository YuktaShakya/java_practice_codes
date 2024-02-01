import javax.swing.*;
import java.awt.event.*;
class B extends JFrame implements ActionListener
{
JLabel L1,L2;
JTextField t1,t2;
JButton b1;
B()
{
L1=new JLabel("First No");
L2=new JLabel("Secon No");
t1=new JTextField();
t2=new JTextField();
b1=new JButton("Add");
L1.setBounds(30,30,80,60);
L2.setBounds(30,100,80,60);
t1.setBounds(120,30,80,60);
t2.setBounds(120,100,80,60);
b1.setBounds(70,200,80,60);
add(L1);
add(L2);
add(t1);
add(t2);
add(b1);
setLayout(null);
setTitle("Calc");
setSize(400,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent et)
{
try
{
double a,b,c;
a=Double.parseDouble(t1.getText());
b=Double.parseDouble(t2.getText());
c=a+b;
JOptionPane.showMessageDialog(null,"sum is "+c,"Result",1);
}
catch(Exception ett)
{
JOptionPane.showMessageDialog(null,"Please Enter Only No","msg",0);
t1.setText("");
t2.setText("");
}
}
public static void main(String k[])
{
new B();
}
}
