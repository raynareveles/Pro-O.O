import javax.swing.*;

public class Welcome{

    private JFrame janela;
    private JPanel painel;
    private JLabel lblWel;
   
    public Welcome(){   
        
        janela = new JFrame();


        painel = new JPanel();
        janela.add(painel);
        painel.setLayout(null);


        lblWel = new JLabel("Bem-vindo");
        lblWel.setBounds(20, 30, 80, 35);
        painel.add(lblWel);

      
        janela.setSize(320, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Welcome");
        janela.setVisible(true);
    }
}
