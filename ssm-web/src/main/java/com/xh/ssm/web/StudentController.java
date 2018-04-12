package com.xh.ssm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xh.ssm.model.Student;
import com.xh.ssm.service.IStudentService;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年4月10日
 */
@Controller
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@RequestMapping("/show")
	public void show() {

		System.out.println("SHOW");
	}

	@RequestMapping("/query")
	@ResponseBody
	public Object query() {
		List<Student> list = studentService.selectList(null);
		return list;
	}
}
