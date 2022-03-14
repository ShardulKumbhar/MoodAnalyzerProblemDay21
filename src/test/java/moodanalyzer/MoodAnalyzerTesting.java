package moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTesting {

	/*
	 * Testing sad Mood
	 */
	MoodAnalyzer mood = new MoodAnalyzer();

	@Test
	public void Test2() {

		String result = mood.analyzeMood("I am in sad mood");
		assertEquals("Sad", result);
	}
}
