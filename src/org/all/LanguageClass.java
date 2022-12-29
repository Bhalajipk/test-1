package org.all;
import org.english.English;
import org.tamil.Tamil;
import org.telugu.Telugu;
public class LanguageClass{
private void allLanguages() {
	System.out.println("Languages are mentioned Below");
}
public static void main(String[] args) {
	LanguageClass all = new LanguageClass();
	all.allLanguages();
	Tamil T = new Tamil();
	T.tamilLanguage();
	English E = new English();
	E.englishLanguage();
	Telugu Te = new Telugu();
	Te.teluguLanguage();
}
}
