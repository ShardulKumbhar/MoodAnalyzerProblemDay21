package moodanalyzer;

public class MoodAnalyzer {

	public String analyzeMood(String message) {

		/*
		 * checking happy mood
		 */
		if (message.toLowerCase().contains("happy")) {

			return "Happy";
		}
		/*
		 * checking sad mood
		 */
		else if (message.toLowerCase().contains("sad")) {

			return "Sad";
		}
		/*
		 * checking any mood
		 */
		else {
			System.out.println("Did Not contain Happy or Sad");
		}
		return null;
	}
}