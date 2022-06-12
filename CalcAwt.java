import java.awt.*;
import java.awt.event.*;
public class CalcAWT extends Frame{
CalcAWT(){
TextField t1,t2;
Label l1,l2,l3;
Button b1,b2,b3,b4,b5,b6;
t1=new TextField();
l1=new Label("Enter the first number:");
l1.setBounds(100,45,145,20);
t1.setBounds(100,75,145,20);
t2=new TextField();
l2=new Label("Enter the second number:");
l2.setBounds(100,110,145,20);
t2.setBounds(100,145,145,20);
l3=new Label("Result");
l3.setBounds(100,169,145,20);
b1=new Button("+");
b1.setBounds(65,200,80,40);
b2=new Button("-");
b2.setBounds(155,200,80,40);
b3=new Button("*");
b3.setBounds(245,200,80,40);
b4=new Button("/");
b4.setBounds(95,250,80,40);
b5=new Button("%");
b5.setBounds(195,250,80,40);
b6=new Button("Exit");
b6.setBounds(65,200,80,40);
add(t1);add(l1);add(t2);add(l2);add(l3);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
setSize(400,400);
setVisible(true);

b1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e) {
       int a = Integer.parseInt(t1.getText());
       int b = Integer.parseInt(t2.getText());
       int c = a+b;
       l3.setText( String.valueOf(a)+"+"+String.valueOf(b)+"="+
       String.valueOf(c));
    }
  });
b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e) {
     int a = Integer.parseInt(t1.getText());
     int b = Integer.parseInt(t2.getText());
     int c = a-b;
     l3.setText(String.valueOf(a)+"-"+String.valueOf(b)+"="+
     String.valueOf(c));
   }
});

b3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e) {
    int a = Integer.parseInt(t1.getText());
    int b = Integer.parseInt(t2.getText());
    int c = a*b;
    l3.setText(String.valueOf(a)+"*"+String.valueOf(b)+"="+
    String.valueOf(c));
   }
});
b4.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
      int a = Integer.parseInt(t1.getText());
      int b = Integer.parseInt(t2.getText());
      float c = a/b;
      l3.setText(String.valueOf(a)+"/"+String.valueOf(b)+"="+
      String.valueOf(c));
    }
});
b5.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
     int a = Integer.parseInt(t1.getText());
     int b = Integer.parseInt(t2.getText());
     float c = a%b;
     l3.setText(String.valueOf(a)+"%"+String.valueOf(b)+"="+
     String.valueOf(c));
   }
});
b6.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e) {
     System.exit(0);
 }
});
}
public static void main(String args[]) {
new CalcAWT();
}
}