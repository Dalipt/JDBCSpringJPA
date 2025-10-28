package com.java.Dao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.java.Model.Employees;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
@Repository
public class EmployeesDao {

    private final JdbcTemplate jdbcTemplate;
    private final SimpleJdbcCall jdbcCall;

    public EmployeesDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.jdbcCall = new SimpleJdbcCall(jdbcTemplate)
            .withProcedureName("get_employee_by_id")
            .returningResultSet("result", new EmployeesRowMapper());
    }

    public List<Employees> getEmployeeById(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource()
            .addValue("emp_id", id);

        Map<String, Object> result = jdbcCall.execute(params);
        return (List<Employees>) result.get("result");
    }
}

