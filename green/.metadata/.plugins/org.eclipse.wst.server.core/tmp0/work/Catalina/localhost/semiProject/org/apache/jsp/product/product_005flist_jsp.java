/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-24 05:16:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import product.ProductBean;
import java.util.ArrayList;
import product.ProductDBBean;

public final class product_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("product.ProductBean");
    _jspx_imports_classes.add("product.ProductDBBean");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("utf-8");
	String pageNum = request.getParameter("pageNum");//페이지 넘버 가져오기

	if (pageNum == null) {
		pageNum = "1";
	}
	ProductDBBean updb = ProductDBBean.getInstance();
	
	ArrayList<ProductBean> productList = updb.productList(pageNum);
	
	int product_number = 0, product_price = 0, product_stock = 0;
	String product_name = "", category_code = "";
	Timestamp create_date = null;
	String stored_file_name = "";//이미지 파일 호출을위한 변수
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	String path = request.getSession().getServletContext().getRealPath("\\img");

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<title>Product</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/simplebar.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/feather.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/select2.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/dropzone.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/uppy.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/jquery.steps.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/jquery.timepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/quill.snow.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/daterangepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/app-light.css\" id=\"lightTheme\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("        function show_product(){\r\n");
      out.write("            if($('.product_sub').css('display') == 'none'){\r\n");
      out.write("            $('.product_sub').show();\r\n");
      out.write("            } else {\r\n");
      out.write("                $('.product_sub').hide();\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        //최상단 체크박스 클릭시 상품목록 전체클릭.\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("        	$(\".cbx_chkAll\").click(function() {\r\n");
      out.write("        		if($(\".cbx_chkAll\").is(\":checked\")) $(\"input[name=chk]\").prop(\"checked\", true);\r\n");
      out.write("        		else $(\"input[name=chk]\").prop(\"checked\", false);\r\n");
      out.write("        	});\r\n");
      out.write("\r\n");
      out.write("        	$(\"input[name=chk]\").click(function() {\r\n");
      out.write("        		var total = $(\"input[name=chk]\").length;\r\n");
      out.write("        		var checked = $(\"input[name=chk]:checked\").length;\r\n");
      out.write("\r\n");
      out.write("        		if(total != checked) $(\".cbx_chkAll\").prop(\"checked\", false);\r\n");
      out.write("        		else $(\".cbx_chkAll\").prop(\"checked\", true); \r\n");
      out.write("        	});\r\n");
      out.write("        });\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"vertical  light  \">\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("			<div class=\"container-fluid\">\r\n");
      out.write("				<div class=\"row justify-content-center\">\r\n");
      out.write("					<div class=\"col-12\">\r\n");
      out.write("						<!-- table -->\r\n");
      out.write("						<div class=\"card shadow\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<table class=\"table table-borderless table-hover\">\r\n");
      out.write("									<thead>\r\n");
      out.write("										<tr>\r\n");
      out.write("											<th>\r\n");
      out.write("												<div class=\"custom-control custom-checkbox\">\r\n");
      out.write("													<input type=\"checkbox\" class=\"custom-control-input cbx_chkAll\" id=\"all2\"> <label class=\"custom-control-label\" for=\"all2\">NO</label>\r\n");
      out.write("												</div>\r\n");
      out.write("											</th>\r\n");
      out.write("											<th>상품명</th>\r\n");
      out.write("											<th>판매가</th>\r\n");
      out.write("											<th>카테고리</th>\r\n");
      out.write("											<th>재고</th>\r\n");
      out.write("											<th>등록일</th>\r\n");
      out.write("											<th>수정</th>\r\n");
      out.write("											<th>삭제</th>\r\n");
      out.write("										</tr>\r\n");
      out.write("									</thead>\r\n");
      out.write("									<tbody>\r\n");
      out.write("										");

											for (int i = 0; i < productList.size(); i++) {
											ProductBean upbd = productList.get(i);

											product_number = upbd.getProduct_number();
											product_name = upbd.getProduct_name();
											product_price = upbd.getProduct_price();
											category_code = upbd.getCategory_code();
											product_stock = upbd.getProduct_stock();
											stored_file_name = updb.getImg(product_number).getStored_file_name();
											create_date = updb.getImg(product_number).getCreate_date();
										
      out.write("\r\n");
      out.write("										<tr>\r\n");
      out.write("											<td><input type=\"checkbox\" class=\"check\" name=\"chk\">NO.");
      out.print(product_number);
      out.write("</td>\r\n");
      out.write("											<td><img style=\"width: 100px\" height=\"100px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/");
      out.print(stored_file_name);
      out.write("\"><br>상품명:");
      out.print(product_name);
      out.write("</td>\r\n");
      out.write("											<td>");
      out.print(product_price);
      out.write("원</td>\r\n");
      out.write("											<td>");
      out.print(category_code);
      out.write("</td>\r\n");
      out.write("											<td>");
      out.print(product_stock);
      out.write("개</td>\r\n");
      out.write("											<td>");
      out.print(sdf.format(create_date));
      out.write("</td>\r\n");
      out.write("											<td><input type=\"button\" value=\"수정\" onclick=\"location.href='adminIndex.jsp?pages=../product/editProduct&product_number=");
      out.print(product_number);
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("'\"></td>\r\n");
      out.write("											<td><input type=\"button\" value=\"삭제\" onclick=\"location.href='adminIndex.jsp?pages=../product/deleteProduct_ok&product_number=");
      out.print(product_number);
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("'\"></td>\r\n");
      out.write("										</tr>\r\n");
      out.write("										");

											}
										
      out.write("\r\n");
      out.write("									</tbody>\r\n");
      out.write("								</table>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<nav aria-label=\"Table Paging\" class=\"my-3\">\r\n");
      out.write("							<ul class=\"pagination justify-content-end mb-0\">\r\n");
      out.write("								<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Previous</a></li>\r\n");
      out.write("								<li class=\"page-item active\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("								<li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("								<li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("								<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Next</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- .col-12 -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- .row -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- .container-fluid -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal fade modal-shortcut modal-slide\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"defaultModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("				<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("					<div class=\"modal-content\">\r\n");
      out.write("						<div class=\"modal-header\">\r\n");
      out.write("							<h5 class=\"modal-title\" id=\"defaultModalLabel\">Shortcuts</h5>\r\n");
      out.write("							<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("								<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("							</button>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"modal-body px-5\">\r\n");
      out.write("							<div class=\"row align-items-center\">\r\n");
      out.write("								<div class=\"col-6 text-center\">\r\n");
      out.write("									<div class=\"squircle bg-success justify-content-center\">\r\n");
      out.write("										<i class=\"fe fe-cpu fe-32 align-self-center text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("									<p>Control area</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-6 text-center\">\r\n");
      out.write("									<div class=\"squircle bg-primary justify-content-center\">\r\n");
      out.write("										<i class=\"fe fe-activity fe-32 align-self-center text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("									<p>Activity</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row align-items-center\">\r\n");
      out.write("								<div class=\"col-6 text-center\">\r\n");
      out.write("									<div class=\"squircle bg-primary justify-content-center\">\r\n");
      out.write("										<i class=\"fe fe-droplet fe-32 align-self-center text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("									<p>Droplet</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-6 text-center\">\r\n");
      out.write("									<div class=\"squircle bg-primary justify-content-center\">\r\n");
      out.write("										<i class=\"fe fe-upload-cloud fe-32 align-self-center text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("									<p>Upload</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row align-items-center\">\r\n");
      out.write("								<div class=\"col-6 text-center\">\r\n");
      out.write("									<div class=\"squircle bg-primary justify-content-center\">\r\n");
      out.write("										<i class=\"fe fe-users fe-32 align-self-center text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("									<p>Users</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-6 text-center\">\r\n");
      out.write("									<div class=\"squircle bg-primary justify-content-center\">\r\n");
      out.write("										<i class=\"fe fe-settings fe-32 align-self-center text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("									<p>Settings</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		<!-- main -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- .wrapper -->\r\n");
      out.write("	<script src=\"../js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/simplebar.min.js\"></script>\r\n");
      out.write("    <script src='../js/daterangepicker.js'></script>\r\n");
      out.write("    <script src='../js/jquery.stickOnScroll.js'></script>\r\n");
      out.write("    <script src=\"../js/tinycolor-min.js\"></script>\r\n");
      out.write("    <script src=\"../js/config.js\"></script>\r\n");
      out.write("    <script src=\"../js/d3.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/topojson.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/datamaps.all.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/datamaps-zoomto.js\"></script>\r\n");
      out.write("    <script src=\"../js/datamaps.custom.js\"></script>\r\n");
      out.write("    <script src=\"../js/Chart.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      /* defind global options */\r\n");
      out.write("      Chart.defaults.global.defaultFontFamily = base.defaultFontFamily;\r\n");
      out.write("      Chart.defaults.global.defaultFontColor = colors.mutedColor;\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"../js/gauge.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/jquery.sparkline.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/apexcharts.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/apexcharts.custom.js\"></script>\r\n");
      out.write("    <script src='../js/jquery.mask.min.js'></script>\r\n");
      out.write("    <script src='../js/select2.min.js'></script>\r\n");
      out.write("    <script src='../js/jquery.steps.min.js'></script>\r\n");
      out.write("    <script src='../js/jquery.validate.min.js'></script>\r\n");
      out.write("    <script src='../js/jquery.timepicker.js'></script>\r\n");
      out.write("    <script src='../js/dropzone.min.js'></script>\r\n");
      out.write("    <script src='../js/uppy.min.js'></script>\r\n");
      out.write("    <script src='../js/quill.min.js'></script>\r\n");
      out.write("	<!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("	<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-56159088-1\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		window.dataLayer = window.dataLayer || [];\r\n");
      out.write("\r\n");
      out.write("		function gtag() {\r\n");
      out.write("			dataLayer.push(arguments);\r\n");
      out.write("		}\r\n");
      out.write("		gtag('js', new Date());\r\n");
      out.write("		gtag('config', 'UA-56159088-1');\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
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
