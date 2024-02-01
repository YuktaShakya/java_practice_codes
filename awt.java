import java.awt.*;
class A extends Frame
{
Label L1,L2;
TextField t1,t2;
Button b1;
A()
{
L1=new Label("First No");
L2=new Label("Secon No");
t1=new TextField();
t2=new TextField();
b1=new Button("Add");
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
}
public static void main(String k[])
{
new A();
}
}
