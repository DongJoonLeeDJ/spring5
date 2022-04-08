package com.org.ex0404.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.org.ex0404.dto.Member;

//membertable database access object
// ctrl + shift + o
public class MemberDao {
	
	@Autowired(required = true)
	DriverManagerDataSource dataSource;

	public boolean insert(Member member) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			System.out.println(dataSource);
			con = dataSource.getConnection();
			pstmt = con.prepareStatement("insert into member (username, password) values (?,?)");
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getPassword());
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public List<Member> selectall(){
		List<Member> list = new ArrayList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement("select * from member");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setPassword(rs.getString("password"));
				member.setUsername(rs.getString("username"));
				list.add(member);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
}





