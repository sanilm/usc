package com.igate.xyz.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;




import com.igate.xyz.bean.MovementReqDetails;
import com.igate.xyz.exception.XyzException;
@Repository
public class XyzDao implements IXyzDao {
	
	@Autowired
	SimpleJdbcTemplate simpleJdbcTemplate;
	@Override
	public int addMR(MovementReqDetails details) throws XyzException {
		// TODO Auto-generated method stub
		int req=0;
		try
		{
		int seq=simpleJdbcTemplate.queryForInt("SELECT seq831185.nextval FROM dual");
		
		
		details.setMrNo(String.valueOf(seq));
		details.setMrStatus("Created");
		 
		req=Integer.parseInt(details.getMrNo());
		
		  String sql="INSERT into movement_request_831185 VALUES(?,?,?,?,?,?,?,?,?)";
		Object[] params=new Object[]{details.getMrNo(),details.getEmpId(),details.getTravelMode(),details.getTravelDate(),details.getTravelTime(),details.getSourceCity(),details.getDestinationCity(),details.getPurpose(),details.getMrStatus()};
		
		int res=simpleJdbcTemplate.update(sql,params);
		}catch(DataAccessException e)
		{ 
			
			
			throw new XyzException("error in inserting");
		}
		return req;
	}
	@Override
	public List<MovementReqDetails> displayselected(MovementReqDetails details) throws XyzException {
		// TODO Auto-generated method stub
		List<MovementReqDetails> xyz=new ArrayList<MovementReqDetails>();
		String empId=details.getEmpId();
		
	try
		{
		
		String sql="SELECT mr_no,emp_Id,travel_Mode,travel_Date,travel_Time,source_City,destination_City,purpose,mr_status FROM movement_request_831185 WHERE emp_Id=?";
			
		
		xyz= simpleJdbcTemplate.query(sql,new XyzRowMapper(),empId);
		}catch(DataAccessException e)
		{ 
			
			
			throw new XyzException("error in selecting");
		}
		return xyz;
	}

	
	
	
	
	
	
}
