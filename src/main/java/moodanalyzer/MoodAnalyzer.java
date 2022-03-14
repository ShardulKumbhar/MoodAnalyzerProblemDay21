package moodanalyzer;

public class MoodAnalyzer {
	/**
	 * 
	 * @param message-mood of person
	 * @return
	 */

	/**
	 * 1.creating a method to check mood
	 */
	public static String analyzeMood(String message) {

		try {

			/*
			 * 2.condition if person is happy
			 */
			if (message.toLowerCase().contains("happy")) {
				System.out.println("Happy");
				return "Happy";

				/*
				 * 3.condition if person is sad
				 */
			} else if (message.toLowerCase().contains("sad")) {
				System.out.println("Sad");
				return "Sad";
			} else {
				throw new NullPointerException();
			}

			/*
			 * 4.catching exception if any
			 */
		} catch (NullPointerException e) {
			System.out.println("Person is not happy or sad");
		}
		return null;
	}

}
