package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import Dao.DaoUtilisateur;
import net.proteanit.sql.DbUtils;

public class Moteurafficherutilisateur implements ActionListener {
     Affichagedesutilisateurs au;
     

	public Affichagedesutilisateurs getAu() {
		return au;
	}

	public void setAu(Affichagedesutilisateurs au) {
		this.au = au;
	}

	public Moteurafficherutilisateur(Affichagedesutilisateurs au) {

		this.au = au;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource().equals(au.getBtnNewButton())) {
			String nomcherche = au.getTextField().getText();
			au.getTable().setModel(DbUtils.resultSetToTableModel(new DaoUtilisateur().rechercher(nomcherche)));
			DefaultTableCellRenderer custom = new DefaultTableCellRenderer(); 
			custom.setHorizontalAlignment(JLabel.CENTER); 
			for (int i=0 ; i < au.getTable().getColumnCount() ; i++) 
			au.getTable().getColumnModel().getColumn(i).setCellRenderer(custom);
		}
		if(arg0.getSource().equals(au.getBtnNewButton_1())) {
			au.getTextField().setText("");
			au.getTable().setModel(DbUtils.resultSetToTableModel(new DaoUtilisateur().afficherResultat()));
			DefaultTableCellRenderer custom = new DefaultTableCellRenderer(); 
			custom.setHorizontalAlignment(JLabel.CENTER); 
			for (int i=0 ; i < au.getTable().getColumnCount() ; i++) 
			au.getTable().getColumnModel().getColumn(i).setCellRenderer(custom);
		}
	}

}
