/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.PermisosDAO;
import Modelo.Permiso;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import loginws.NewWebService;
 
/**
 *
 * @author basti
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WebServices/NewWebService.wsdl")
    private NewWebService service;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");
            
            
            if("login".equals(action)) {
                String u = request.getParameter("usuario");
                String p = request.getParameter("password");
                
                 loginws.Usuario usu = checkLogin(u,p);
                             
          
                if(usu.getRut().isEmpty()){
                response.sendRedirect("login.jsp");
                                
                }
                else {  
                 HttpSession session = request.getSession();
             
                   session.setAttribute("nombre",usu.getNombre()+ " " + usu.getApellidoPaterno());
                   session.setAttribute("nombre1",usu.getNombre());
                   session.setAttribute("apellido",usu.getApellidoPaterno());
                   session.setAttribute("apellidom", usu.getApellidoMaterno());
                   session.setAttribute("rut", usu.getRut());
                   session.setAttribute("mail", usu.getMail());
                   session.setAttribute("nombre_cargo", usu.getCargo());
                   session.setAttribute("nombre_departamento", usu.getDpto());
             
                    switch (usu.getTipoUser()) {
                        case 1:
                            response.sendRedirect("menu.jsp");
                            break;
                        case 2:
                            response.sendRedirect("MenuJefeUinterna.jsp");
                            break;
                        case 3:
                            response.sendRedirect("MenuJefeUsuperior.jsp");
                            break;
                        case 4:
                            response.sendRedirect("MenuAlcalde.jsp");
                            break;
                        case 5:
                            
                            PermisosDAO permisoDao = new PermisosDAO();
                            
                            ArrayList<Permiso> permisos = permisoDao.getPermisos();
                         
                            request.setAttribute("permisos", permisos);
                            response.sendRedirect("MenuFuncionario.jsp");
                            break;
                        default:
                            break;
                    }
                                
              }
                         
             //   response.sendRedirect(url);
            }    
            
            
          
          HttpSession sesion = request.getSession(); //mostrar datos
          String object = (String) sesion.getAttribute("misDatos");
          
         
                    
                    
            
        } finally {
            out.close();
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
    @Override
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private loginws.Usuario checkLogin(java.lang.String u, java.lang.String p) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginws.Login port = service.getLoginPort();
        return port.checkLogin(u, p);
    }

    private loginws.Usuario datosUsuario(java.lang.String u, java.lang.String p) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginws.Login port = service.getLoginPort();
        return port.datosUsuario(u, p);
    }

   

   

}
