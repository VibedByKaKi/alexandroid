package com.amazon.identity.auth.device;

import android.util.Log;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class bs extends cs {
    public static final DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();

    /* renamed from: a, reason: collision with root package name */
    public final String f548a;
    public final String b;
    public final LinkedList c;

    public bs(String str, String str2, cs... csVarArr) {
        this.f548a = str;
        this.b = str2;
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        linkedList.addAll(Arrays.asList(csVarArr));
    }

    public static String a(Document document) {
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "no");
            StringWriter stringWriter = new StringWriter();
            newTransformer.transform(new DOMSource(document), new StreamResult(stringWriter));
            return stringWriter.getBuffer().toString();
        } catch (TransformerConfigurationException e) {
            Log.e(yf.a("XMLElement"), "convertDocumentToString: Unable to convert XML Document to text since the transformer could not be constructed. Error: " + e.getMessage());
            return null;
        } catch (TransformerException e2) {
            Log.e(yf.a("XMLElement"), "convertDocumentToString: Unable to convert XML Document to text. Error: " + e2.getMessage());
            return null;
        }
    }

    public final Element b(Document document) {
        Element createElement = document.createElement(this.f548a);
        String str = this.b;
        if (str != null) {
            createElement.setTextContent(str);
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((cs) it2.next()).a(createElement);
        }
        return createElement;
    }

    public final String a() {
        try {
            Document newDocument = d.newDocumentBuilder().newDocument();
            newDocument.appendChild(b(newDocument));
            return a(newDocument);
        } catch (ParserConfigurationException e) {
            Log.e(yf.a("XMLElement"), "convertToString: Unable to construct an XML Document since the document factory could not be constructed. Error: " + e.getMessage());
            return null;
        }
    }

    public final void a(String str, String str2) {
        this.c.add(new bs(str, str2, new yr[0]));
    }

    @Override // com.amazon.identity.auth.device.cs
    public final void a(Element element) {
        element.appendChild(b(element.getOwnerDocument()));
    }
}
