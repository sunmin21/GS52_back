package com.gs52.vo.attendance;

import org.apache.ibatis.annotations.Param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //DTO 코드를 자동으로 Generate (Getter, Setter, toString, default 생성자)
@NoArgsConstructor // 기본생성자
@AllArgsConstructor //모든 속성을 파라미터로 갖는 생성자
public class AnnualManageVO {

	
	private int VACATION_INDEX=0;
	private int VACATION_EMP_ID =0;
	private String VACATION_DATE = null;
	private String VACATION_CONTENTS = null;
	private int VACATION_ATTEND_INFO_INDEX =0;
	private double EMP_VACATION=0;
	private String ATTEND_TYPE_NAME  =null;
	private double COUNT =0;
	private int EMP_ID = 0;
	
   
	
}
