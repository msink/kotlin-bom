/*
 * Licensed under the Apache License, Version 2.0
 */

fun StringBuilder.zDocumentHeader() = append("""<?xml version="1.0" encoding="UTF-8"?>

<office:document xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0" xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0" xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0" xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0" xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0" xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0" xmlns:number="urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0" xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0" xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0" xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0" xmlns:math="http://www.w3.org/1998/Math/MathML" xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0" xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0" xmlns:config="urn:oasis:names:tc:opendocument:xmlns:config:1.0" xmlns:ooo="http://openoffice.org/2004/office" xmlns:ooow="http://openoffice.org/2004/writer" xmlns:oooc="http://openoffice.org/2004/calc" xmlns:dom="http://www.w3.org/2001/xml-events" xmlns:xforms="http://www.w3.org/2002/xforms" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:rpt="http://openoffice.org/2005/report" xmlns:of="urn:oasis:names:tc:opendocument:xmlns:of:1.2" xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:grddl="http://www.w3.org/2003/g/data-view#" xmlns:officeooo="http://openoffice.org/2009/office" xmlns:tableooo="http://openoffice.org/2009/table" xmlns:drawooo="http://openoffice.org/2010/draw" xmlns:calcext="urn:org:documentfoundation:names:experimental:calc:xmlns:calcext:1.0" xmlns:loext="urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0" xmlns:field="urn:openoffice:names:experimental:ooo-ms-interop:xmlns:field:1.0" xmlns:formx="urn:openoffice:names:experimental:ooxml-odf-interop:xmlns:form:1.0" xmlns:css3t="http://www.w3.org/TR/css3-text/" office:version="1.2" office:mimetype="application/vnd.oasis.opendocument.text">
 <office:meta><meta:creation-date>2001-02-18T22:55:00</meta:creation-date><dc:date>2017-10-06T15:39:43.611000000</dc:date><meta:print-date>2017-10-03T13:59:38.864000000</meta:print-date><meta:editing-cycles>39</meta:editing-cycles><meta:editing-duration>PT2H16M7S</meta:editing-duration><meta:generator>LibreOffice/5.3.6.1${'$'}Windows_X86_64 LibreOffice_project/686f202eff87ef707079aeb7f485847613344eb7</meta:generator><meta:document-statistic meta:table-count="3" meta:image-count="0" meta:object-count="0" meta:page-count="4" meta:paragraph-count="213" meta:word-count="273" meta:character-count="1955" meta:non-whitespace-character-count="1895"/><meta:template xlink:type="simple" xlink:actuate="onRequest" xlink:title="Normal.dot" xlink:href=""/></office:meta>
 <office:settings>
  <config:config-item-set config:name="ooo:view-settings">
   <config:config-item config:name="ViewAreaTop" config:type="long">0</config:config-item>
   <config:config-item config:name="ViewAreaLeft" config:type="long">0</config:config-item>
   <config:config-item config:name="ViewAreaWidth" config:type="long">72268</config:config-item>
   <config:config-item config:name="ViewAreaHeight" config:type="long">30805</config:config-item>
   <config:config-item config:name="ShowRedlineChanges" config:type="boolean">true</config:config-item>
   <config:config-item config:name="InBrowseMode" config:type="boolean">false</config:config-item>
   <config:config-item-map-indexed config:name="Views">
    <config:config-item-map-entry>
     <config:config-item config:name="ViewId" config:type="string">view2</config:config-item>
     <config:config-item config:name="ViewLeft" config:type="long">12236</config:config-item>
     <config:config-item config:name="ViewTop" config:type="long">1595</config:config-item>
     <config:config-item config:name="VisibleLeft" config:type="long">0</config:config-item>
     <config:config-item config:name="VisibleTop" config:type="long">0</config:config-item>
     <config:config-item config:name="VisibleRight" config:type="long">72267</config:config-item>
     <config:config-item config:name="VisibleBottom" config:type="long">30803</config:config-item>
     <config:config-item config:name="ZoomType" config:type="short">2</config:config-item>
     <config:config-item config:name="ViewLayoutColumns" config:type="short">0</config:config-item>
     <config:config-item config:name="ViewLayoutBookMode" config:type="boolean">false</config:config-item>
     <config:config-item config:name="ZoomFactor" config:type="short">67</config:config-item>
     <config:config-item config:name="IsSelectedFrame" config:type="boolean">false</config:config-item>
     <config:config-item config:name="AnchoredTextOverflowLegacy" config:type="boolean">false</config:config-item>
    </config:config-item-map-entry>
   </config:config-item-map-indexed>
  </config:config-item-set>
  <config:config-item-set config:name="ooo:configuration-settings">
   <config:config-item config:name="ProtectForm" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrinterName" config:type="string"/>
   <config:config-item config:name="EmbeddedDatabaseName" config:type="string"/>
   <config:config-item config:name="CurrentDatabaseDataSource" config:type="string"/>
   <config:config-item config:name="LinkUpdateMode" config:type="short">1</config:config-item>
   <config:config-item config:name="AddParaTableSpacingAtStart" config:type="boolean">true</config:config-item>
   <config:config-item config:name="FloattableNomargins" config:type="boolean">false</config:config-item>
   <config:config-item config:name="UnbreakableNumberings" config:type="boolean">false</config:config-item>
   <config:config-item config:name="FieldAutoUpdate" config:type="boolean">true</config:config-item>
   <config:config-item config:name="AddVerticalFrameOffsets" config:type="boolean">false</config:config-item>
   <config:config-item config:name="BackgroundParaOverDrawings" config:type="boolean">false</config:config-item>
   <config:config-item config:name="AddParaTableSpacing" config:type="boolean">true</config:config-item>
   <config:config-item config:name="ChartAutoUpdate" config:type="boolean">true</config:config-item>
   <config:config-item config:name="CurrentDatabaseCommand" config:type="string"/>
   <config:config-item config:name="AlignTabStopPosition" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrinterSetup" config:type="base64Binary"/>
   <config:config-item config:name="IsKernAsianPunctuation" config:type="boolean">false</config:config-item>
   <config:config-item config:name="CharacterCompressionType" config:type="short">0</config:config-item>
   <config:config-item config:name="ApplyUserData" config:type="boolean">true</config:config-item>
   <config:config-item config:name="SaveGlobalDocumentLinks" config:type="boolean">false</config:config-item>
   <config:config-item config:name="SurroundTextWrapSmall" config:type="boolean">false</config:config-item>
   <config:config-item config:name="SmallCapsPercentage66" config:type="boolean">false</config:config-item>
   <config:config-item config:name="CurrentDatabaseCommandType" config:type="int">0</config:config-item>
   <config:config-item config:name="SaveVersionOnClose" config:type="boolean">false</config:config-item>
   <config:config-item config:name="UpdateFromTemplate" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintSingleJobs" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrinterIndependentLayout" config:type="string">high-resolution</config:config-item>
   <config:config-item config:name="EmbedSystemFonts" config:type="boolean">false</config:config-item>
   <config:config-item config:name="DoNotCaptureDrawObjsOnPage" config:type="boolean">false</config:config-item>
   <config:config-item config:name="UseFormerObjectPositioning" config:type="boolean">false</config:config-item>
   <config:config-item config:name="IsLabelDocument" config:type="boolean">false</config:config-item>
   <config:config-item config:name="AddFrameOffsets" config:type="boolean">false</config:config-item>
   <config:config-item config:name="AllowPaddingWithoutBorders" config:type="boolean">false</config:config-item>
   <config:config-item config:name="AddExternalLeading" config:type="boolean">true</config:config-item>
   <config:config-item config:name="UseOldNumbering" config:type="boolean">false</config:config-item>
   <config:config-item config:name="OutlineLevelYieldsNumbering" config:type="boolean">false</config:config-item>
   <config:config-item config:name="DoNotResetParaAttrsForNumFont" config:type="boolean">false</config:config-item>
   <config:config-item config:name="IgnoreFirstLineIndentInNumbering" config:type="boolean">false</config:config-item>
   <config:config-item config:name="AllowPrintJobCancel" config:type="boolean">true</config:config-item>
   <config:config-item config:name="UseFormerLineSpacing" config:type="boolean">false</config:config-item>
   <config:config-item config:name="AddParaSpacingToTableCells" config:type="boolean">true</config:config-item>
   <config:config-item config:name="UseFormerTextWrapping" config:type="boolean">false</config:config-item>
   <config:config-item config:name="RedlineProtectionKey" config:type="base64Binary"/>
   <config:config-item config:name="ConsiderTextWrapOnObjPos" config:type="boolean">false</config:config-item>
   <config:config-item config:name="DoNotJustifyLinesWithManualBreak" config:type="boolean">false</config:config-item>
   <config:config-item config:name="EmbedFonts" config:type="boolean">false</config:config-item>
   <config:config-item config:name="TableRowKeep" config:type="boolean">false</config:config-item>
   <config:config-item config:name="TabsRelativeToIndent" config:type="boolean">true</config:config-item>
   <config:config-item config:name="IgnoreTabsAndBlanksForLineCalculation" config:type="boolean">false</config:config-item>
   <config:config-item config:name="RsidRoot" config:type="int">228619</config:config-item>
   <config:config-item config:name="LoadReadonly" config:type="boolean">false</config:config-item>
   <config:config-item config:name="ClipAsCharacterAnchoredWriterFlyFrames" config:type="boolean">false</config:config-item>
   <config:config-item config:name="UnxForceZeroExtLeading" config:type="boolean">false</config:config-item>
   <config:config-item config:name="UseOldPrinterMetrics" config:type="boolean">false</config:config-item>
   <config:config-item config:name="TabAtLeftIndentForParagraphsInList" config:type="boolean">false</config:config-item>
   <config:config-item config:name="Rsid" config:type="int">443059</config:config-item>
   <config:config-item config:name="MathBaselineAlignment" config:type="boolean">false</config:config-item>
   <config:config-item config:name="InvertBorderSpacing" config:type="boolean">false</config:config-item>
   <config:config-item config:name="CollapseEmptyCellPara" config:type="boolean">true</config:config-item>
   <config:config-item config:name="TabOverflow" config:type="boolean">true</config:config-item>
   <config:config-item config:name="StylesNoDefault" config:type="boolean">false</config:config-item>
   <config:config-item config:name="ClippedPictures" config:type="boolean">false</config:config-item>
   <config:config-item config:name="TabOverMargin" config:type="boolean">false</config:config-item>
   <config:config-item config:name="TreatSingleColumnBreakAsPageBreak" config:type="boolean">false</config:config-item>
   <config:config-item config:name="ApplyParagraphMarkFormatToNumbering" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PropLineSpacingShrinksFirstLine" config:type="boolean">true</config:config-item>
   <config:config-item config:name="SubtractFlysAnchoredAtFlys" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintAnnotationMode" config:type="short">0</config:config-item>
   <config:config-item config:name="PrintGraphics" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintBlackFonts" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintProspect" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintLeftPages" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintControls" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintPageBackground" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintTextPlaceholder" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintDrawings" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintHiddenText" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintTables" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintProspectRTL" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintReversed" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintRightPages" config:type="boolean">true</config:config-item>
   <config:config-item config:name="PrintFaxName" config:type="string"/>
   <config:config-item config:name="PrintPaperFromSetup" config:type="boolean">false</config:config-item>
   <config:config-item config:name="PrintEmptyPages" config:type="boolean">false</config:config-item>
  </config:config-item-set>
 </office:settings>
 <office:scripts>
  <office:script script:language="ooo:Basic">
   <ooo:libraries xmlns:ooo="http://openoffice.org/2004/office" xmlns:xlink="http://www.w3.org/1999/xlink">
    <ooo:library-embedded ooo:name="Standard"/>
   </ooo:libraries>
  </office:script>
 </office:scripts>
 <office:font-face-decls>
  <style:font-face style:name="Mangal1" svg:font-family="Mangal"/>
  <style:font-face style:name="Liberation Serif" svg:font-family="&apos;Liberation Serif&apos;" style:font-family-generic="roman" style:font-pitch="variable"/>
  <style:font-face style:name="Times New Roman" svg:font-family="&apos;Times New Roman&apos;" style:font-family-generic="roman" style:font-pitch="variable"/>
  <style:font-face style:name="Arial" svg:font-family="Arial" style:font-family-generic="swiss" style:font-pitch="variable"/>
  <style:font-face style:name="GOST type B" svg:font-family="&apos;GOST type B&apos;" style:font-family-generic="swiss" style:font-pitch="variable"/>
  <style:font-face style:name="Liberation Sans" svg:font-family="&apos;Liberation Sans&apos;" style:font-family-generic="swiss" style:font-pitch="variable"/>
  <style:font-face style:name="Mangal" svg:font-family="Mangal" style:font-family-generic="system" style:font-pitch="variable"/>
  <style:font-face style:name="Microsoft YaHei" svg:font-family="&apos;Microsoft YaHei&apos;" style:font-family-generic="system" style:font-pitch="variable"/>
  <style:font-face style:name="SimSun" svg:font-family="SimSun" style:font-family-generic="system" style:font-pitch="variable"/>
 </office:font-face-decls>
 <office:styles>
  <style:default-style style:family="graphic">
   <style:graphic-properties svg:stroke-color="#3465a4" draw:fill-color="#729fcf" fo:wrap-option="no-wrap" draw:shadow-offset-x="0.3cm" draw:shadow-offset-y="0.3cm" draw:start-line-spacing-horizontal="0.283cm" draw:start-line-spacing-vertical="0.283cm" draw:end-line-spacing-horizontal="0.283cm" draw:end-line-spacing-vertical="0.283cm" style:flow-with-text="false"/>
   <style:paragraph-properties style:text-autospace="ideograph-alpha" style:line-break="strict" style:writing-mode="lr-tb" style:font-independent-line-spacing="false">
    <style:tab-stops/>
   </style:paragraph-properties>
   <style:text-properties style:use-window-font-color="true" style:font-name="Liberation Serif" fo:font-size="12pt" fo:language="zxx" fo:country="none" style:letter-kerning="true" style:font-name-asian="SimSun" style:font-size-asian="10.5pt" style:language-asian="zxx" style:country-asian="none" style:font-name-complex="Mangal" style:font-size-complex="12pt" style:language-complex="zxx" style:country-complex="none"/>
  </style:default-style>
  <style:default-style style:family="paragraph">
   <style:paragraph-properties fo:hyphenation-ladder-count="no-limit" style:text-autospace="ideograph-alpha" style:punctuation-wrap="hanging" style:line-break="strict" style:tab-stop-distance="1.27cm" style:writing-mode="lr-tb"/>
   <style:text-properties style:use-window-font-color="true" style:font-name="Liberation Serif" fo:font-size="12pt" fo:language="zxx" fo:country="none" style:letter-kerning="true" style:font-name-asian="SimSun" style:font-size-asian="10.5pt" style:language-asian="zxx" style:country-asian="none" style:font-name-complex="Mangal" style:font-size-complex="12pt" style:language-complex="zxx" style:country-complex="none" fo:hyphenate="false" fo:hyphenation-remain-char-count="2" fo:hyphenation-push-char-count="2"/>
  </style:default-style>
  <style:default-style style:family="table">
   <style:table-properties table:border-model="collapsing"/>
  </style:default-style>
  <style:default-style style:family="table-row">
   <style:table-row-properties fo:keep-together="auto"/>
  </style:default-style>
  <style:style style:name="Standard" style:family="paragraph" style:class="text">
   <style:paragraph-properties fo:orphans="2" fo:widows="2" style:writing-mode="lr-tb"/>
   <style:text-properties style:use-window-font-color="true" style:font-name="Times New Roman" fo:font-family="&apos;Times New Roman&apos;" style:font-family-generic="roman" style:font-pitch="variable" fo:font-size="10pt" fo:language="ru" fo:country="RU" style:font-name-asian="Times New Roman" style:font-family-asian="&apos;Times New Roman&apos;" style:font-family-generic-asian="roman" style:font-pitch-asian="variable" style:font-size-asian="10pt" style:font-name-complex="Times New Roman" style:font-family-complex="&apos;Times New Roman&apos;" style:font-family-generic-complex="roman" style:font-pitch-complex="variable" style:font-size-complex="10pt" style:language-complex="ar" style:country-complex="SA"/>
  </style:style>
  <style:style style:name="Heading" style:family="paragraph" style:parent-style-name="Standard" style:next-style-name="Text_20_body" style:class="text">
   <style:paragraph-properties fo:margin-top="0.423cm" fo:margin-bottom="0.212cm" loext:contextual-spacing="false" fo:keep-with-next="always"/>
   <style:text-properties style:font-name="Liberation Sans" fo:font-family="&apos;Liberation Sans&apos;" style:font-family-generic="swiss" style:font-pitch="variable" fo:font-size="14pt" style:font-name-asian="Microsoft YaHei" style:font-family-asian="&apos;Microsoft YaHei&apos;" style:font-family-generic-asian="system" style:font-pitch-asian="variable" style:font-size-asian="14pt" style:font-name-complex="Mangal" style:font-family-complex="Mangal" style:font-family-generic-complex="system" style:font-pitch-complex="variable" style:font-size-complex="14pt"/>
  </style:style>
  <style:style style:name="Text_20_body" style:display-name="Text body" style:family="paragraph" style:parent-style-name="Standard" style:class="text">
   <style:paragraph-properties fo:margin-top="0cm" fo:margin-bottom="0.247cm" loext:contextual-spacing="false" fo:line-height="120%"/>
  </style:style>
  <style:style style:name="List" style:family="paragraph" style:parent-style-name="Text_20_body" style:class="list">
   <style:text-properties style:font-size-asian="12pt" style:font-name-complex="Mangal1" style:font-family-complex="Mangal"/>
  </style:style>
  <style:style style:name="Caption" style:family="paragraph" style:parent-style-name="Standard" style:class="extra">
   <style:paragraph-properties fo:margin-top="0.212cm" fo:margin-bottom="0.212cm" loext:contextual-spacing="false" text:number-lines="false" text:line-number="0"/>
   <style:text-properties fo:font-size="12pt" fo:font-style="italic" style:font-size-asian="12pt" style:font-style-asian="italic" style:font-name-complex="Mangal1" style:font-family-complex="Mangal" style:font-size-complex="12pt" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="Index" style:family="paragraph" style:parent-style-name="Standard" style:class="index">
   <style:paragraph-properties text:number-lines="false" text:line-number="0"/>
   <style:text-properties style:font-size-asian="12pt" style:font-name-complex="Mangal1" style:font-family-complex="Mangal"/>
  </style:style>
  <style:style style:name="Heading_20_1" style:display-name="Heading 1" style:family="paragraph" style:parent-style-name="Standard" style:next-style-name="Standard" style:default-outline-level="1" style:class="text">
   <style:paragraph-properties fo:keep-with-next="always"/>
   <style:text-properties fo:font-size="16pt" style:font-size-asian="16pt"/>
  </style:style>
  <style:style style:name="Heading_20_2" style:display-name="Heading 2" style:family="paragraph" style:parent-style-name="Standard" style:next-style-name="Standard" style:default-outline-level="2" style:class="text">
   <style:paragraph-properties fo:keep-with-next="always"/>
   <style:text-properties fo:font-size="14pt" style:font-size-asian="14pt"/>
  </style:style>
  <style:style style:name="Heading_20_3" style:display-name="Heading 3" style:family="paragraph" style:parent-style-name="Standard" style:next-style-name="Standard" style:default-outline-level="3" style:class="text">
   <style:paragraph-properties fo:text-align="center" style:justify-single-word="false" fo:keep-with-next="always"/>
   <style:text-properties fo:font-size="12pt" style:font-size-asian="12pt"/>
  </style:style>
  <style:style style:name="Heading_20_4" style:display-name="Heading 4" style:family="paragraph" style:parent-style-name="Standard" style:next-style-name="Standard" style:default-outline-level="4" style:class="text">
   <style:paragraph-properties fo:margin-left="-0.307cm" fo:margin-right="-0.298cm" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" fo:keep-with-next="always"/>
   <style:text-properties fo:font-size="12pt" style:font-size-asian="12pt"/>
  </style:style>
  <style:style style:name="Heading_20_5" style:display-name="Heading 5" style:family="paragraph" style:parent-style-name="Standard" style:next-style-name="Standard" style:default-outline-level="5" style:class="text">
   <style:paragraph-properties fo:margin-left="0cm" fo:margin-right="0cm" fo:text-indent="0.811cm" style:auto-text-indent="false" fo:keep-with-next="always"/>
   <style:text-properties fo:font-size="12pt" style:font-size-asian="12pt"/>
  </style:style>
  <style:style style:name="Heading_20_6" style:display-name="Heading 6" style:family="paragraph" style:parent-style-name="Standard" style:next-style-name="Standard" style:default-outline-level="6" style:class="text">
   <style:paragraph-properties fo:margin-left="-0.191cm" fo:margin-right="-0.192cm" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" fo:keep-with-next="always"/>
   <style:text-properties fo:font-size="12pt" fo:language="en" fo:country="US" style:font-size-asian="12pt"/>
  </style:style>
  <style:style style:name="Table_20_Contents" style:display-name="Table Contents" style:family="paragraph" style:parent-style-name="Standard" style:class="extra">
   <style:paragraph-properties text:number-lines="false" text:line-number="0"/>
  </style:style>
  <style:style style:name="Table_20_Heading" style:display-name="Table Heading" style:family="paragraph" style:parent-style-name="Table_20_Contents" style:class="extra">
   <style:paragraph-properties fo:text-align="center" style:justify-single-word="false" text:number-lines="false" text:line-number="0"/>
   <style:text-properties fo:font-weight="bold" style:font-weight-asian="bold" style:font-weight-complex="bold"/>
  </style:style>
  <style:style style:name="Header" style:family="paragraph" style:parent-style-name="Standard" style:class="extra">
   <style:paragraph-properties text:number-lines="false" text:line-number="0">
    <style:tab-stops>
     <style:tab-stop style:position="9.252cm" style:type="center"/>
     <style:tab-stop style:position="18.503cm" style:type="right"/>
    </style:tab-stops>
   </style:paragraph-properties>
  </style:style>
  <style:style style:name="Footer" style:family="paragraph" style:parent-style-name="Standard" style:class="extra">
   <style:paragraph-properties text:number-lines="false" text:line-number="0">
    <style:tab-stops>
     <style:tab-stop style:position="9.252cm" style:type="center"/>
     <style:tab-stop style:position="18.503cm" style:type="right"/>
    </style:tab-stops>
   </style:paragraph-properties>
  </style:style>
  <style:style style:name="Graphics" style:family="graphic">
   <style:graphic-properties text:anchor-type="paragraph" svg:x="0cm" svg:y="0cm" style:wrap="dynamic" style:number-wrapped-paragraphs="no-limit" style:wrap-contour="false" style:vertical-pos="top" style:vertical-rel="paragraph" style:horizontal-pos="center" style:horizontal-rel="paragraph"/>
  </style:style>
  <style:style style:name="OLE" style:family="graphic">
   <style:graphic-properties text:anchor-type="paragraph" svg:x="0cm" svg:y="0cm" style:wrap="dynamic" style:number-wrapped-paragraphs="no-limit" style:wrap-contour="false" style:vertical-pos="top" style:vertical-rel="paragraph" style:horizontal-pos="center" style:horizontal-rel="paragraph"/>
  </style:style>
  <text:outline-style style:name="Outline">
   <text:outline-level-style text:level="1" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="2" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="3" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="4" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="5" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="6" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="7" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="8" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="9" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
   <text:outline-level-style text:level="10" style:num-format="">
    <style:list-level-properties text:list-level-position-and-space-mode="label-alignment">
     <style:list-level-label-alignment text:label-followed-by="listtab"/>
    </style:list-level-properties>
   </text:outline-level-style>
  </text:outline-style>
  <text:notes-configuration text:note-class="footnote" style:num-format="1" text:start-value="0" text:footnotes-position="page" text:start-numbering-at="document"/>
  <text:notes-configuration text:note-class="endnote" style:num-format="i" text:start-value="0"/>
  <text:linenumbering-configuration text:number-lines="false" text:offset="0.499cm" style:num-format="1" text:number-position="left" text:increment="5"/>
  <style:default-page-layout>
   <style:page-layout-properties style:writing-mode="lr-tb" style:layout-grid-standard-mode="true"/>
  </style:default-page-layout>
 </office:styles>
 <office:automatic-styles>
  <style:style style:name="Штамп2" style:family="table">
   <style:table-properties style:width="18.33cm" fo:margin-left="0cm" table:align="left" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.A" style:family="table-column">
   <style:table-column-properties style:column-width="0.824cm"/>
  </style:style>
  <style:style style:name="Штамп2.B" style:family="table-column">
   <style:table-column-properties style:column-width="0.981cm"/>
  </style:style>
  <style:style style:name="Штамп2.C" style:family="table-column">
   <style:table-column-properties style:column-width="2.175cm"/>
  </style:style>
  <style:style style:name="Штамп2.D" style:family="table-column">
   <style:table-column-properties style:column-width="1.443cm"/>
  </style:style>
  <style:style style:name="Штамп2.E" style:family="table-column">
   <style:table-column-properties style:column-width="1.067cm"/>
  </style:style>
  <style:style style:name="Штамп2.F" style:family="table-column">
   <style:table-column-properties style:column-width="10.622cm"/>
  </style:style>
  <style:style style:name="Штамп2.G" style:family="table-column">
   <style:table-column-properties style:column-width="1.219cm"/>
  </style:style>
  <style:style style:name="Штамп2.1" style:family="table-row">
   <style:table-row-properties style:min-row-height="0.501cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Штамп2.A1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.B1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.F1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="1pt solid #000000" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.G1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="0.05pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.A2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.B2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.G2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="0.05pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.3" style:family="table-row">
   <style:table-row-properties style:min-row-height="0.499cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Штамп2.A3" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.B3" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп" style:family="table">
   <style:table-properties style:width="18.33cm" fo:margin-left="0cm" table:align="left" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A" style:family="table-column">
   <style:table-column-properties style:column-width="0.824cm"/>
  </style:style>
  <style:style style:name="Штамп.B" style:family="table-column">
   <style:table-column-properties style:column-width="0.981cm"/>
  </style:style>
  <style:style style:name="Штамп.C" style:family="table-column">
   <style:table-column-properties style:column-width="2.175cm"/>
  </style:style>
  <style:style style:name="Штамп.D" style:family="table-column">
   <style:table-column-properties style:column-width="1.443cm"/>
  </style:style>
  <style:style style:name="Штамп.E" style:family="table-column">
   <style:table-column-properties style:column-width="1.067cm"/>
  </style:style>
  <style:style style:name="Штамп.F" style:family="table-column">
   <style:table-column-properties style:column-width="7.428cm"/>
  </style:style>
  <style:style style:name="Штамп.G" style:family="table-column">
   <style:table-column-properties style:column-width="0.506cm"/>
  </style:style>
  <style:style style:name="Штамп.H" style:family="table-column">
   <style:table-column-properties style:column-width="0.51cm"/>
  </style:style>
  <style:style style:name="Штамп.I" style:family="table-column">
   <style:table-column-properties style:column-width="0.508cm"/>
  </style:style>
  <style:style style:name="Штамп.J" style:family="table-column">
   <style:table-column-properties style:column-width="1.371cm"/>
  </style:style>
  <style:style style:name="Штамп.K" style:family="table-column">
   <style:table-column-properties style:column-width="1.519cm"/>
  </style:style>
  <style:style style:name="Штамп.1" style:family="table-row">
   <style:table-row-properties style:min-row-height="0.501cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Штамп.A1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.B1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.F1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.B2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A3" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.C4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.E4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.F4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.G4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.H5" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="0.5pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.G6" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A8" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.E8" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2" style:family="table">
   <style:table-properties style:width="18.33cm" fo:margin-left="0cm" table:align="left" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.A" style:family="table-column">
   <style:table-column-properties style:column-width="0.824cm"/>
  </style:style>
  <style:style style:name="Штамп2.B" style:family="table-column">
   <style:table-column-properties style:column-width="0.981cm"/>
  </style:style>
  <style:style style:name="Штамп2.C" style:family="table-column">
   <style:table-column-properties style:column-width="2.175cm"/>
  </style:style>
  <style:style style:name="Штамп2.D" style:family="table-column">
   <style:table-column-properties style:column-width="1.443cm"/>
  </style:style>
  <style:style style:name="Штамп2.E" style:family="table-column">
   <style:table-column-properties style:column-width="1.067cm"/>
  </style:style>
  <style:style style:name="Штамп2.F" style:family="table-column">
   <style:table-column-properties style:column-width="10.622cm"/>
  </style:style>
  <style:style style:name="Штамп2.G" style:family="table-column">
   <style:table-column-properties style:column-width="1.219cm"/>
  </style:style>
  <style:style style:name="Штамп2.1" style:family="table-row">
   <style:table-row-properties style:min-row-height="0.501cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Штамп2.A1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.B1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.F1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="1pt solid #000000" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.G1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="0.05pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.A2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.B2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.G2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="0.05pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.3" style:family="table-row">
   <style:table-row-properties style:min-row-height="0.499cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Штамп2.A3" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп2.B3" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп" style:family="table">
   <style:table-properties style:width="18.33cm" fo:margin-left="0cm" table:align="left" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A" style:family="table-column">
   <style:table-column-properties style:column-width="0.824cm"/>
  </style:style>
  <style:style style:name="Штамп.B" style:family="table-column">
   <style:table-column-properties style:column-width="0.981cm"/>
  </style:style>
  <style:style style:name="Штамп.C" style:family="table-column">
   <style:table-column-properties style:column-width="2.175cm"/>
  </style:style>
  <style:style style:name="Штамп.D" style:family="table-column">
   <style:table-column-properties style:column-width="1.443cm"/>
  </style:style>
  <style:style style:name="Штамп.E" style:family="table-column">
   <style:table-column-properties style:column-width="1.067cm"/>
  </style:style>
  <style:style style:name="Штамп.F" style:family="table-column">
   <style:table-column-properties style:column-width="7.428cm"/>
  </style:style>
  <style:style style:name="Штамп.G" style:family="table-column">
   <style:table-column-properties style:column-width="0.506cm"/>
  </style:style>
  <style:style style:name="Штамп.H" style:family="table-column">
   <style:table-column-properties style:column-width="0.51cm"/>
  </style:style>
  <style:style style:name="Штамп.I" style:family="table-column">
   <style:table-column-properties style:column-width="0.508cm"/>
  </style:style>
  <style:style style:name="Штамп.J" style:family="table-column">
   <style:table-column-properties style:column-width="1.371cm"/>
  </style:style>
  <style:style style:name="Штамп.K" style:family="table-column">
   <style:table-column-properties style:column-width="1.519cm"/>
  </style:style>
  <style:style style:name="Штамп.1" style:family="table-row">
   <style:table-row-properties style:min-row-height="0.501cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Штамп.A1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.B1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.F1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.B2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A3" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="1pt solid #000000" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="none" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.C4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.E4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.F4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="top" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.G4" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.H5" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="0.5pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.G6" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.A8" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Штамп.E8" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Перечень" style:family="table" style:master-page-name="First_20_Page">
   <style:table-properties style:width="18.33cm" fo:margin-left="0cm" style:page-number="auto" table:align="left" style:shadow="none" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Перечень.A" style:family="table-column">
   <style:table-column-properties style:column-width="14.33cm"/>
  </style:style>
  <style:style style:name="Перечень.B" style:family="table-column">
   <style:table-column-properties style:column-width="4.001cm"/>
  </style:style>
  <style:style style:name="Перечень.1" style:family="table-row">
   <style:table-row-properties style:row-height="1.33cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Перечень.A1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Перечень.B1" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="1pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Перечень.2" style:family="table-row">
   <style:table-row-properties style:row-height="0.801cm" fo:keep-together="auto"/>
  </style:style>
  <style:style style:name="Перечень.A2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="none" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="Перечень.B2" style:family="table-cell">
   <style:table-cell-properties style:vertical-align="middle" fo:padding-left="0.191cm" fo:padding-right="0.191cm" fo:padding-top="0cm" fo:padding-bottom="0cm" fo:border-left="1pt solid #000000" fo:border-right="1pt solid #000000" fo:border-top="none" fo:border-bottom="0.5pt solid #000000" style:writing-mode="lr-tb"/>
  </style:style>
  <style:style style:name="P1" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:text-align="center" style:justify-single-word="false" style:snap-to-layout-grid="false"/>
   <style:text-properties style:use-window-font-color="true" style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="0013000c" officeooo:paragraph-rsid="002a72a9" style:font-name-asian="Times New Roman" style:font-size-asian="12pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-name-complex="Times New Roman" style:font-size-complex="12pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P2" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="0cm" fo:margin-right="0cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0.811cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="001fb975" officeooo:paragraph-rsid="001fb975" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P3" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.191cm" fo:margin-right="-0.231cm" fo:margin-top="0cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="10pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="001163f7" style:font-size-asian="10pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-name-complex="Arial" style:font-size-complex="10pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P4" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.101cm" fo:margin-right="-0.199cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="0013000c" officeooo:paragraph-rsid="0013000c" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P5" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.101cm" fo:margin-right="-0.199cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="0013000c" officeooo:paragraph-rsid="0013000c" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P6" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.199cm" fo:margin-right="-0.199cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="000b5ea9" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P7" style:family="paragraph" style:parent-style-name="Heading_20_4">
   <style:paragraph-properties fo:margin-left="-0.199cm" fo:margin-right="-0.199cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="000b5ea9" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P8" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="0.199cm" fo:margin-right="0cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="001fb975" officeooo:paragraph-rsid="001fb975" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P9" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.3cm" fo:margin-right="-0.3cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="10pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="001163f7" officeooo:paragraph-rsid="001163f7" style:font-size-asian="10pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="10pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P10" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.3cm" fo:margin-right="-0.3cm" fo:margin-top="0cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="10pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="001163f7" style:font-size-asian="10pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-name-complex="Arial" style:font-size-complex="10pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P11" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.101cm" fo:margin-right="-0.3cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="001163f7" officeooo:paragraph-rsid="001163f7" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P12" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.101cm" fo:margin-right="-0.499cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="10pt" fo:language="zxx" fo:country="none" fo:font-style="italic" fo:font-weight="normal" officeooo:rsid="003438d8" officeooo:paragraph-rsid="003438d8" style:font-size-asian="10pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-weight-asian="normal" style:font-size-complex="10pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic" style:font-weight-complex="normal"/>
  </style:style>
  <style:style style:name="P13" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.101cm" fo:margin-right="-0.499cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="001163f7" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P14" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-left="-0.3cm" fo:margin-right="-0.199cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" fo:text-indent="0cm" style:auto-text-indent="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="001fb975" officeooo:paragraph-rsid="001fb975" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P15" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="001be318" officeooo:paragraph-rsid="001be318" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P16" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="001163f7" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P17" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="001369b7" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P18" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" style:vertical-align="middle" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="20pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="003438d8" officeooo:paragraph-rsid="003438d8" style:font-size-asian="20pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="20pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P19" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="14pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="003438d8" officeooo:paragraph-rsid="003438d8" style:font-size-asian="14pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="14pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P20" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="9pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="001163f7" officeooo:paragraph-rsid="001163f7" style:font-size-asian="9pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-name-complex="Arial" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P21" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="9pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="001163f7" style:font-size-asian="9pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-name-complex="Arial" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P22" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:use-window-font-color="true" style:font-name="GOST type B" fo:font-size="10pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="0013000c" officeooo:paragraph-rsid="001163f7" style:font-name-asian="Times New Roman" style:font-size-asian="10pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-name-complex="Times New Roman" style:font-size-complex="10pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P23" style:family="paragraph" style:parent-style-name="Standard">
   <style:paragraph-properties fo:margin-top="0.499cm" fo:margin-bottom="0.3cm" loext:contextual-spacing="false" fo:text-align="center" style:justify-single-word="false" style:vertical-align="middle" style:snap-to-layout-grid="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="20pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:rsid="003438d8" officeooo:paragraph-rsid="003438d8" style:font-size-asian="20pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="20pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P24" style:family="paragraph" style:parent-style-name="Heading_20_4">
   <style:paragraph-properties fo:margin-left="-0.199cm" fo:margin-right="-0.199cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="000b5ea9" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="P25" style:family="paragraph" style:parent-style-name="Heading_20_4">
   <style:paragraph-properties fo:margin-left="-0.199cm" fo:margin-right="-0.199cm" fo:margin-top="0.101cm" fo:margin-bottom="0cm" loext:contextual-spacing="false" fo:text-indent="0cm" style:auto-text-indent="false" style:writing-mode="lr-tb"/>
   <style:text-properties style:font-name="GOST type B" fo:font-size="12pt" fo:language="zxx" fo:country="none" fo:font-style="italic" officeooo:paragraph-rsid="0006c2b3" style:font-size-asian="16pt" style:language-asian="zxx" style:country-asian="none" style:font-style-asian="italic" style:font-size-complex="16pt" style:language-complex="zxx" style:country-complex="none" style:font-style-complex="italic"/>
  </style:style>
  <style:style style:name="T1" style:family="text">
   <style:text-properties officeooo:rsid="0006c2b3"/>
  </style:style>
  <style:page-layout style:name="pm1">
   <style:page-layout-properties fo:page-width="21.001cm" fo:page-height="29.7cm" style:num-format="1" style:print-orientation="portrait" fo:margin-top="0.6cm" fo:margin-bottom="0.45cm" fo:margin-left="2cm" fo:margin-right="0.6cm" fo:border="0.99pt solid #000000" fo:padding="0cm" style:shadow="none" style:writing-mode="lr-tb" style:layout-grid-color="#c0c0c0" style:layout-grid-lines="45" style:layout-grid-base-height="0.635cm" style:layout-grid-ruby-height="0cm" style:layout-grid-mode="none" style:layout-grid-ruby-below="false" style:layout-grid-print="false" style:layout-grid-display="false" style:layout-grid-base-width="0.353cm" style:layout-grid-snap-to="true" style:footnote-max-height="0cm">
    <style:footnote-sep style:width="0.018cm" style:distance-before-sep="0.101cm" style:distance-after-sep="0.101cm" style:line-style="solid" style:adjustment="left" style:rel-width="25%" style:color="#000000"/>
   </style:page-layout-properties>
   <style:header-style/>
   <style:footer-style>
    <style:header-footer-properties svg:height="1.499cm" fo:margin-left="0cm" fo:margin-right="0cm" fo:margin-top="0cm" fo:background-color="transparent" style:dynamic-spacing="false" draw:fill="none" draw:fill-color="#729fcf"/>
   </style:footer-style>
  </style:page-layout>
  <style:page-layout style:name="pm2">
   <style:page-layout-properties fo:page-width="21.001cm" fo:page-height="29.7cm" style:num-format="1" style:print-orientation="portrait" fo:margin-top="0.6cm" fo:margin-bottom="0.45cm" fo:margin-left="2cm" fo:margin-right="0.6cm" fo:border="0.99pt solid #000000" fo:padding="0cm" style:shadow="none" fo:background-color="transparent" style:writing-mode="lr-tb" draw:fill="none" draw:fill-color="#729fcf" style:footnote-max-height="0cm">
    <style:columns fo:column-count="1" fo:column-gap="0cm"/>
    <style:footnote-sep style:width="0.018cm" style:distance-before-sep="0.101cm" style:distance-after-sep="0.101cm" style:line-style="solid" style:adjustment="left" style:rel-width="25%" style:color="#000000"/>
   </style:page-layout-properties>
   <style:header-style/>
   <style:footer-style>
    <style:header-footer-properties svg:height="4.001cm" fo:margin-left="0cm" fo:margin-right="0cm" fo:margin-top="0cm" fo:background-color="transparent" style:dynamic-spacing="true" draw:fill="none" draw:fill-color="#729fcf"/>
   </style:footer-style>
  </style:page-layout>
 </office:automatic-styles>
 <office:master-styles>
  <style:master-page style:name="Standard" style:page-layout-name="pm1">
   <style:footer>
    <table:table table:name="Штамп2" table:style-name="Штамп2">
     <table:table-column table:style-name="Штамп2.A"/>
     <table:table-column table:style-name="Штамп2.B"/>
     <table:table-column table:style-name="Штамп2.C"/>
     <table:table-column table:style-name="Штамп2.D"/>
     <table:table-column table:style-name="Штамп2.E"/>
     <table:table-column table:style-name="Штамп2.F"/>
     <table:table-column table:style-name="Штамп2.G"/>
     <table:table-row table:style-name="Штамп2.1">
      <table:table-cell table:style-name="Штамп2.A1" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B1" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B1" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B1" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B1" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.F1" table:number-rows-spanned="3" office:value-type="string">
       <text:p text:style-name="P18">${board.code}</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.G1" office:value-type="string">
       <text:p text:style-name="P22">Лист</text:p>
      </table:table-cell>
     </table:table-row>
     <table:table-row table:style-name="Штамп2.1">
      <table:table-cell table:style-name="Штамп2.A2" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B2" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B2" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B2" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B2" office:value-type="string">
       <text:p text:style-name="P17"/>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп2.G2" table:number-rows-spanned="2" office:value-type="string">
       <text:p text:style-name="P1"><text:page-number text:select-page="current">4</text:page-number></text:p>
      </table:table-cell>
     </table:table-row>
     <table:table-row table:style-name="Штамп2.3">
      <table:table-cell table:style-name="Штамп2.A3" office:value-type="string">
       <text:p text:style-name="P4">Изм.</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B3" office:value-type="string">
       <text:p text:style-name="P4">Лист</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B3" office:value-type="string">
       <text:p text:style-name="P5">№ докум.</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B3" office:value-type="string">
       <text:p text:style-name="P4">Подпись</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп2.B3" office:value-type="string">
       <text:p text:style-name="P4">Дата</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
     </table:table-row>
    </table:table>
   </style:footer>
  </style:master-page>
  <style:master-page style:name="First_20_Page" style:display-name="First Page" style:page-layout-name="pm2" style:next-style-name="Standard">
   <style:footer>
    <table:table table:name="Штамп" table:style-name="Штамп">
     <table:table-column table:style-name="Штамп.A"/>
     <table:table-column table:style-name="Штамп.B"/>
     <table:table-column table:style-name="Штамп.C"/>
     <table:table-column table:style-name="Штамп.D"/>
     <table:table-column table:style-name="Штамп.E"/>
     <table:table-column table:style-name="Штамп.F"/>
     <table:table-column table:style-name="Штамп.G"/>
     <table:table-column table:style-name="Штамп.H"/>
     <table:table-column table:style-name="Штамп.I"/>
     <table:table-column table:style-name="Штамп.J"/>
     <table:table-column table:style-name="Штамп.K"/>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A1" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B1" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B1" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B1" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B1" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.F1" table:number-rows-spanned="3" table:number-columns-spanned="6" office:value-type="string">
       <text:p text:style-name="P18">${board.code}</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
     </table:table-row>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A2" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B2" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B2" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B2" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.B2" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
     </table:table-row>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A3" office:value-type="string">
       <text:p text:style-name="P4">Изм.</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.F1" office:value-type="string">
       <text:p text:style-name="P4">Лист</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.F1" office:value-type="string">
       <text:p text:style-name="P5">№ докум.</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.F1" office:value-type="string">
       <text:p text:style-name="P4">Подпись</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.F1" office:value-type="string">
       <text:p text:style-name="P4">Дата</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
     </table:table-row>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A4" table:number-columns-spanned="2" office:value-type="string">
       <text:p text:style-name="P9">Разработал</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P12">${board.developed}</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.E4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.F4" table:number-rows-spanned="5" office:value-type="string">
       <text:p text:style-name="P23">${board.name}</text:p>
       <text:p text:style-name="P19">Заявка на покупные изделия</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.G4" table:number-columns-spanned="3" office:value-type="string">
       <text:p text:style-name="P20">Лит.</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.G4" office:value-type="string">
       <text:p text:style-name="P22">Лист</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.G4" office:value-type="string">
       <text:p text:style-name="P22">Листов</text:p>
      </table:table-cell>
     </table:table-row>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A4" table:number-columns-spanned="2" office:value-type="string">
       <text:p text:style-name="P11">Проверил</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P12">${board.checked}</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.E4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.G4" office:value-type="string">
       <text:p text:style-name="P21"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.H5" office:value-type="string">
       <text:p text:style-name="P21"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.H5" office:value-type="string">
       <text:p text:style-name="P21"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.G4" office:value-type="string">
       <text:p text:style-name="P10"><text:page-number text:select-page="current">1</text:page-number></text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.G4" office:value-type="string">
       <text:p text:style-name="P3"><text:page-count>4</text:page-count></text:p>
      </table:table-cell>
     </table:table-row>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A4" table:number-columns-spanned="2" office:value-type="string">
       <text:p text:style-name="P11">Нач. КБ</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P13"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.E4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.G6" table:number-rows-spanned="3" table:number-columns-spanned="5" office:value-type="string">
       <text:p text:style-name="P21"/>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
     </table:table-row>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A4" table:number-columns-spanned="2" office:value-type="string">
       <text:p text:style-name="P11">H. контр.</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P13"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.C4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.E4" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
     </table:table-row>
     <table:table-row table:style-name="Штамп.1">
      <table:table-cell table:style-name="Штамп.A8" table:number-columns-spanned="2" office:value-type="string">
       <text:p text:style-name="P11">Утвердил</text:p>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:table-cell table:style-name="Штамп.G6" office:value-type="string">
       <text:p text:style-name="P12">${board.approved}</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.G6" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:table-cell table:style-name="Штамп.E8" office:value-type="string">
       <text:p text:style-name="P16"/>
      </table:table-cell>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
      <table:covered-table-cell/>
     </table:table-row>
    </table:table>
   </style:footer>
  </style:master-page>
 </office:master-styles>
 <office:body>
  <office:text text:use-soft-page-breaks="true">
   <office:forms form:automatic-focus="false" form:apply-design-mode="false"/>
   <text:sequence-decls>
    <text:sequence-decl text:display-outline-level="0" text:name="Illustration"/>
    <text:sequence-decl text:display-outline-level="0" text:name="Table"/>
    <text:sequence-decl text:display-outline-level="0" text:name="Text"/>
    <text:sequence-decl text:display-outline-level="0" text:name="Drawing"/>
   </text:sequence-decls>
   <table:table table:name="Перечень" table:style-name="Перечень">
    <table:table-column table:style-name="Перечень.A"/>
    <table:table-column table:style-name="Перечень.B"/>
    <table:table-header-rows>
     <table:table-row table:style-name="Перечень.1">
      <table:table-cell table:style-name="Перечень.A1" office:value-type="string">
       <text:p text:style-name="P6">Наименование</text:p>
      </table:table-cell>
      <table:table-cell table:style-name="Перечень.B1" office:value-type="string">
       <text:h text:style-name="P25" text:outline-level="4">Количество</text:h>
      </table:table-cell>
     </table:table-row>
    </table:table-header-rows>
""")

