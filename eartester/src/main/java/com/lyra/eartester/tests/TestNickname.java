package com.lyra.eartester.tests;

import static org.junit.Assert.assertFalse;

import java.io.File;

import org.junit.Test;

import com.lyra.eartrainer.model.Nickname;

public class TestNickname {
	
	/*
	@Test
	public void testCase1() {
		//fail("Not yet implemented");
		
//        notes[0] = sp.load(activity, R.raw.p040, 1);
//        notes[1] = sp.load(activity, R.raw.p041, 1);
//        notes[2] = sp.load(activity, R.raw.p042, 1);
//        notes[3] = sp.load(activity, R.raw.p043, 1);
//        notes[4] = sp.load(activity, R.raw.p044, 1);
//        notes[5] = sp.load(activity, R.raw.p045, 1);
//        notes[6] = sp.load(activity, R.raw.p046, 1);
//        notes[7] = sp.load(activity, R.raw.p047, 1);
//        notes[8] = sp.load(activity, R.raw.p048, 1);
//        notes[9] = sp.load(activity, R.raw.p049, 1);
//        notes[10] = sp.load(activity, R.raw.p050, 1);
//        notes[11] = sp.load(activity, R.raw.p051, 1);
//        notes[12] = sp.load(activity, R.raw.p052, 1);
        
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
	
	@Test
	public void TestNickExists() {
		Nickname nickname = new Nickname();
		String name = "Jeff";
		File parentDir = new File("C:/");
		assertFalse(nickname.nickExists(parentDir));
    }
}
