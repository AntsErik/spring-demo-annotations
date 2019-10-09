package com.luv2code.practises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class PractiseRandomFortuneService implements PractiseFortuneService {

	private String fortunesFile = "C:/Datasource/fortune-data.txt";
	private List<String> randomFortunes;
	
	//create a random number generator
	private Random myRandom = new Random();
	
	public PractiseRandomFortuneService() {
		
		System.out.println(">>PractiseRandomFortuneService: inside default constructor.");	
	}
	
	@PostConstruct
	private void loadFortuneFile() {
		
		System.out.println(">>PractiseRandomFortuneService: inside PostConstruct method loadFortuneFile().");
		
		File myAwesomeFortunesFile = new File(fortunesFile);
		
		System.out.println("Reading fortunes from file: " + myAwesomeFortunesFile);
		
		// initialize array list
		randomFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(myAwesomeFortunesFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				System.out.println(">>Random fortunes include: " + tempLine);
				randomFortunes.add(tempLine);
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(randomFortunes.size());

		String tempFortune = randomFortunes.get(index);

		return tempFortune;
	}


}
