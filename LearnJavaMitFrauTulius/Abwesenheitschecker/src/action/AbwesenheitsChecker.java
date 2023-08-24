package action;

import java.util.List;
import javax.swing.JFilechooser;

public class AbwesenheitsChecker {

	static JFileChooser chooser;
	static String school;
	static String teams;
	List klassenliste;
	List teamsliste; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		school = ChooseFile(school);
		System.out.println(school);

	}
	
	public static String ChooseFile() {
		
		try {
			chooser = new JFileChooser();
			chooser.showOpendialog(null);
			chooser.getSelectedfile(output);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		// return chooser
		return selectedFile;
	}
	
	public void readFile() {
		
	}

}
