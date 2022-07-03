package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

import Dao.DaoClient;
import net.proteanit.sql.DbUtils;

public class Moteurafficherclient implements ActionListener {
	
  private affichageetrecherchedesclients as;
   
	public affichageetrecherchedesclients getAs() {
	                      return as;
                                                   }

public void setAs(affichageetrecherchedesclients as) {
	                      this.as = as;
                                                     }

public Moteurafficherclient(affichageetrecherchedesclients as) {

	this.as = as;
                                                                           }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(as.getBtnNewButton())) {
			String nomcherche = as.getTextField().getText();
			as.getTable().setModel(DbUtils.resultSetToTableModel(new DaoClient().rechercher(nomcherche)));	
			DefaultTableCellRenderer custom1 = new DefaultTableCellRenderer(); 
			  custom1.setHorizontalAlignment(JLabel.CENTER); 
			for (int i=0 ; i < as.getTable().getColumnCount() ; i++) 
				as.getTable().getColumnModel().getColumn(i).setCellRenderer(custom1);
		}
		if(arg0.getSource().equals(as.getBtnNewButton_1())) {
			as.getTable().setModel(DbUtils.resultSetToTableModel(new DaoClient().afficherResultat()));
			DefaultTableCellRenderer custom1 = new DefaultTableCellRenderer(); 
			  custom1.setHorizontalAlignment(JLabel.CENTER); 
			for (int i=0 ; i < as.getTable().getColumnCount() ; i++) 
				as.getTable().getColumnModel().getColumn(i).setCellRenderer(custom1);
			
		}

	}

}
