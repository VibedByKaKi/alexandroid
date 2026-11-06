package org.apache.commons.text.lookup;

import org.apache.commons.text.StringEscapeUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class XmlEncoderStringLookup extends AbstractStringLookup {
    static final XmlEncoderStringLookup INSTANCE = new XmlEncoderStringLookup();

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        return StringEscapeUtils.escapeXml10(str);
    }
}
