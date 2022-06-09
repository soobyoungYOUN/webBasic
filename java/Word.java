package com.survivalCoding;

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

		if (letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("e")
				|| letters.substring(i, i + 1).equals("i") || letters.substring(i, i + 1).equals("o")
				|| letters.substring(i, i + 1).equals("u")) {
			result = true;
		}
		return result;
	}

	// i 번째 글자가 자음인지
	public boolean isConsonant(int i){
		String vowel = "aeiou";
		boolean result = false;
		if (!vowel.contains(letters.substring(i, i + 1))) {
			result = true;
		}
		return result;
	}

	// 위의 코드 깔끔하게
	public boolean isConsonant2(int i){
		return "aeiou".contains(letters.substring(i, i + 1));
	}

	// 기존의 모음 구분 메소드를 활용한 자음 구분
	public boolean isConsonant3(int i){
		return !isVowel(i);
	}
}
