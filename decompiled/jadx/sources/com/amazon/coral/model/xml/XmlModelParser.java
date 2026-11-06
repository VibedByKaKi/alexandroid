package com.amazon.coral.model.xml;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.LinkedList;
import kotlin.text.Typography;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.text.StringSubstitutor;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class XmlModelParser extends DefaultHandler2 {
    private static final String DOCUMENTATION = "documentation";
    private int doc;
    private final Listener listener;
    private Locator locator;
    private final String source;
    private final LinkedList<ElementInfo> tags = new LinkedList<>();
    private StringBuilder text;
    private int x;
    private int y;
    private static final char[] START_TAG = {Typography.less};
    private static final char[] STOP_TAG = {Typography.less, '/'};
    private static final char[] CLOSE_TAG = {Typography.greater};
    private static final char[] COMMENT_START = {Typography.less, '!', '-', '-'};
    private static final char[] COMMENT_END = {'-', '-', Typography.greater};
    public static Listener NullListener = new Listener() { // from class: com.amazon.coral.model.xml.XmlModelParser.1
        @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
        public void onAttribute(AttributeInfo attributeInfo) {
        }

        @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
        public void onComment(TextInfo textInfo) {
        }

        @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
        public void onElementBegin(ElementInfo elementInfo) {
        }

        @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
        public void onElementEnd(ElementInfo elementInfo) {
        }

        @Override // com.amazon.coral.model.xml.XmlModelParser.Listener
        public void onText(TextInfo textInfo) {
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AttributeInfo {
        private final String name;
        private final String uri;
        private final String value;

        public AttributeInfo(String str, String str2, String str3) {
            this.name = str;
            this.uri = str2;
            this.value = str3;
        }

        public String getName() {
            return this.name;
        }

        public String getURI() {
            return this.uri;
        }

        public String getValue() {
            return this.value;
        }

        public String toString() {
            return this.name + "=" + this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ElementInfo {
        private final String name;
        private final String source;
        private final String uri;
        private final int x;
        private final int y;

        public ElementInfo(String str, String str2, String str3, int i, int i2) {
            this.name = str;
            this.uri = str2;
            this.source = str3;
            this.x = i;
            this.y = i2;
        }

        public String getName() {
            return this.name;
        }

        public String getSource() {
            return this.source;
        }

        public String getURI() {
            return this.uri;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            sb.append("{");
            return a$$ExternalSyntheticOutline0.m(sb, this.uri, StringSubstitutor.DEFAULT_VAR_END);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onAttribute(AttributeInfo attributeInfo);

        void onComment(TextInfo textInfo);

        void onElementBegin(ElementInfo elementInfo);

        void onElementEnd(ElementInfo elementInfo);

        void onText(TextInfo textInfo);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TextInfo {
        private final String source;
        private final CharSequence text;
        private final int x;
        private final int y;

        public TextInfo(CharSequence charSequence, String str, int i, int i2) {
            this.text = charSequence;
            this.source = str;
            this.x = i;
            this.y = i2;
        }

        public String getSource() {
            return this.source;
        }

        public CharSequence getText() {
            return this.text;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public String toString() {
            return this.text.toString();
        }
    }

    public XmlModelParser(String str, Listener listener) {
        if (str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (listener == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.source = str;
        this.listener = listener;
        setDocumentLocator(this.locator);
    }

    private void checkText() {
        StringBuilder sb = this.text;
        if (sb != null) {
            this.listener.onText(new TextInfo(sb, this.source, this.x, this.y));
            this.text = null;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        int columnNumber = this.locator.getColumnNumber();
        int lineNumber = this.locator.getLineNumber();
        if (this.text == null) {
            this.text = new StringBuilder();
            this.x = columnNumber;
            this.y = lineNumber;
        }
        this.text.append(cArr, i, i2);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i, int i2) throws SAXException {
        int columnNumber = this.locator.getColumnNumber();
        int lineNumber = this.locator.getLineNumber();
        if (this.doc <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(cArr, i, i2);
            this.listener.onComment(new TextInfo(sb, this.source, columnNumber, lineNumber));
            return;
        }
        char[] cArr2 = COMMENT_START;
        characters(cArr2, 0, cArr2.length);
        characters(cArr, i, i2);
        char[] cArr3 = COMMENT_END;
        characters(cArr3, 0, cArr3.length);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        checkText();
        if (this.doc > 1) {
            char[] cArr = STOP_TAG;
            characters(cArr, 0, cArr.length);
            characters(str3.toCharArray(), 0, str3.length());
            char[] cArr2 = CLOSE_TAG;
            characters(cArr2, 0, cArr2.length);
        } else {
            this.listener.onElementEnd(this.tags.remove(0));
        }
        int i = this.doc;
        if (i > 0) {
            this.doc = i - 1;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        checkText();
        int i = this.doc;
        if (i > 0) {
            char[] cArr = START_TAG;
            characters(cArr, 0, cArr.length);
            characters(str3.toCharArray(), 0, str3.length());
            for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                String m = a$$ExternalSyntheticOutline0.m(" ", attributes.getQName(i2), "=\"", attributes.getValue(i2), DeviceConfigConstants.DOUBLE_QUOTE);
                characters(m.toCharArray(), 0, m.length());
            }
            char[] cArr2 = CLOSE_TAG;
            characters(cArr2, 0, cArr2.length);
            this.doc++;
            return;
        }
        if (i == 0 && DOCUMENTATION.equals(str2)) {
            this.doc++;
        }
        ElementInfo elementInfo = new ElementInfo(str3, str, this.source, this.locator.getColumnNumber(), this.locator.getLineNumber());
        this.tags.add(0, elementInfo);
        this.listener.onElementBegin(elementInfo);
        for (int length = attributes.getLength(); length > 0; length--) {
            int i3 = length - 1;
            this.listener.onAttribute(new AttributeInfo(attributes.getQName(i3), attributes.getURI(i3), attributes.getValue(i3)));
        }
    }
}
