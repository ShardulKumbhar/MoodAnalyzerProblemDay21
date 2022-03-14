package moodanalyzer;

public class MoodAnalyzer {
	private String message;
	/**
	 * PROCEDURE
	 * =======================================
	 *  1.created parametric constructor
	 *  2.created another constructor
	 *  3. created getter and setters
	 *  4.creating a method to check various mood
	 *  5.condition if person is happy
	 *  6.condition if person is sad
	 *  7.condition if person in any mood
	 *  8.catching nullpoint exception
	 * @param message-mood of person
	 * =========================================
	 */
	
	/*
	 * 1.created parametric constructor
	 */
	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	/*
	 * 2.created another constructor
	 */
	public MoodAnalyzer() {

	}

	/*
	 * 3. created getter and setters
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 4.creating a method to check various mood
	 */
	public String analyzeMood() {
		try {
			/*
			 * 5.condition if person is happy
			 */
			if (message.toLowerCase().contains("happy")) {
				return "Happy";

				/*
				 * 6.condition if person is sad
				 */
			} else if (message.toLowerCase().contains("sad")) {
				return "Sad";
				/*
				 * 7.condition if person in any mood
				 */
			} else {
				return "Any";
			}

			/*
			 * 8.catching nullpoint exception
			 */
		} catch (NullPointerException e) {
			return "Happy";

		}

	}

}
