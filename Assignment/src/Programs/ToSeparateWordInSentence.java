package Programs;

public class ToSeparateWordInSentence {

	public static void main(String[] args) 
	{
		String sentence = "Work From Home";
		String[] words = sentence.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

	}

}
