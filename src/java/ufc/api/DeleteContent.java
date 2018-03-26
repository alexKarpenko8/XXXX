package ufc.api;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ufc.controllers.ContentController;



@WebServlet(name = "DeleteContent", urlPatterns = {"/DeleteContent"})
public class DeleteContent extends HttpServlet { 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       //String jsonObject = request.getParameter("json");
        int id = Integer.parseInt(request.getParameter("id"));
        try (PrintWriter out = response.getWriter()) 
        {
           //Contents contents = JsonContentsMapper.fromJSON(jsonObject);
           ContentController  contentsController = new ContentController();
           int res=contentsController.deleteContent(id);
           out.print(res);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    } 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

