package com.twitter.dao;

import com.twitter.entity.TwitterEmployee;

public class TwitterDAO implements TwitterDAOInterface {
	private TwitterDAO() {}

	@Override
	public int createprofileDAO(TwitterEmployee fe) {
		// TODO Auto-generated method stub
		return 1;
	}

	public static TwitterDAOInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new TwitterDAO();
	}

}
