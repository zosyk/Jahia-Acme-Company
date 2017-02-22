package org.apache.jsp.jnt_005fbootstrapMenuSimpleSearchForm.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bootstrapMenuSimpleSearchForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bootstrap_addCSS_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addCacheDependency_uuid_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_var_key_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bootstrap_addCSS_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_addCacheDependency_uuid_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_var_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bootstrap_addCSS_nobody.release();
    _jspx_tagPool_template_addCacheDependency_uuid_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_message_var_key_nobody.release();
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
      if (_jspx_meth_template_addCacheDependency_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_0(_jspx_page_context))
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

  private boolean _jspx_meth_template_addCacheDependency_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addCacheDependency
    org.jahia.taglibs.template.include.AddCacheDependencyTag _jspx_th_template_addCacheDependency_0 = (org.jahia.taglibs.template.include.AddCacheDependencyTag) _jspx_tagPool_template_addCacheDependency_uuid_nobody.get(org.jahia.taglibs.template.include.AddCacheDependencyTag.class);
    _jspx_th_template_addCacheDependency_0.setPageContext(_jspx_page_context);
    _jspx_th_template_addCacheDependency_0.setParent(null);
    _jspx_th_template_addCacheDependency_0.setUuid((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentNode.properties.result.string}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_template_addCacheDependency_0 = _jspx_th_template_addCacheDependency_0.doStartTag();
    if (_jspx_th_template_addCacheDependency_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addCacheDependency_uuid_nobody.reuse(_jspx_th_template_addCacheDependency_0);
      return true;
    }
    _jspx_tagPool_template_addCacheDependency_uuid_nobody.reuse(_jspx_th_template_addCacheDependency_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty currentNode.properties.result.node}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        if (_jspx_meth_jcr_nodeProperty_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
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

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.base}${currentNode.properties.result.node.path}.html", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_url_0.setVar("searchUrl");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_jcr_nodeProperty_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jcr:nodeProperty
    org.jahia.taglibs.jcr.node.JCRPropertyTag _jspx_th_jcr_nodeProperty_0 = (org.jahia.taglibs.jcr.node.JCRPropertyTag) _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.get(org.jahia.taglibs.jcr.node.JCRPropertyTag.class);
    _jspx_th_jcr_nodeProperty_0.setPageContext(_jspx_page_context);
    _jspx_th_jcr_nodeProperty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_jcr_nodeProperty_0.setNode((org.jahia.services.content.JCRNodeWrapper) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentNode}", org.jahia.services.content.JCRNodeWrapper.class, (PageContext)_jspx_page_context, null));
    _jspx_th_jcr_nodeProperty_0.setName("position");
    _jspx_th_jcr_nodeProperty_0.setVar("position");
    int _jspx_eval_jcr_nodeProperty_0 = _jspx_th_jcr_nodeProperty_0.doStartTag();
    if (_jspx_th_jcr_nodeProperty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.reuse(_jspx_th_jcr_nodeProperty_0);
      return true;
    }
    _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.reuse(_jspx_th_jcr_nodeProperty_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_0.setVar("pullClass");
    _jspx_th_c_set_0.setValue(new String(""));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty position}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_1.setVar("pullClass");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression(" pull-${position.string}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_s_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.jsp.tag.meta.search.form_tag _jspx_th_s_form_0 = new org.apache.jsp.tag.meta.search.form_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_s_form_0      );
    }
    _jspx_th_s_form_0.setJspContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(_jspx_th_c_if_0);
    _jspx_th_s_form_0.setDynamicAttribute(null, "method", new String("post"));
    _jspx_th_s_form_0.setDynamicAttribute(null, "class", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("navbar-search${pullClass}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_form_0.setDynamicAttribute(null, "action", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_form_0.setJspBody(new bootstrapMenuSimpleSearchForm_jspHelper( 0, _jspx_page_context, _jspx_th_s_form_0, null));
    _jspx_th_s_form_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_var_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("search.startSearching");
    _jspx_th_fmt_message_0.setVar("startSearching");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_var_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_var_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_s_term_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:term
    org.apache.jsp.tag.meta.search.term_tag _jspx_th_s_term_0 = new org.apache.jsp.tag.meta.search.term_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_s_term_0      );
    }
    _jspx_th_s_term_0.setJspContext(_jspx_page_context);
    _jspx_th_s_term_0.setParent(_jspx_parent);
    _jspx_th_s_term_0.setMatch("all_words");
    _jspx_th_s_term_0.setDynamicAttribute(null, "id", new String("searchTerm"));
    _jspx_th_s_term_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${startSearching}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_term_0.setSearchIn("siteContent,tags");
    _jspx_th_s_term_0.setDynamicAttribute(null, "onfocus", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("if(this.value=='${startSearching}')this.value='';", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_term_0.setDynamicAttribute(null, "onblur", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("if(this.value=='')this.value='${startSearching}';", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_term_0.setDynamicAttribute(null, "class", new String("search-query"));
    _jspx_th_s_term_0.doTag();
    return false;
  }

  private boolean _jspx_meth_s_site_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:site
    org.apache.jsp.tag.meta.search.site_tag _jspx_th_s_site_0 = new org.apache.jsp.tag.meta.search.site_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_s_site_0      );
    }
    _jspx_th_s_site_0.setJspContext(_jspx_page_context);
    _jspx_th_s_site_0.setParent(_jspx_parent);
    _jspx_th_s_site_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderContext.site.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_site_0.setIncludeReferencesFrom("systemsite");
    _jspx_th_s_site_0.setDisplay(new Boolean(false));
    _jspx_th_s_site_0.doTag();
    return false;
  }

  private boolean _jspx_meth_s_language_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:language
    org.apache.jsp.tag.meta.search.language_tag _jspx_th_s_language_0 = new org.apache.jsp.tag.meta.search.language_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_s_language_0      );
    }
    _jspx_th_s_language_0.setJspContext(_jspx_page_context);
    _jspx_th_s_language_0.setParent(_jspx_parent);
    _jspx_th_s_language_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderContext.mainResource.locale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_language_0.setDisplay(new Boolean(false));
    _jspx_th_s_language_0.doTag();
    return false;
  }

  private class bootstrapMenuSimpleSearchForm_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public bootstrapMenuSimpleSearchForm_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_s_term_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_s_site_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_s_language_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
