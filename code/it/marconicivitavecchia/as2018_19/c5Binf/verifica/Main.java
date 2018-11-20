
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(900,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb= new StringBuilder ();
		sb.append("<html>");  
		sb.append("<h1><g> LIVE THE COMPANY</g></h1>"); //imposto il titolo grande e in grassettio
		sb.append("<table><tr>");			//creo la tabbella e apro la riga
		sb.append("<td><h3>evento</h3></td>"); //creo varie colonne 
		sb.append("<td><h3>data</h3></td>");
		sb.append("<td><h3>vado?</h3></td>");
		sb.append("</tr><tr>");
		sb.append("<td>coctail party</td>");
		sb.append("<td>7dic</td>");
		sb.append("<td>si</td>");
		sb.append("</tr><tr>");
		sb.append("<td>colazione sociale</td>");
		sb.append("<td>12dic</td>");
		sb.append("<td>si</td>");
		sb.append("</tr><tr>");
		sb.append("<td>saluti di natale</td>");
		sb.append("<td>23dic</td>");
		sb.append("<td>no</td>");
		sb.append("</tr>");
		sb.append("</html>");
		String htmlText = sb.toString();
		
		// TODO Convertire lo StringBuilder in String
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		// TODO Assegnare correttamente la stringa create a JLabel
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

