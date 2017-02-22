package org.apache.jsp.jnt_005ftemplate.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_bootstrap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addResources_type_resources_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addResources_type_resources_condition_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bootstrap_addThemeJS_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bootstrap_addCSS_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_area_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_template_addResources_type_resources_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_addResources_type_resources_condition_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bootstrap_addThemeJS_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bootstrap_addCSS_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_area_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_template_addResources_type_resources_nobody.release();
    _jspx_tagPool_template_addResources_type_resources_condition_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_bootstrap_addThemeJS_nobody.release();
    _jspx_tagPool_bootstrap_addCSS_nobody.release();
    _jspx_tagPool_template_area_path_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderContext.mainResourceLocale.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("    <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:escapeXml(renderContext.mainResource.node.displayableName)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</title>\n");
      out.write("\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_template_addResources_0(_jspx_page_context))
        return;
      if (_jspx_meth_template_addResources_1(_jspx_page_context))
        return;
      if (_jspx_meth_template_addResources_2(_jspx_page_context))
        return;
      if (_jspx_meth_template_addResources_3(_jspx_page_context))
        return;
      if (_jspx_meth_template_addResources_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"icon\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" type=\"image/ico\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\"\n");
      out.write("          href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <meta name='HandheldFriendly' content='True'/>\n");
      out.write("    <meta name=\"viewport\"\n");
      out.write("          content=\"initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, width=device-width, user-scalable=no\">\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\"/>\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\">\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Audiowide' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      if (_jspx_meth_template_addResources_5(_jspx_page_context))
        return;
      if (_jspx_meth_template_addResources_6(_jspx_page_context))
        return;
      if (_jspx_meth_bootstrap_addThemeJS_0(_jspx_page_context))
        return;
      if (_jspx_meth_bootstrap_addCSS_0(_jspx_page_context))
        return;
      if (_jspx_meth_template_area_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    ");
      if (_jspx_meth_template_area_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"copyright\">\n");
      out.write("        ");
      if (_jspx_meth_template_area_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_template_addResources_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_0 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_0.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_0.setParent(null);
    _jspx_th_template_addResources_0.setType("javascript");
    _jspx_th_template_addResources_0.setResources("modernizr.js");
    int _jspx_eval_template_addResources_0 = _jspx_th_template_addResources_0.doStartTag();
    if (_jspx_th_template_addResources_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_0);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_0);
    return false;
  }

  private boolean _jspx_meth_template_addResources_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_1 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_1.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_1.setParent(null);
    _jspx_th_template_addResources_1.setType("css");
    _jspx_th_template_addResources_1.setResources("prettify.css");
    int _jspx_eval_template_addResources_1 = _jspx_th_template_addResources_1.doStartTag();
    if (_jspx_th_template_addResources_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_1);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_1);
    return false;
  }

  private boolean _jspx_meth_template_addResources_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_2 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_2.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_2.setParent(null);
    _jspx_th_template_addResources_2.setType("javascript");
    _jspx_th_template_addResources_2.setResources("prettify.js,lang-css.js,");
    int _jspx_eval_template_addResources_2 = _jspx_th_template_addResources_2.doStartTag();
    if (_jspx_th_template_addResources_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_2);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_2);
    return false;
  }

  private boolean _jspx_meth_template_addResources_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_3 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_condition_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_3.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_3.setParent(null);
    _jspx_th_template_addResources_3.setType("javascript");
    _jspx_th_template_addResources_3.setResources("html5shiv.js");
    _jspx_th_template_addResources_3.setCondition("if lt IE 9");
    int _jspx_eval_template_addResources_3 = _jspx_th_template_addResources_3.doStartTag();
    if (_jspx_th_template_addResources_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_condition_nobody.reuse(_jspx_th_template_addResources_3);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_condition_nobody.reuse(_jspx_th_template_addResources_3);
    return false;
  }

  private boolean _jspx_meth_template_addResources_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_4 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_4.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_4.setParent(null);
    _jspx_th_template_addResources_4.setType("css");
    _jspx_th_template_addResources_4.setResources("font-awesome.css");
    int _jspx_eval_template_addResources_4 = _jspx_th_template_addResources_4.doStartTag();
    if (_jspx_th_template_addResources_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_4);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_4);
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.currentModule}/icon/favicon.ico", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.currentModule}/icon/favicon.ico", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.currentModule}/icon/favicon.png", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.currentModule}/icon/icon-iphone.png", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.currentModule}/icon/icon-ipad.png", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.currentModule}/icon/jahia-icon-iphone4.png", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("s");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderContext.request.scheme=='https'?'s':''}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_template_addResources_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_5 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_5.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_5.setParent(null);
    _jspx_th_template_addResources_5.setType("css");
    _jspx_th_template_addResources_5.setResources("jahia-old-responsive.css,jahia-old.css");
    int _jspx_eval_template_addResources_5 = _jspx_th_template_addResources_5.doStartTag();
    if (_jspx_th_template_addResources_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_5);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_5);
    return false;
  }

  private boolean _jspx_meth_template_addResources_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_6 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_6.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_6.setParent(null);
    _jspx_th_template_addResources_6.setType("javascript");
    _jspx_th_template_addResources_6.setResources("jquery.min.js");
    int _jspx_eval_template_addResources_6 = _jspx_th_template_addResources_6.doStartTag();
    if (_jspx_th_template_addResources_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_6);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_6);
    return false;
  }

  private boolean _jspx_meth_bootstrap_addThemeJS_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bootstrap:addThemeJS
    org.jahia.modules.bootstrap.tags.AddBootstrapThemeJavascriptTag _jspx_th_bootstrap_addThemeJS_0 = (org.jahia.modules.bootstrap.tags.AddBootstrapThemeJavascriptTag) _jspx_tagPool_bootstrap_addThemeJS_nobody.get(org.jahia.modules.bootstrap.tags.AddBootstrapThemeJavascriptTag.class);
    _jspx_th_bootstrap_addThemeJS_0.setPageContext(_jspx_page_context);
    _jspx_th_bootstrap_addThemeJS_0.setParent(null);
    int _jspx_eval_bootstrap_addThemeJS_0 = _jspx_th_bootstrap_addThemeJS_0.doStartTag();
    if (_jspx_th_bootstrap_addThemeJS_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bootstrap_addThemeJS_nobody.reuse(_jspx_th_bootstrap_addThemeJS_0);
      return true;
    }
    _jspx_tagPool_bootstrap_addThemeJS_nobody.reuse(_jspx_th_bootstrap_addThemeJS_0);
    return false;
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

  private boolean _jspx_meth_template_area_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:area
    org.jahia.taglibs.template.include.AreaTag _jspx_th_template_area_0 = (org.jahia.taglibs.template.include.AreaTag) _jspx_tagPool_template_area_path_nobody.get(org.jahia.taglibs.template.include.AreaTag.class);
    _jspx_th_template_area_0.setPageContext(_jspx_page_context);
    _jspx_th_template_area_0.setParent(null);
    _jspx_th_template_area_0.setPath("header");
    int _jspx_eval_template_area_0 = _jspx_th_template_area_0.doStartTag();
    if (_jspx_th_template_area_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_area_path_nobody.reuse(_jspx_th_template_area_0);
      return true;
    }
    _jspx_tagPool_template_area_path_nobody.reuse(_jspx_th_template_area_0);
    return false;
  }

  private boolean _jspx_meth_template_area_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:area
    org.jahia.taglibs.template.include.AreaTag _jspx_th_template_area_1 = (org.jahia.taglibs.template.include.AreaTag) _jspx_tagPool_template_area_path_nobody.get(org.jahia.taglibs.template.include.AreaTag.class);
    _jspx_th_template_area_1.setPageContext(_jspx_page_context);
    _jspx_th_template_area_1.setParent(null);
    _jspx_th_template_area_1.setPath("pagecontent");
    int _jspx_eval_template_area_1 = _jspx_th_template_area_1.doStartTag();
    if (_jspx_th_template_area_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_area_path_nobody.reuse(_jspx_th_template_area_1);
      return true;
    }
    _jspx_tagPool_template_area_path_nobody.reuse(_jspx_th_template_area_1);
    return false;
  }

  private boolean _jspx_meth_template_area_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:area
    org.jahia.taglibs.template.include.AreaTag _jspx_th_template_area_2 = (org.jahia.taglibs.template.include.AreaTag) _jspx_tagPool_template_area_path_nobody.get(org.jahia.taglibs.template.include.AreaTag.class);
    _jspx_th_template_area_2.setPageContext(_jspx_page_context);
    _jspx_th_template_area_2.setParent(null);
    _jspx_th_template_area_2.setPath("footer");
    int _jspx_eval_template_area_2 = _jspx_th_template_area_2.doStartTag();
    if (_jspx_th_template_area_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_area_path_nobody.reuse(_jspx_th_template_area_2);
      return true;
    }
    _jspx_tagPool_template_area_path_nobody.reuse(_jspx_th_template_area_2);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderContext.editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_template_addResources_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_template_addResources_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_7 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_7.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_template_addResources_7.setType("css");
    _jspx_th_template_addResources_7.setResources("edit.css");
    int _jspx_eval_template_addResources_7 = _jspx_th_template_addResources_7.doStartTag();
    if (_jspx_th_template_addResources_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_7);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_7);
    return false;
  }
}
