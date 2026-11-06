package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.view.ViewCompat;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.media.transform.lce.LceConfigDefaults;
import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.app.elements.bridges.LeapfrogSceneAssetsDownloader;
import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.here.sdk.search.PlaceCategory;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.text.StringSubstitutor;
import org.openjdk.tools.javac.code.Flags;
import org.openjdk.tools.javac.jvm.ByteCodes;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SVGParser {
    private static final String CURRENTCOLOR = "currentColor";
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;
    private static final String FEATURE_STRING_PREFIX = "http://www.w3.org/TR/SVG11/feature#";
    private static final String NONE = "none";
    private static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String TAG = "SVGParser";
    private static final String VALID_DISPLAY_VALUES = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
    private static final String VALID_VISIBILITY_VALUES = "|visible|hidden|collapse|";
    private static final String XLINK_NAMESPACE = "http://www.w3.org/1999/xlink";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";
    public static final String XML_STYLESHEET_ATTR_HREF = "href";
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";
    private static final String XML_STYLESHEET_PROCESSING_INSTRUCTION = "xml-stylesheet";
    private int ignoreDepth;
    private SVG svgDocument = null;
    private SVG.SvgContainer currentElement = null;
    private boolean ignoring = false;
    private boolean inMetadataElement = false;
    private SVGElem metadataTag = null;
    private StringBuilder metadataElementContents = null;
    private boolean inStyleElement = false;
    private StringBuilder styleElementContents = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.caverock.androidsvg.SVGParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr;
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AspectRatioKeywords {
        private static final Map<String, PreserveAspectRatio.Alignment> aspectRatioKeywords;

        static {
            HashMap hashMap = new HashMap(10);
            aspectRatioKeywords = hashMap;
            hashMap.put("none", PreserveAspectRatio.Alignment.none);
            hashMap.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            hashMap.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            hashMap.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            hashMap.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            hashMap.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            hashMap.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            hashMap.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            hashMap.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            hashMap.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        private AspectRatioKeywords() {
        }

        public static PreserveAspectRatio.Alignment get(String str) {
            return aspectRatioKeywords.get(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ColourKeywords {
        private static final Map<String, Integer> colourKeywords;

        static {
            HashMap hashMap = new HashMap(47);
            colourKeywords = hashMap;
            TableInfo$$ExternalSyntheticOutline0.m(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "aqua", (Integer) (-16711681), -8388652, "aquamarine");
            TableInfo$$ExternalSyntheticOutline0.m(-983041, hashMap, "azure", -657956, "beige");
            TableInfo$$ExternalSyntheticOutline0.m(-6972, hashMap, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
            TableInfo$$ExternalSyntheticOutline0.m(-5171, hashMap, "blanchedalmond", -16776961, "blue");
            TableInfo$$ExternalSyntheticOutline0.m(-7722014, hashMap, "blueviolet", -5952982, "brown");
            TableInfo$$ExternalSyntheticOutline0.m(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
            TableInfo$$ExternalSyntheticOutline0.m(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
            TableInfo$$ExternalSyntheticOutline0.m(-32944, hashMap, "coral", -10185235, "cornflowerblue");
            TableInfo$$ExternalSyntheticOutline0.m(-1828, hashMap, "cornsilk", -2354116, "crimson");
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "cyan", (Integer) (-16711681), -16777077, "darkblue");
            TableInfo$$ExternalSyntheticOutline0.m(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "darkgray", (Integer) (-5658199), -16751616, "darkgreen");
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "darkgrey", (Integer) (-5658199), -4343957, "darkkhaki");
            TableInfo$$ExternalSyntheticOutline0.m(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
            TableInfo$$ExternalSyntheticOutline0.m(-29696, hashMap, "darkorange", -6737204, "darkorchid");
            TableInfo$$ExternalSyntheticOutline0.m(-7667712, hashMap, "darkred", -1468806, "darksalmon");
            TableInfo$$ExternalSyntheticOutline0.m(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "darkturquoise", (Integer) (-16724271), -7077677, "darkviolet");
            TableInfo$$ExternalSyntheticOutline0.m(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "dodgerblue", (Integer) (-14774017), -5103070, "firebrick");
            TableInfo$$ExternalSyntheticOutline0.m(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "fuchsia", (Integer) (-65281), -2302756, "gainsboro");
            TableInfo$$ExternalSyntheticOutline0.m(-460545, hashMap, "ghostwhite", -10496, "gold");
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            TableInfo$$ExternalSyntheticOutline0.m(-16744448, hashMap, "green", -5374161, "greenyellow");
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "grey", (Integer) (-8355712), -983056, "honeydew");
            TableInfo$$ExternalSyntheticOutline0.m(-38476, hashMap, "hotpink", -3318692, "indianred");
            TableInfo$$ExternalSyntheticOutline0.m(-11861886, hashMap, "indigo", -16, "ivory");
            TableInfo$$ExternalSyntheticOutline0.m(-989556, hashMap, "khaki", -1644806, "lavender");
            TableInfo$$ExternalSyntheticOutline0.m(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
            TableInfo$$ExternalSyntheticOutline0.m(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
            TableInfo$$ExternalSyntheticOutline0.m(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            TableInfo$$ExternalSyntheticOutline0.m(-18751, hashMap, "lightpink", -24454, "lightsalmon");
            TableInfo$$ExternalSyntheticOutline0.m(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "lightsteelblue", (Integer) (-5192482), -32, "lightyellow");
            TableInfo$$ExternalSyntheticOutline0.m(-16711936, hashMap, "lime", -13447886, "limegreen");
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            TableInfo$$ExternalSyntheticOutline0.m(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
            TableInfo$$ExternalSyntheticOutline0.m(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
            TableInfo$$ExternalSyntheticOutline0.m(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
            TableInfo$$ExternalSyntheticOutline0.m(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
            TableInfo$$ExternalSyntheticOutline0.m(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
            TableInfo$$ExternalSyntheticOutline0.m(-15132304, hashMap, "midnightblue", -655366, "mintcream");
            TableInfo$$ExternalSyntheticOutline0.m(-6943, hashMap, "mistyrose", -6987, "moccasin");
            TableInfo$$ExternalSyntheticOutline0.m(-8531, hashMap, "navajowhite", -16777088, "navy");
            TableInfo$$ExternalSyntheticOutline0.m(-133658, hashMap, "oldlace", -8355840, "olive");
            TableInfo$$ExternalSyntheticOutline0.m(-9728477, hashMap, "olivedrab", -23296, "orange");
            TableInfo$$ExternalSyntheticOutline0.m(-47872, hashMap, "orangered", -2461482, "orchid");
            TableInfo$$ExternalSyntheticOutline0.m(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
            TableInfo$$ExternalSyntheticOutline0.m(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
            TableInfo$$ExternalSyntheticOutline0.m(-4139, hashMap, "papayawhip", -9543, "peachpuff");
            TableInfo$$ExternalSyntheticOutline0.m(-3308225, hashMap, "peru", -16181, "pink");
            TableInfo$$ExternalSyntheticOutline0.m(-2252579, hashMap, "plum", -5185306, "powderblue");
            TableInfo$$ExternalSyntheticOutline0.m(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
            TableInfo$$ExternalSyntheticOutline0.m(-65536, hashMap, "red", -4419697, "rosybrown");
            TableInfo$$ExternalSyntheticOutline0.m(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
            TableInfo$$ExternalSyntheticOutline0.m(-360334, hashMap, "salmon", -744352, "sandybrown");
            TableInfo$$ExternalSyntheticOutline0.m(-13726889, hashMap, "seagreen", -2578, "seashell");
            TableInfo$$ExternalSyntheticOutline0.m(-6270419, hashMap, "sienna", -4144960, "silver");
            TableInfo$$ExternalSyntheticOutline0.m(-7876885, hashMap, "skyblue", -9807155, "slateblue");
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, "snow", (Integer) (-1286), -16711809, "springgreen");
            TableInfo$$ExternalSyntheticOutline0.m(-12156236, hashMap, "steelblue", -2968436, "tan");
            TableInfo$$ExternalSyntheticOutline0.m(-16744320, hashMap, "teal", -2572328, "thistle");
            TableInfo$$ExternalSyntheticOutline0.m(-40121, hashMap, "tomato", -12525360, "turquoise");
            TableInfo$$ExternalSyntheticOutline0.m(-1146130, hashMap, "violet", -663885, "wheat");
            TableInfo$$ExternalSyntheticOutline0.m(-1, hashMap, "white", -657931, "whitesmoke");
            TableInfo$$ExternalSyntheticOutline0.m(-256, hashMap, "yellow", -6632142, "yellowgreen");
            hashMap.put("transparent", 0);
        }

        private ColourKeywords() {
        }

        public static Integer get(String str) {
            return colourKeywords.get(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FontSizeKeywords {
        private static final Map<String, SVG.Length> fontSizeKeywords;

        static {
            HashMap hashMap = new HashMap(9);
            fontSizeKeywords = hashMap;
            SVG.Unit unit = SVG.Unit.pt;
            hashMap.put("xx-small", new SVG.Length(0.694f, unit));
            hashMap.put("x-small", new SVG.Length(0.833f, unit));
            hashMap.put("small", new SVG.Length(10.0f, unit));
            hashMap.put(Constants.ScionAnalytics.PARAM_MEDIUM, new SVG.Length(12.0f, unit));
            hashMap.put("large", new SVG.Length(14.4f, unit));
            hashMap.put("x-large", new SVG.Length(17.3f, unit));
            hashMap.put("xx-large", new SVG.Length(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            hashMap.put("smaller", new SVG.Length(83.33f, unit2));
            hashMap.put("larger", new SVG.Length(120.0f, unit2));
        }

        private FontSizeKeywords() {
        }

        public static SVG.Length get(String str) {
            return fontSizeKeywords.get(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FontWeightKeywords {
        private static final Map<String, Integer> fontWeightKeywords;

        static {
            HashMap hashMap = new HashMap(13);
            fontWeightKeywords = hashMap;
            hashMap.put(BaseTemplateProvider.NON_INVITATION_KEY, 400);
            hashMap.put("bold", 700);
            TableInfo$$ExternalSyntheticOutline0.m(1, hashMap, "bolder", -1, "lighter");
            TableInfo$$ExternalSyntheticOutline0.m(100, hashMap, PlaceCategory.EAT_AND_DRINK, 200, "200");
            hashMap.put(PlaceCategory.SIGHTS_AND_MUSEUMS, 300);
            hashMap.put(PlaceCategory.TRANSPORT, 400);
            TableInfo$$ExternalSyntheticOutline0.m(500, hashMap, PlaceCategory.ACCOMMODATION, 600, PlaceCategory.SHOPPING);
            TableInfo$$ExternalSyntheticOutline0.m(hashMap, PlaceCategory.BUSINESS_AND_SERVICES, (Integer) 700, 800, PlaceCategory.FACILITIES);
            hashMap.put(PlaceCategory.AREAS_AND_BUILDINGS, 900);
        }

        private FontWeightKeywords() {
        }

        public static Integer get(String str) {
            return fontWeightKeywords.get(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, SVGAttr> cache = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put(RoadProbe.CLASS_PROPERTY, sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, SVGElem> cache = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    private void appendToTextContainer(String str) throws SVGParseException {
        SVG.SvgConditionalContainer svgConditionalContainer = (SVG.SvgConditionalContainer) this.currentElement;
        int size = svgConditionalContainer.children.size();
        SVG.SvgObject svgObject = size == 0 ? null : svgConditionalContainer.children.get(size - 1);
        if (!(svgObject instanceof SVG.TextSequence)) {
            this.currentElement.addChild(new SVG.TextSequence(str));
        } else {
            SVG.TextSequence textSequence = (SVG.TextSequence) svgObject;
            textSequence.text = a$$ExternalSyntheticOutline0.m(new StringBuilder(), textSequence.text, str);
        }
    }

    private void circle(Attributes attributes) throws SVGParseException {
        debug("<circle>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Circle circle = new SVG.Circle();
        circle.document = this.svgDocument;
        circle.parent = this.currentElement;
        parseAttributesCore(circle, attributes);
        parseAttributesStyle(circle, attributes);
        parseAttributesTransform(circle, attributes);
        parseAttributesConditional(circle, attributes);
        parseAttributesCircle(circle, attributes);
        this.currentElement.addChild(circle);
    }

    private static int clamp255(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private void clipPath(Attributes attributes) throws SVGParseException {
        debug("<clipPath>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.ClipPath clipPath = new SVG.ClipPath();
        clipPath.document = this.svgDocument;
        clipPath.parent = this.currentElement;
        parseAttributesCore(clipPath, attributes);
        parseAttributesStyle(clipPath, attributes);
        parseAttributesTransform(clipPath, attributes);
        parseAttributesConditional(clipPath, attributes);
        parseAttributesClipPath(clipPath, attributes);
        this.currentElement.addChild(clipPath);
        this.currentElement = clipPath;
    }

    private void defs(Attributes attributes) throws SVGParseException {
        debug("<defs>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Defs defs = new SVG.Defs();
        defs.document = this.svgDocument;
        defs.parent = this.currentElement;
        parseAttributesCore(defs, attributes);
        parseAttributesStyle(defs, attributes);
        parseAttributesTransform(defs, attributes);
        this.currentElement.addChild(defs);
        this.currentElement = defs;
    }

    private void dumpNode(SVG.SvgObject svgObject, String str) {
        Objects.toString(svgObject);
        if (svgObject instanceof SVG.SvgConditionalContainer) {
            String m = BitVector$$ExternalSyntheticOutline0.m(str, "  ");
            Iterator<SVG.SvgObject> it2 = ((SVG.SvgConditionalContainer) svgObject).children.iterator();
            while (it2.hasNext()) {
                dumpNode(it2.next(), m);
            }
        }
    }

    private void ellipse(Attributes attributes) throws SVGParseException {
        debug("<ellipse>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Ellipse ellipse = new SVG.Ellipse();
        ellipse.document = this.svgDocument;
        ellipse.parent = this.currentElement;
        parseAttributesCore(ellipse, attributes);
        parseAttributesStyle(ellipse, attributes);
        parseAttributesTransform(ellipse, attributes);
        parseAttributesConditional(ellipse, attributes);
        parseAttributesEllipse(ellipse, attributes);
        this.currentElement.addChild(ellipse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endElement(String str, String str2, String str3) throws SVGParseException {
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
                return;
            }
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.fromString(str2).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
                switch (i2) {
                    case 22:
                    case 23:
                        this.inMetadataElement = false;
                        StringBuilder sb = this.metadataElementContents;
                        if (sb != null) {
                            SVGElem sVGElem = this.metadataTag;
                            if (sVGElem == SVGElem.title) {
                                this.svgDocument.setTitle(sb.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.svgDocument.setDesc(sb.toString());
                            }
                            this.metadataElementContents.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.styleElementContents;
                        if (sb2 != null) {
                            this.inStyleElement = false;
                            parseCSSStyleSheet(sb2.toString());
                            this.styleElementContents.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.currentElement = ((SVG.SvgObject) this.currentElement).parent;
        }
    }

    private void g(Attributes attributes) throws SVGParseException {
        debug("<g>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Group group = new SVG.Group();
        group.document = this.svgDocument;
        group.parent = this.currentElement;
        parseAttributesCore(group, attributes);
        parseAttributesStyle(group, attributes);
        parseAttributesTransform(group, attributes);
        parseAttributesConditional(group, attributes);
        this.currentElement.addChild(group);
        this.currentElement = group;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProcessingInstruction(String str, Map<String, String> map) {
        String str2;
        String resolveCSSStyleSheet;
        if (!str.equals(XML_STYLESHEET_PROCESSING_INSTRUCTION) || SVG.getFileResolver() == null) {
            return;
        }
        if (map.get("type") == null || "text/css".equals(map.get("type"))) {
            if ((map.get(XML_STYLESHEET_ATTR_ALTERNATE) != null && !"no".equals(map.get(XML_STYLESHEET_ATTR_ALTERNATE))) || (str2 = map.get(XML_STYLESHEET_ATTR_HREF)) == null || (resolveCSSStyleSheet = SVG.getFileResolver().resolveCSSStyleSheet(str2)) == null) {
                return;
            }
            String str3 = map.get("media");
            if (str3 != null && !"all".equals(str3.trim())) {
                resolveCSSStyleSheet = a$$ExternalSyntheticOutline0.m("@media ", str3, " { ", resolveCSSStyleSheet, StringSubstitutor.DEFAULT_VAR_END);
            }
            parseCSSStyleSheet(resolveCSSStyleSheet);
        }
    }

    private static int hslToRgb(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return clamp255(hueToRgb(f10, f9, f5 - 2.0f) * 256.0f) | (clamp255(hueToRgb(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (clamp255(hueToRgb(f10, f9, f5) * 256.0f) << 8);
    }

    private static float hueToRgb(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? ErrorUtils$$ExternalSyntheticOutline0.m(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? ErrorUtils$$ExternalSyntheticOutline0.m(4.0f, f3, f2 - f, f) : f;
    }

    private void image(Attributes attributes) throws SVGParseException {
        debug("<image>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Image image = new SVG.Image();
        image.document = this.svgDocument;
        image.parent = this.currentElement;
        parseAttributesCore(image, attributes);
        parseAttributesStyle(image, attributes);
        parseAttributesTransform(image, attributes);
        parseAttributesConditional(image, attributes);
        parseAttributesImage(image, attributes);
        this.currentElement.addChild(image);
        this.currentElement = image;
    }

    private void line(Attributes attributes) throws SVGParseException {
        debug("<line>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Line line = new SVG.Line();
        line.document = this.svgDocument;
        line.parent = this.currentElement;
        parseAttributesCore(line, attributes);
        parseAttributesStyle(line, attributes);
        parseAttributesTransform(line, attributes);
        parseAttributesConditional(line, attributes);
        parseAttributesLine(line, attributes);
        this.currentElement.addChild(line);
    }

    private void linearGradient(Attributes attributes) throws SVGParseException {
        debug("<linearGradient>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.SvgLinearGradient svgLinearGradient = new SVG.SvgLinearGradient();
        svgLinearGradient.document = this.svgDocument;
        svgLinearGradient.parent = this.currentElement;
        parseAttributesCore(svgLinearGradient, attributes);
        parseAttributesStyle(svgLinearGradient, attributes);
        parseAttributesGradient(svgLinearGradient, attributes);
        parseAttributesLinearGradient(svgLinearGradient, attributes);
        this.currentElement.addChild(svgLinearGradient);
        this.currentElement = svgLinearGradient;
    }

    private void marker(Attributes attributes) throws SVGParseException {
        debug("<marker>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Marker marker = new SVG.Marker();
        marker.document = this.svgDocument;
        marker.parent = this.currentElement;
        parseAttributesCore(marker, attributes);
        parseAttributesStyle(marker, attributes);
        parseAttributesConditional(marker, attributes);
        parseAttributesViewBox(marker, attributes);
        parseAttributesMarker(marker, attributes);
        this.currentElement.addChild(marker);
        this.currentElement = marker;
    }

    private void mask(Attributes attributes) throws SVGParseException {
        debug("<mask>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Mask mask = new SVG.Mask();
        mask.document = this.svgDocument;
        mask.parent = this.currentElement;
        parseAttributesCore(mask, attributes);
        parseAttributesStyle(mask, attributes);
        parseAttributesConditional(mask, attributes);
        parseAttributesMask(mask, attributes);
        this.currentElement.addChild(mask);
        this.currentElement = mask;
    }

    private void parseAttributesCircle(SVG.Circle circle, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    circle.cx = parseLength(trim);
                    break;
                case 13:
                    circle.cy = parseLength(trim);
                    break;
                case 14:
                    SVG.Length parseLength = parseLength(trim);
                    circle.r = parseLength;
                    if (parseLength.isNegative()) {
                        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <circle> element. r cannot be negative");
                        return;
                    }
                    break;
            }
        }
    }

    private void parseAttributesClipPath(SVG.ClipPath clipPath, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    clipPath.clipPathUnitsAreUser = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid value for attribute clipPathUnits");
                        return;
                    }
                    clipPath.clipPathUnitsAreUser = Boolean.TRUE;
                }
            }
        }
    }

    private void parseAttributesConditional(SVG.SvgConditional svgConditional, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    svgConditional.setRequiredFeatures(parseRequiredFeatures(trim));
                    break;
                case 22:
                    svgConditional.setRequiredExtensions(trim);
                    break;
                case 23:
                    svgConditional.setSystemLanguage(parseSystemLanguage(trim));
                    break;
                case 24:
                    svgConditional.setRequiredFormats(parseRequiredFormats(trim));
                    break;
                case 25:
                    List<String> parseFontFamily = parseFontFamily(trim);
                    svgConditional.setRequiredFonts(parseFontFamily != null ? new HashSet(parseFontFamily) : new HashSet(0));
                    break;
            }
        }
    }

    private void parseAttributesCore(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.id = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    svgElementBase.spacePreserve = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    svgElementBase.spacePreserve = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    private void parseAttributesEllipse(SVG.Ellipse ellipse, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    SVG.Length parseLength = parseLength(trim);
                    ellipse.f1130rx = parseLength;
                    if (parseLength.isNegative()) {
                        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <ellipse> element. rx cannot be negative");
                        return;
                    }
                    break;
                case 11:
                    SVG.Length parseLength2 = parseLength(trim);
                    ellipse.ry = parseLength2;
                    if (parseLength2.isNegative()) {
                        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <ellipse> element. ry cannot be negative");
                        return;
                    }
                    break;
                case 12:
                    ellipse.cx = parseLength(trim);
                    break;
                case 13:
                    ellipse.cy = parseLength(trim);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseAttributesGradient(com.caverock.androidsvg.SVG.GradientElement r5, org.xml.sax.Attributes r6) throws com.caverock.androidsvg.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L7f
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L62
            switch(r2) {
                case 32: goto L42;
                case 33: goto L3b;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L7c
        L26:
            com.caverock.androidsvg.SVG$GradientSpread r2 = com.caverock.androidsvg.SVG.GradientSpread.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.spreadMethod = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L7c
        L2d:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r5 = "Invalid spreadMethod attribute. \""
            java.lang.String r6 = "\" is not a valid value."
            java.lang.String r5 = defpackage.a$$ExternalSyntheticOutline0.m(r5, r1, r6)
            r4.<init>(r5)
            throw r4
        L3b:
            android.graphics.Matrix r1 = r4.parseTransformList(r1)
            r5.gradientTransform = r1
            goto L7c
        L42:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L4f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.gradientUnitsAreUser = r1
            goto L7c
        L4f:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L5c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.gradientUnitsAreUser = r1
            goto L7c
        L5c:
            java.lang.String r4 = "Invalid value for attribute gradientUnits"
            com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0.m$3(r4)
            return
        L62:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L7c
        L7a:
            r5.href = r1
        L7c:
            int r0 = r0 + 1
            goto L1
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesGradient(com.caverock.androidsvg.SVG$GradientElement, org.xml.sax.Attributes):void");
    }

    private void parseAttributesImage(SVG.Image image, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                image.x = parseLength(trim);
            } else if (i2 == 2) {
                image.y = parseLength(trim);
            } else if (i2 == 3) {
                SVG.Length parseLength = parseLength(trim);
                image.width = parseLength;
                if (parseLength.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <use> element. width cannot be negative");
                    return;
                }
            } else if (i2 == 4) {
                SVG.Length parseLength2 = parseLength(trim);
                image.height = parseLength2;
                if (parseLength2.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <use> element. height cannot be negative");
                    return;
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    parsePreserveAspectRatio(image, trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                image.href = trim;
            }
        }
    }

    private void parseAttributesLine(SVG.Line line, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    line.x1 = parseLength(trim);
                    break;
                case 16:
                    line.y1 = parseLength(trim);
                    break;
                case 17:
                    line.x2 = parseLength(trim);
                    break;
                case 18:
                    line.y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void parseAttributesLinearGradient(SVG.SvgLinearGradient svgLinearGradient, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    svgLinearGradient.x1 = parseLength(trim);
                    break;
                case 16:
                    svgLinearGradient.y1 = parseLength(trim);
                    break;
                case 17:
                    svgLinearGradient.x2 = parseLength(trim);
                    break;
                case 18:
                    svgLinearGradient.y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void parseAttributesMarker(SVG.Marker marker, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    marker.refX = parseLength(trim);
                    break;
                case 27:
                    marker.refY = parseLength(trim);
                    break;
                case 28:
                    SVG.Length parseLength = parseLength(trim);
                    marker.markerWidth = parseLength;
                    if (parseLength.isNegative()) {
                        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <marker> element. markerWidth cannot be negative");
                        return;
                    }
                    break;
                case 29:
                    SVG.Length parseLength2 = parseLength(trim);
                    marker.markerHeight = parseLength2;
                    if (parseLength2.isNegative()) {
                        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <marker> element. markerHeight cannot be negative");
                        return;
                    }
                    break;
                case 30:
                    if (!ReactProperties.HereMapPolyline.STROKE_WIDTH.equals(trim)) {
                        if ("userSpaceOnUse".equals(trim)) {
                            marker.markerUnitsAreUser = true;
                            break;
                        } else {
                            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid value for attribute markerUnits");
                            return;
                        }
                    } else {
                        marker.markerUnitsAreUser = false;
                        break;
                    }
                case 31:
                    if ("auto".equals(trim)) {
                        marker.orient = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        marker.orient = Float.valueOf(parseFloat(trim));
                        break;
                    }
            }
        }
    }

    private void parseAttributesMask(SVG.Mask mask, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                mask.x = parseLength(trim);
            } else if (i2 == 2) {
                mask.y = parseLength(trim);
            } else if (i2 == 3) {
                SVG.Length parseLength = parseLength(trim);
                mask.width = parseLength;
                if (parseLength.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <mask> element. width cannot be negative");
                    return;
                }
            } else if (i2 == 4) {
                SVG.Length parseLength2 = parseLength(trim);
                mask.height = parseLength2;
                if (parseLength2.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <mask> element. height cannot be negative");
                    return;
                }
            } else if (i2 != 43) {
                if (i2 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    mask.maskContentUnitsAreUser = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid value for attribute maskContentUnits");
                        return;
                    }
                    mask.maskContentUnitsAreUser = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                mask.maskUnitsAreUser = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid value for attribute maskUnits");
                    return;
                }
                mask.maskUnitsAreUser = Boolean.TRUE;
            }
        }
    }

    private void parseAttributesPath(SVG.Path path, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 8) {
                path.d = parsePath(trim);
            } else if (i2 != 9) {
                continue;
            } else {
                Float valueOf = Float.valueOf(parseFloat(trim));
                path.pathLength = valueOf;
                if (valueOf.floatValue() < 0.0f) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <path> element. pathLength cannot be negative");
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseAttributesPattern(com.caverock.androidsvg.SVG.Pattern r6, org.xml.sax.Attributes r7) throws com.caverock.androidsvg.SVGParseException {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r7.getLength()
            if (r0 >= r1) goto Lcb
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r3 = r7.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto Lc1
            r3 = 2
            if (r2 == r3) goto Lba
            r3 = 3
            if (r2 == r3) goto La7
            r3 = 4
            if (r2 == r3) goto L94
            r3 = 6
            if (r2 == r3) goto L79
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            switch(r2) {
                case 40: goto L5d;
                case 41: goto L3f;
                case 42: goto L37;
                default: goto L35;
            }
        L35:
            goto Lc7
        L37:
            android.graphics.Matrix r1 = r5.parseTransformList(r1)
            r6.patternTransform = r1
            goto Lc7
        L3f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.patternContentUnitsAreUser = r1
            goto Lc7
        L4b:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.patternContentUnitsAreUser = r1
            goto Lc7
        L57:
            java.lang.String r5 = "Invalid value for attribute patternContentUnits"
            com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0.m$3(r5)
            return
        L5d:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L68
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.patternUnitsAreUser = r1
            goto Lc7
        L68:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L73
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.patternUnitsAreUser = r1
            goto Lc7
        L73:
            java.lang.String r5 = "Invalid value for attribute patternUnits"
            com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0.m$3(r5)
            return
        L79:
            java.lang.String r2 = ""
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L91
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lc7
        L91:
            r6.href = r1
            goto Lc7
        L94:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r6.height = r1
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto La1
            goto Lc7
        La1:
            java.lang.String r5 = "Invalid <pattern> element. height cannot be negative"
            com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0.m$3(r5)
            return
        La7:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r6.width = r1
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto Lb4
            goto Lc7
        Lb4:
            java.lang.String r5 = "Invalid <pattern> element. width cannot be negative"
            com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0.m$3(r5)
            return
        Lba:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r6.y = r1
            goto Lc7
        Lc1:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r6.x = r1
        Lc7:
            int r0 = r0 + 1
            goto L1
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesPattern(com.caverock.androidsvg.SVG$Pattern, org.xml.sax.Attributes):void");
    }

    private void parseAttributesPolyLine(SVG.PolyLine polyLine, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float nextFloat = textScanner.nextFloat();
                    if (Float.isNaN(nextFloat)) {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    textScanner.skipCommaWhitespace();
                    float nextFloat2 = textScanner.nextFloat();
                    if (Float.isNaN(nextFloat2)) {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    textScanner.skipCommaWhitespace();
                    arrayList.add(Float.valueOf(nextFloat));
                    arrayList.add(Float.valueOf(nextFloat2));
                }
                polyLine.points = new float[arrayList.size()];
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    polyLine.points[i2] = ((Float) it2.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseAttributesRadialGradient(com.caverock.androidsvg.SVG.SvgRadialGradient r4, org.xml.sax.Attributes r5) throws com.caverock.androidsvg.SVGParseException {
        /*
            r3 = this;
            r3 = 0
        L1:
            int r0 = r5.getLength()
            if (r3 >= r0) goto L5c
            java.lang.String r0 = r5.getValue(r3)
            java.lang.String r0 = r0.trim()
            int[] r1 = com.caverock.androidsvg.SVGParser.AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r2 = r5.getLocalName(r3)
            com.caverock.androidsvg.SVGParser$SVGAttr r2 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r2)
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 35
            if (r1 == r2) goto L53
            r2 = 36
            if (r1 == r2) goto L4c
            switch(r1) {
                case 12: goto L45;
                case 13: goto L3e;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L59
        L2b:
            com.caverock.androidsvg.SVG$Length r0 = parseLength(r0)
            r4.r = r0
            boolean r0 = r0.isNegative()
            if (r0 != 0) goto L38
            goto L59
        L38:
            java.lang.String r3 = "Invalid <radialGradient> element. r cannot be negative"
            com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0.m$3(r3)
            return
        L3e:
            com.caverock.androidsvg.SVG$Length r0 = parseLength(r0)
            r4.cy = r0
            goto L59
        L45:
            com.caverock.androidsvg.SVG$Length r0 = parseLength(r0)
            r4.cx = r0
            goto L59
        L4c:
            com.caverock.androidsvg.SVG$Length r0 = parseLength(r0)
            r4.fy = r0
            goto L59
        L53:
            com.caverock.androidsvg.SVG$Length r0 = parseLength(r0)
            r4.fx = r0
        L59:
            int r3 = r3 + 1
            goto L1
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesRadialGradient(com.caverock.androidsvg.SVG$SvgRadialGradient, org.xml.sax.Attributes):void");
    }

    private void parseAttributesRect(SVG.Rect rect, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                rect.x = parseLength(trim);
            } else if (i2 == 2) {
                rect.y = parseLength(trim);
            } else if (i2 == 3) {
                SVG.Length parseLength = parseLength(trim);
                rect.width = parseLength;
                if (parseLength.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <rect> element. width cannot be negative");
                    return;
                }
            } else if (i2 == 4) {
                SVG.Length parseLength2 = parseLength(trim);
                rect.height = parseLength2;
                if (parseLength2.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <rect> element. height cannot be negative");
                    return;
                }
            } else if (i2 == 10) {
                SVG.Length parseLength3 = parseLength(trim);
                rect.f1131rx = parseLength3;
                if (parseLength3.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <rect> element. rx cannot be negative");
                    return;
                }
            } else if (i2 != 11) {
                continue;
            } else {
                SVG.Length parseLength4 = parseLength(trim);
                rect.ry = parseLength4;
                if (parseLength4.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <rect> element. ry cannot be negative");
                    return;
                }
            }
        }
    }

    private void parseAttributesSVG(SVG.Svg svg, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                svg.x = parseLength(trim);
            } else if (i2 == 2) {
                svg.y = parseLength(trim);
            } else if (i2 == 3) {
                SVG.Length parseLength = parseLength(trim);
                svg.width = parseLength;
                if (parseLength.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <svg> element. width cannot be negative");
                    return;
                }
            } else if (i2 == 4) {
                SVG.Length parseLength2 = parseLength(trim);
                svg.height = parseLength2;
                if (parseLength2.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <svg> element. height cannot be negative");
                    return;
                }
            } else if (i2 == 5) {
                svg.version = trim;
            }
        }
    }

    private void parseAttributesStop(SVG.Stop stop, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 37) {
                stop.offset = parseGradientOffset(trim);
            }
        }
    }

    private void parseAttributesStyle(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    parseStyle(svgElementBase, trim);
                } else if (i2 != 46) {
                    if (svgElementBase.baseStyle == null) {
                        svgElementBase.baseStyle = new SVG.Style();
                    }
                    processStyleProperty(svgElementBase.baseStyle, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    svgElementBase.classNames = CSSParser.parseClassAttribute(trim);
                }
            }
        }
    }

    private void parseAttributesTRef(SVG.TRef tRef, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                tRef.href = trim;
            }
        }
    }

    private void parseAttributesTextPath(SVG.TextPath textPath, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    textPath.startOffset = parseLength(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                textPath.href = trim;
            }
        }
    }

    private void parseAttributesTextPosition(SVG.TextPositionedContainer textPositionedContainer, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                textPositionedContainer.x = parseLengthList(trim);
            } else if (i2 == 2) {
                textPositionedContainer.y = parseLengthList(trim);
            } else if (i2 == 19) {
                textPositionedContainer.dx = parseLengthList(trim);
            } else if (i2 == 20) {
                textPositionedContainer.dy = parseLengthList(trim);
            }
        }
    }

    private void parseAttributesTransform(SVG.HasTransform hasTransform, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                hasTransform.setTransform(parseTransformList(attributes.getValue(i)));
            }
        }
    }

    private void parseAttributesUse(SVG.Use use, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                use.x = parseLength(trim);
            } else if (i2 == 2) {
                use.y = parseLength(trim);
            } else if (i2 == 3) {
                SVG.Length parseLength = parseLength(trim);
                use.width = parseLength;
                if (parseLength.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <use> element. width cannot be negative");
                    return;
                }
            } else if (i2 == 4) {
                SVG.Length parseLength2 = parseLength(trim);
                use.height = parseLength2;
                if (parseLength2.isNegative()) {
                    Classes$$ExternalSyntheticBUOutline0.m$3("Invalid <use> element. height cannot be negative");
                    return;
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                use.href = trim;
            }
        }
    }

    private void parseAttributesViewBox(SVG.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                parsePreserveAspectRatio(svgViewBoxContainer, trim);
            } else if (i2 == 87) {
                svgViewBoxContainer.viewBox = parseViewBox(trim);
            }
        }
    }

    private void parseCSSStyleSheet(String str) {
        this.svgDocument.addCSSRules(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).parse(str));
    }

    private static SVG.CSSClipRect parseClip(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        TextScanner textScanner = new TextScanner(str.substring(5));
        textScanner.skipWhitespace();
        SVG.Length parseLengthOrAuto = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto2 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto3 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto4 = parseLengthOrAuto(textScanner);
        textScanner.skipWhitespace();
        if (textScanner.consume(')') || textScanner.empty()) {
            return new SVG.CSSClipRect(parseLengthOrAuto, parseLengthOrAuto2, parseLengthOrAuto3, parseLengthOrAuto4);
        }
        return null;
    }

    private static SVG.Colour parseColour(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            IntegerParser parseHex = IntegerParser.parseHex(str, 1, str.length());
            if (parseHex == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            int endPos = parseHex.getEndPos();
            if (endPos == 4) {
                int value = parseHex.value();
                int i = value & 3840;
                int i2 = value & 240;
                int i3 = value & 15;
                return new SVG.Colour(i3 | (i << 8) | (-16777216) | (i << 12) | (i2 << 8) | (i2 << 4) | (i3 << 4));
            }
            if (endPos != 5) {
                if (endPos == 7) {
                    return new SVG.Colour(parseHex.value() | ViewCompat.MEASURED_STATE_MASK);
                }
                if (endPos == 9) {
                    return new SVG.Colour((parseHex.value() >>> 8) | (parseHex.value() << 24));
                }
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            int value2 = parseHex.value();
            int i4 = 61440 & value2;
            int i5 = value2 & 3840;
            int i6 = value2 & 240;
            int i7 = value2 & 15;
            return new SVG.Colour((i7 << 24) | (i7 << 28) | (i4 << 8) | (i4 << 4) | (i5 << 4) | i5 | i6 | (i6 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return parseColourKeyword(lowerCase);
            }
            TextScanner textScanner = new TextScanner(str.substring(startsWith2 ? 5 : 4));
            textScanner.skipWhitespace();
            float nextFloat = textScanner.nextFloat();
            float checkedNextFloat = textScanner.checkedNextFloat(nextFloat);
            if (!Float.isNaN(checkedNextFloat)) {
                textScanner.consume('%');
            }
            float checkedNextFloat2 = textScanner.checkedNextFloat(checkedNextFloat);
            if (!Float.isNaN(checkedNextFloat2)) {
                textScanner.consume('%');
            }
            if (!startsWith2) {
                textScanner.skipWhitespace();
                if (Float.isNaN(checkedNextFloat2) || !textScanner.consume(')')) {
                    throw new SVGParseException("Bad hsl() colour value: ".concat(str));
                }
                return new SVG.Colour(hslToRgb(nextFloat, checkedNextFloat, checkedNextFloat2) | ViewCompat.MEASURED_STATE_MASK);
            }
            float checkedNextFloat3 = textScanner.checkedNextFloat(checkedNextFloat2);
            textScanner.skipWhitespace();
            if (Float.isNaN(checkedNextFloat3) || !textScanner.consume(')')) {
                throw new SVGParseException("Bad hsla() colour value: ".concat(str));
            }
            return new SVG.Colour((clamp255(checkedNextFloat3 * 256.0f) << 24) | hslToRgb(nextFloat, checkedNextFloat, checkedNextFloat2));
        }
        TextScanner textScanner2 = new TextScanner(str.substring(startsWith ? 5 : 4));
        textScanner2.skipWhitespace();
        float nextFloat2 = textScanner2.nextFloat();
        if (!Float.isNaN(nextFloat2) && textScanner2.consume('%')) {
            nextFloat2 = (nextFloat2 * 256.0f) / 100.0f;
        }
        float checkedNextFloat4 = textScanner2.checkedNextFloat(nextFloat2);
        if (!Float.isNaN(checkedNextFloat4) && textScanner2.consume('%')) {
            checkedNextFloat4 = (checkedNextFloat4 * 256.0f) / 100.0f;
        }
        float checkedNextFloat5 = textScanner2.checkedNextFloat(checkedNextFloat4);
        if (!Float.isNaN(checkedNextFloat5) && textScanner2.consume('%')) {
            checkedNextFloat5 = (checkedNextFloat5 * 256.0f) / 100.0f;
        }
        if (!startsWith) {
            textScanner2.skipWhitespace();
            if (Float.isNaN(checkedNextFloat5) || !textScanner2.consume(')')) {
                throw new SVGParseException("Bad rgb() colour value: ".concat(str));
            }
            return new SVG.Colour((clamp255(nextFloat2) << 16) | ViewCompat.MEASURED_STATE_MASK | (clamp255(checkedNextFloat4) << 8) | clamp255(checkedNextFloat5));
        }
        float checkedNextFloat6 = textScanner2.checkedNextFloat(checkedNextFloat5);
        textScanner2.skipWhitespace();
        if (Float.isNaN(checkedNextFloat6) || !textScanner2.consume(')')) {
            throw new SVGParseException("Bad rgba() colour value: ".concat(str));
        }
        return new SVG.Colour((clamp255(checkedNextFloat6 * 256.0f) << 24) | (clamp255(nextFloat2) << 16) | (clamp255(checkedNextFloat4) << 8) | clamp255(checkedNextFloat5));
    }

    private static SVG.Colour parseColourKeyword(String str) throws SVGParseException {
        Integer num = ColourKeywords.get(str);
        if (num != null) {
            return new SVG.Colour(num.intValue());
        }
        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid colour keyword: ", str));
    }

    private static SVG.SvgPaint parseColourSpecifer(String str) {
        str.getClass();
        if (str.equals("none")) {
            return SVG.Colour.TRANSPARENT;
        }
        if (str.equals(CURRENTCOLOR)) {
            return SVG.CurrentColor.getInstance();
        }
        try {
            return parseColour(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static SVG.Style.FillRule parseFillRule(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    private static float parseFloat(String str, int i, int i2) throws SVGParseException {
        float parseNumber = new NumberParser().parseNumber(str, i, i2);
        if (Float.isNaN(parseNumber)) {
            throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid float value: ", str));
        }
        return parseNumber;
    }

    private static void parseFont(SVG.Style style, String str) {
        String nextToken;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str + '|')) {
            TextScanner textScanner = new TextScanner(str);
            Integer num = null;
            SVG.Style.FontStyle fontStyle = null;
            String str2 = null;
            while (true) {
                nextToken = textScanner.nextToken('/');
                textScanner.skipWhitespace();
                if (nextToken != null) {
                    if (num != null && fontStyle != null) {
                        break;
                    }
                    if (!nextToken.equals(BaseTemplateProvider.NON_INVITATION_KEY) && (num != null || (num = FontWeightKeywords.get(nextToken)) == null)) {
                        if (fontStyle != null || (fontStyle = parseFontStyle(nextToken)) == null) {
                            if (str2 != null || !nextToken.equals("small-caps")) {
                                break;
                            } else {
                                str2 = nextToken;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            SVG.Length parseFontSize = parseFontSize(nextToken);
            if (textScanner.consume('/')) {
                textScanner.skipWhitespace();
                String nextToken2 = textScanner.nextToken();
                if (nextToken2 != null) {
                    try {
                        parseLength(nextToken2);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                textScanner.skipWhitespace();
            }
            style.fontFamily = parseFontFamily(textScanner.restOfText());
            style.fontSize = parseFontSize;
            style.fontWeight = Integer.valueOf(num == null ? 400 : num.intValue());
            if (fontStyle == null) {
                fontStyle = SVG.Style.FontStyle.Normal;
            }
            style.fontStyle = fontStyle;
            style.specifiedFlags |= 122880;
        }
    }

    private static List<String> parseFontFamily(String str) {
        TextScanner textScanner = new TextScanner(str);
        ArrayList arrayList = null;
        do {
            String nextQuotedString = textScanner.nextQuotedString();
            if (nextQuotedString == null) {
                nextQuotedString = textScanner.nextTokenWithWhitespace(AbstractJsonLexerKt.COMMA);
            }
            if (nextQuotedString == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextQuotedString);
            textScanner.skipCommaWhitespace();
        } while (!textScanner.empty());
        return arrayList;
    }

    private static SVG.Length parseFontSize(String str) {
        try {
            SVG.Length length = FontSizeKeywords.get(str);
            return length == null ? parseLength(str) : length;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static SVG.Style.FontStyle parseFontStyle(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return SVG.Style.FontStyle.Oblique;
            case "italic":
                return SVG.Style.FontStyle.Italic;
            case "normal":
                return SVG.Style.FontStyle.Normal;
            default:
                return null;
        }
    }

    private static Integer parseFontWeight(String str) {
        return FontWeightKeywords.get(str);
    }

    private static String parseFunctionalIRI(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(MarkdownConstants.RIGHT_PARENTHESIS) ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private Float parseGradientOffset(String str) throws SVGParseException {
        if (str.length() == 0) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid offset value in <stop> (empty string)");
            return null;
        }
        int length = str.length();
        boolean z = true;
        if (AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float parseFloat = parseFloat(str, 0, length);
            float f = 100.0f;
            if (z) {
                parseFloat /= 100.0f;
            }
            if (parseFloat < 0.0f) {
                f = 0.0f;
            } else if (parseFloat <= 100.0f) {
                f = parseFloat;
            }
            return Float.valueOf(f);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid offset value in <stop>: ".concat(str), e);
        }
    }

    public static SVG.Length parseLength(String str) throws SVGParseException {
        if (str.length() == 0) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        SVG.Unit unit = SVG.Unit.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            unit = SVG.Unit.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unit = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new SVG.Length(parseFloat(str, 0, length), unit);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: ".concat(str), e);
        }
    }

    private static List<SVG.Length> parseLengthList(String str) throws SVGParseException {
        if (str.length() == 0) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            float nextFloat = textScanner.nextFloat();
            if (Float.isNaN(nextFloat)) {
                throw new SVGParseException("Invalid length list value: " + textScanner.ahead());
            }
            SVG.Unit nextUnit = textScanner.nextUnit();
            if (nextUnit == null) {
                nextUnit = SVG.Unit.px;
            }
            arrayList.add(new SVG.Length(nextFloat, nextUnit));
            textScanner.skipCommaWhitespace();
        }
        return arrayList;
    }

    private static SVG.Length parseLengthOrAuto(TextScanner textScanner) {
        return textScanner.consume("auto") ? new SVG.Length(0.0f) : textScanner.nextLength();
    }

    private static Float parseOpacity(String str) {
        try {
            float parseFloat = parseFloat(str);
            float f = 0.0f;
            if (parseFloat >= 0.0f) {
                f = 1.0f;
                if (parseFloat > 1.0f) {
                }
                return Float.valueOf(parseFloat);
            }
            parseFloat = f;
            return Float.valueOf(parseFloat);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static Boolean parseOverflow(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static SVG.SvgPaint parsePaintSpecifier(String str) {
        if (!str.startsWith("url(")) {
            return parseColourSpecifer(str);
        }
        int indexOf = str.indexOf(MarkdownConstants.RIGHT_PARENTHESIS);
        if (indexOf == -1) {
            return new SVG.PaintReference(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new SVG.PaintReference(trim, trim2.length() > 0 ? parseColourSpecifer(trim2) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0268 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.caverock.androidsvg.SVG.PathDefinition parsePath(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parsePath(java.lang.String):com.caverock.androidsvg.SVG$PathDefinition");
    }

    public static PreserveAspectRatio parsePreserveAspectRatio(String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        String nextToken = textScanner.nextToken();
        if ("defer".equals(nextToken)) {
            textScanner.skipWhitespace();
            nextToken = textScanner.nextToken();
        }
        PreserveAspectRatio.Alignment alignment = AspectRatioKeywords.get(nextToken);
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            scale = null;
        } else {
            String nextToken2 = textScanner.nextToken();
            nextToken2.getClass();
            if (nextToken2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!nextToken2.equals("slice")) {
                    throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid preserveAspectRatio definition: ", str));
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignment, scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> parseProcessingInstructionAttributes(TextScanner textScanner) {
        HashMap hashMap = new HashMap();
        textScanner.skipWhitespace();
        String nextToken = textScanner.nextToken('=');
        while (nextToken != null) {
            textScanner.consume('=');
            hashMap.put(nextToken, textScanner.nextQuotedString());
            textScanner.skipWhitespace();
            nextToken = textScanner.nextToken('=');
        }
        return hashMap;
    }

    private static SVG.Style.RenderQuality parseRenderQuality(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return SVG.Style.RenderQuality.optimizeQuality;
            case "auto":
                return SVG.Style.RenderQuality.auto;
            case "optimizeSpeed":
                return SVG.Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set<String> parseRequiredFeatures(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            if (nextToken.startsWith(FEATURE_STRING_PREFIX)) {
                hashSet.add(nextToken.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseRequiredFormats(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            hashSet.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static SVG.Length[] parseStrokeDashArray(String str) {
        SVG.Length nextLength;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty() || (nextLength = textScanner.nextLength()) == null || nextLength.isNegative()) {
            return null;
        }
        float floatValue = nextLength.floatValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nextLength);
        while (!textScanner.empty()) {
            textScanner.skipCommaWhitespace();
            SVG.Length nextLength2 = textScanner.nextLength();
            if (nextLength2 == null || nextLength2.isNegative()) {
                return null;
            }
            arrayList.add(nextLength2);
            floatValue += nextLength2.floatValue();
        }
        if (floatValue == 0.0f) {
            return null;
        }
        return (SVG.Length[]) arrayList.toArray(new SVG.Length[arrayList.size()]);
    }

    private static SVG.Style.LineCap parseStrokeLineCap(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    private static SVG.Style.LineJoin parseStrokeLineJoin(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    private static void parseStyle(SVG.SvgElementBase svgElementBase, String str) {
        TextScanner textScanner = new TextScanner(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String nextToken = textScanner.nextToken(AbstractJsonLexerKt.COLON);
            textScanner.skipWhitespace();
            if (!textScanner.consume(AbstractJsonLexerKt.COLON)) {
                return;
            }
            textScanner.skipWhitespace();
            String nextTokenWithWhitespace = textScanner.nextTokenWithWhitespace(';');
            if (nextTokenWithWhitespace == null) {
                return;
            }
            textScanner.skipWhitespace();
            if (textScanner.empty() || textScanner.consume(';')) {
                if (svgElementBase.style == null) {
                    svgElementBase.style = new SVG.Style();
                }
                processStyleProperty(svgElementBase.style, nextToken, nextTokenWithWhitespace);
                textScanner.skipWhitespace();
            }
        }
    }

    private static Set<String> parseSystemLanguage(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            int indexOf = nextToken.indexOf(45);
            if (indexOf != -1) {
                nextToken = nextToken.substring(0, indexOf);
            }
            hashSet.add(new Locale(nextToken, "", "").getLanguage());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static SVG.Style.TextAnchor parseTextAnchor(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return SVG.Style.TextAnchor.Middle;
            case "end":
                return SVG.Style.TextAnchor.End;
            case "start":
                return SVG.Style.TextAnchor.Start;
            default:
                return null;
        }
    }

    private static SVG.Style.TextDecoration parseTextDecoration(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return SVG.Style.TextDecoration.LineThrough;
            case "underline":
                return SVG.Style.TextDecoration.Underline;
            case "none":
                return SVG.Style.TextDecoration.None;
            case "blink":
                return SVG.Style.TextDecoration.Blink;
            case "overline":
                return SVG.Style.TextDecoration.Overline;
            default:
                return null;
        }
    }

    private static SVG.Style.TextDirection parseTextDirection(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return SVG.Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return SVG.Style.TextDirection.RTL;
        }
        return null;
    }

    private Matrix parseTransformList(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String nextFunction = textScanner.nextFunction();
            if (nextFunction == null) {
                throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Bad transform function encountered in transform list: ", str));
            }
            switch (nextFunction) {
                case "matrix":
                    textScanner.skipWhitespace();
                    float nextFloat = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat2 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat3 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat4 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat5 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat6 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat6) && textScanner.consume(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{nextFloat, nextFloat3, nextFloat5, nextFloat2, nextFloat4, nextFloat6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list: ", str));
                    }
                case "rotate":
                    textScanner.skipWhitespace();
                    float nextFloat7 = textScanner.nextFloat();
                    float possibleNextFloat = textScanner.possibleNextFloat();
                    float possibleNextFloat2 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat7) || !textScanner.consume(')')) {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list: ", str));
                    }
                    if (Float.isNaN(possibleNextFloat)) {
                        matrix.preRotate(nextFloat7);
                        break;
                    } else if (!Float.isNaN(possibleNextFloat2)) {
                        matrix.preRotate(nextFloat7, possibleNextFloat, possibleNextFloat2);
                        break;
                    } else {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list: ", str));
                    }
                case "scale":
                    textScanner.skipWhitespace();
                    float nextFloat8 = textScanner.nextFloat();
                    float possibleNextFloat3 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat8) && textScanner.consume(')')) {
                        if (!Float.isNaN(possibleNextFloat3)) {
                            matrix.preScale(nextFloat8, possibleNextFloat3);
                            break;
                        } else {
                            matrix.preScale(nextFloat8, nextFloat8);
                            break;
                        }
                    } else {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list: ", str));
                    }
                    break;
                case "skewX":
                    textScanner.skipWhitespace();
                    float nextFloat9 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat9) && textScanner.consume(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(nextFloat9)), 0.0f);
                        break;
                    } else {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list: ", str));
                    }
                    break;
                case "skewY":
                    textScanner.skipWhitespace();
                    float nextFloat10 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat10) && textScanner.consume(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(nextFloat10)));
                        break;
                    } else {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list: ", str));
                    }
                    break;
                case "translate":
                    textScanner.skipWhitespace();
                    float nextFloat11 = textScanner.nextFloat();
                    float possibleNextFloat4 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(nextFloat11) && textScanner.consume(')')) {
                        if (!Float.isNaN(possibleNextFloat4)) {
                            matrix.preTranslate(nextFloat11, possibleNextFloat4);
                            break;
                        } else {
                            matrix.preTranslate(nextFloat11, 0.0f);
                            break;
                        }
                    } else {
                        throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list: ", str));
                    }
                    break;
                default:
                    throw new SVGParseException(a$$ExternalSyntheticOutline0.m("Invalid transform list fn: ", nextFunction, MarkdownConstants.RIGHT_PARENTHESIS));
            }
            if (textScanner.empty()) {
                return matrix;
            }
            textScanner.skipCommaWhitespace();
        }
        return matrix;
    }

    private void parseUsingSAX(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler(this, null);
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    private void parseUsingXmlPullParser(InputStream inputStream, boolean z) throws SVGParseException {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                XPPAttributesWrapper xPPAttributesWrapper = new XPPAttributesWrapper(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        startDocument();
                    } else if (eventType == 8) {
                        newPullParser.getText();
                        TextScanner textScanner = new TextScanner(newPullParser.getText());
                        handleProcessingInstruction(textScanner.nextToken(), parseProcessingInstructionAttributes(textScanner));
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + AbstractJsonLexerKt.COLON + name;
                            }
                            startElement(newPullParser.getNamespace(), newPullParser.getName(), name, xPPAttributesWrapper);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + AbstractJsonLexerKt.COLON + name2;
                            }
                            endElement(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            text(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            text(newPullParser.getText());
                        }
                    } else if (z && this.svgDocument.getRootElement() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            inputStream.reset();
                            parseUsingSAX(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w(TAG, "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
                endDocument();
            } catch (XmlPullParserException e) {
                throw new SVGParseException("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        }
    }

    private static SVG.Style.VectorEffect parseVectorEffect(String str) {
        str.getClass();
        if (str.equals("none")) {
            return SVG.Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    private static SVG.Box parseViewBox(String str) throws SVGParseException {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        float nextFloat = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat2 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat3 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat4 = textScanner.nextFloat();
        if (Float.isNaN(nextFloat) || Float.isNaN(nextFloat2) || Float.isNaN(nextFloat3) || Float.isNaN(nextFloat4)) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid viewBox definition - should have four numbers");
            return null;
        }
        if (nextFloat3 < 0.0f) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid viewBox. width cannot be negative");
            return null;
        }
        if (nextFloat4 >= 0.0f) {
            return new SVG.Box(nextFloat, nextFloat2, nextFloat3, nextFloat4);
        }
        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid viewBox. height cannot be negative");
        return null;
    }

    private void path(Attributes attributes) throws SVGParseException {
        debug("<path>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Path path = new SVG.Path();
        path.document = this.svgDocument;
        path.parent = this.currentElement;
        parseAttributesCore(path, attributes);
        parseAttributesStyle(path, attributes);
        parseAttributesTransform(path, attributes);
        parseAttributesConditional(path, attributes);
        parseAttributesPath(path, attributes);
        this.currentElement.addChild(path);
    }

    private void pattern(Attributes attributes) throws SVGParseException {
        debug("<pattern>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Pattern pattern = new SVG.Pattern();
        pattern.document = this.svgDocument;
        pattern.parent = this.currentElement;
        parseAttributesCore(pattern, attributes);
        parseAttributesStyle(pattern, attributes);
        parseAttributesConditional(pattern, attributes);
        parseAttributesViewBox(pattern, attributes);
        parseAttributesPattern(pattern, attributes);
        this.currentElement.addChild(pattern);
        this.currentElement = pattern;
    }

    private void polygon(Attributes attributes) throws SVGParseException {
        debug("<polygon>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.PolyLine polygon = new SVG.Polygon();
        polygon.document = this.svgDocument;
        polygon.parent = this.currentElement;
        parseAttributesCore(polygon, attributes);
        parseAttributesStyle(polygon, attributes);
        parseAttributesTransform(polygon, attributes);
        parseAttributesConditional(polygon, attributes);
        parseAttributesPolyLine(polygon, attributes, "polygon");
        this.currentElement.addChild(polygon);
    }

    private void polyline(Attributes attributes) throws SVGParseException {
        debug("<polyline>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.PolyLine polyLine = new SVG.PolyLine();
        polyLine.document = this.svgDocument;
        polyLine.parent = this.currentElement;
        parseAttributesCore(polyLine, attributes);
        parseAttributesStyle(polyLine, attributes);
        parseAttributesTransform(polyLine, attributes);
        parseAttributesConditional(polyLine, attributes);
        parseAttributesPolyLine(polyLine, attributes, "polyline");
        this.currentElement.addChild(polyLine);
    }

    public static void processStyleProperty(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(str).ordinal()]) {
                case 47:
                    SVG.SvgPaint parsePaintSpecifier = parsePaintSpecifier(str2);
                    style.fill = parsePaintSpecifier;
                    if (parsePaintSpecifier != null) {
                        style.specifiedFlags |= 1;
                        break;
                    }
                    break;
                case 48:
                    SVG.Style.FillRule parseFillRule = parseFillRule(str2);
                    style.fillRule = parseFillRule;
                    if (parseFillRule != null) {
                        style.specifiedFlags |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float parseOpacity = parseOpacity(str2);
                    style.fillOpacity = parseOpacity;
                    if (parseOpacity != null) {
                        style.specifiedFlags |= 4;
                        break;
                    }
                    break;
                case 50:
                    SVG.SvgPaint parsePaintSpecifier2 = parsePaintSpecifier(str2);
                    style.stroke = parsePaintSpecifier2;
                    if (parsePaintSpecifier2 != null) {
                        style.specifiedFlags |= 8;
                        break;
                    }
                    break;
                case 51:
                    Float parseOpacity2 = parseOpacity(str2);
                    style.strokeOpacity = parseOpacity2;
                    if (parseOpacity2 != null) {
                        style.specifiedFlags |= 16;
                        break;
                    }
                    break;
                case 52:
                    style.strokeWidth = parseLength(str2);
                    style.specifiedFlags |= 32;
                    break;
                case 53:
                    SVG.Style.LineCap parseStrokeLineCap = parseStrokeLineCap(str2);
                    style.strokeLineCap = parseStrokeLineCap;
                    if (parseStrokeLineCap != null) {
                        style.specifiedFlags |= 64;
                        break;
                    }
                    break;
                case 54:
                    SVG.Style.LineJoin parseStrokeLineJoin = parseStrokeLineJoin(str2);
                    style.strokeLineJoin = parseStrokeLineJoin;
                    if (parseStrokeLineJoin != null) {
                        style.specifiedFlags |= 128;
                        break;
                    }
                    break;
                case 55:
                    style.strokeMiterLimit = Float.valueOf(parseFloat(str2));
                    style.specifiedFlags |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        SVG.Length[] parseStrokeDashArray = parseStrokeDashArray(str2);
                        style.strokeDashArray = parseStrokeDashArray;
                        if (parseStrokeDashArray != null) {
                            style.specifiedFlags |= 512;
                            break;
                        }
                    } else {
                        style.strokeDashArray = null;
                        style.specifiedFlags |= 512;
                        break;
                    }
                    break;
                case 57:
                    style.strokeDashOffset = parseLength(str2);
                    style.specifiedFlags |= 1024;
                    break;
                case 58:
                    style.opacity = parseOpacity(str2);
                    style.specifiedFlags |= 2048;
                    break;
                case 59:
                    style.color = parseColour(str2);
                    style.specifiedFlags |= 4096;
                    break;
                case 60:
                    parseFont(style, str2);
                    break;
                case 61:
                    List<String> parseFontFamily = parseFontFamily(str2);
                    style.fontFamily = parseFontFamily;
                    if (parseFontFamily != null) {
                        style.specifiedFlags |= 8192;
                        break;
                    }
                    break;
                case 62:
                    SVG.Length parseFontSize = parseFontSize(str2);
                    style.fontSize = parseFontSize;
                    if (parseFontSize != null) {
                        style.specifiedFlags |= 16384;
                        break;
                    }
                    break;
                case 63:
                    Integer parseFontWeight = parseFontWeight(str2);
                    style.fontWeight = parseFontWeight;
                    if (parseFontWeight != null) {
                        style.specifiedFlags |= 32768;
                        break;
                    }
                    break;
                case 64:
                    SVG.Style.FontStyle parseFontStyle = parseFontStyle(str2);
                    style.fontStyle = parseFontStyle;
                    if (parseFontStyle != null) {
                        style.specifiedFlags |= 65536;
                        break;
                    }
                    break;
                case 65:
                    SVG.Style.TextDecoration parseTextDecoration = parseTextDecoration(str2);
                    style.textDecoration = parseTextDecoration;
                    if (parseTextDecoration != null) {
                        style.specifiedFlags |= 131072;
                        break;
                    }
                    break;
                case 66:
                    SVG.Style.TextDirection parseTextDirection = parseTextDirection(str2);
                    style.direction = parseTextDirection;
                    if (parseTextDirection != null) {
                        style.specifiedFlags |= Flags.GENERATEDCONSTR;
                        break;
                    }
                    break;
                case 67:
                    SVG.Style.TextAnchor parseTextAnchor = parseTextAnchor(str2);
                    style.textAnchor = parseTextAnchor;
                    if (parseTextAnchor != null) {
                        style.specifiedFlags |= 262144;
                        break;
                    }
                    break;
                case 68:
                    Boolean parseOverflow = parseOverflow(str2);
                    style.overflow = parseOverflow;
                    if (parseOverflow != null) {
                        style.specifiedFlags |= 524288;
                        break;
                    }
                    break;
                case 69:
                    String parseFunctionalIRI = parseFunctionalIRI(str2, str);
                    style.markerStart = parseFunctionalIRI;
                    style.markerMid = parseFunctionalIRI;
                    style.markerEnd = parseFunctionalIRI;
                    style.specifiedFlags |= 14680064;
                    break;
                case 70:
                    style.markerStart = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 2097152;
                    break;
                case 71:
                    style.markerMid = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 4194304;
                    break;
                case 72:
                    style.markerEnd = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if (VALID_DISPLAY_VALUES.contains("|" + str2 + '|')) {
                            style.display = Boolean.valueOf(!str2.equals("none"));
                            style.specifiedFlags |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if (VALID_VISIBILITY_VALUES.contains("|" + str2 + '|')) {
                            style.visibility = Boolean.valueOf(str2.equals(ViewProps.VISIBLE));
                            style.specifiedFlags |= LeapfrogSceneAssetsDownloader.MAX_ARTIFACT_BYTES;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals(CURRENTCOLOR)) {
                        style.stopColor = SVG.CurrentColor.getInstance();
                    } else {
                        try {
                            style.stopColor = parseColour(str2);
                        } catch (SVGParseException e) {
                            Log.w(TAG, e.getMessage());
                            return;
                        }
                    }
                    style.specifiedFlags |= 67108864;
                    break;
                case 76:
                    style.stopOpacity = parseOpacity(str2);
                    style.specifiedFlags |= 134217728;
                    break;
                case ByteCodes.astore_2 /* 77 */:
                    SVG.CSSClipRect parseClip = parseClip(str2);
                    style.clip = parseClip;
                    if (parseClip != null) {
                        style.specifiedFlags |= 1048576;
                        break;
                    }
                    break;
                case 78:
                    style.clipPath = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= LceConfigDefaults.MEMORY_HEADROOM_MARGIN_BYTES;
                    break;
                case 79:
                    style.clipRule = parseFillRule(str2);
                    style.specifiedFlags |= 536870912;
                    break;
                case 80:
                    style.mask = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 1073741824;
                    break;
                case 81:
                    if (str2.equals(CURRENTCOLOR)) {
                        style.solidColor = SVG.CurrentColor.getInstance();
                    } else {
                        try {
                            style.solidColor = parseColour(str2);
                        } catch (SVGParseException e2) {
                            Log.w(TAG, e2.getMessage());
                            return;
                        }
                    }
                    style.specifiedFlags |= Flags.BRIDGE;
                    break;
                case 82:
                    style.solidOpacity = parseOpacity(str2);
                    style.specifiedFlags |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals(CURRENTCOLOR)) {
                        style.viewportFill = SVG.CurrentColor.getInstance();
                    } else {
                        try {
                            style.viewportFill = parseColour(str2);
                        } catch (SVGParseException e3) {
                            Log.w(TAG, e3.getMessage());
                            return;
                        }
                    }
                    style.specifiedFlags |= 8589934592L;
                    break;
                case 84:
                    style.viewportFillOpacity = parseOpacity(str2);
                    style.specifiedFlags |= Flags.VARARGS;
                    break;
                case 85:
                    SVG.Style.VectorEffect parseVectorEffect = parseVectorEffect(str2);
                    style.vectorEffect = parseVectorEffect;
                    if (parseVectorEffect != null) {
                        style.specifiedFlags |= Flags.ACYCLIC_ANN;
                        break;
                    }
                    break;
                case 86:
                    SVG.Style.RenderQuality parseRenderQuality = parseRenderQuality(str2);
                    style.imageRendering = parseRenderQuality;
                    if (parseRenderQuality != null) {
                        style.specifiedFlags |= Flags.HYPOTHETICAL;
                        break;
                    }
                    break;
            }
        } catch (SVGParseException unused) {
        }
    }

    private void radialGradient(Attributes attributes) throws SVGParseException {
        debug("<radialGradient>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.SvgRadialGradient svgRadialGradient = new SVG.SvgRadialGradient();
        svgRadialGradient.document = this.svgDocument;
        svgRadialGradient.parent = this.currentElement;
        parseAttributesCore(svgRadialGradient, attributes);
        parseAttributesStyle(svgRadialGradient, attributes);
        parseAttributesGradient(svgRadialGradient, attributes);
        parseAttributesRadialGradient(svgRadialGradient, attributes);
        this.currentElement.addChild(svgRadialGradient);
        this.currentElement = svgRadialGradient;
    }

    private void rect(Attributes attributes) throws SVGParseException {
        debug("<rect>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Rect rect = new SVG.Rect();
        rect.document = this.svgDocument;
        rect.parent = this.currentElement;
        parseAttributesCore(rect, attributes);
        parseAttributesStyle(rect, attributes);
        parseAttributesTransform(rect, attributes);
        parseAttributesConditional(rect, attributes);
        parseAttributesRect(rect, attributes);
        this.currentElement.addChild(rect);
    }

    private void solidColor(Attributes attributes) throws SVGParseException {
        debug("<solidColor>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.SolidColor solidColor = new SVG.SolidColor();
        solidColor.document = this.svgDocument;
        solidColor.parent = this.currentElement;
        parseAttributesCore(solidColor, attributes);
        parseAttributesStyle(solidColor, attributes);
        this.currentElement.addChild(solidColor);
        this.currentElement = solidColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startDocument() {
        this.svgDocument = new SVG();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.ignoring) {
            this.ignoreDepth++;
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem fromString = SVGElem.fromString(str2);
            switch (AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[fromString.ordinal()]) {
                case 1:
                    svg(attributes);
                    break;
                case 2:
                case 3:
                    g(attributes);
                    break;
                case 4:
                    defs(attributes);
                    break;
                case 5:
                    use(attributes);
                    break;
                case 6:
                    path(attributes);
                    break;
                case 7:
                    rect(attributes);
                    break;
                case 8:
                    circle(attributes);
                    break;
                case 9:
                    ellipse(attributes);
                    break;
                case 10:
                    line(attributes);
                    break;
                case 11:
                    polyline(attributes);
                    break;
                case 12:
                    polygon(attributes);
                    break;
                case 13:
                    text(attributes);
                    break;
                case 14:
                    tspan(attributes);
                    break;
                case 15:
                    tref(attributes);
                    break;
                case 16:
                    zwitch(attributes);
                    break;
                case 17:
                    symbol(attributes);
                    break;
                case 18:
                    marker(attributes);
                    break;
                case 19:
                    linearGradient(attributes);
                    break;
                case 20:
                    radialGradient(attributes);
                    break;
                case 21:
                    stop(attributes);
                    break;
                case 22:
                case 23:
                    this.inMetadataElement = true;
                    this.metadataTag = fromString;
                    break;
                case 24:
                    clipPath(attributes);
                    break;
                case 25:
                    textPath(attributes);
                    break;
                case 26:
                    pattern(attributes);
                    break;
                case 27:
                    image(attributes);
                    break;
                case 28:
                    view(attributes);
                    break;
                case 29:
                    mask(attributes);
                    break;
                case 30:
                    style(attributes);
                    break;
                case 31:
                    solidColor(attributes);
                    break;
                default:
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    break;
            }
        }
    }

    private void stop(Attributes attributes) throws SVGParseException {
        debug("<stop>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        if (!(svgContainer instanceof SVG.GradientElement)) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
            return;
        }
        SVG.Stop stop = new SVG.Stop();
        stop.document = this.svgDocument;
        stop.parent = this.currentElement;
        parseAttributesCore(stop, attributes);
        parseAttributesStyle(stop, attributes);
        parseAttributesStop(stop, attributes);
        this.currentElement.addChild(stop);
        this.currentElement = stop;
    }

    private void style(Attributes attributes) throws SVGParseException {
        debug("<style>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        String str = "all";
        boolean z = true;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 88) {
                z = trim.equals("text/css");
            } else if (i2 == 89) {
                str = trim;
            }
        }
        if (z && CSSParser.mediaMatches(str, CSSParser.MediaType.screen)) {
            this.inStyleElement = true;
        } else {
            this.ignoring = true;
            this.ignoreDepth = 1;
        }
    }

    private void svg(Attributes attributes) throws SVGParseException {
        debug("<svg>", new Object[0]);
        SVG.Svg svg = new SVG.Svg();
        svg.document = this.svgDocument;
        svg.parent = this.currentElement;
        parseAttributesCore(svg, attributes);
        parseAttributesStyle(svg, attributes);
        parseAttributesConditional(svg, attributes);
        parseAttributesViewBox(svg, attributes);
        parseAttributesSVG(svg, attributes);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            this.svgDocument.setRootElement(svg);
        } else {
            svgContainer.addChild(svg);
        }
        this.currentElement = svg;
    }

    private void symbol(Attributes attributes) throws SVGParseException {
        debug("<symbol>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.SvgViewBoxContainer symbol = new SVG.Symbol();
        symbol.document = this.svgDocument;
        symbol.parent = this.currentElement;
        parseAttributesCore(symbol, attributes);
        parseAttributesStyle(symbol, attributes);
        parseAttributesConditional(symbol, attributes);
        parseAttributesViewBox(symbol, attributes);
        this.currentElement.addChild(symbol);
        this.currentElement = symbol;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void text(String str) throws SVGParseException {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(str.length());
            }
            this.metadataElementContents.append(str);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(str.length());
            }
            this.styleElementContents.append(str);
        } else if (this.currentElement instanceof SVG.TextContainer) {
            appendToTextContainer(str);
        }
    }

    private void textPath(Attributes attributes) throws SVGParseException {
        debug("<textPath>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.TextPath textPath = new SVG.TextPath();
        textPath.document = this.svgDocument;
        textPath.parent = this.currentElement;
        parseAttributesCore(textPath, attributes);
        parseAttributesStyle(textPath, attributes);
        parseAttributesConditional(textPath, attributes);
        parseAttributesTextPath(textPath, attributes);
        this.currentElement.addChild(textPath);
        this.currentElement = textPath;
        SVG.SvgContainer svgContainer = textPath.parent;
        if (svgContainer instanceof SVG.TextRoot) {
            textPath.setTextRoot((SVG.TextRoot) svgContainer);
        } else {
            textPath.setTextRoot(((SVG.TextChild) svgContainer).getTextRoot());
        }
    }

    private void tref(Attributes attributes) throws SVGParseException {
        debug("<tref>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        if (!(svgContainer instanceof SVG.TextContainer)) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
            return;
        }
        SVG.TRef tRef = new SVG.TRef();
        tRef.document = this.svgDocument;
        tRef.parent = this.currentElement;
        parseAttributesCore(tRef, attributes);
        parseAttributesStyle(tRef, attributes);
        parseAttributesConditional(tRef, attributes);
        parseAttributesTRef(tRef, attributes);
        this.currentElement.addChild(tRef);
        SVG.SvgContainer svgContainer2 = tRef.parent;
        if (svgContainer2 instanceof SVG.TextRoot) {
            tRef.setTextRoot((SVG.TextRoot) svgContainer2);
        } else {
            tRef.setTextRoot(((SVG.TextChild) svgContainer2).getTextRoot());
        }
    }

    private void tspan(Attributes attributes) throws SVGParseException {
        debug("<tspan>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        if (!(svgContainer instanceof SVG.TextContainer)) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
            return;
        }
        SVG.TSpan tSpan = new SVG.TSpan();
        tSpan.document = this.svgDocument;
        tSpan.parent = this.currentElement;
        parseAttributesCore(tSpan, attributes);
        parseAttributesStyle(tSpan, attributes);
        parseAttributesConditional(tSpan, attributes);
        parseAttributesTextPosition(tSpan, attributes);
        this.currentElement.addChild(tSpan);
        this.currentElement = tSpan;
        SVG.SvgContainer svgContainer2 = tSpan.parent;
        if (svgContainer2 instanceof SVG.TextRoot) {
            tSpan.setTextRoot((SVG.TextRoot) svgContainer2);
        } else {
            tSpan.setTextRoot(((SVG.TextChild) svgContainer2).getTextRoot());
        }
    }

    private void use(Attributes attributes) throws SVGParseException {
        debug("<use>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Use use = new SVG.Use();
        use.document = this.svgDocument;
        use.parent = this.currentElement;
        parseAttributesCore(use, attributes);
        parseAttributesStyle(use, attributes);
        parseAttributesTransform(use, attributes);
        parseAttributesConditional(use, attributes);
        parseAttributesUse(use, attributes);
        this.currentElement.addChild(use);
        this.currentElement = use;
    }

    private void view(Attributes attributes) throws SVGParseException {
        debug("<view>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.SvgViewBoxContainer view = new SVG.View();
        view.document = this.svgDocument;
        view.parent = this.currentElement;
        parseAttributesCore(view, attributes);
        parseAttributesConditional(view, attributes);
        parseAttributesViewBox(view, attributes);
        this.currentElement.addChild(view);
        this.currentElement = view;
    }

    private void zwitch(Attributes attributes) throws SVGParseException {
        debug("<switch>", new Object[0]);
        if (this.currentElement == null) {
            Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
            return;
        }
        SVG.Switch r0 = new SVG.Switch();
        r0.document = this.svgDocument;
        r0.parent = this.currentElement;
        parseAttributesCore(r0, attributes);
        parseAttributesStyle(r0, attributes);
        parseAttributesTransform(r0, attributes);
        parseAttributesConditional(r0, attributes);
        this.currentElement.addChild(r0);
        this.currentElement = r0;
    }

    public SVG parse(InputStream inputStream, boolean z) throws SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            parseUsingXmlPullParser(inputStream, z);
            return this.svgDocument;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e(TAG, "Exception thrown closing input stream");
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class XPPAttributesWrapper implements Attributes {
        private XmlPullParser parser;

        public XPPAttributesWrapper(XmlPullParser xmlPullParser) {
            this.parser = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.parser.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.parser.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.parser.getAttributeName(i);
            if (this.parser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.parser.getAttributePrefix(i) + AbstractJsonLexerKt.COLON + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.parser.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.parser.getAttributeValue(i);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class SAXHandler extends DefaultHandler2 {
        private SAXHandler() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            SVGParser.this.text(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            SVGParser.this.endDocument();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            SVGParser.this.endElement(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            SVGParser.this.handleProcessingInstruction(str, SVGParser.this.parseProcessingInstructionAttributes(new TextScanner(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            SVGParser.this.startDocument();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            SVGParser.this.startElement(str, str2, str3, attributes);
        }

        public /* synthetic */ SAXHandler(SVGParser sVGParser, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endDocument() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TextScanner {
        String input;
        int inputLength;
        int position = 0;
        private NumberParser numberParser = new NumberParser();

        public TextScanner(String str) {
            this.inputLength = 0;
            String trim = str.trim();
            this.input = trim;
            this.inputLength = trim.length();
        }

        public int advanceChar() {
            int i = this.position;
            int i2 = this.inputLength;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.position = i3;
            if (i3 < i2) {
                return this.input.charAt(i3);
            }
            return -1;
        }

        public String ahead() {
            int i = this.position;
            while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
            String substring = this.input.substring(i, this.position);
            this.position = i;
            return substring;
        }

        public Boolean checkedNextFlag(Object obj) {
            if (obj == null) {
                return null;
            }
            skipCommaWhitespace();
            return nextFlag();
        }

        public float checkedNextFloat(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        public boolean consume(String str) {
            int length = str.length();
            int i = this.position;
            boolean z = i <= this.inputLength - length && this.input.substring(i, i + length).equals(str);
            if (z) {
                this.position += length;
            }
            return z;
        }

        public boolean empty() {
            return this.position == this.inputLength;
        }

        public boolean hasLetter() {
            int i = this.position;
            if (i == this.inputLength) {
                return false;
            }
            char charAt = this.input.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                return charAt >= 'A' && charAt <= 'Z';
            }
            return true;
        }

        public boolean isEOL(int i) {
            return i == 10 || i == 13;
        }

        public boolean isWhitespace(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public Integer nextChar() {
            int i = this.position;
            if (i == this.inputLength) {
                return null;
            }
            String str = this.input;
            this.position = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        public Boolean nextFlag() {
            int i = this.position;
            if (i == this.inputLength) {
                return null;
            }
            char charAt = this.input.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.position++;
            return Boolean.valueOf(charAt == '1');
        }

        public float nextFloat() {
            float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(parseNumber)) {
                this.position = this.numberParser.getEndPos();
            }
            return parseNumber;
        }

        public String nextFunction() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            int charAt = this.input.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = advanceChar();
            }
            int i2 = this.position;
            while (isWhitespace(charAt)) {
                charAt = advanceChar();
            }
            if (charAt == 40) {
                this.position++;
                return this.input.substring(i, i2);
            }
            this.position = i;
            return null;
        }

        public SVG.Length nextLength() {
            float nextFloat = nextFloat();
            if (Float.isNaN(nextFloat)) {
                return null;
            }
            SVG.Unit nextUnit = nextUnit();
            return nextUnit == null ? new SVG.Length(nextFloat, SVG.Unit.px) : new SVG.Length(nextFloat, nextUnit);
        }

        public String nextQuotedString() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            char charAt = this.input.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int advanceChar = advanceChar();
            while (advanceChar != -1 && advanceChar != charAt) {
                advanceChar = advanceChar();
            }
            if (advanceChar == -1) {
                this.position = i;
                return null;
            }
            int i2 = this.position;
            this.position = i2 + 1;
            return this.input.substring(i + 1, i2);
        }

        public String nextToken(char c, boolean z) {
            if (empty()) {
                return null;
            }
            char charAt = this.input.charAt(this.position);
            if ((!z && isWhitespace(charAt)) || charAt == c) {
                return null;
            }
            int i = this.position;
            int advanceChar = advanceChar();
            while (advanceChar != -1 && advanceChar != c && (z || !isWhitespace(advanceChar))) {
                advanceChar = advanceChar();
            }
            return this.input.substring(i, this.position);
        }

        public String nextTokenWithWhitespace(char c) {
            return nextToken(c, true);
        }

        public SVG.Unit nextUnit() {
            if (empty()) {
                return null;
            }
            char charAt = this.input.charAt(this.position);
            int i = this.position;
            if (charAt == '%') {
                this.position = i + 1;
                return SVG.Unit.percent;
            }
            if (i > this.inputLength - 2) {
                return null;
            }
            try {
                SVG.Unit valueOf = SVG.Unit.valueOf(this.input.substring(i, i + 2).toLowerCase(Locale.US));
                this.position += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public String nextWord() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            char charAt = this.input.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.position = i;
                return null;
            }
            int advanceChar = advanceChar();
            while (true) {
                if ((advanceChar < 65 || advanceChar > 90) && (advanceChar < 97 || advanceChar > 122)) {
                    break;
                }
                advanceChar = advanceChar();
            }
            return this.input.substring(i, this.position);
        }

        public float possibleNextFloat() {
            skipCommaWhitespace();
            float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(parseNumber)) {
                this.position = this.numberParser.getEndPos();
            }
            return parseNumber;
        }

        public String restOfText() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            this.position = this.inputLength;
            return this.input.substring(i);
        }

        public boolean skipCommaWhitespace() {
            skipWhitespace();
            int i = this.position;
            if (i == this.inputLength || this.input.charAt(i) != ',') {
                return false;
            }
            this.position++;
            skipWhitespace();
            return true;
        }

        public void skipWhitespace() {
            while (true) {
                int i = this.position;
                if (i >= this.inputLength || !isWhitespace(this.input.charAt(i))) {
                    return;
                } else {
                    this.position++;
                }
            }
        }

        public float checkedNextFloat(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        public boolean consume(char c) {
            int i = this.position;
            boolean z = i < this.inputLength && this.input.charAt(i) == c;
            if (z) {
                this.position++;
            }
            return z;
        }

        public String nextToken(char c) {
            return nextToken(c, false);
        }

        public String nextToken() {
            return nextToken(' ', false);
        }
    }

    private static float parseFloat(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return parseFloat(str, 0, length);
        }
        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid float value (empty string)");
        return 0.0f;
    }

    private void debug(String str, Object... objArr) {
    }

    private void text(char[] cArr, int i, int i2) throws SVGParseException {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(i2);
            }
            this.metadataElementContents.append(cArr, i, i2);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(i2);
            }
            this.styleElementContents.append(cArr, i, i2);
        } else if (this.currentElement instanceof SVG.TextContainer) {
            appendToTextContainer(new String(cArr, i, i2));
        }
    }

    private void text(Attributes attributes) throws SVGParseException {
        debug("<text>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Text text = new SVG.Text();
            text.document = this.svgDocument;
            text.parent = this.currentElement;
            parseAttributesCore(text, attributes);
            parseAttributesStyle(text, attributes);
            parseAttributesTransform(text, attributes);
            parseAttributesConditional(text, attributes);
            parseAttributesTextPosition(text, attributes);
            this.currentElement.addChild(text);
            this.currentElement = text;
            return;
        }
        Classes$$ExternalSyntheticBUOutline0.m$3("Invalid document. Root element must be <svg>");
    }

    private static void parsePreserveAspectRatio(SVG.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) throws SVGParseException {
        svgPreserveAspectRatioContainer.preserveAspectRatio = parsePreserveAspectRatio(str);
    }
}
