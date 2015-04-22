package ijp.ch21;

/**
 * Class Description: ?
 Input: {cloud, face, slot, could, loud, lots, lost}

 Output: {cloud, could, slot, lots, lost}


 Set<String> myInput = new HashSet<String>();
 myInput.addAll(Arrays.asList(Input);

 findAnagam("loud")

 public bool findAnagam(String wordToSearch) {
 bool searcRes = false;
 for (String word: myInput) {
 if (word.IndexOf(wordToSearch) >= 0)
 {
 searchRes = true;
 break;
 }
 }
 return searchRes
 }

 Collections.removeAll(lettersSet1, lettersSet2);
 Collections.removeAll(lettersSet2, lettersSet1);
 ABC
 ABCX

 Set<String> anagrams = new HashSet<String>();
 for (String word1: myInput) {
 for (String word2: myInput {
 if (!word1.compareToIngnorecase(word2)) {
 if (findAnagram(word1, word2)) {
 if (anagrams.contains(word2)) {
 anagrams.add(word2);
 }
 }
 }
 }
 }

 O(n^2)

 * 2015-04-06 - tri
 */
public class AnagramSearch {
}
