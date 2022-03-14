package moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;


public class MoodAnalyzerTesting {

	/*
	 * junit testing to check mood
	 */

	@Test
	public void Test() {
	
		assertEquals("Happy", MoodAnalyzer.analyzeMood("I am in happy mood"));
	}

}
	