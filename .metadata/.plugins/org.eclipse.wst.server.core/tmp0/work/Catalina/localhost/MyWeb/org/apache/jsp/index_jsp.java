/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-05-03 07:55:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1620003054633L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1620028518463L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \t");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-idth, initial-scale=1\">\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <title>Welcome to MyWorld</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/business-casual.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Fonts -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("\t <!-- jQuery -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Script to Activate the Carousel -->\r\n");
      out.write("    <script>\r\n");
      out.write("    $('.carousel').carousel({\r\n");
      out.write("        interval: 2000 //changes the speed\r\n");
      out.write("    })\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header -->\r\n");
      out.write("\t<div class=\"brand\">My Web</div>        \r\n");
      out.write("    <div class=\"address-bar\">Welcome to MyWorld</div>\r\n");
      out.write("\t\t\r\n");
      out.write("    \r\n");
      out.write("    <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                \r\n");
      out.write("                <a class=\"navbar-brand\" href=\"/hong\">My First Web</a>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                \t\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print( request.getContextPath() );
      out.write("\">HOME</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/member/member.jsp\">Member</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\">BOARD</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
 if(session.getAttribute("user_id") == null) { 
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/login.jsp\">LOGIN</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/join.jsp\" style=\"color:red\">JOIN</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
 } else { 
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/mypage.jsp\">마이페이지</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/logout.jsp\">로그아웃</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </nav>\r\n");
      out.write(" \t<!-- end header -->");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"row \">\r\n");
      out.write("        \t\r\n");
      out.write("        \t       \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                \r\n");
      out.write("                       \r\n");
      out.write("                <div class=\"col-lg-6 text-center\">\r\n");
      out.write("                    <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\"><!-- data-ride=\"carousel\" 자동 슬라이드 기능 -->\r\n");
      out.write("                       \r\n");
      out.write("                        <ol class=\"carousel-indicators hidden-xs\">\r\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                        <div class=\"carousel-inner\">\r\n");
      out.write("                            <div class=\"item active\">\r\n");
      out.write("                                <img class=\"img-responsive img-full\" src=\"img/1.jpg\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <img class=\"img-responsive img-full\" src=\"img/2.jpg\"> <!-- img-full 옵션 class -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <img class=\"img-responsive img-full\" src=\"img/3.jpg\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                       \t\r\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\r\n");
      out.write("                            <span class=\"icon-prev\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\r\n");
      out.write("                            <span class=\"icon-next\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                 \r\n");
      out.write("                    \r\n");
      out.write("                <div class=\"col-lg-6 text-center\" >    \r\n");
      out.write("                   \r\n");
      out.write("\t\t\t\t\t\t<h2>배우</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t한지민을 소개합니다.\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t<h3>화보 영상</h3>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<iframe width=\"100%\" height=\"372px\" src=\"https://www.youtube.com/embed/1C6dcnVQjSM?autoplay=1&amp;loop=1\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>></iframe>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                 </div>   \r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("            \r\n");
      out.write("                      \r\n");
      out.write("        \r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <h2 class=\"intro-text text-center\">Jimin World\r\n");
      out.write("                        <strong>유의 사항!</strong>\r\n");
      out.write("                    </h2>\r\n");
      out.write("                    <hr>\r\n");
      out.write("\t\t                <div class=\"inner\" align=\"center\">\r\n");
      out.write("\t\t                    <img class=\"img-responsive img-center\" src=\"img/intro.jpg\" alt=\"\"><!-- img-border --> \r\n");
      out.write("\t\t                    \r\n");
      out.write("\t\t                    <hr class=\"visible-xs\">\r\n");
      out.write("\t\t                   \r\n");
      out.write("\t\t                    <p>1. 모든 자료는 회원 가입 후에 이용하실 수 있습니다.</p>\r\n");
      out.write("\t\t                    <p>2. ------------------------------------------------------</p>\r\n");
      out.write("\t\t                    <p>3. ------------------------------------------------------</p>\r\n");
      out.write("\t                    \t\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    \t\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("              \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("    <!-- /.container -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <p>Copyright &copy; By Park 2018.XX.XX~</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
