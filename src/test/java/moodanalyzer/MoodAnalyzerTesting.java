package moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyzerTesting {
	
	/*
	 * ===========================
	 * checking various mood 
	 * to pass the test case
	 * 1. created object of class
	 * 2.happy mood
	 * 3.sad mood
	 * 4.any mood
	 * 5.null mood
	 * ========================
	 */

	/*
	 * 1. created object of class
	 */
	MoodAnalyzer mood = new MoodAnalyzer();

	/*
	 * 2.happy mood
	 */
	@Test
	public void happyMood() throws MoodAnalyzerException {

		mood.setMessage("I am in happy mood");

		String result = mood.analyzeMood();
		Assert.assertEquals("Happy", result);
	}

	/*
	 * 3.sad mood
	 */
	@Test
	public void SadMood() throws MoodAnalyzerException{

		mood.setMessage("I am in sad mood");
		String result = mood.analyzeMood();
		Assert.assertEquals("Sad", result);
	}

	/*
	 * 4.Anymood
	 */
	@Test
	public void anyMood() throws MoodAnalyzerException{

		mood.setMessage("I am in any mood");
		String result = mood.analyzeMood();
		Assert.assertEquals("Any", result);
	}

	/*
	 * 5.null mood
	 */
	@Test
	public void nullMood() throws MoodAnalyzerException{
try {
		mood.setMessage(null);
		String result = mood.analyzeMood();
		Assert.assertEquals("Invalid mood", result);
}catch(MoodAnalyzerException e) {
	System.out.println("Invalid mood");
}

	}
}
