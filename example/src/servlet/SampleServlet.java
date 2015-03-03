package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//運勢をランダムで決定
				String[] luckArray = { "超スッキリ","スッキリ","最悪"};

				//0以上3未満の整数を乱数で生成
				int index = (int) (Math.random() * 3);

				String luck = luckArray[index];

				//実行日を取得
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				String today = sdf.format(date);

				//HTMLを入力
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Order Format</title>");
				out.println("</head>");
				out.println("<body>");
				out.println( "<font color=red >" );
				out.println("please form your Address");

				out.println("<p>" +"<input type= number name= example1 required>" +"</p>" );
				out.println("your Phone-number");
				out.println("<p>" +"<input type= number name= example2 required>" +"</p>" );
				out.println("your Email-Address");
				out.println("<p>" +"<input type= number name= example2 required>" +"</p>" );

				out.println("<p>" +"<input type= Submit value=submit target= _blank>"+"</p>" );
				out.println("<p>" +"<input type= Reset value=reset>"+ "</p>" );
				out.println("<from method= post action= example.cgi  target= _blank> Thank You</from>");
				out.println("</body>");
				out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub


	}

}
