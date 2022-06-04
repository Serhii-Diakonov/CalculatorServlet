import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Answer")
public class ServletAnswer extends HttpServlet {

    private Double a, b;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag=true;
        System.out.println("a = "+req.getParameter("a"));
        System.out.println("b = "+req.getParameter("b"));
        System.out.println("operation : "+req.getParameter("oper"));
        if (isValid(req.getParameter("a"))) {
            if (!Double.isNaN((a = parse(req.getParameter("a"))))) {
                a=parse(req.getParameter("a"));
                String ans="null";
                switch (req.getParameter("oper")) {
                    case "-" -> {
                        if (isValid(req.getParameter("b"))&& !Double.isNaN((b = parse(req.getParameter("b")))))
                            ans = String.valueOf(a - b);
                        else {
                            flag=false;
                            req.getRequestDispatcher("invalid.jsp").forward(req, resp);
                        }
                    }
                    case "+" -> {
                        if (isValid(req.getParameter("b"))&& !Double.isNaN((b = parse(req.getParameter("b")))))
                            ans = String.valueOf(a + b);
                        else {
                            flag=false;
                            req.getRequestDispatcher("invalid.jsp").forward(req, resp);
                        }
                    }
                    case "*" -> {
                        if (isValid(req.getParameter("b"))&&!Double.isNaN(b = parse(req.getParameter("b"))))
                            ans = String.valueOf(a * b);
                        else {
                            flag=false;
                            req.getRequestDispatcher("invalid.jsp").forward(req, resp);
                        }
                    }
                    case "/" -> {
                        if (isValid(req.getParameter("b"))&&!Double.isNaN(b = parse(req.getParameter("b"))))
                            ans = String.valueOf(a / b);
                        else {
                            flag=false;
                            req.getRequestDispatcher("invalid.jsp").forward(req, resp);
                        }
                    }
                    case "sin(x)" -> ans = String.valueOf(Math.sin(a));
                    case "cos(x)" -> ans = String.valueOf(Math.cos(a));
                    case "tg(x)" -> ans = String.valueOf(Math.tan(a));
                    case "ctg(x)" -> ans = String.valueOf(1 / Math.tan(a));
                    case "ln(x)" -> ans = String.valueOf(Math.log(a));
                    case "lg(x)" -> ans = String.valueOf(Math.log10(a));
                    case "sec(x)" -> ans = String.valueOf(1 / Math.cos(a));
                    case "cosec(x)" -> ans = String.valueOf(1 / Math.sin(a));
                    case "sh(x)" -> ans = String.valueOf(Math.sinh(a));
                    case "ch(x)" -> ans = String.valueOf(Math.cosh(a));
                    case "a^b" -> {
                        if (isValid(req.getParameter("b"))&&!Double.isNaN(b = parse(req.getParameter("b"))))
                            ans = String.valueOf(Math.pow(a, b));
                        else {
                            flag=false;
                            req.getRequestDispatcher("invalid.jsp").forward(req, resp);
                        }
                    }
                }
                if(flag){
                    req.setAttribute("answer", ans);
                    req.getRequestDispatcher("answer.jsp").forward(req, resp);
                }
                System.out.println(ans);
            } else req.getRequestDispatcher("invalid.jsp").forward(req, resp);
        }else req.getRequestDispatcher("error.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private boolean isValid(String s1) {
        return s1 != null && !s1.isEmpty();
    }

    private Double parse(String s) {
        double res;
        if (s.equals("e") || s.equals("E")) return Math.E;
        if (s.equals("pi") || s.equals("Pi") || s.equals("PI")) return Math.PI;
        try {
            res = Double.parseDouble(s);
            return res;
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }

}
