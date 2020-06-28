package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class JDBCRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class EmployeeRowMaper implements RowMapper<EmployeeBean> {

        @Override
        public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException 
        { EmployeeBean emp=new EmployeeBean();
            emp.setid(rs.getInt("id"));
            emp.setFirstName(rs.getString("first_name"));
            emp.setLastName(rs.getString("last_name"));
            emp.setAge(rs.getString("age"));
            emp.setEmail(rs.getString("email"));

        
            return emp;
        }
        
    }
    public List <EmployeeBean> getAll()
    {
             return jdbcTemplate.query("select * from employees", new EmployeeRowMaper());
    }
    public int insert (EmployeeBean emp)
    {
        return jdbcTemplate.update("insert into employees(id,first_name,last_name,age,email)"+"values(?,?,?,?,?)",
        new Object[]{
            emp.getid(),emp.getFirstName(),emp.getLastName(),emp.getAge(),emp.getEmail()
        });
    } 
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from employees where id=?", new Object[] {
            id
        });
    }
}