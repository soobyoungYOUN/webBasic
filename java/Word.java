package com.asd;

public class Word {
	public static void main(String[] args) {
		Word word = new Word("Hello World");
		
		for (int i = 0; i < letters.length(); i++) {
			System.out.println(word.isVowel(i));
		}
	}

	private static String letters;
	
	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	// i 번째 글자가 모음인지 // a, e, i, o u
	public boolean isVowel(int i) {
		boolean result = false; // 기본으로 false 초기화
		
		if (letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("e") || 
				letters.substring(i, i + 1).equals("i") || letters.substring(i, i + 1).equals("o") ||
				letters.substring(i, i + 1).equals("u")) {
			result = true;
		} 
		return result;
	}

}
