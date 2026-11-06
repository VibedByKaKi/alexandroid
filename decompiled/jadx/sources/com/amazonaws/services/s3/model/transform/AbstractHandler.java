package com.amazonaws.services.s3.model.transform;

import java.util.Iterator;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
abstract class AbstractHandler extends DefaultHandler {
    private final StringBuilder text = new StringBuilder();
    private final LinkedList<String> context = new LinkedList<>();

    public final boolean atTopLevel() {
        return this.context.isEmpty();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.text.append(cArr, i, i2);
    }

    public abstract void doEndElement(String str, String str2, String str3);

    public abstract void doStartElement(String str, String str2, String str3, Attributes attributes);

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.context.removeLast();
        doEndElement(str, str2, str3);
    }

    public final String getText() {
        return this.text.toString();
    }

    public final boolean in(String... strArr) {
        if (strArr.length != this.context.size()) {
            return false;
        }
        Iterator<String> it2 = this.context.iterator();
        int i = 0;
        while (it2.hasNext()) {
            String next = it2.next();
            String str = strArr[i];
            if (!str.equals("*") && !str.equals(next)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.text.setLength(0);
        doStartElement(str, str2, str3, attributes);
        this.context.add(str2);
    }
}
