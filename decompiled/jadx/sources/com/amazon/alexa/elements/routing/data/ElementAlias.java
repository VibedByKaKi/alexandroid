package com.amazon.alexa.elements.routing.data;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ElementAlias {
    public Integer priority;
    public String template;

    public ElementAlias(String str, int i) {
        this.template = str;
        this.priority = Integer.valueOf(i);
    }

    public int getPriority() {
        return this.priority.intValue();
    }

    public String getTemplate() {
        return this.template;
    }

    public ElementAlias(String str) {
        this.template = str;
    }
}
