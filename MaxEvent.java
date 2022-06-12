import java.awt.*;
import java.net.*;
import java.awt.event.*;
public class MaxEvent extends Frame{
MaxEvent(){
TextField t1,t2,t3;
Label l1,l2,l3,l4;
Button b1,b2;
t1=new TextField();
l1=new Label("Enter th first number:");
t1.setBounds(100,45,145,20);
l1.setBounds(100,75,145,20);

t2=new TextField();
l2=new Label("Enter th second number:");
t2.setBounds(100,110,145,30);
l2.setBounds(100,145,145,20);

t3=new TextField();
l3=new Label("Enter the third number:");
t3.setBounds(100,170,145,20);
l3.setBounds(100,200,145,20);


l4=new Label(" ");
l4.setBounds(100,240,145,20);

b1=new Button("Find");
b1.setBounds(105,278,70,40);

b2=new Button("Exit");
b2.setBounds(198,278,70,40);
add(b1);add(b2);add(t1);add(l1);add(t2);add(l2);add(t3);add(l3);add(l4);
setSize(400,400);
setVisible(true);
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int a= Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=Integer.parseInt(t3.getText());
if(a>b && a>c) {
l4.setText("MAXIMUM="+String.valueOf(a));
}
else if(b>c){
l4.setText("MAXIMUM="+String.valueOf(b));
}
else {
l4.setText("MAXIMUM="+String.valueOf(c));
}
}
});
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
}
public static void main(String args[]) {
new MaxEvent();
}
}