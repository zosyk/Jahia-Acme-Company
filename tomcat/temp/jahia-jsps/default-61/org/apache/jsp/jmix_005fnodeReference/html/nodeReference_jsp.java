package org.apache.jsp.jmix_005fnodeReference.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nodeReference_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addCacheDependency_uuid_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_module_view_node_editable;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_param_value_name_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_template_addCacheDependency_uuid_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_module_view_node_editable = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_template_addCacheDependency_uuid_nobody.release();
    _jspx_tagPool_template_module_view_node_editable.release();
    _jspx_tagPool_template_param_value_name_nobody.release();
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

      if (_jspx_meth_template_addCacheDependency_0(_jspx_page_context))
        return;
      if (_jspx_meth_template_module_0(_jspx_page_context))
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

  private boolean _jspx_meth_template_addCacheDependency_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addCacheDependency
    org.jahia.taglibs.template.include.AddCacheDependencyTag _jspx_th_template_addCacheDependency_0 = (org.jahia.taglibs.template.include.AddCacheDependencyTag) _jspx_tagPool_template_addCacheDependency_uuid_nobody.get(org.jahia.taglibs.template.include.AddCacheDependencyTag.class);
    _jspx_th_template_addCacheDependency_0.setPageContext(_jspx_page_context);
    _jspx_th_template_addCacheDependency_0.setParent(null);
    _jspx_th_template_addCacheDependency_0.setUuid((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentNode.properties['j:node'].string}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_template_addCacheDependency_0 = _jspx_th_template_addCacheDependency_0.doStartTag();
    if (_jspx_th_template_addCacheDependency_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addCacheDependency_uuid_nobody.reuse(_jspx_th_template_addCacheDependency_0);
      return true;
    }
    _jspx_tagPool_template_addCacheDependency_uuid_nobody.reuse(_jspx_th_template_addCacheDependency_0);
    return false;
  }

  private boolean _jspx_meth_template_module_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:module
    org.jahia.taglibs.template.include.ModuleTag _jspx_th_template_module_0 = (org.jahia.taglibs.template.include.ModuleTag) _jspx_tagPool_template_module_view_node_editable.get(org.jahia.taglibs.template.include.ModuleTag.class);
    _jspx_th_template_module_0.setPageContext(_jspx_page_context);
    _jspx_th_template_module_0.setParent(null);
    _jspx_th_template_module_0.setNode((org.jahia.services.content.JCRNodeWrapper) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentNode.contextualizedNode}", org.jahia.services.content.JCRNodeWrapper.class, (PageContext)_jspx_page_context, null));
    _jspx_th_template_module_0.setEditable(false);
    _jspx_th_template_module_0.setView((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentNode.properties['j:referenceView'].string}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_template_module_0 = _jspx_th_template_module_0.doStartTag();
    if (_jspx_eval_template_module_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_template_module_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_template_module_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_template_module_0.doInitBody();
      }
      do {
        if (_jspx_meth_template_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_template_module_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_template_module_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_template_module_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_template_module_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_module_view_node_editable.reuse(_jspx_th_template_module_0);
      return true;
    }
    _jspx_tagPool_template_module_view_node_editable.reuse(_jspx_th_template_module_0);
    return false;
  }

  private boolean _jspx_meth_template_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_module_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_template_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_template_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_template_param_0.setPageContext(_jspx_page_context);
    _jspx_th_template_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_module_0);
    _jspx_th_template_param_0.setName("refTitle");
    _jspx_th_template_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentNode.properties['jcr:title'].string}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_template_param_0 = _jspx_th_template_param_0.doStartTag();
    if (_jspx_th_template_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_param_value_name_nobody.reuse(_jspx_th_template_param_0);
      return true;
    }
    _jspx_tagPool_template_param_value_name_nobody.reuse(_jspx_th_template_param_0);
    return false;
  }
}
