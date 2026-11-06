package com.amazon.scxml.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"toMap", "", "", "Lorg/xml/sax/Attributes;", "AlexaMobileAndroidVoice-TTA_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SimpleXMLReaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> toMap(Attributes attributes) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            linkedHashMap.put(attributes.getLocalName(i), attributes.getValue(i));
        }
        return MapsKt.toMap(linkedHashMap);
    }
}
