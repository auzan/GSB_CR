package appliCR;

import java.sql.SQLException;
import java.awt.*;
import java.awt.event.*;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Controleur.Controleur;
import Modele.ModeleAppliCR;
import Views.GuiAppliCR;

public class AppliCR {

	/** Lancement de l'application, création des vues et methodes necessaires
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, UnsupportedLookAndFeelException {
	
		
		/** création du modele de l'application
		 * 
		 */
		ModeleAppliCR modele = new ModeleAppliCR() ;
		
		/** création du controleur de l'application
		 * 
		 */
		Controleur controleur = new Controleur(modele) ;
		
		/** création de la vue principale
		 * 
		 */
		new GuiAppliCR(modele,controleur) ;
	}
}
