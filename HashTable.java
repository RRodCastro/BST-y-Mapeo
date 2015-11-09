import java.util.ArrayList;
import java.util.HashMap;

import java.util.Iterator;


import java.util.*;
public class HashTable implements WordSet{
	
	private HashMap<String, Word> base;
	
	public HashTable(){
		base = new HashMap<String, Word>();
	}
	public void add(Word wordObject) {
		base.put(wordObject.getWord(),wordObject);
	
	}

	public Word get(Word word) {
		return  base.get(word.getWord());
	}

}
