/*Rayná Araújo Reveles - 0050013521*/

package view;

import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Point;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class TelaInicial {

	private JFrame frmTelaInicial;
	private Image img_logo = new ImageIcon(TelaInicial.class.getResource("assets/student.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);

	
	private PanelCadAluno panelCadAluno;
	private PanelListaAlunos panelListaAlunos;
	private PanelHome panelHome;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmTelaInicial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaInicial = new JFrame();
		frmTelaInicial.setResizable(false);
		frmTelaInicial.getContentPane().setBackground(new Color(190,155,123));
		frmTelaInicial.setTitle("Tela inicial");
		
		
		
		frmTelaInicial.setBounds(100, 100, 1024, 568);
		frmTelaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaInicial.getContentPane().setLayout(null);
		
		
		panelHome = new PanelHome();
		panelHome.setBounds(0, 0, 693, 534);
		panelCadAluno = new PanelCadAluno();
		panelCadAluno.setBounds(0, 0, 693, 534);
		panelListaAlunos = new PanelListaAlunos();
		panelListaAlunos.setBounds(0, 0, 693, 534);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(133, 68, 66));
		panelMenu.setBounds(0, 0, 311, 546);
		frmTelaInicial.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(6, 47, 299, 106);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		panelMenu.add(lblIconLogo);
		
		JPanel cadAluno = new JPanel();
		cadAluno.addMouseListener(new PanelButtonMouse(cadAluno) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCadAluno);
			}
		});
		cadAluno.setBackground(new Color(75,56,50));
		cadAluno.setBounds(6, 250, 299, 45);
		panelMenu.add(cadAluno);
		cadAluno.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Novo Aluno");
		lblNewLabel.setForeground(new Color(255,244,230));
		lblNewLabel.setBounds(36, 0, 227, 45);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		cadAluno.add(lblNewLabel);
		
		JPanel ListarAlunos = new JPanel();
		ListarAlunos.addMouseListener(new PanelButtonMouse(ListarAlunos){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelListaAlunos);
				
				panelListaAlunos.atualizarTable(); 
				
			}
		});
		ListarAlunos.setBackground(new Color(75,56,50));
		ListarAlunos.setBounds(6, 330, 299, 45);
		panelMenu.add(ListarAlunos);
		ListarAlunos.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Listar e Manipular Alunos");
		lblNewLabel_1.setForeground(new Color(255,244,230));
		lblNewLabel_1.setBounds(18, 0, 262, 45);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		ListarAlunos.add(lblNewLabel_1);
		
		JPanel home = new JPanel();
		home.addMouseListener(new PanelButtonMouse(home){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		home.setBackground(new Color(75, 56, 50));
		home.setBounds(6, 171, 299, 45);
		panelMenu.add(home);
		home.setLayout(null);
		
		JLabel lblTelaInicial = new JLabel("Tela Inicial");
		lblTelaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaInicial.setForeground(new Color(255, 244, 230));
		lblTelaInicial.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblTelaInicial.setBounds(36, 0, 227, 45);
		home.add(lblTelaInicial);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(325, 6, 693, 534);
		frmTelaInicial.getContentPane().add(panelMainContent);
		panelMainContent.setLayout(null);
		//panelMainContent.setLayout(null);
		
		
		panelMainContent.add(panelListaAlunos);
		panelMainContent.add(panelCadAluno);
		panelMainContent.add(panelHome);
		
		menuClicked(panelHome);
	}
	
	
	public void menuClicked(JPanel panel) {
		panelListaAlunos.setVisible(false);
		panelCadAluno.setVisible(false);
		panelHome.setVisible(false);
		
		panel.setVisible(true);
	}

	private class PanelButtonMouse extends MouseAdapter {
		
		JPanel panel;
		
		
		public PanelButtonMouse(JPanel panel) {
			this.panel = panel;
		} 
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(60,47,47));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(75,56,50));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(190,155,123));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(60,47,47));
		}
		
	}
	
	}
	
	
