/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import carroCompra.CarroCompra;
import ejb.CarroEJBLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alvarocr
 */
public class MainFormServlet extends HttpServlet {
    
    private CarroEJBLocal getEJBOfSession(HttpServletRequest request){
        HttpSession currentSession = request.getSession();
        CarroEJBLocal ejb= (CarroEJBLocal) currentSession.getAttribute("ejb");
        if(ejb == null){
            ejb = lookupCarroEJBLocal();
            currentSession.setAttribute("ejb", ejb);
        }
        return ejb;
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CarroEJBLocal carroEJB = getEJBOfSession(request);
        CarroCompra elements = carroEJB.getElements();
        request.setAttribute("elements", elements);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/mainForm.jsp");
        requestDispatcher.forward(request, response);
       
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CarroEJBLocal carroEJB = getEJBOfSession(request);
        String productName = request.getParameter("elementName");
        int amount = Integer.valueOf(request.getParameter("amount"));
        carroEJB.addElement(productName, amount);
        processRequest(request, response);
    }

    private CarroEJBLocal lookupCarroEJBLocal() {
        try {
            Context c = new InitialContext();
            return (CarroEJBLocal) c.lookup("java:global/5CarroCompraEA/CarroEJB!ejb.CarroEJBLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
