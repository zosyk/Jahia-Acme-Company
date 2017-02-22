<?xml version="1.0" encoding="UTF-8" ?>

<!-- New document created with EditiX at Fri Apr 02 14:31:29 CEST 2010 -->

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:jcr="http://www.jcp.org/jcr/1.0" xmlns:j="http://www.jahia.org/jahia/1.0">
    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="@*">
        <xsl:choose>
            <xsl:when test="name()='jcr:created'"/>
            <xsl:when test="name()='jcr:createdBy'"/>
            <xsl:when test="name()='jcr:lastModified'"/>
            <xsl:when test="name()='jcr:lastModifiedBy'"/>
            <xsl:when test="name()='j:lastPublished'"/>
            <xsl:when test="name()='j:lastPublishedBy'"/>
            <xsl:when test="name()='j:templateDeployed'"/>
            <xsl:when test="name()='jcr:uuid'"/>
            <xsl:when test="name()='j:fullpath'"/>
            <xsl:when test="name()='j:movedFrom'"/>
            <xsl:when test="name()='j:siteId'"/>
            <xsl:when test="name()='j:published'"/>
            <xsl:when test="name()='j:checkinDate'"/>
            <xsl:when test="name()='j:originWS'"/>
            <xsl:when test="name()='jcr:lockOwner'"/>
            <xsl:when test="name()='jcr:lockIsDeep'"/>
            <xsl:when test="name()='j:locktoken'"/>
            <xsl:when test="name()='j:lockTypes'"/>
            <xsl:when test="matches(.,'^/modules/.+/(\d+\.)*\d+(-SNAPSHOT)?/')">
                <xsl:attribute name="{name()}" namespace="{namespace-uri()}">
                    <xsl:value-of select="replace(.,'^(/modules/.+)/(\d+\.)*\d+(-SNAPSHOT)?(/.+)$','$1$4')" />
                </xsl:attribute>
            </xsl:when>
            <xsl:otherwise>
                <xsl:copy/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template match="@jcr:primaryType">
        <xsl:choose>
            <xsl:when test=".='jnt:moduleVersion'">
                <xsl:attribute name="primaryType" namespace="http://www.jcp.org/jcr/1.0">jnt:module</xsl:attribute>
            </xsl:when>
            <xsl:otherwise>
                <xsl:copy/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template match="*">
        <xsl:choose>
            <xsl:when test="@jcr:primaryType='jnt:permission'"/>
            <xsl:when test="@jcr:primaryType='jnt:roles'"/>
            <xsl:when test="@jcr:primaryType='jnt:versionInfo'"/>
            <xsl:when test="@jcr:primaryType='jnt:componentFolder'"/>
            <xsl:when test="@jcr:primaryType='jnt:externalProviderExtension' and @j:extendedType='jnt:moduleVersionFolder' and matches(name(),'sources')"/>
            <xsl:when test="@jcr:primaryType='jnt:module'">
                <xsl:element name="{name()}" namespace="{namespace-uri()}">
                    <xsl:for-each select="*">
                        <xsl:apply-templates select="node()|@*"/>
                    </xsl:for-each>
                </xsl:element>
            </xsl:when>
            <xsl:otherwise>
                <xsl:element name="{name()}" namespace="{namespace-uri()}">
                    <xsl:variable name="vtheElem" select="."/>

                    <xsl:for-each select="namespace::*">
                        <xsl:variable name="vPrefix" select="name()"/>

                        <xsl:if test="$vtheElem/descendant::*[namespace-uri()=current() and substring-before(name(),':') = $vPrefix or @*[substring-before(name(),':') = $vPrefix]]">
                            <xsl:copy/>
                        </xsl:if>
                    </xsl:for-each>
                    <xsl:apply-templates select="node()|@*"/>
                </xsl:element>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    <xsl:template match="/">
        <xsl:copy>
            <xsl:apply-templates select="child::node()"/>
        </xsl:copy>
    </xsl:template>
</xsl:stylesheet>
