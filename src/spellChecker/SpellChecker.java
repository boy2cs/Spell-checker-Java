package spellChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import hash.HashTable;


public class SpellChecker {
	public static int        table_size;
	private final static int dictSize = 300000; 
	
	HashTable ht = new HashTable();
	/**
	 * 
	 * @param dictName
	 * @param docName
	 */
	public void checkSpelling(String dictName, 
			                         String docName){
		
	}
	
	public static String[] getWordsFromFile(String docName) throws FileNotFoundException{
		return getWords( readFile(docName) );
	}
	
	public static String[] getWords(String str){
		StringTokenizer st = new StringTokenizer(str);
		String[] words;
		int i;
		
		table_size = 0;
		words      = new String[dictSize];
		i = 0;
		//words = null;
		while(st.hasMoreTokens()){
			words[i]=st.nextToken();
			i++;
			table_size++;
		}
		return words;
	}
	
	public static String readFile(String docName) throws FileNotFoundException {
	   
	   File F = new File(docName);	
	   Scanner docFile = new Scanner(F);	
	   String result, line;

	   result = "";
	   while (docFile.hasNextLine()) {
	      line = docFile.nextLine();
	      result += line + " ";
	   } 
	   return result;
	}
}
