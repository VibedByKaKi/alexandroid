package com.amazon.scxml.internal;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.scxml.logging.Loggable;
import com.amazon.scxml.logging.Logger;
import com.google.common.collect.CompactHashMap$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Stack;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/amazon/scxml/internal/SimpleXMLReader;", "Lcom/amazon/scxml/logging/Loggable;", "<init>", "()V", "process", "Lcom/amazon/scxml/internal/SimpleXMLElement;", StringLookupFactory.KEY_XML, "", "inputStream", "Ljava/io/InputStream;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SimpleXMLReader extends Loggable {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.Stack] */
    @Nullable
    public final SimpleXMLElement process(@NotNull InputStream inputStream) {
        inputStream.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new Stack();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.getClass();
            SAXParser newSAXParser = newInstance.newSAXParser();
            newSAXParser.getClass();
            newSAXParser.parse(inputStream, new DefaultHandler() { // from class: com.amazon.scxml.internal.SimpleXMLReader$process$defaultHandler$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                public void endDocument() {
                    String tag;
                    String tag2;
                    if (objectRef.element.size() != 1) {
                        Logger log = Loggable.INSTANCE.getLog();
                        tag2 = this.getTAG();
                        log.e(tag2, "SimpleXMLReader error - elementStack should have 1 element; found [" + objectRef.element.size() + "] elements");
                        return;
                    }
                    Object pop = objectRef.element.pop();
                    Ref.ObjectRef<SimpleXMLElement> objectRef3 = objectRef2;
                    T t = pop instanceof SimpleXMLElement ? (SimpleXMLElement) pop : 0;
                    objectRef3.element = t;
                    if (t == 0) {
                        Logger log2 = Loggable.INSTANCE.getLog();
                        tag = this.getTAG();
                        log2.e(tag, "SimpleXMLReader error - expected top element type to be [SimpleXMLElement] - found  [" + pop + MarkdownConstants.RIGHT_BRACKET);
                    }
                }

                @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                public void endElement(String uri, String localName, String qName) {
                    uri.getClass();
                    localName.getClass();
                    qName.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (!objectRef.element.isEmpty()) {
                        Object pop = objectRef.element.pop();
                        if (!(pop instanceof SimpleXMLElement)) {
                            if (!(pop instanceof SimpleXMLElementStart)) {
                                CompactHashMap$$ExternalSyntheticBUOutline0.m(BitVector$$ExternalSyntheticOutline0.m("expected SimpleXMLElement or SimpleXMLElementStart - found [", pop, MarkdownConstants.RIGHT_BRACKET));
                                return;
                            }
                            SimpleXMLElementStart simpleXMLElementStart = (SimpleXMLElementStart) pop;
                            objectRef.element.push(new SimpleXMLElement(simpleXMLElementStart.getName(), simpleXMLElementStart.getAttributes(), CollectionsKt.toList(CollectionsKt.reversed(arrayList))));
                            return;
                        }
                        arrayList.add(pop);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
                
                    r1 = com.amazon.scxml.internal.SimpleXMLReaderKt.toMap(r4);
                 */
                @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void startElement(java.lang.String r1, java.lang.String r2, java.lang.String r3, org.xml.sax.Attributes r4) {
                    /*
                        r0 = this;
                        if (r3 != 0) goto L4
                        java.lang.String r3 = "UNKNOWN"
                    L4:
                        if (r4 == 0) goto Lc
                        java.util.Map r1 = com.amazon.scxml.internal.SimpleXMLReaderKt.access$toMap(r4)
                        if (r1 != 0) goto L10
                    Lc:
                        java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
                    L10:
                        com.amazon.scxml.internal.SimpleXMLElementStart r2 = new com.amazon.scxml.internal.SimpleXMLElementStart
                        r2.<init>(r3, r1)
                        kotlin.jvm.internal.Ref$ObjectRef<java.util.Stack<java.lang.Object>> r0 = r1
                        T r0 = r0.element
                        java.util.Stack r0 = (java.util.Stack) r0
                        r0.push(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.scxml.internal.SimpleXMLReader$process$defaultHandler$1.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
                }
            });
            return (SimpleXMLElement) objectRef2.element;
        } catch (Exception e) {
            Logger log = Loggable.INSTANCE.getLog();
            String tag = getTAG();
            String message = e.getMessage();
            if (message == null) {
                message = "NO_ERROR_MESSAGE";
            }
            log.e(tag, "e - ".concat(message));
            return null;
        }
    }

    @Nullable
    public final SimpleXMLElement process(@NotNull String xml) {
        xml.getClass();
        byte[] bytes = xml.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return process(new ByteArrayInputStream(bytes));
    }
}