fun StringBuilder.zTableHeaderRow(
        name: String
) = append("""    <table:table-row table:style-name="Перечень.2">
     <table:table-cell table:style-name="Перечень.A2" office:value-type="string">
      <text:p text:style-name="P2">$name</text:p>
     </table:table-cell>
     <table:table-cell table:style-name="Перечень.B2" office:value-type="string">
      <text:p text:style-name="P15"/>
     </table:table-cell>
    </table:table-row>
""")

fun StringBuilder.zTableRow(
        name: String,
        count: Int
) = append("""    <table:table-row table:style-name="Перечень.2">
     <table:table-cell table:style-name="Перечень.A2" office:value-type="string">
      <text:p text:style-name="P8">$name</text:p>
     </table:table-cell>
     <table:table-cell table:style-name="Перечень.B2" office:value-type="string">
      <text:p text:style-name="P14">$count</text:p>
     </table:table-cell>
    </table:table-row>
""")

fun StringBuilder.zTableEmptyRow() = append("""    <table:table-row table:style-name="Перечень.2">
     <table:table-cell table:style-name="Перечень.A2" office:value-type="string">
      <text:p text:style-name="P8"/>
     </table:table-cell>
     <table:table-cell table:style-name="Перечень.B2" office:value-type="string">
      <text:p text:style-name="P14"/>
     </table:table-cell>
    </table:table-row>
""")

fun StringBuilder.zDocumentFooter() = append("""   </table:table>
  </office:text>
 </office:body>
</office:document>""")
