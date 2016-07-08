package com.monstar.game.dao.impl;

import com.monstar.game.dao.PlayerDao;
import com.monstar.game.util.GameUtil;

public class PlayerDaoImpl implements PlayerDao {

	public void create(String pname) {
		GameUtil.printCurrTime();
		System.out.println(getClass() + " = " + pname);
	}

}
