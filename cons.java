import java.awt.*;
import java.awt.event.*;
public class cons
{
    // constructor to initialize
   cons() {

// creating the frame  
        Frame f = new Frame ("CheckBox Example");
        f.setLayout(new FlowLayout());
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
// creating the label  
        final Label label = new Label();
// setting the alignment, size of label       
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
// creating the checkboxes  
        Checkbox checkbox1 = new Checkbox();
        checkbox1.setLabel("C++");
        checkbox1.setBounds(100, 100,  40, 20);
        Checkbox checkbox2 = new Checkbox("Java");
        checkbox2.setBounds(100, 180,  40, 20);
// adding the checkbox to frame  
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);

// adding event to the checkboxes

        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource()==checkbox1)
                {
                    label.setText("C++ Checkbox: " + (e.getStateChange() == 1?"checked":"unchecked"));
                }

            }
        });
       checkbox2.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               if(e.getSource()==checkbox2){
                   label.setText("java checkedbox: "+(e.getStateChange()==1?"checked":"unchecked"));
               }
           }

       });
       checkbox2.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               checkbox2.setBackground(Color.red);
           }
       });
        checkbox2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                checkbox2.setBackground(Color.white);
            }
        });
// setting size, layout and visibility of frame  
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    // main method
    public static void main(String args[])
    {
        new cons();
    }
}    