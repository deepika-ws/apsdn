package com.apsdn.dao;

import org.springframework.jdbc.core.JdbcTemplate;  

public class CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}
	
	public int saveCustomer(Customer e){  
	    String query="insert into CUSTOMERS values('"+e.getAccessId()+"','"+e.getName()+"','"+e.getUserName()+"','"+e.getPassword()+"','"+e.getEmailId()+"')";
	    int affectedCount = 0;
	    try {
	    	affectedCount=jdbcTemplate.update(query);
	    } catch (Exception exp) {
	    	
	    }
	    return affectedCount;  
	}  
	public int updateCustomer(Customer e){  
	    String query="update CUSTOMERS set NAME='"+e.getName()+"',USERNAME='"+e.getUserName()+"', PASSWORD='+"+e.getPassword()+"', EMAIL='"+e.getEmailId()+"' where accessId='"+e.getAccessId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteCustomer(Customer e){  
	    String query="delete from CUSTOMERS where id='"+e.getAccessId()+"' ";  
	    return jdbcTemplate.update(query);  
	}
}
