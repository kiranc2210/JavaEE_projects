/**
 * 
 */
package com.sms.jsp.utils;

import java.util.ArrayList;
import java.util.List;

import com.sms.dao.QueryFactory;
import com.sms.model.Marks;
import com.sms.model.Notices;
import com.sms.model.Student;
import com.sms.model.Teacher;

/**
 * @author Isura
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PasswordService pService = PasswordService.getInstance();
		try {
			String pass = pService.encrypt("HelloWorld");
			System.out.println("Encrypted PassWord= "+pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CryptoService cService = CryptoService.getInstance();
		try {
			String enc = cService.encrypt("Hello Isura=1", "22");
			System.out.println("Encrypted= "+ enc);
			String dec= cService.decrypt(enc, "22");
			System.out.println("Decrypted="+ dec);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		
		@SuppressWarnings("unused")
		List<Student> sList = new ArrayList<Student>();
		sList = QueryFactory.getStudentQueries().selectQuery();
		//request.setAttribute("studList", sList);
		
	
		
		List<Teacher> tList = new ArrayList<Teacher>();
		tList = QueryFactory.TeacherQueries().selectTeachers();
		for(Teacher t : tList){
			System.out.println(t.toString());
			//System.out.println(s.getUser_id());
		}
		
		List<Notices> nList = new ArrayList<Notices>();
		nList = QueryFactory.getNewsQuery().selectQuery();
		
		for(Notices n : nList){
			System.out.println(n.toString());
			System.out.println(n.getDateOfExpire());
		}
		
		int no = 0;
		no = QueryFactory.TeacherQueries().countTeacher();
		System.out.println(no);
		Marks mList = new Marks();
		mList = QueryFactory.getMarksQuery().selectQuery("sms/std/2018/22");
		System.out.println(mList.toString());
	}
	

}
