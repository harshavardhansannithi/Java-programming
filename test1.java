import java.awt.*;
// create a class extending Frame component
class <className> extends Frame{
<className>(){
Button button=new Button("<Text_To_Display_On_Button>");  // create instance of component
button.setBounds(40,90,80,30);// call method to set button position
add(button);//    adding component to the container
setSize(400,400);//set size of container
setVisible(true);//set visibility of container to true
}
public static void main(String args[]){
<className> clsobj=new <className>();
}}





















































































public class LabelExample {    
public static void main(String args[]){   
    Frame f = new Frame ("Label example");  
    Label l1, l2;       
    l1 = new Label ("First Label.");   
    l2 = new Label ("Second Label.");   
  
    // set the location of label  
    l1.setBounds(50, 100, 100, 30);    
    l2.setBounds(50, 150, 100, 30);  
  
    // adding labels to the frame    
    f.add(l1);  
    f.add(l2);   
  
    // setting size, layout and visibility of frame   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);    
}    
}    




















