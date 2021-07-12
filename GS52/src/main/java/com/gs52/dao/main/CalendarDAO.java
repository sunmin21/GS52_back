package com.gs52.dao.main;

import java.util.List;
import javax.transaction.Transactional;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gs52.vo.main.CalendarVO;

@Service
@Transactional
public class CalendarDAO {
	
	@Autowired
	private SqlSessionFactory sqlFactory = null;
	
	public List<CalendarVO> selectCalendar(@RequestBody CalendarVO vo) {
//		System.out.println("calendar DAO ~~~~~~");
		System.out.println("@@@@@@@@@@@@@@@");
		System.out.println(vo);
		return sqlFactory.openSession().selectList("mainCalendar.selectCalendar", vo);
	}
}
