package br.com.aula.ExemploServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastroLogin
 */
@WebServlet("/CadastroLogin")
public class CadastroLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request, response);
		}
		private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			validaDadosRecebidos(req);
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
			
		}
		private void validaDadosRecebidos(HttpServletRequest req) throws ServletException {
			String nomeUsuario = req.getParameter("txtusuario");
			String nomeSenha = req.getParameter("txtsenha");
			if(nomeUsuario.trim().equals("") || nomeSenha.trim().equals(""))	
				throw new ServletException("Preencha os Campos");
		}
}
