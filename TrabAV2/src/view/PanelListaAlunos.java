/*Rayná Araújo Reveles - 0050013521*/

package view;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import bo.Aluno;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelListaAlunos extends JPanel {

	DefaultTableModel tableModel = new DefaultTableModel();
	AlunoView alunoView = new AlunoView();
	private JTextField textFieldMatricula;
	private JTextField textFieldNome;
	private JTextField textFieldCidade;
	
	public PanelListaAlunos() {
		
		
		
		setBounds(0,0,693,534);
		//setLayout(null);
		setVisible(true);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de alunos");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 29, 681, 50);
		add(lblNewLabel);
		
		
		
		
		
		Object[] columns = {"Matricula","Nome","cidade"};
		
		
		
		tableModel.setColumnIdentifiers(columns);
		
		

		
		JTable table = new JTable();
		table.setEnabled(false);
		table.setFillsViewportHeight(true);
		
		table.setBackground(Color.WHITE);
		table.setModel(tableModel);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 91, 677, 181);
		add(scrollPane);
		
		JRadioButton RadioAtualizarAluno = new JRadioButton("Atualizar aluno");
		RadioAtualizarAluno.setSelected(true);
		RadioAtualizarAluno.setBounds(151, 284, 141, 23);
		add(RadioAtualizarAluno);
		
		JRadioButton RadioDeletarAluno = new JRadioButton("Deletar aluno");
		RadioDeletarAluno.setBounds(387, 284, 141, 23);
		add(RadioDeletarAluno);
		
		ButtonGroup RadioGrupo = new ButtonGroup();
		
		RadioGrupo.add(RadioAtualizarAluno);
		RadioGrupo.add(RadioDeletarAluno);
		
		JLabel lblMatricula = new JLabel("Matricula*:");
		lblMatricula.setBounds(69, 365, 130, 16);
		add(lblMatricula);
		
		JLabel lblNome = new JLabel("Novo Nome*:");
		lblNome.setBounds(289, 365, 130, 16);
		add(lblNome);
		
		JLabel lblCidade = new JLabel("Nova Cidade*:");
		lblCidade.setBounds(489, 365, 130, 16);
		add(lblCidade);
		
		textFieldMatricula = new JTextField();
		textFieldMatricula.setBounds(69, 382, 130, 26);
		add(textFieldMatricula);
		textFieldMatricula.setColumns(10);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(289, 382, 130, 26);
		add(textFieldNome);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(489, 382, 130, 26);
		add(textFieldCidade);
		
		JButton btnDone = new JButton("Atualizar");
		btnDone.setBounds(338, 471, 117, 29);
		add(btnDone);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(151, 471, 117, 29);
		add(btnCancel);
		
		JLabel lblFeedbackMSG = new JLabel(" ");
		lblFeedbackMSG.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedbackMSG.setBounds(69, 432, 550, 16);
		add(lblFeedbackMSG);
		 lblFeedbackMSG.setVisible(false);
		
		
		RadioAtualizarAluno.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				lblMatricula.setVisible(true);
				lblNome.setVisible(true);
				lblCidade.setVisible(true);
				btnDone.setText("Atualizar");
				
				textFieldMatricula.setVisible(true);
				textFieldNome.setVisible(true);
				textFieldCidade.setVisible(true);
		    }
		});
		
		RadioDeletarAluno.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				lblMatricula.setVisible(true);
				lblNome.setVisible(false);
				lblCidade.setVisible(false);
				btnDone.setText("Deletar");
				
				textFieldMatricula.setVisible(true);
				textFieldNome.setVisible(false);
				textFieldCidade.setVisible(false);
		    }
		});
		
		
		btnDone.addActionListener(new ActionListener() {
			int feedbackMSG;
			@Override
		    public void actionPerformed(ActionEvent e) {
				
				if(RadioDeletarAluno.isSelected()) {
					
					 feedbackMSG = alunoView.delete(textFieldMatricula.getText());
					 
					 if(feedbackMSG == 1) {
					 lblFeedbackMSG.setText("Aluno Deletado com Sucesso!!");
					 lblFeedbackMSG.setForeground(Color.black);
					 }
					 else {
						 lblFeedbackMSG.setText("Erro ao Deletar Aluno. Verifique se a Matricula esta Correta!");
						 lblFeedbackMSG.setForeground(Color.red);
					 }
					 
					 
					 
					 
				
				}else if(RadioAtualizarAluno.isSelected()) {
					feedbackMSG = alunoView.update(textFieldMatricula.getText(),textFieldNome.getText(),textFieldCidade.getText());
				
				
				if(feedbackMSG == 1) {
					 lblFeedbackMSG.setText("Aluno Atualizado com Sucesso!!");
					 lblFeedbackMSG.setForeground(Color.black);
					 }
					 else {
						 lblFeedbackMSG.setText("Erro ao Atualizar Aluno. Verifique se Matricula esta Correta!");
						 lblFeedbackMSG.setForeground(Color.red);
					 }
				
				}
				
				textFieldMatricula.setText("");
				textFieldNome.setText("");
				textFieldCidade.setText("");
				
				lblFeedbackMSG.setVisible(true);
				atualizarTable();
		    }
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				textFieldMatricula.setText("");
				textFieldNome.setText("");
				textFieldCidade.setText("");
			}
		});
		
		
		atualizarTable();
		
			
		
		
		
	}
	
	
	public void atualizarTable() {
		tableModel.setRowCount(0);
		Object[] row = new Object[3];
		
		for(Aluno aluno:alunoView.read()) {
			
			row[0] = aluno.getMatricula();
			row[1] = aluno.getNome();
			row[2] = aluno.getCidade();
			tableModel.addRow(row);
		}
	}
}
