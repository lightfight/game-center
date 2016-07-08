package com.monstar.game.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GameUtil {
	
	/**
	 *
	 */
	public static void printCurrTime(){
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(new Date()));
	}

}
