package fileReaderWriter;

import java.util.*;
import java.io.*;

public class Indexizator {
	
	private final static String root = "." + File.separator + "data"
			+ File.separator;
	private final static String indexAddress = root + "index" + File.separator;
	private final static String index = indexAddress + "index.ind";
	
	/**
	 * Atualiza a key com o valor dado.
	 * Se nao encontra o .ind, o cria.
	 * 
	 * @param key
	 * @param value
	 */
	public static void updateKey(String key, String value){
		Properties prop = new Properties();
	    FileInputStream fis = null;
	    
	    //Tenta ler o arquivo
	    try {
			fis = new FileInputStream(index);
		} catch (FileNotFoundException e1) {
			//se nao o acha, cria um novo.
			
		}
	    
	    try {
			prop.loadFromXML(fis);
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //prop.list(System.out);
	    
	}
	
	public static void createIndex(){
	    FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(index);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
