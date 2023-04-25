

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class VoterLogin
 */
public class VoterLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		DbManager db = new DbManager();
		java.sql.Connection con = db.getConnection();
		String vNumber = request.getParameter("voterNumber");
		try {
                    String query="select vNumber from temp_vc_number where vNumber ='"+vNumber+"'";
			PreparedStatement st1 = con.prepareStatement(query);
			ResultSet rs1 = st1.executeQuery(query);
		    if(rs1.next()) {
		    	response.sendRedirect("voted.jsp");
		    }
		    else {
		    	PreparedStatement st2 = con.prepareStatement("select * from voters where vNumber='"+vNumber+"'");
			    ResultSet rs2 = ((java.sql.Statement)st2).executeQuery("select * from voters where vNumber='"+vNumber+"'");
			
			    if(rs2.next()) {
			    	response.sendRedirect("welcomeVoter.jsp");
			    }
			    else {
			    	response.sendRedirect("invalid.jsp");
			    }
		    }
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}