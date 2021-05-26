/* Rayná Araújo Reveles - 0050013521 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private JFrame janela;
    private JPanel painel;
    private JLabel lblUser;
    private JLabel lblPass;
    private JLabel lblResul;
    private JTextField txtUser;
    private JPasswordField pssPass;
    private JButton btnLog;


    public Login(){

        janela = new JFrame();

        painel = new JPanel();
        janela.add(painel);
        painel.setLayout(null);


        //Usuário
        lblUser = new JLabel("Usuário");
        lblUser.setBounds(20, 30, 80, 35);
        painel.add(lblUser);

        txtUser = new JTextField(20);
        txtUser.setBounds(100, 30, 160, 35);
        painel.add(txtUser);


        //Senha
        lblPass = new JLabel("Senha");
        lblPass.setBounds(20, 60, 90, 25);
        painel.add(lblPass);

        pssPass = new JPasswordField();
        pssPass.setBounds(100, 50, 165, 25);
        painel.add(pssPass);


        //Login
        btnLog = new JButton("Login");
        btnLog.setBounds(20, 90, 90, 35);
        btnLog.addActionListener(this);
        painel.add(btnLog);



        lblResul = new JLabel("");
        lblResul.setBounds(20, 120, 400, 35);
        painel.add(lblResul);

      
        janela.setSize(320, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Login");
        janela.setVisible(true);
    }

    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           String user = txtUser.getText();  
           String pass = new String(pssPass.getPassword());

           System.out.println(user + ", " + pass);

           if(user.equals("rayna") && pass.equals("8765")){
               lblResul.setText("Usuário Válido");

               janela.dispose();
               new Welcome();
           }
           else {
               lblResul.setText("Usuário Inválido");
           }
    }
}
