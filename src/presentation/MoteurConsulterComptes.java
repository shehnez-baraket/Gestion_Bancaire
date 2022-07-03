package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

import Dao.DaoCompteCourant;
import Dao.DaoCompteEpargne;
import net.proteanit.sql.DbUtils;

public class MoteurConsulterComptes implements ActionListener {
     private Consultercomptes cc;
     
	public Consultercomptes getCc() {
		return cc;
	}

	public void setCc(Consultercomptes cc) {
		this.cc = cc;
	}

	/**
	 * @param cc
	 */
	public MoteurConsulterComptes(Consultercomptes cc) {
		super();
		this.cc = cc;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource().equals(cc.getBtnNewButton_4())) {
			String nomcherche = cc.getTextField().getText();
			cc.getTable().setModel(DbUtils.resultSetToTableModel(new DaoCompteCourant().rechercher(nomcherche)));
		}
		if(arg0.getSource().equals(cc.getBtnNewButton_4_1())) {
			String nomcherche = cc.getTextField_1().getText();
			cc.getTable_1().setModel(DbUtils.resultSetToTableModel(new DaoCompteEpargne().afficherResultatRecherche(nomcherche)));

		}			
		if(arg0.getSource().equals(cc.getBtnNewButton())) {
			cc.getTable().setModel(DbUtils.resultSetToTableModel(new DaoCompteCourant().afficherResultat()));
			cc.getTable_1().setModel(DbUtils.resultSetToTableModel(new DaoCompteEpargne().afficherResultat()));
			DefaultTableCellRenderer custom1 = new DefaultTableCellRenderer(); 
			  custom1.setHorizontalAlignment(JLabel.CENTER); 
			for (int i=0 ; i < cc.getTable_1().getColumnCount() ; i++) 
				cc.getTable_1().getColumnModel().getColumn(i).setCellRenderer(custom1);
			for (int i=0 ; i < cc.getTable().getColumnCount() ; i++) 
				cc.getTable().getColumnModel().getColumn(i).setCellRenderer(custom1);
			
		}
		

	}

}
