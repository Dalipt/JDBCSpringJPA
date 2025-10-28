package com.java.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.Model.Employees;

public class EmployeesRowMapper implements RowMapper<Employees> {
    @Override
    public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employees(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("city")
        );
    }

}