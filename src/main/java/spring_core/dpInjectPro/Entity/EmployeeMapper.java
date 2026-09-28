package spring_core.dpInjectPro.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

//import javax.swing.tree.RowMapper;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeMapper implements RowMapper<Employee>{
	
	@Override
	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
		System.out.println("EmployeeMapper.mapRow()");
		Employee emp = new Employee();
		emp.setId(resultSet.getInt("id"));
		emp.setName(resultSet.getString("name"));
		emp.setGender(resultSet.getString("gender"));
		emp.setSalary(resultSet.getInt("salary"));
		return emp;
		
	}
	

}
