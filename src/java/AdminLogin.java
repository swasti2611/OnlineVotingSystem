/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
/*
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author swati
 */
/*
public class AdminLogin extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("adminName");
        String password=request.getParameter("password");
        DatabaseManager db=new DatabaseManager();
        java.sql.Connection con=db.getConnection();
        try{
            String query="select * from admins where name= '"+name+"'and password='"+password+"' ";
        PreparedStatement st= con.prepareStatement(query); 
        ResultSet rs=((java.sql.Statement)st).executeQuery(query);
        if(rs.next()){
         HttpSession session=request.getSession();
         session.setAttribute("adminName",name);
         response.sendRedirect("AdminWelcome.jsp");
        }else{
            response.sendRedirect("invalid.jsp");
        }
        
        }catch(Exception e){
           e.printStackTrace(); 
           response.sendRedirect("error.jsp");
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   /* @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    /*
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
*/








import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		DbManager db = new DbManager();
		java.sql.Connection con = db.getConnection();
		
		String name = request.getParameter("aName");
		String pass = request.getParameter("Password");
		
		try {
			PreparedStatement st = con.prepareStatement("select * from adminn where aName='"+name+"' and aPassword='"+pass+"'");
		    ResultSet rs = ((java.sql.Statement)st).executeQuery("select * from adminn where aName='"+name+"' and aPassword='"+pass+"'");
		
		    if(rs.next()) {
		    	HttpSession session = request.getSession();
		    	session.setAttribute("aName",name);
		    	response.sendRedirect("AdminWelcome.jsp");
		    }
		    else {
		    	response.sendRedirect("invalid.jsp");
		    }
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}







