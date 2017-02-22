package org.apache.jsp.jnt_005fbootstrapNavMenu.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bootstrapNavMenu_addResources_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bootstrap_addCSS_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addResources_type_resources_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bootstrap_addCSS_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_addResources_type_resources_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bootstrap_addCSS_nobody.release();
    _jspx_tagPool_template_addResources_type_resources_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      if (_jspx_meth_bootstrap_addCSS_0(_jspx_page_context))
        return;
      if (_jspx_meth_template_addResources_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_bootstrap_addCSS_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bootstrap:addCSS
    org.jahia.modules.bootstrap.tags.AddBootstrapCSSTag _jspx_th_bootstrap_addCSS_0 = (org.jahia.modules.bootstrap.tags.AddBootstrapCSSTag) _jspx_tagPool_bootstrap_addCSS_nobody.get(org.jahia.modules.bootstrap.tags.AddBootstrapCSSTag.class);
    _jspx_th_bootstrap_addCSS_0.setPageContext(_jspx_page_context);
    _jspx_th_bootstrap_addCSS_0.setParent(null);
    int _jspx_eval_bootstrap_addCSS_0 = _jspx_th_bootstrap_addCSS_0.doStartTag();
    if (_jspx_th_bootstrap_addCSS_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bootstrap_addCSS_nobody.reuse(_jspx_th_bootstrap_addCSS_0);
      return true;
    }
    _jspx_tagPool_bootstrap_addCSS_nobody.reuse(_jspx_th_bootstrap_addCSS_0);
    return false;
  }

  private boolean _jspx_meth_template_addResources_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_0 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_0.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_0.setParent(null);
    _jspx_th_template_addResources_0.setType("javascript");
    _jspx_th_template_addResources_0.setResources("jquery.js,bootstrap-dropdown.js,twitter-bootstrap-hover-dropdown.js");
    int _jspx_eval_template_addResources_0 = _jspx_th_template_addResources_0.doStartTag();
    if (_jspx_th_template_addResources_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_0);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_0);
    return false;
  }
}
