package com.test.delphix.sam;

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
class DelphixAnagramFinder {
  private static final String WORD_LIST_PATH = "/usr/share/dict/words";
  public static void main(String[] args) {
 //   List<String> wordsList = readWords(WORD_LIST_PATH);
	  
	  List<String> wordsList =Arrays.asList("cat", "tac", "act", "test", "sett","ttes", "te'st", "TE'ST");
    System.out.println(wordsList);
    Map<String, List<String>> returnedSource  = createSource(wordsList);
    
    String testingWord = "estt";
    char[] charArray = normalizeString(testingWord);
    List<String> list = returnedSource.get(new String(charArray));
    System.out.println(list);
  }
  public static List<String> readWords(String fileName) {
    List<String> wordsList = new ArrayList<String>();
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(fileName));
      String currentWord;
      while ((currentWord = br.readLine()) != null) {
        wordsList.add(currentWord);
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    } finally {
      try {
        if (br != null) {
          br.close(); 
       }
      } catch (IOException e) {
         e.printStackTrace();
        System.exit(1);
      }
    }
    return wordsList;
  }
  
  private static Map<String, List<String>> createSource(List<String> wordList)
  {
    Map<String, List<String>> returnedSource = new HashMap<>();
  
    
    for(String word :wordList)
    {
    	String originalWord = word;
    	char[] charArray = normalizeString(word);
        
        List<String> list = returnedSource.get(new String(charArray));
        if(list!= null)
        {
        	list.add(originalWord);
        
        }
        else 
        {
        	returnedSource.put(new String(charArray), new ArrayList<String>(Arrays.asList(originalWord)));
        }
    } 
    return returnedSource;
  }
private static char[] normalizeString(String word) {
	
	String lowerCaseWord = word.trim().toLowerCase();
	char[] charArray = word.contains("'")? word.replace("'", "").trim().toLowerCase().toCharArray() : lowerCaseWord.toCharArray();
	Arrays.sort(charArray);
	
	return charArray;
}
  
}

