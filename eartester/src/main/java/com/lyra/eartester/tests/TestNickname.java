package com.lyra.eartester.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;

import org.junit.Test;

import com.lyra.eartrainer.model.Nickname;

public class TestNickname {
	//testing the correctness of the nickExists method

	//scenario1 - Checking if nickname exists before one was ever created
	@Test
	public void TestCaseNickExists1() {
		Nickname nickname = new Nickname();
		File parentDir = new File("C:/");
		assertFalse(nickname.nickExists(parentDir));
    }
	
	//scenario2 - The nickname.txt file exists, but is empty (no nickname stored in it)
	@Test
	public void TestCaseNickExists2() {
		Nickname nickname = new Nickname();
		File parentDir = new File("C:/");
		
		//simulating an already created nickname.txt file
		File nickFile  = new File("C:/nickname.txt");
		try {
			if(!nickFile.exists()) nickFile.createNewFile();
		}
		catch(Exception e){
			fail("Unexpected Exception" + e.getMessage());
		}
		
		assertFalse(nickname.nickExists(parentDir));
    }
	
	//scenario3 - The nickname.txt file exists, but something went wrong when
	//the nickname was previously stored in the system. The value of the name
	//is equal to the string "null"
	@Test
	public void TestCaseNickExists3() {
		Nickname nickname = new Nickname();
		File parentDir = new File("C:/");
		
		//simulating an already created nickname.txt file
		File nickFile  = new File("C:/nickname.txt");
		try {
			if(!nickFile.exists()) nickFile.createNewFile();
			//writing "null" to the nickname.txt file
			FileOutputStream fout = new FileOutputStream(nickFile);
			fout.write("null".getBytes());
			fout.flush();
			fout.close();
		}
		catch(Exception e){
			fail("Unexpected Exception" + e.getMessage());
		}
		
		assertFalse(nickname.nickExists(parentDir));
    }
	
	//scenario4 - The nickname.txt file exists and contains a
	//valid nickname
	@Test
	public void TestCaseNickExists4() {
		Nickname nickname = new Nickname();
		File parentDir = new File("C:/");
		
		//simulating an already created nickname.txt file
		File nickFile  = new File("C:/nickname.txt");
		try {
			if(!nickFile.exists()) nickFile.createNewFile();
			//writing "null" to the nickname.txt file
			FileOutputStream fout = new FileOutputStream(nickFile);
			fout.write("Jeff".getBytes());
			fout.flush();
			fout.close();
		}
		catch(Exception e){
			fail("Unexpected Exception" + e.getMessage());
		}
		
		assertTrue(nickname.nickExists(parentDir));
    }
}






/*
@Test
public void testCase1() {
	//fail("Not yet implemented");
	
//    notes[0] = sp.load(activity, R.raw.p040, 1);
//    notes[1] = sp.load(activity, R.raw.p041, 1);
//    notes[2] = sp.load(activity, R.raw.p042, 1);
//    notes[3] = sp.load(activity, R.raw.p043, 1);
//    notes[4] = sp.load(activity, R.raw.p044, 1);
//    notes[5] = sp.load(activity, R.raw.p045, 1);
//    notes[6] = sp.load(activity, R.raw.p046, 1);
//    notes[7] = sp.load(activity, R.raw.p047, 1);
//    notes[8] = sp.load(activity, R.raw.p048, 1);
//    notes[9] = sp.load(activity, R.raw.p049, 1);
//    notes[10] = sp.load(activity, R.raw.p050, 1);
//    notes[11] = sp.load(activity, R.raw.p051, 1);
//    notes[12] = sp.load(activity, R.raw.p052, 1);
    
    int[] notes = new int[13];
    for(int i = 0;i < notes.length;i++){
    	notes[i] = i + 1;
    }
	
	MusicInfo mi =  new MusicInfo();
	mi.setSoundNotes(notes);
	
	LyraAbstractFactory factory = LyraFactoryCreator.getFactory(ScaleTypes.MAJOR);
	IMusicInstrument piano = factory.createInstrument(mi);
	//assert piano  is not null I guess...
}
*/