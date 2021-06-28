package com.gs52.controller.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gs52.dao.manager.RegistDAO;
import com.gs52.vo.emp.EmpVO;
import com.gs52.vo.manager.PositionVO;
import com.gs52.vo.manager.RankVO;
import com.gs52.vo.manager.RegistVO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value="/manager")
public class RegistController {
 
	@Autowired
	public RegistDAO  rDAO = null;
	

	@PostMapping("/select_dept")
	public List<RegistVO> selectDept() {

		System.out.println("selectDept"); 
		System.out.println(rDAO.selectDept()); 
	return rDAO.selectDept();
	}
	
	@PostMapping("/select_rank")
	public List<RankVO> selectRank() {

		System.out.println("selectRank"); 
		System.out.println(rDAO.selectRank()); 
	return rDAO.selectRank();
	}

	@PostMapping("/select_position")
	public List<PositionVO> selectPosition() {

		System.out.println("selectPosition"); 
		System.out.println(rDAO.selectPosition()); 
	return rDAO.selectPosition();
	}
	

	@PostMapping("/select_emp")
	public List<EmpVO> selectEmp() {

		System.out.println("selectEmp"); 
		System.out.println(rDAO.selectEmp()); 
	return rDAO.selectEmp();
	}
	
	
	@PostMapping("/regist")
	public int insertConf(@RequestBody RegistVO vo) {
		System.out.println("insertConf"); 
		System.out.println(vo);
		return rDAO.insertRegist(vo);
	}
	
}
