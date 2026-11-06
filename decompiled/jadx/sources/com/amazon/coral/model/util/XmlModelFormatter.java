package com.amazon.coral.model.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class XmlModelFormatter {
    private static final String DOC_EXAMPLE_NS = "coraltrait:com.amazon.coral.doc.example";
    private static final boolean HAS_TRANSFORMERS;
    private static final int INDENT_WIDTH = 4;
    private static final String JDK_XALAN_IMPL = "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl";
    private static final String XALAN_IMPL;
    private static final String XALAN_INDENT_AMOUNT = "{http://xml.apache.org/xslt}indent-amount";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BlockingClassLoader extends ClassLoader {
        private static final String XF_RESOURCE_NAME = "META-INF/services/".concat(TransformerFactory.class.getName());

        public BlockingClassLoader(ClassLoader classLoader) {
            super(classLoader);
        }

        @Override // java.lang.ClassLoader
        public Enumeration<URL> getResources(String str) throws IOException {
            return XF_RESOURCE_NAME.equals(str) ? Collections.emptyEnumeration() : super.getResources(str);
        }
    }

    static {
        String str;
        boolean z = false;
        if (hasClass(JDK_XALAN_IMPL)) {
            XALAN_IMPL = JDK_XALAN_IMPL;
            HAS_TRANSFORMERS = false;
            return;
        }
        try {
            Iterator it2 = ServiceLoader.load(TransformerFactory.class).iterator();
            z = it2.hasNext();
            str = null;
            while (it2.hasNext()) {
                try {
                    String name = ((TransformerFactory) it2.next()).getClass().getName();
                    if (name.contains("xalan")) {
                        str = name;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            str = null;
        }
        HAS_TRANSFORMERS = z;
        if (str == null || !hasClass(str)) {
            XALAN_IMPL = null;
        } else {
            XALAN_IMPL = str;
        }
    }

    private static void addAll(NodeList nodeList, List<Element> list) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            list.add((Element) nodeList.item(i));
        }
    }

    public static Transformer createPrettyPrinter() {
        return newTransformer("stylesheet.xslt");
    }

    private static String flatten(Element element, Transformer transformer) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                if (firstChild.getNodeType() == 1) {
                    StringWriter stringWriter = new StringWriter();
                    transformer.transform(new DOMSource(firstChild), new StreamResult(stringWriter));
                    sb.append(stringWriter.toString());
                } else if (isText(firstChild)) {
                    sb.append(firstChild.getNodeValue());
                }
            }
            return sb.toString();
        } catch (TransformerException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    private static boolean hasClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean hasMixedContent(Element element) {
        Node firstChild = element.getFirstChild();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (firstChild == null) {
                break;
            }
            z |= firstChild.getNodeType() == 1;
            if (!isText(firstChild) || firstChild.getNodeValue().trim().length() <= 0) {
                z3 = false;
            }
            z2 |= z3;
            firstChild = firstChild.getNextSibling();
        }
        return z && z2;
    }

    private static boolean isText(Node node) {
        return node.getNodeType() == 3 || node.getNodeType() == 4;
    }

    private static Transformer markupSerializer() {
        Transformer newTransformer = newTransformer(null);
        newTransformer.setOutputProperty("omit-xml-declaration", "yes");
        newTransformer.setOutputProperty("indent", "no");
        return newTransformer;
    }

    private static Transformer newTransformer(String str) {
        ClassLoader classLoader;
        boolean z = false;
        if (HAS_TRANSFORMERS && XALAN_IMPL == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
            try {
                Thread.currentThread().setContextClassLoader(new BlockingClassLoader(XmlModelFormatter.class.getClassLoader()));
                z = true;
            } catch (Exception unused) {
            }
        } else {
            classLoader = null;
        }
        try {
            try {
                String str2 = XALAN_IMPL;
                TransformerFactory newInstance = str2 != null ? TransformerFactory.newInstance(str2, null) : TransformerFactory.newInstance();
                setAttributeIfSupported(newInstance, "indent-number", 4);
                setAttributeIfSupported(newInstance, "http://javax.xml.XMLConstants/property/accessExternalDTD", "");
                setAttributeIfSupported(newInstance, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
                if (str == null) {
                    Transformer newTransformer = newInstance.newTransformer();
                    if (z) {
                        Thread.currentThread().setContextClassLoader(classLoader);
                    }
                    return newTransformer;
                }
                Transformer newTransformer2 = newInstance.newTransformer(new StreamSource(XmlModelFormatter.class.getResourceAsStream(str)));
                newTransformer2.setOutputProperty("indent", "yes");
                newTransformer2.setOutputProperty(XALAN_INDENT_AMOUNT, String.valueOf(4));
                if (z) {
                    Thread.currentThread().setContextClassLoader(classLoader);
                }
                return newTransformer2;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().setContextClassLoader(classLoader);
                }
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void normalizeMixedContent(Document document) {
        ArrayList arrayList = new ArrayList();
        addAll(document.getElementsByTagName("documentation"), arrayList);
        addAll(document.getElementsByTagNameNS(DOC_EXAMPLE_NS, "example"), arrayList);
        addAll(document.getElementsByTagNameNS(DOC_EXAMPLE_NS, "examples"), arrayList);
        Transformer markupSerializer = markupSerializer();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Element element = (Element) it2.next();
            if (hasMixedContent(element)) {
                element.setTextContent(flatten(element, markupSerializer));
            }
        }
    }

    public static String prettyPrintXml(String str) {
        try {
            InputSource inputSource = new InputSource(new StringReader(str));
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setNamespaceAware(true);
            Document parse = newInstance.newDocumentBuilder().parse(inputSource);
            normalizeMixedContent(parse);
            Element documentElement = parse.getDocumentElement();
            StringWriter stringWriter = new StringWriter();
            createPrettyPrinter().transform(new DOMSource(documentElement), new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    private static void setAttributeIfSupported(TransformerFactory transformerFactory, String str, Object obj) {
        try {
            transformerFactory.setAttribute(str, obj);
        } catch (Exception unused) {
        }
    }
}
