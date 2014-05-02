package controller.servlet;

import model.beans.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by shakhov on 23.03.14.
 */
public class LoginServlet extends HttpServlet{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
        String pas = req.getParameter("pas");
        String log = req.getParameter("log");
        User user = new User("log", "pas");
        if(log.equals(user.getLogin())&&pas.equals(user.getPas())) {
            req.setAttribute("test", "yes");
        }else {
            req.setAttribute("test", "no");
        }
        req.getRequestDispatcher("test.jsp").forward(req,res);
    }
}
