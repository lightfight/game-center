package com.monstar.game.service.impl;

import com.monstar.game.dao.PlayerDao;
import com.monstar.game.dao.impl.PlayerDaoImpl;
import com.monstar.game.service.PlayerService;
import com.monstar.game.util.GameUtil;

public class PlayerServiceImpl implements PlayerService {
	
	PlayerDao playerDao = new PlayerDaoImpl();

	public void create(String pname) {
		
		GameUtil.printCurrTime();
		System.out.println(getClass() + " = " + pname);
		
		playerDao.create(pname);
	}

}
