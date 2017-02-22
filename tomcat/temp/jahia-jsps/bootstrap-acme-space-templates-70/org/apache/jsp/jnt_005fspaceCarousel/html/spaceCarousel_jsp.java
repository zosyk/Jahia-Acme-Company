package org.apache.jsp.jnt_005fspaceCarousel.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class spaceCarousel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("jcr:getChildrenOfType", org.jahia.taglibs.jcr.node.JCRTagUtils.class, "getChildrenOfType", new Class[] {org.jahia.services.content.JCRNodeWrapper.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_module_nodeTypes_node_editable_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_module_path_nodeTypes_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addResources_type_resources_media_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addResources_type_resources_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addResources_type;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_module_nodeTypes_node_editable_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_module_path_nodeTypes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_addResources_type_resources_media_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_addResources_type_resources_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_addResources_type = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_template_module_nodeTypes_node_editable_nobody.release();
    _jspx_tagPool_template_module_path_nodeTypes_nobody.release();
    _jspx_tagPool_template_addResources_type_resources_media_nobody.release();
    _jspx_tagPool_template_addResources_type_resources_nobody.release();
    _jspx_tagPool_template_addResources_type.release();
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

      if (_jspx_meth_jcr_nodeProperty_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<section class=\"illustration-section\" ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("    <div class=\"container-fluid \">\n");
      out.write("        <div class=\"flexslider carousel\">\n");
      out.write("            <ul class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderContext.editMode?'':'slides'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</section>\n");
      if (_jspx_meth_template_addResources_0(_jspx_page_context))
        return;
      if (_jspx_meth_template_addResources_1(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_2(_jspx_page_context))
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

  private boolean _jspx_meth_jcr_nodeProperty_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jcr:nodeProperty
    org.jahia.taglibs.jcr.node.JCRPropertyTag _jspx_th_jcr_nodeProperty_0 = (org.jahia.taglibs.jcr.node.JCRPropertyTag) _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.get(org.jahia.taglibs.jcr.node.JCRPropertyTag.class);
    _jspx_th_jcr_nodeProperty_0.setPageContext(_jspx_page_context);
    _jspx_th_jcr_nodeProperty_0.setParent(null);
    _jspx_th_jcr_nodeProperty_0.setVar("bgimage");
    _jspx_th_jcr_nodeProperty_0.setNode((org.jahia.services.content.JCRNodeWrapper) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentNode}", org.jahia.services.content.JCRNodeWrapper.class, (PageContext)_jspx_page_context, null));
    _jspx_th_jcr_nodeProperty_0.setName("bgimage");
    int _jspx_eval_jcr_nodeProperty_0 = _jspx_th_jcr_nodeProperty_0.doStartTag();
    if (_jspx_th_jcr_nodeProperty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.reuse(_jspx_th_jcr_nodeProperty_0);
      return true;
    }
    _jspx_tagPool_jcr_nodeProperty_var_node_name_nobody.reuse(_jspx_th_jcr_nodeProperty_0);
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
    _jspx_th_c_set_0.setVar("bgimageUrl");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bgimage.node.url}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${! empty bgimageUrl}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" style=\"background: url('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bgimageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("') no-repeat 50% 50%\"");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jcr:getChildrenOfType(currentNode, 'jnt:spaceCarouselItem')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <li>\n");
          out.write("                        ");
          if (_jspx_meth_template_module_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                    </li>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_template_module_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:module
    org.jahia.taglibs.template.include.ModuleTag _jspx_th_template_module_0 = (org.jahia.taglibs.template.include.ModuleTag) _jspx_tagPool_template_module_nodeTypes_node_editable_nobody.get(org.jahia.taglibs.template.include.ModuleTag.class);
    _jspx_th_template_module_0.setPageContext(_jspx_page_context);
    _jspx_th_template_module_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_template_module_0.setNode((org.jahia.services.content.JCRNodeWrapper) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item}", org.jahia.services.content.JCRNodeWrapper.class, (PageContext)_jspx_page_context, null));
    _jspx_th_template_module_0.setNodeTypes("jnt:spaceCarouselItem");
    _jspx_th_template_module_0.setEditable(true);
    int _jspx_eval_template_module_0 = _jspx_th_template_module_0.doStartTag();
    if (_jspx_th_template_module_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_module_nodeTypes_node_editable_nobody.reuse(_jspx_th_template_module_0);
      return true;
    }
    _jspx_tagPool_template_module_nodeTypes_node_editable_nobody.reuse(_jspx_th_template_module_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderContext.editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_template_module_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
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

  private boolean _jspx_meth_template_module_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:module
    org.jahia.taglibs.template.include.ModuleTag _jspx_th_template_module_1 = (org.jahia.taglibs.template.include.ModuleTag) _jspx_tagPool_template_module_path_nodeTypes_nobody.get(org.jahia.taglibs.template.include.ModuleTag.class);
    _jspx_th_template_module_1.setPageContext(_jspx_page_context);
    _jspx_th_template_module_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_template_module_1.setPath("*");
    _jspx_th_template_module_1.setNodeTypes("jnt:spaceCarouselItem");
    int _jspx_eval_template_module_1 = _jspx_th_template_module_1.doStartTag();
    if (_jspx_th_template_module_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_module_path_nodeTypes_nobody.reuse(_jspx_th_template_module_1);
      return true;
    }
    _jspx_tagPool_template_module_path_nodeTypes_nobody.reuse(_jspx_th_template_module_1);
    return false;
  }

  private boolean _jspx_meth_template_addResources_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_0 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_media_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_0.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_0.setParent(null);
    _jspx_th_template_addResources_0.setType("css");
    _jspx_th_template_addResources_0.setResources("flexslider.css");
    _jspx_th_template_addResources_0.setMedia("screen");
    int _jspx_eval_template_addResources_0 = _jspx_th_template_addResources_0.doStartTag();
    if (_jspx_th_template_addResources_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_media_nobody.reuse(_jspx_th_template_addResources_0);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_media_nobody.reuse(_jspx_th_template_addResources_0);
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
    _jspx_th_template_addResources_1.setType("javascript");
    _jspx_th_template_addResources_1.setResources("jquery.min.js,jquery.flexslider.js");
    int _jspx_eval_template_addResources_1 = _jspx_th_template_addResources_1.doStartTag();
    if (_jspx_th_template_addResources_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_1);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${! renderContext.editMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_template_addResources_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_template_addResources_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_2 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_2.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_template_addResources_2.setType("inline");
    int _jspx_eval_template_addResources_2 = _jspx_th_template_addResources_2.doStartTag();
    if (_jspx_eval_template_addResources_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_template_addResources_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_template_addResources_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_template_addResources_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <script>\n");
        out.write("            // Can also be used with $(window).load\n");
        out.write("            $(document).ready(function () {\n");
        out.write("                $('.flexslider').flexslider({\n");
        out.write("                    animation: \"slide\",\n");
        out.write("                    smoothHeight: true\n");
        out.write("                });\n");
        out.write("            });\n");
        out.write("        </script>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_template_addResources_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_template_addResources_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_template_addResources_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type.reuse(_jspx_th_template_addResources_2);
      return true;
    }
    _jspx_tagPool_template_addResources_type.reuse(_jspx_th_template_addResources_2);
    return false;
  }
}
