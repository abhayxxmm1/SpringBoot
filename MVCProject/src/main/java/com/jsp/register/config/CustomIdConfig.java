package com.jsp.register.config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdConfig implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		String prefix="ROCKY";
		int suffix=0;
		
		JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
		
		try {
			Connection obtainConnection = jdbcConnectionAccess.obtainConnection();
			Statement st = obtainConnection.createStatement();
			String sql="select nextval('per_seq')";
			
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				suffix = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prefix+suffix;
	}

}
