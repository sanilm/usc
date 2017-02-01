package com.igate.xyz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.igate.xyz.bean.MovementReqDetails;
import com.igate.xyz.dao.IXyzDao;
import com.igate.xyz.exception.XyzException;
@Service
public class XyzService implements IXyzService {
	@Autowired
	IXyzDao xyzDao;
	@Override
	public int addMR(MovementReqDetails details) throws XyzException {
		// TODO Auto-generated method stub
		int req = 0;
		try {
			req = xyzDao.addMR(details);
		} catch (XyzException e) {
			// TODO Auto-generated catch block
		 throw new XyzException( e.getMessage());
		}
		return req;
	}
	@Override
	public List<MovementReqDetails> displayselected(MovementReqDetails details) throws XyzException {
		// TODO Auto-generated method stub
		List<MovementReqDetails> xyz=new ArrayList<MovementReqDetails>();
		try {
			xyz=xyzDao.displayselected(details);
		} catch (XyzException e) {
			// TODO Auto-generated catch block
			throw new XyzException( e.getMessage());
		}
		return xyz;
	}

}
