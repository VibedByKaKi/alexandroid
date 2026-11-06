package org.commonmark.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.LinkReferenceDefinition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LinkReferenceDefinitions {
    private final Map<String, LinkReferenceDefinition> definitions = new LinkedHashMap();

    public void add(LinkReferenceDefinition linkReferenceDefinition) {
        String normalizeLabelContent = Escaping.normalizeLabelContent(linkReferenceDefinition.getLabel());
        if (this.definitions.containsKey(normalizeLabelContent)) {
            return;
        }
        this.definitions.put(normalizeLabelContent, linkReferenceDefinition);
    }

    public LinkReferenceDefinition get(String str) {
        return this.definitions.get(Escaping.normalizeLabelContent(str));
    }
}
