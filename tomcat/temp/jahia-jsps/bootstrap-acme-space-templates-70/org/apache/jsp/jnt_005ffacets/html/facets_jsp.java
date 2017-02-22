package org.apache.jsp.jnt_005ffacets.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facets_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_3;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_4;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_5;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_6;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_7;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_8;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_9;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_10;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_11;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("uiComponents:getBindedComponent", org.jahia.taglibs.uicomponents.Functions.class, "getBoundComponent", new Class[] {org.jahia.services.content.JCRNodeWrapper.class, org.jahia.services.render.RenderContext.class, java.lang.String.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("functions:decodeUrlParam", org.jahia.taglibs.functions.Functions.class, "decodeUrlParam", new Class[] {java.lang.String.class});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("facet:getAppliedFacetFilters", org.jahia.taglibs.facet.Functions.class, "getAppliedFacetFilters", new Class[] {java.lang.String.class});
  _jspx_fnmap_3= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("facet:getDeleteFacetUrl", org.jahia.taglibs.facet.Functions.class, "getDeleteFacetUrl", new Class[] {java.lang.Object.class, org.apache.commons.collections.KeyValue.class, java.lang.String.class});
  _jspx_fnmap_4= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("functions:encodeUrlParam", org.jahia.taglibs.functions.Functions.class, "encodeUrlParam", new Class[] {java.lang.String.class});
  _jspx_fnmap_5= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("facet:isUnappliedFacetExisting", org.jahia.taglibs.facet.Functions.class, "isUnappliedFacetExisting", new Class[] {org.jahia.services.query.QueryResultWrapper.class, java.util.Map.class});
  _jspx_fnmap_6= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("facet:isUnappliedFacetValueExisting", org.jahia.taglibs.facet.Functions.class, "isUnappliedFacetValueExisting", new Class[] {org.apache.solr.client.solrj.response.FacetField.class, java.util.Map.class});
  _jspx_fnmap_7= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("facet:isFacetValueApplied", org.jahia.taglibs.facet.Functions.class, "isFacetValueApplied", new Class[] {java.lang.Object.class, java.util.Map.class});
  _jspx_fnmap_8= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_8.mapFunction("functions:encodeUrlParam", org.jahia.taglibs.functions.Functions.class, "encodeUrlParam", new Class[] {java.lang.String.class});
  _jspx_fnmap_8.mapFunction("facet:getFacetDrillDownUrl", org.jahia.taglibs.facet.Functions.class, "getFacetDrillDownUrl", new Class[] {java.lang.Object.class, java.lang.String.class});
  _jspx_fnmap_9= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("facet:isUnappliedRangeFacetValueExisting", org.jahia.taglibs.facet.Functions.class, "isUnappliedRangeFacetValueExisting", new Class[] {org.apache.solr.client.solrj.response.RangeFacet.class, java.util.Map.class});
  _jspx_fnmap_10= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("jcr:getNodes", org.jahia.taglibs.jcr.node.JCRTagUtils.class, "getNodes", new Class[] {org.jahia.services.content.JCRNodeWrapper.class, java.lang.String.class});
  _jspx_fnmap_11= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:replace", org.apache.taglibs.standard.functions.Functions.class, "replace", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/jnt_facets/html/activeFacets.jspf");
    _jspx_dependants.add("/jnt_facets/html/facetDisplay.jspf");
    _jspx_dependants.add("/jnt_facets/html/rangeFacetDisplay.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_addResources_type_resources_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_value_target_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_option_view_nodetype_node;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_facet_setupQueryAndMetadata_var_existingQuery_boundComponent_activeFacets_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jcr_jqom_var_scope_qomBeanName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_module_node_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_template_module_path_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_template_addResources_type_resources_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_value_target_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_option_view_nodetype_node = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_facet_setupQueryAndMetadata_var_existingQuery_boundComponent_activeFacets_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_jcr_jqom_var_scope_qomBeanName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_module_node_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_template_module_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_template_addResources_type_resources_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_set_value_target_property_nobody.release();
    _jspx_tagPool_template_option_view_nodetype_node.release();
    _jspx_tagPool_template_param_value_name_nobody.release();
    _jspx_tagPool_facet_setupQueryAndMetadata_var_existingQuery_boundComponent_activeFacets_nobody.release();
    _jspx_tagPool_jcr_jqom_var_scope_qomBeanName_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_template_module_node_nobody.release();
    _jspx_tagPool_template_module_path_nobody.release();
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

      if (_jspx_meth_template_addResources_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty boundComponent}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          java.util.HashMap facetLabels = null;
          synchronized (request) {
            facetLabels = (java.util.HashMap) _jspx_page_context.getAttribute("facetLabels", PageContext.REQUEST_SCOPE);
            if (facetLabels == null){
              facetLabels = new java.util.HashMap();
              _jspx_page_context.setAttribute("facetLabels", facetLabels, PageContext.REQUEST_SCOPE);
            }
          }
          java.util.HashMap facetValueLabels = null;
          synchronized (request) {
            facetValueLabels = (java.util.HashMap) _jspx_page_context.getAttribute("facetValueLabels", PageContext.REQUEST_SCOPE);
            if (facetValueLabels == null){
              facetValueLabels = new java.util.HashMap();
              _jspx_page_context.setAttribute("facetValueLabels", facetValueLabels, PageContext.REQUEST_SCOPE);
            }
          }
          java.util.HashMap facetValueFormats = null;
          synchronized (request) {
            facetValueFormats = (java.util.HashMap) _jspx_page_context.getAttribute("facetValueFormats", PageContext.REQUEST_SCOPE);
            if (facetValueFormats == null){
              facetValueFormats = new java.util.HashMap();
              _jspx_page_context.setAttribute("facetValueFormats", facetValueFormats, PageContext.REQUEST_SCOPE);
            }
          }
          java.util.HashMap facetValueRenderers = null;
          synchronized (request) {
            facetValueRenderers = (java.util.HashMap) _jspx_page_context.getAttribute("facetValueRenderers", PageContext.REQUEST_SCOPE);
            if (facetValueRenderers == null){
              facetValueRenderers = new java.util.HashMap();
              _jspx_page_context.setAttribute("facetValueRenderers", facetValueRenderers, PageContext.REQUEST_SCOPE);
            }
          }
          java.util.HashMap facetValueNodeTypes = null;
          synchronized (request) {
            facetValueNodeTypes = (java.util.HashMap) _jspx_page_context.getAttribute("facetValueNodeTypes", PageContext.REQUEST_SCOPE);
            if (facetValueNodeTypes == null){
              facetValueNodeTypes = new java.util.HashMap();
              _jspx_page_context.setAttribute("facetValueNodeTypes", facetValueNodeTypes, PageContext.REQUEST_SCOPE);
            }
          }
          if (_jspx_meth_template_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          if (_jspx_meth_facet_setupQueryAndMetadata_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          if (_jspx_meth_jcr_jqom_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_3.setPageContext(_jspx_page_context);
          _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not result.facetResultsEmpty or !empty activeFacetsVars[activeFacetMapVarName]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
          if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("        <div>\n");
              out.write("        ");
              if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                return;
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
              _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activeFacetsVars[activeFacetMapVarName]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
              _jspx_th_c_forEach_0.setVar("facet");
              _jspx_th_c_forEach_0.setVarStatus("activeFacetStat");
              int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
                if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    //  c:forEach
                    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
                    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                    _jspx_th_c_forEach_1.setVar("facetValue");
                    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
                    try {
                      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                            return;
                          if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                            return;
                          //  c:choose
                          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                          _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
                          _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                          int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
                          if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_when_0.setPageContext(_jspx_page_context);
                              _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
                              _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty facetParam}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                              int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
                              if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\n");
                              out.write("                <li><a onclick=\"window.location='");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write("'\"><span class=\"text-success\">");
                              //  facet:facetValueLabel
                              org.apache.jsp.tag.meta.facet.facetValueLabel_tag _jspx_th_facet_facetValueLabel_0 = new org.apache.jsp.tag.meta.facet.facetValueLabel_tag();
                              if (_jspx_resourceInjector != null) {
                              _jspx_resourceInjector.inject(_jspx_th_facet_facetValueLabel_0                              );
                              }
                              _jspx_th_facet_facetValueLabel_0.setJspContext(_jspx_page_context);
                              _jspx_th_facet_facetValueLabel_0.setParent(_jspx_th_c_when_0);
                              _jspx_th_facet_facetValueLabel_0.setCurrentActiveFacet((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_0.setCurrentActiveFacetValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_0.setFacetValueLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_0.doTag();
                              out.write("&nbsp;</span><span class=\"badge badge-info\"><i class=\"icon-remove-sign\"></i></span></a></li>\n");
                              out.write("            ");
                              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
                              return;
                              }
                              _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
                              _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
                              int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
                              if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\n");
                              out.write("                <li><a href=\"");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write("\"><span class=\"text-success\">");
                              //  facet:facetValueLabel
                              org.apache.jsp.tag.meta.facet.facetValueLabel_tag _jspx_th_facet_facetValueLabel_1 = new org.apache.jsp.tag.meta.facet.facetValueLabel_tag();
                              if (_jspx_resourceInjector != null) {
                              _jspx_resourceInjector.inject(_jspx_th_facet_facetValueLabel_1                              );
                              }
                              _jspx_th_facet_facetValueLabel_1.setJspContext(_jspx_page_context);
                              _jspx_th_facet_facetValueLabel_1.setParent(_jspx_th_c_otherwise_0);
                              _jspx_th_facet_facetValueLabel_1.setCurrentActiveFacet((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_1.setCurrentActiveFacetValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_1.setFacetValueLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_1.doTag();
                              out.write("&nbsp;</span><span class=\"badge badge-info\"><i class=\"icon-remove-sign\"></i></span></a></li>\n");
                              out.write("            ");
                              int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
                              return;
                              }
                              _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
                              int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
                            return;
                          }
                          _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
                          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        return;
                      }
                    } catch (Throwable _jspx_exception) {
                      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                        out = _jspx_page_context.popBody();
                      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
                    } finally {
                      _jspx_th_c_forEach_1.doFinally();
                      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
                    }
                    int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_0.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_0.doFinally();
                _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
              }
              if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                return;
              if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                return;
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
              _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.facetFields}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
              _jspx_th_c_forEach_2.setVar("currentFacet");
              int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
                if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
                    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
                    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet:isUnappliedFacetValueExisting(currentFacet, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_6)).booleanValue());
                    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
                    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("    <h6>");
                        //  facet:facetLabel
                        org.apache.jsp.tag.meta.facet.facetLabel_tag _jspx_th_facet_facetLabel_0 = new org.apache.jsp.tag.meta.facet.facetLabel_tag();
                        if (_jspx_resourceInjector != null) {
                          _jspx_resourceInjector.inject(_jspx_th_facet_facetLabel_0                          );
                        }
                        _jspx_th_facet_facetLabel_0.setJspContext(_jspx_page_context);
                        _jspx_th_facet_facetLabel_0.setParent(_jspx_th_c_if_8);
                        _jspx_th_facet_facetLabel_0.setCurrentFacetFieldName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetLabel_0.setFacetLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetLabel_0.doTag();
                        out.write("</h6>\n");
                        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
                      return;
                    }
                    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
                    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
                    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty currentFacet.values}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
                    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("<ul class=\"nav nav-pills nav-stacked\">\n");
                        out.write("    ");
                        //  c:forEach
                        org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                        _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
                        _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
                        _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.values}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_c_forEach_3.setVar("facetValue");
                        int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
                        try {
                          int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
                          if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_if_10.setPageContext(_jspx_page_context);
                              _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
                              _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not facet:isFacetValueApplied(facetValue, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_7)).booleanValue());
                              int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
                              if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
                              return;
                              out.write("\n");
                              out.write("            <li><a href=\"");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write("\" rel=\"nofollow\">\n");
                              out.write("                    ");
                              //  facet:facetValueLabel
                              org.apache.jsp.tag.meta.facet.facetValueLabel_tag _jspx_th_facet_facetValueLabel_2 = new org.apache.jsp.tag.meta.facet.facetValueLabel_tag();
                              if (_jspx_resourceInjector != null) {
                              _jspx_resourceInjector.inject(_jspx_th_facet_facetValueLabel_2                              );
                              }
                              _jspx_th_facet_facetValueLabel_2.setJspContext(_jspx_page_context);
                              _jspx_th_facet_facetValueLabel_2.setParent(_jspx_th_c_if_10);
                              _jspx_th_facet_facetValueLabel_2.setCurrentFacetFieldName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_2.setFacetValueCount((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_2.setFacetValueLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_2.setFacetValueFormats((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueFormats}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_2.setFacetValueRenderers((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueRenderers}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_2.setFacetValueNodeTypes((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueNodeTypes}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_2.doTag();
                              out.write("\n");
                              out.write("                <span class=\"muted\">&nbsp;(");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write(")</span></a>\n");
                              out.write("            </li>\n");
                              out.write("        ");
                              int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
                              return;
                              }
                              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
                              int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_c_forEach_3.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_c_forEach_3.doFinally();
                          _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
                        }
                        out.write("\n");
                        out.write("</ul>\n");
                        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
                      return;
                    }
                    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
                    int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_2.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_2.doFinally();
                _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
              }
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
              _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.facetDates}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
              _jspx_th_c_forEach_4.setVar("currentFacet");
              int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
                if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
                    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
                    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet:isUnappliedFacetValueExisting(currentFacet, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_6)).booleanValue());
                    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
                    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("    <h6>");
                        //  facet:facetLabel
                        org.apache.jsp.tag.meta.facet.facetLabel_tag _jspx_th_facet_facetLabel_1 = new org.apache.jsp.tag.meta.facet.facetLabel_tag();
                        if (_jspx_resourceInjector != null) {
                          _jspx_resourceInjector.inject(_jspx_th_facet_facetLabel_1                          );
                        }
                        _jspx_th_facet_facetLabel_1.setJspContext(_jspx_page_context);
                        _jspx_th_facet_facetLabel_1.setParent(_jspx_th_c_if_11);
                        _jspx_th_facet_facetLabel_1.setCurrentFacetFieldName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetLabel_1.setFacetLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetLabel_1.doTag();
                        out.write("</h6>\n");
                        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
                      return;
                    }
                    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
                    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
                    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty currentFacet.values}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
                    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("<ul class=\"nav nav-pills nav-stacked\">\n");
                        out.write("    ");
                        //  c:forEach
                        org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                        _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
                        _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
                        _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.values}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_c_forEach_5.setVar("facetValue");
                        int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
                        try {
                          int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
                          if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_if_13.setPageContext(_jspx_page_context);
                              _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
                              _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not facet:isFacetValueApplied(facetValue, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_7)).booleanValue());
                              int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
                              if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              if (_jspx_meth_c_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
                              return;
                              out.write("\n");
                              out.write("            <li><a href=\"");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write("\" rel=\"nofollow\">\n");
                              out.write("                    ");
                              //  facet:facetValueLabel
                              org.apache.jsp.tag.meta.facet.facetValueLabel_tag _jspx_th_facet_facetValueLabel_3 = new org.apache.jsp.tag.meta.facet.facetValueLabel_tag();
                              if (_jspx_resourceInjector != null) {
                              _jspx_resourceInjector.inject(_jspx_th_facet_facetValueLabel_3                              );
                              }
                              _jspx_th_facet_facetValueLabel_3.setJspContext(_jspx_page_context);
                              _jspx_th_facet_facetValueLabel_3.setParent(_jspx_th_c_if_13);
                              _jspx_th_facet_facetValueLabel_3.setCurrentFacetFieldName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_3.setFacetValueCount((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_3.setFacetValueLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_3.setFacetValueFormats((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueFormats}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_3.setFacetValueRenderers((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueRenderers}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_3.setFacetValueNodeTypes((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueNodeTypes}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_3.doTag();
                              out.write("\n");
                              out.write("                <span class=\"muted\">&nbsp;(");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write(")</span></a>\n");
                              out.write("            </li>\n");
                              out.write("        ");
                              int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
                              return;
                              }
                              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
                              int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_c_forEach_5.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_c_forEach_5.doFinally();
                          _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
                        }
                        out.write("\n");
                        out.write("</ul>\n");
                        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
                      return;
                    }
                    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
                    int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_4.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_4.doFinally();
                _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
              }
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
              _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rangeFacets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
              _jspx_th_c_forEach_6.setVar("currentFacet");
              int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
                if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
                    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
                    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet:isUnappliedRangeFacetValueExisting(currentFacet, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_9)).booleanValue());
                    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
                    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("    <h6>");
                        //  facet:facetLabel
                        org.apache.jsp.tag.meta.facet.facetLabel_tag _jspx_th_facet_facetLabel_2 = new org.apache.jsp.tag.meta.facet.facetLabel_tag();
                        if (_jspx_resourceInjector != null) {
                          _jspx_resourceInjector.inject(_jspx_th_facet_facetLabel_2                          );
                        }
                        _jspx_th_facet_facetLabel_2.setJspContext(_jspx_page_context);
                        _jspx_th_facet_facetLabel_2.setParent(_jspx_th_c_if_14);
                        _jspx_th_facet_facetLabel_2.setCurrentFacetFieldName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetLabel_2.setFacetLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetLabel_2.doTag();
                        out.write("</h6>\n");
                        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
                      return;
                    }
                    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
                    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
                    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty currentFacet.counts}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
                    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
                    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("<ul class=\"nav nav-pills nav-stacked\">\n");
                        out.write("    ");
                        //  c:forEach
                        org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                        _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
                        _jspx_th_c_forEach_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
                        _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.counts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_c_forEach_7.setVar("facetValue");
                        int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
                        try {
                          int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
                          if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              //  c:if
                              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                              _jspx_th_c_if_16.setPageContext(_jspx_page_context);
                              _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_7);
                              _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not facet:isFacetValueApplied(facetValue, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_7)).booleanValue());
                              int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
                              if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              if (_jspx_meth_c_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
                              return;
                              out.write("\n");
                              out.write("            <li><a href=\"");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write("\" rel=\"nofollow\">\n");
                              out.write("                    ");
                              //  facet:facetValueLabel
                              org.apache.jsp.tag.meta.facet.facetValueLabel_tag _jspx_th_facet_facetValueLabel_4 = new org.apache.jsp.tag.meta.facet.facetValueLabel_tag();
                              if (_jspx_resourceInjector != null) {
                              _jspx_resourceInjector.inject(_jspx_th_facet_facetValueLabel_4                              );
                              }
                              _jspx_th_facet_facetValueLabel_4.setJspContext(_jspx_page_context);
                              _jspx_th_facet_facetValueLabel_4.setParent(_jspx_th_c_if_16);
                              _jspx_th_facet_facetValueLabel_4.setCurrentFacetFieldName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentFacet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_4.setFacetValueCount((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_4.setFacetValueLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_4.setFacetValueFormats((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueFormats}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_4.setFacetValueRenderers((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueRenderers}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_4.setFacetValueNodeTypes((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueNodeTypes}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                              _jspx_th_facet_facetValueLabel_4.doTag();
                              out.write("\n");
                              out.write("                <span class=\"muted\">&nbsp;(");
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write(")</span></a>\n");
                              out.write("            </li>\n");
                              out.write("        ");
                              int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
                              return;
                              }
                              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
                              int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_c_forEach_7.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_c_forEach_7.doFinally();
                          _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
                        }
                        out.write("\n");
                        out.write("</ul>\n");
                        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
                      return;
                    }
                    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
                    int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_6.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_6.doFinally();
                _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
              }
              if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                return;
              if (_jspx_meth_c_set_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                return;
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
              _jspx_th_c_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.facetQuery}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
              _jspx_th_c_forEach_8.setVar("facetValue");
              _jspx_th_c_forEach_8.setVarStatus("iterationStatus");
              int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
                if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    //  facet:facetLabel
                    org.apache.jsp.tag.meta.facet.facetLabel_tag _jspx_th_facet_facetLabel_3 = new org.apache.jsp.tag.meta.facet.facetLabel_tag();
                    if (_jspx_resourceInjector != null) {
                      _jspx_resourceInjector.inject(_jspx_th_facet_facetLabel_3                      );
                    }
                    _jspx_th_facet_facetLabel_3.setJspContext(_jspx_page_context);
                    _jspx_th_facet_facetLabel_3.setParent(_jspx_th_c_forEach_8);
                    _jspx_th_facet_facetLabel_3.setCurrentActiveFacet((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                    _jspx_th_facet_facetLabel_3.setFacetLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                    _jspx_th_facet_facetLabel_3.setDisplay(new Boolean(false));
                    _jspx_th_facet_facetLabel_3.doTag();
                    if (_jspx_meth_c_if_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
                      return;
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
                    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
                    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not facet:isFacetValueApplied(facetValue, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_7)).booleanValue());
                    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
                    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        if (_jspx_meth_c_set_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_19, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
                          return;
                        if (_jspx_meth_c_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_19, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
                          return;
                        out.write("\n");
                        out.write("                <li><a href=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        out.write('"');
                        out.write('>');
                        //  facet:facetValueLabel
                        org.apache.jsp.tag.meta.facet.facetValueLabel_tag _jspx_th_facet_facetValueLabel_5 = new org.apache.jsp.tag.meta.facet.facetValueLabel_tag();
                        if (_jspx_resourceInjector != null) {
                          _jspx_resourceInjector.inject(_jspx_th_facet_facetValueLabel_5                          );
                        }
                        _jspx_th_facet_facetValueLabel_5.setJspContext(_jspx_page_context);
                        _jspx_th_facet_facetValueLabel_5.setParent(_jspx_th_c_if_19);
                        _jspx_th_facet_facetValueLabel_5.setCurrentActiveFacetValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetValueLabel_5.setFacetValueLabels((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValueLabels}", java.util.Map.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_facet_facetValueLabel_5.doTag();
                        out.write("<span class=\"muted\">&nbsp;(");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetValue.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        out.write(")</span></a>\n");
                        out.write("                </li>\n");
                        out.write("            ");
                        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
                      return;
                    }
                    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
                    int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_8.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_8.doFinally();
                _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_8);
              }
              if (_jspx_meth_c_if_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                return;
              out.write("\n");
              out.write("        </div>\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
            return;
          }
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      if (_jspx_meth_c_if_21(_jspx_page_context))
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

  private boolean _jspx_meth_template_addResources_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:addResources
    org.jahia.taglibs.template.include.AddResourcesTag _jspx_th_template_addResources_0 = (org.jahia.taglibs.template.include.AddResourcesTag) _jspx_tagPool_template_addResources_type_resources_nobody.get(org.jahia.taglibs.template.include.AddResourcesTag.class);
    _jspx_th_template_addResources_0.setPageContext(_jspx_page_context);
    _jspx_th_template_addResources_0.setParent(null);
    _jspx_th_template_addResources_0.setType("css");
    _jspx_th_template_addResources_0.setResources("facets.css");
    int _jspx_eval_template_addResources_0 = _jspx_th_template_addResources_0.doStartTag();
    if (_jspx_th_template_addResources_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_0);
      return true;
    }
    _jspx_tagPool_template_addResources_type_resources_nobody.reuse(_jspx_th_template_addResources_0);
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
    _jspx_th_c_set_0.setVar("boundComponent");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uiComponents:getBindedComponent(currentNode, renderContext, 'j:bindedComponent')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_1.setVar("facetParamVarName");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("N-${boundComponent.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_2.setVar("activeFacetMapVarName");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("afm-${boundComponent.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[facetParamVarName] and empty activeFacetsVars[facetParamVarName]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activeFacetsVars == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        java.util.HashMap activeFacetsVars = null;
        synchronized (request) {
          activeFacetsVars = (java.util.HashMap) _jspx_page_context.getAttribute("activeFacetsVars", PageContext.REQUEST_SCOPE);
          if (activeFacetsVars == null){
            activeFacetsVars = new java.util.HashMap();
            _jspx_page_context.setAttribute("activeFacetsVars", activeFacetsVars, PageContext.REQUEST_SCOPE);
          }
        }
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

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_value_target_property_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_3.setTarget((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activeFacetsVars}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_3.setProperty((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetParamVarName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${functions:decodeUrlParam(param[facetParamVarName])}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_value_target_property_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_value_target_property_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_value_target_property_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_4.setTarget((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activeFacetsVars}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_4.setProperty((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activeFacetMapVarName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet:getAppliedFacetFilters(activeFacetsVars[facetParamVarName])}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_value_target_property_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_value_target_property_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_template_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:option
    org.jahia.taglibs.template.include.OptionTag _jspx_th_template_option_0 = (org.jahia.taglibs.template.include.OptionTag) _jspx_tagPool_template_option_view_nodetype_node.get(org.jahia.taglibs.template.include.OptionTag.class);
    _jspx_th_template_option_0.setPageContext(_jspx_page_context);
    _jspx_th_template_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_template_option_0.setNode((org.jahia.services.content.JCRNodeWrapper) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${boundComponent}", org.jahia.services.content.JCRNodeWrapper.class, (PageContext)_jspx_page_context, null));
    _jspx_th_template_option_0.setNodetype((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${boundComponent.primaryNodeTypeName},jmix:list", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_template_option_0.setView("hidden.load");
    int _jspx_eval_template_option_0 = _jspx_th_template_option_0.doStartTag();
    if (_jspx_eval_template_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_template_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_template_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_template_option_0.doInitBody();
      }
      do {
        if (_jspx_meth_template_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_template_option_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_template_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_template_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_template_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_option_view_nodetype_node.reuse(_jspx_th_template_option_0);
      return true;
    }
    _jspx_tagPool_template_option_view_nodetype_node.reuse(_jspx_th_template_option_0);
    return false;
  }

  private boolean _jspx_meth_template_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_option_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_template_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_template_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_template_param_0.setPageContext(_jspx_page_context);
    _jspx_th_template_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_option_0);
    _jspx_th_template_param_0.setName("queryLoadAllUnsorted");
    _jspx_th_template_param_0.setValue("true");
    int _jspx_eval_template_param_0 = _jspx_th_template_param_0.doStartTag();
    if (_jspx_th_template_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_param_value_name_nobody.reuse(_jspx_th_template_param_0);
      return true;
    }
    _jspx_tagPool_template_param_value_name_nobody.reuse(_jspx_th_template_param_0);
    return false;
  }

  private boolean _jspx_meth_facet_setupQueryAndMetadata_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  facet:setupQueryAndMetadata
    org.jahia.taglibs.facet.SetupQueryAndMetadataTag _jspx_th_facet_setupQueryAndMetadata_0 = (org.jahia.taglibs.facet.SetupQueryAndMetadataTag) _jspx_tagPool_facet_setupQueryAndMetadata_var_existingQuery_boundComponent_activeFacets_nobody.get(org.jahia.taglibs.facet.SetupQueryAndMetadataTag.class);
    _jspx_th_facet_setupQueryAndMetadata_0.setPageContext(_jspx_page_context);
    _jspx_th_facet_setupQueryAndMetadata_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_facet_setupQueryAndMetadata_0.setVar("listQuery");
    _jspx_th_facet_setupQueryAndMetadata_0.setBoundComponent((org.jahia.services.content.JCRNodeWrapper) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${boundComponent}", org.jahia.services.content.JCRNodeWrapper.class, (PageContext)_jspx_page_context, null));
    _jspx_th_facet_setupQueryAndMetadata_0.setExistingQuery((javax.jcr.query.qom.QueryObjectModel) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${moduleMap.listQuery}", javax.jcr.query.qom.QueryObjectModel.class, (PageContext)_jspx_page_context, null));
    _jspx_th_facet_setupQueryAndMetadata_0.setActiveFacets((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activeFacetsVars[activeFacetMapVarName]}", java.util.Map.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_facet_setupQueryAndMetadata_0 = _jspx_th_facet_setupQueryAndMetadata_0.doStartTag();
    if (_jspx_th_facet_setupQueryAndMetadata_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_facet_setupQueryAndMetadata_var_existingQuery_boundComponent_activeFacets_nobody.reuse(_jspx_th_facet_setupQueryAndMetadata_0);
      return true;
    }
    _jspx_tagPool_facet_setupQueryAndMetadata_var_existingQuery_boundComponent_activeFacets_nobody.reuse(_jspx_th_facet_setupQueryAndMetadata_0);
    return false;
  }

  private boolean _jspx_meth_jcr_jqom_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jcr:jqom
    org.jahia.taglibs.jcr.query.JQOMTag _jspx_th_jcr_jqom_0 = (org.jahia.taglibs.jcr.query.JQOMTag) _jspx_tagPool_jcr_jqom_var_scope_qomBeanName_nobody.get(org.jahia.taglibs.jcr.query.JQOMTag.class);
    _jspx_th_jcr_jqom_0.setPageContext(_jspx_page_context);
    _jspx_th_jcr_jqom_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_jcr_jqom_0.setVar("result");
    _jspx_th_jcr_jqom_0.setQomBeanName("listQuery");
    _jspx_th_jcr_jqom_0.setScope("request");
    int _jspx_eval_jcr_jqom_0 = _jspx_th_jcr_jqom_0.doStartTag();
    if (_jspx_th_jcr_jqom_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jcr_jqom_var_scope_qomBeanName_nobody.reuse(_jspx_th_jcr_jqom_0);
      return true;
    }
    _jspx_tagPool_jcr_jqom_var_scope_qomBeanName_nobody.reuse(_jspx_th_jcr_jqom_0);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty activeFacetsVars[activeFacetMapVarName]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    <div class=\"well well-small\">\n");
        out.write("    <h5>");
        if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</h5>\n");
        out.write("    <ul class=\"nav nav-pills nav-stacked\">\n");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_fmt_message_0.setKey("facets.activeFacets");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_5.setVar("facetParam");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet:getDeleteFacetUrl(facet, facetValue, activeFacetsVars[facetParamVarName])}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_3));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_0.setVar("facetUrl");
    _jspx_th_c_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.mainResource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty facetParam}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_param_0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetParamVarName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${functions:encodeUrlParam(facetParam)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_4));
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty activeFacetsVars[activeFacetMapVarName]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    </ul>\n");
        out.write("    </div>\n");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet:isUnappliedFacetExisting(result, activeFacetsVars[activeFacetMapVarName])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_5)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <h5>");
        if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</h5>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_fmt_message_1.setKey("facets.SelectFilter");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_url_1.setVar("facetUrl");
    _jspx_th_c_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.mainResource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_c_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_1.doInitBody();
      }
      do {
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_c_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_1.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetParamVarName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_param_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${functions:encodeUrlParam(facet:getFacetDrillDownUrl(facetValue, activeFacetsVars[facetParamVarName]))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_8));
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_c_url_2.setVar("facetUrl");
    _jspx_th_c_url_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.mainResource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_5[0]++;
        _jspx_th_c_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_2.doInitBody();
      }
      do {
        if (_jspx_meth_c_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        int evalDoAfterBody = _jspx_th_c_url_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_5[0]--;
    }
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_2.setPageContext(_jspx_page_context);
    _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_2.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetParamVarName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_param_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${functions:encodeUrlParam(facet:getFacetDrillDownUrl(facetValue, activeFacetsVars[facetParamVarName]))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_8));
    int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
    if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_c_url_3.setVar("facetUrl");
    _jspx_th_c_url_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.mainResource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_7[0]++;
        _jspx_th_c_url_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_3.doInitBody();
      }
      do {
        if (_jspx_meth_c_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context, _jspx_push_body_count_c_forEach_7))
          return true;
        int evalDoAfterBody = _jspx_th_c_url_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_7[0]--;
    }
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_3.setPageContext(_jspx_page_context);
    _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_3.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetParamVarName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_param_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${functions:encodeUrlParam(facet:getFacetDrillDownUrl(facetValue, activeFacetsVars[facetParamVarName]))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_8));
    int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
    if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_set_6.setVar("currentFacetLabel");
    _jspx_th_c_set_6.setValue(new String(""));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_set_7.setVar("mappedFacetLabel");
    _jspx_th_c_set_7.setValue(new String(""));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${iterationStatus.first or (mappedFacetLabel != currentFacetLabel and not empty mappedFacetLabel)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        if (_jspx_meth_c_if_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        out.write("\n");
        out.write("                <h6>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mappedFacetLabel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h6>\n");
        out.write("                <ul class=\"nav nav-pills nav-stacked\">\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_set_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_8.setPageContext(_jspx_page_context);
    _jspx_th_c_set_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_c_set_8.setVar("currentFacetLabel");
    _jspx_th_c_set_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mappedFacetLabel}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
    if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_8);
    return false;
  }

  private boolean _jspx_meth_c_if_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty currentFacetLabel}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    </ul>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_c_set_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_9.setPageContext(_jspx_page_context);
    _jspx_th_c_set_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_c_set_9.setVar("facetDrillDownUrl");
    _jspx_th_c_set_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet:getFacetDrillDownUrl(facetValue, activeFacetsVars[facetParamVarName])}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_8));
    int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
    if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_9);
    return false;
  }

  private boolean _jspx_meth_c_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_c_url_4.setVar("facetUrl");
    _jspx_th_c_url_4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url.mainResource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_8[0]++;
        _jspx_th_c_url_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_4.doInitBody();
      }
      do {
        if (_jspx_meth_c_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
          return true;
        int evalDoAfterBody = _jspx_th_c_url_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_8[0]--;
    }
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_4 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_4.setPageContext(_jspx_page_context);
    _jspx_th_c_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_4.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facetParamVarName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_param_4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${functions:encodeUrlParam(facetDrillDownUrl)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_8));
    int _jspx_eval_c_param_4 = _jspx_th_c_param_4.doStartTag();
    if (_jspx_th_c_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
    return false;
  }

  private boolean _jspx_meth_c_if_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty currentFacetLabel}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            </ul>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_c_if_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent(null);
    _jspx_th_c_if_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editableModule}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write(" :\n");
        out.write("    ");
        if (_jspx_meth_c_forEach_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        if (_jspx_meth_template_module_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_fmt_message_2.setKey("facets.facetsSet");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_9.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_c_forEach_9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jcr:getNodes(currentNode, 'jnt:facet')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_10));
    _jspx_th_c_forEach_9.setVar("facet");
    int[] _jspx_push_body_count_c_forEach_9 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_9 = _jspx_th_c_forEach_9.doStartTag();
      if (_jspx_eval_c_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_template_module_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_9, _jspx_page_context, _jspx_push_body_count_c_forEach_9))
            return true;
          int evalDoAfterBody = _jspx_th_c_forEach_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_9.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_9);
    }
    return false;
  }

  private boolean _jspx_meth_template_module_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:module
    org.jahia.taglibs.template.include.ModuleTag _jspx_th_template_module_0 = (org.jahia.taglibs.template.include.ModuleTag) _jspx_tagPool_template_module_node_nobody.get(org.jahia.taglibs.template.include.ModuleTag.class);
    _jspx_th_template_module_0.setPageContext(_jspx_page_context);
    _jspx_th_template_module_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_9);
    _jspx_th_template_module_0.setNode((org.jahia.services.content.JCRNodeWrapper) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${facet}", org.jahia.services.content.JCRNodeWrapper.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_template_module_0 = _jspx_th_template_module_0.doStartTag();
    if (_jspx_th_template_module_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_module_node_nobody.reuse(_jspx_th_template_module_0);
      return true;
    }
    _jspx_tagPool_template_module_node_nobody.reuse(_jspx_th_template_module_0);
    return false;
  }

  private boolean _jspx_meth_template_module_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:module
    org.jahia.taglibs.template.include.ModuleTag _jspx_th_template_module_1 = (org.jahia.taglibs.template.include.ModuleTag) _jspx_tagPool_template_module_path_nobody.get(org.jahia.taglibs.template.include.ModuleTag.class);
    _jspx_th_template_module_1.setPageContext(_jspx_page_context);
    _jspx_th_template_module_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_template_module_1.setPath("*");
    int _jspx_eval_template_module_1 = _jspx_th_template_module_1.doStartTag();
    if (_jspx_th_template_module_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_template_module_path_nobody.reuse(_jspx_th_template_module_1);
      return true;
    }
    _jspx_tagPool_template_module_path_nobody.reuse(_jspx_th_template_module_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_fmt_message_3.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:replace(currentNode.primaryNodeTypeName,':','_')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_11));
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }
}
