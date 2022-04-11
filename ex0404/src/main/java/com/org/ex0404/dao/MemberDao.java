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

public class MemberDao {
	
	@Autowired(required = true)
	DriverManagerDataSource dataSource;

	public boolean insert(Member member) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
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

	// insert delete update pstmt.executeUpdate();
	// select pstmt.executeQuery();
	public void delete(List<Integer> list) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// list [14,15,16]
		
		String ids = "";
		
		for(int i =0; i<list.size(); i++)
		{
			if(list.size()-1 ==i)
				ids = ids + list.get(i);
			else
				ids = ids + list.get(i)+",";
		}
		
//		ids = 14,15,16
		
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement("delete from member where id in ("+ids+")");
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}





