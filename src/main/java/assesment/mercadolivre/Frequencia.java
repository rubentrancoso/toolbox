package assesment.mercadolivre;

import java.math.BigInteger;
import java.text.Normalizer;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequencia {

	public static void main(String[] args) {
		String text = "Um dois tres, vinte e quatro, vinte e cindo, trinta e três";
		printFrequency(text);
	}

	public static void printFrequency(String text) {
		text = stripAccents(text.toLowerCase().replace(",", ""));

		String[] words = text.split(" ");		
		
		HashMap<String, BigInteger> fmap = new HashMap<String, BigInteger>();
		for(int i=0;i<words.length;i++) {
			if(!fmap.containsKey(words[i])) {
				fmap.put(words[i], BigInteger.valueOf(1));
			} else {
				fmap.put(words[i], fmap.get(words[i]).add(BigInteger.valueOf(1)));
			}
		}
		Map<String, BigInteger> result = sortByValue(fmap);
		for (Map.Entry<String, BigInteger> entry : result.entrySet())
		{
		    System.out.println(entry.getKey() + "\t [" + entry.getValue() + "]");
		}
		
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
	    return map.entrySet()
	              .stream()
	              .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
	              .collect(Collectors.toMap(
	                Map.Entry::getKey, 
	                Map.Entry::getValue, 
	                (e1, e2) -> e1, 
	                LinkedHashMap::new
	              ));
	}	
	
	public static String stripAccents(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}	
	
}
