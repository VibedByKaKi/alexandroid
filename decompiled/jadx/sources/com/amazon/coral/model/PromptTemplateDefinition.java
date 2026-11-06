package com.amazon.coral.model;

import com.amazon.coral.model.Model;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class PromptTemplateDefinition implements Serializable {
    private final Model.Id arguments;
    private final String description;
    private final String preferWhen;
    private final String template;

    public PromptTemplateDefinition(String str, String str2, Model.Id id, String str3) {
        this.description = str;
        Objects.requireNonNull(str2, "template cannot be null");
        this.template = str2;
        this.arguments = id;
        this.preferWhen = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PromptTemplateDefinition.class == obj.getClass()) {
            PromptTemplateDefinition promptTemplateDefinition = (PromptTemplateDefinition) obj;
            if (Objects.equals(this.description, promptTemplateDefinition.description) && Objects.equals(this.template, promptTemplateDefinition.template) && Objects.equals(this.arguments, promptTemplateDefinition.arguments) && Objects.equals(this.preferWhen, promptTemplateDefinition.preferWhen)) {
                return true;
            }
        }
        return false;
    }

    public Model.Id getArguments() {
        return this.arguments;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPreferWhen() {
        return this.preferWhen;
    }

    public String getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return Objects.hash(this.description, this.template, this.arguments, this.preferWhen);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PromptTemplateDefinition{description='");
        sb.append(this.description);
        sb.append("', template='");
        sb.append(this.template);
        sb.append("', arguments=");
        sb.append(this.arguments);
        sb.append(", preferWhen='");
        return a$$ExternalSyntheticOutline0.m(sb, this.preferWhen, "'}");
    }

    public PromptTemplateDefinition(String str, String str2, Model.Id id) {
        this(str, str2, id, null);
    }

    public PromptTemplateDefinition(String str, Model.Id id) {
        this(null, str, id, null);
    }
}
