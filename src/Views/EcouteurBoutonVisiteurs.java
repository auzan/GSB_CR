package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Controleur.Controleur;
import Modele.ModeleAppliCR;
import Modele.ModeleListeVisiteurs;

/** Ecouteur des boutons du tableau des Visiteurs
 * 

 *
 */
public class EcouteurBoutonVisiteurs extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private int row ;
	private int column ;
	private JTable table ;
	public static String VisMatricule;

	
	/** Modifier l'indice de la ligne
	 * @param row L'indice de la ligne
	 */
	public void setRow(int row){
		this.row = row ;
	}
	
	/** Modifier l'indice de la colonne
	 * @param column L'indice de la colonne
	 */
	public void setColumn(int column){
		this.column = column ;
	}
	
	/** Modifier le tableau
	 * @param table Le nouveau tableau
	 */
	public void setTable(JTable table){
		this.table = table ;
	}
	
	/** Action de l'évenement
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Controleur controleur = ((ModeleListeVisiteurs)this.table.getModel()).getControleur() ;
		ModeleAppliCR modele = ((ModeleListeVisiteurs) this.table.getModel()).getModele() ;
		 VisMatricule = ((ModeleListeVisiteurs)this.table.getModel()).getNumeroVis(this.row) ;
		String VisNom = ((ModeleListeVisiteurs)this.table.getModel()).getNomVis(this.row) ;
		String VisPrenom = ((ModeleListeVisiteurs)this.table.getModel()).getPrenomVis(this.row) ;
		switch(this.column){
			case 4 :
				
					controleur.visualiserComptesRendus();
					
				break ;
			}
	}

	public static String getVisMatricule() {
		return VisMatricule;
	}

	public static void setVisMatricule(String visMatricule) {
		VisMatricule = visMatricule;
	}
}

