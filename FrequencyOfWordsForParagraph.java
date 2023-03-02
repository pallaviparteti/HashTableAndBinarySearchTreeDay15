package com.hashtable;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordsForParagraph {
	public static void main(String[] args) {
		String sentence= "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations" ;
		fnFrequencyofWords(sentence);

	}

	//-------Supporting Function-----------------
	static void fnFrequencyofWords(String sentence) {
		//------- Convert String to proper format----
		sentence=sentence.replaceAll("[^A-Za-z0-9\\s]","");
		sentence=sentence.replaceAll(" +"," ");
		sentence=sentence.toLowerCase();

		//-------Create String to an array with words------
		String[] sentence2=sentence.split(" ");
		System.out.println(sentence);

		//-------- Create a HashMap to store each word and its count--
		Map <String , Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<sentence2.length;i++) {
			//---- Verify if Word Already Exits---
			if(map.containsKey(sentence2[i]))
			{
				//-- Increment value by 1 if word already exits--
				map.put(sentence2[i], 1+ map.get(sentence2[i]));
			}
			else {
				// --- Add Word to map and set value as 1 if it does not exist in map--
				map.put(sentence2[i], 1); 
			}
		}
		// Print the HashMap with Key, Value Pair
		System.out.println(map); 
	}
}



