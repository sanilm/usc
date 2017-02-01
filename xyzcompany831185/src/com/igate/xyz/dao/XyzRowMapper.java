package com.igate.xyz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.xyz.bean.MovementReqDetails;



public class XyzRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int num) throws SQLException {
		
		MovementReqDetails mrd=new MovementReqDetails();
		mrd.setMrNo(rs.getString(1));
		mrd.setEmpId(rs.getString(2));
		mrd.setTravelMode(rs.getString(3));
		mrd.setTravelDate(rs.getString(4));
		mrd.setTravelTime(rs.getString(5));
		mrd.setSourceCity(rs.getString(6));
		mrd.setDestinationCity(rs.getString(7));
		mrd.setPurpose(rs.getString(8));
		mrd.setMrStatus(rs.getString(9));
	
		return mrd;
	}
}
