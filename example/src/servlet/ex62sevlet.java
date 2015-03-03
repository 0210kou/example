package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex62sevlet
 */
@WebServlet("/ex62sevlet")
public class ex62sevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ex62sevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {





				//0以上9未満の整数を乱数で生成
				int index = (int) (Math.random() * 9);
				//int index = 4;

				//奇数ならリダイレクト、偶数ならフォワード
				if(index % 2 == 1){
					//リダイレクト
					response.sendRedirect("http://localhost:8080/example/reddirect.jsp");
				}else{
					//フォワード
					RequestDispatcher dispatcher =
							request.getRequestDispatcher("/forwarded.jsp");
					dispatcher.forward(request,response);
				}


		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
