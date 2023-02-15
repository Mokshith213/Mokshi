package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoHosp;
import dto.Dtohosp;

@WebServlet("/mokshi")
public class Controlerhosp extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String s1=req.getParameter("name");
		String s2=req.getParameter("id");
		String s3=req.getParameter("blood");
		String s4=req.getParameter("ph");
		
		int id1=Integer.parseInt(s2);
		int phone1=Integer.parseInt(s4);
		
		Dtohosp d1=new Dtohosp();
		d1.setName(s1);
		d1.setId(id1);
		d1.setBloodgroup(s3);
		d1.setNumber(phone1);
		
		DaoHosp d2=new DaoHosp();
		d2.insert(d1);
	}
	

	
}
