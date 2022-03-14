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
	public void happyMood() {

		mood.setMessage("I am in happy mood");

		String result = mood.analyzeMood();
		Assert.assertEquals("Happy", result);
	}

	/*
	 * 3.sad mood
	 */
	@Test
	public void SadMood() {

		mood.setMessage("I am in sad mood");
		String result = mood.analyzeMood();
		Assert.assertEquals("Sad", result);
	}

	/*
	 * 4.any mood
	 */
	@Test
	public void anyMood() {

		mood.setMessage("I am in any mood");
		String result = mood.analyzeMood();
		Assert.assertEquals("Happy", result);

	}
}
