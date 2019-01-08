import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    private JLabel label;
    private JButton button;
    //public static CriarTXT criarTXT = new CriarTXT();
    private JTextField textfield;
    //public static CriarTXT criarTXT= new CriarTXT();


    public GUI(){
        setLayout(new FlowLayout());
        label = new JLabel("O que deseja pesquisar: ");
        add(label);

        textfield = new JTextField(15);
        add(textfield);

        button = new JButton("Pesquisar");
        add(button);




    }


}