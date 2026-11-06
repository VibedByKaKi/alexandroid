package com.typesafe.config.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class ConfigNodeComplexValue extends AbstractConfigNodeValue {
    protected final ArrayList<AbstractConfigNode> children;

    public ConfigNodeComplexValue(Collection<AbstractConfigNode> collection) {
        this.children = new ArrayList<>(collection);
    }

    public final Collection<AbstractConfigNode> children() {
        return this.children;
    }

    public ConfigNodeComplexValue indentText(AbstractConfigNode abstractConfigNode) {
        ArrayList arrayList = new ArrayList(this.children);
        int i = 0;
        while (i < arrayList.size()) {
            AbstractConfigNode abstractConfigNode2 = (AbstractConfigNode) arrayList.get(i);
            if ((abstractConfigNode2 instanceof ConfigNodeSingleToken) && Tokens.isNewline(((ConfigNodeSingleToken) abstractConfigNode2).token())) {
                i++;
                arrayList.add(i, abstractConfigNode);
            } else if (abstractConfigNode2 instanceof ConfigNodeField) {
                ConfigNodeField configNodeField = (ConfigNodeField) abstractConfigNode2;
                AbstractConfigNodeValue value = configNodeField.value();
                if (value instanceof ConfigNodeComplexValue) {
                    arrayList.set(i, configNodeField.replaceValue(((ConfigNodeComplexValue) value).indentText(abstractConfigNode)));
                }
            } else if (abstractConfigNode2 instanceof ConfigNodeComplexValue) {
                arrayList.set(i, ((ConfigNodeComplexValue) abstractConfigNode2).indentText(abstractConfigNode));
            }
            i++;
        }
        return newNode(arrayList);
    }

    public abstract ConfigNodeComplexValue newNode(Collection<AbstractConfigNode> collection);

    @Override // com.typesafe.config.impl.AbstractConfigNode
    public Collection<Token> tokens() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractConfigNode> it2 = this.children.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().tokens());
        }
        return arrayList;
    }
}
