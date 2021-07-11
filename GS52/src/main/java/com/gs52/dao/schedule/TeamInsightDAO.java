package com.gs52.dao.schedule;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs52.vo.attendance.AnnualManageVO;
import com.gs52.vo.attendance.PersonInsightVO;
import com.gs52.vo.schedule.TeamInsightVO;

@Service  
@Transactional // 실패하면 다시 롤백하라
public class TeamInsightDAO {

	@Autowired 
	private SqlSessionFactory sqlFactory =null;
	
	public List<TeamInsightVO> selectList(int userid){
		System.out.println(userid);
		System.out.println("나오나?");
		
		 return sqlFactory.openSession().selectList("TeamInsight.selectTeamEntryDate",userid);
		 
	}
	
	
	
	

	
	
	
}
