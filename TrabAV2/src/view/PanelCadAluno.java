/*Rayná Araújo Reveles - 0050013521*/

package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PanelCadAluno extends JPanel {
	private JTextField MatriculaInput;
	private JTextField NomeInput;
	private JTextField CidadeInput;

	/**
	 * Create the panel.
	 */
	public PanelCadAluno() {
		setBounds(0,0,693,534);
		//setLayout(null);
		setVisible(true);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Alunos");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 20, 571, 61);
		add(lblNewLabel);
		
		
		
		JLabel lblFeedBack = new JLabel("Matricula eh um Campo Obrigatorio!!!");
		lblFeedBack.setForeground(Color.RED);
		lblFeedBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedBack.setBounds(190, 381, 352, 16);
		
		add(lblFeedBack);
		lblFeedBack.setVisible(false);
		
		
		MatriculaInput = new JTextField();
		MatriculaInput.setToolTipText("Numero de matricula");
		MatriculaInput.setBounds(342, 140, 200, 35);
		add(MatriculaInput);
		MatriculaInput.setColumns(10);
		
		JLabel MatriculaLabel = new JLabel("Matricula* :");
		MatriculaLabel.setBounds(190, 140, 79, 35);
		add(MatriculaLabel);
		
		NomeInput = new JTextField();
		NomeInput.setToolTipText("Nome");
		NomeInput.setColumns(10);
		NomeInput.setBounds(342, 220, 200, 35);
		add(NomeInput);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(190, 220, 79, 35);
		add(lblNome);
		
		CidadeInput = new JTextField();
		CidadeInput.setToolTipText("Cidade");
		CidadeInput.setColumns(10);
		CidadeInput.setBounds(342, 300, 200, 35);
		add(CidadeInput);
		
		JLabel lblCidade = new JLabel("Cidade :");
		lblCidade.setBounds(190, 300, 79, 35);
		add(lblCidade);
		
		JButton btnEnviarForm = new JButton("Enviar");
		btnEnviarForm.setBounds(425, 445, 117, 35);
		add(btnEnviarForm);
		btnEnviarForm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(!MatriculaInput.getText().isBlank()) {
					
					AlunoView aluno = new AlunoView();
					lblFeedBack.setVisible(true);
					
					
				aluno.create(MatriculaInput.getText(),NomeInput.getText(),CidadeInput.getText());
				
				lblFeedBack.setForeground(Color.black);
				lblFeedBack.setText("Formulario enviado com sucesso...");
				lblFeedBack.setVisible(true);
				
				}else {
					lblFeedBack.setText("Matricula eh um campo obrigatorio");
					
					lblFeedBack.setForeground(Color.RED);
					lblFeedBack.setVisible(true);
					
				}
				
				MatriculaInput.setText("");
				NomeInput.setText("");
				CidadeInput.setText("");
				
			}
			
		});
		
		JButton btnCancelarForm = new JButton("Cancelar");
		btnCancelarForm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MatriculaInput.setText("");
				NomeInput.setText("");
				CidadeInput.setText("");
			}
		});
		btnCancelarForm.setBounds(190, 445, 117, 35);
		add(btnCancelarForm);
		
		
	}
}
