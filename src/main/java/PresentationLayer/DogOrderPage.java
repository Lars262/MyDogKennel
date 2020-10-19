package PresentationLayer;

import FunctionLayer.LoginSampleException;
import sun.rmi.server.Dispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DogOrderPage extends Command{
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String breed=request.getParameter("breed");
        String area=request.getParameter("area");
        String msg=String.format("You asked for %s in %s",breed,area);
        request.setAttribute("breed",breed);
        request.setAttribute("area",area);
        request.setAttribute("msg",msg);

        return "dogorderpage";
    }
}
