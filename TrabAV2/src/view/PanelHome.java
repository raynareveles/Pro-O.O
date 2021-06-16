/*Rayná Araújo Reveles - 0050013521*/

package view;

import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private Icon img_Gif = new ImageIcon(PanelHome.class.getResource("assets/computer.gif"));
	
	
	public PanelHome() {
		
		setBounds(0,0,693,534);
		//setLayout(null);
		setVisible(true);
		setLayout(null);
		
		JLabel tituloTelaInicial = new JLabel("Tela inicial");
		tituloTelaInicial.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		tituloTelaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		tituloTelaInicial.setBounds(0, 25, 693, 50);
		add(tituloTelaInicial);
		
		JLabel lblNewLabel = new JLabel("Trabalho CRUD Semana 12");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 125, 693, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Alunos: ");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(225, 422, 68, 21);
		add(lblNewLabel_1);
		
		
		JLabel lblIconLogo = new JLabel(new ImageIcon(PanelHome.class.getResource("/view/assets/computer.gif")));
		lblIconLogo.setBounds(214, 199, 277, 211);
		add(lblIconLogo);
		
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Thays dos Santos Barroso Ribeiro");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(293, 455, 357, 21);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Rayná Araujo Reveles");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(293, 488, 357, 21);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Patrick Delfim Borges");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(293, 422, 357, 21);
		add(lblNewLabel_1_1_1);
		
		JLabel lblSistemaRealizaUm = new JLabel("Sistema realiza um CRUD no Banco Alunos na AWS");
		lblSistemaRealizaUm.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaRealizaUm.setBounds(0, 156, 693, 31);
		add(lblSistemaRealizaUm);
	}

}
