package com.twitter.service;


import com.twitter.dao.TwitterDAO;
import com.twitter.dao.TwitterDAOInterface;
import com.twitter.entity.TwitterEmployee;

public class Twitterservice implements TwitterserviceInterface {
	private Twitterservice() {}

	public static TwitterserviceInterface createserviceobject() {
		// TODO Auto-generated method stub
		return new Twitterservice();
	}

	@Override
	public int createprofile(TwitterEmployee fe) {
		// TODO Auto-generated method stub
		TwitterDAOInterface fd=TwitterDAO.createDaoObject();
		return fd.createprofileDAO(fe);
	}

}
