<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:emd="http://org.core.URLEncoderEncodeExtFct">    
    
    
    <xsl:element name="a">
      <xsl:attribute name="href">
        <xsl:value-of select="emd:encode(translate($pDocNum,'/-',''))"/>
      </xsl:attribute>
