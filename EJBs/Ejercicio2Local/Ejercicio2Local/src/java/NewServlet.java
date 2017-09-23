/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.NewSessionBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvarocr
 */
public class NewServlet extends HttpServlet {

    @EJB
    private NewSessionBeanLocal newSessionBean;

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
        requestDispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strName = request.getParameter("name");
        System.out.println("From servlet "+strName);
        String answer = newSessionBean.diHola(strName);
        System.out.println("From EJB"+answer);
        request.setAttribute("answer", answer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/answer.jsp");
        requestDispatcher.forward(request, response);
    }


}
