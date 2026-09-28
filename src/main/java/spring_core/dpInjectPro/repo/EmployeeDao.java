package spring_core.dpInjectPro.repo;

import java.util.List;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.Entity.EmployeeMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmp()
	{
		return jdbcTemplate.query("select * from employee", new EmployeeMapper());

	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee (id,name,salary,gender) values (?,?,?,?)";
		return jdbcTemplate.update(query, e.getId(), e.getName(), e.getSalary(), e.getGender());
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name=?, salary=? where id=?";
		return jdbcTemplate.update(query, e.getName(), e.getSalary(), e.getId());
	}

	public int deleteEmployee(int id) {
		return jdbcTemplate.update("delete from employee where id=?", id);
	}

}
