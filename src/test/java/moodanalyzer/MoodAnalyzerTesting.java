package moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTesting {

	/*
	 * Testing Happy Mood
	 */
	MoodAnalyzer mood = new MoodAnalyzer();
	@Test
	public void Test() {
		
		String result = mood.analyzeMood("I am in happy mood");
		assertEquals("Happy", result);
	}

	/*
	 * Testing sad Mood
	 */
	@Test
	public void Test2() {
		
		String result = mood.analyzeMood("I am in sad mood");
		assertEquals("Sad", result);
	}
}
