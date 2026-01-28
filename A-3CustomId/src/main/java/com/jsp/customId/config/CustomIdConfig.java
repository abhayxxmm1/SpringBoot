package com.jsp.customId.config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomIdConfig implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		String prefix="COM";
		int suffix=0;
		JdbcConnectionAccess acess = session.getJdbcConnectionAccess();
		
		try {
			Connection conn = acess.obtainConnection();
			
			Statement st = conn.createStatement();
			String sql= "select nextval('emp_seq')";
			
			ResultSet rs = st.executeQuery(sql);
			
			if (rs.next()) {
				suffix = rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return prefix + suffix;
	}

}
