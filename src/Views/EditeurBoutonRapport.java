package Views;

import java.awt.Component;

import javax.swing.DefaultCellEditor ;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/** Editeur des boutons du tableau des Visiteurs
 * 

 *
 */
public class EditeurBoutonRapport extends DefaultCellEditor {

	private static final long serialVersionUID = 1L;
	protected JButton bouton ;
	private boolean isPushed ;
	private EcouteurBoutonRapport ecouteur = new EcouteurBoutonRapport() ;

	/** Créer l'éditeur
	 * 
	 * @param checkBox La case à cocher associée au bouton
	 */
	public EditeurBoutonRapport(JCheckBox checkBox) {
		super(checkBox);
		this.bouton = new JButton() ;
		this.bouton.setOpaque(true) ;
		this.bouton.addActionListener(this.ecouteur) ;
	}


	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		
		this.ecouteur.setRow(row) ;
		this.ecouteur.setColumn(column) ;
		this.ecouteur.setTable(table) ;
		
		if(value == null){
			this.bouton.setText("") ;
		}
		else {
			this.bouton.setText(value.toString()) ;
		}
		
		return this.bouton ;
	}

}
