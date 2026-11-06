package com.amazon.identity.auth.device;

import java.util.HashMap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class es {
    public static HashMap a(Element element) {
        if (element == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Element element2 = (Element) childNodes.item(i);
            if (element2 != null) {
                hashMap.put(element2.getTagName(), element2.getTextContent());
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static Element b(Element element, String str) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (str.equalsIgnoreCase(element2.getTagName())) {
                    return element2;
                }
            }
        }
        return null;
    }

    public static boolean c(Element element, String str) {
        return element.getElementsByTagName(str).getLength() > 0;
    }

    public static String b(Element element) {
        if (element == null) {
            return null;
        }
        return element.getTextContent();
    }

    public static Element a(Element element, String str) {
        if (element == null) {
            return null;
        }
        NodeList elementsByTagName = element.getElementsByTagName(str);
        if (elementsByTagName.getLength() == 0) {
            return null;
        }
        return (Element) elementsByTagName.item(0);
    }
}
