/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-01 19:25:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("<!-- \t\t<meta charset=\"ISO-8859-1\"> -->\r\n");
      out.write("\t\t<title>Insert title here</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write(" \t\t\t.aParent div { \r\n");
      out.write(" \t\t\t\t float: left;\r\n");
      out.write("\t\t\t\t clear: none; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.viewport {\r\n");
      out.write("    \t\t\twidth: 100%;\r\n");
      out.write("    \t\t\tposition: absolute;\r\n");
      out.write("    \t\t\ttop: 0;\r\n");
      out.write("    \t\t\tbottom: 0;\r\n");
      out.write("    \t\t\tbackground-color: \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.login {\r\n");
      out.write("\t\t\t    background-color: darkblue;\r\n");
      out.write("    \t\t\tcolor: white;\r\n");
      out.write("    \t\t\theight: 50px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.login-form {\r\n");
      out.write("\t\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\t\theight: 100%;\r\n");
      out.write("\t\t\t\tborder-color: gray;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.loginData {\r\n");
      out.write("\t\t\t\tbackground-color: gray;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\theight: 50px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("<!-- \t\t<div class=\"aParent\"> -->\r\n");
      out.write("\t\t<div class=\"viewport\">\r\n");
      out.write("\t\t<div>Message is: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t<table class=\"login-form\" border=\"1\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width = \"50%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<div style=\"word-wrap: break-word;\"><font size=\"100px\">Achieving perfect secrecy using dynamic network control</font></div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width = \"40%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<form action=\"/\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"login-form\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"center\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLogin \r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"loginData\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tUser Name \r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"loginData\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPassword\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\"  align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Reset\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
