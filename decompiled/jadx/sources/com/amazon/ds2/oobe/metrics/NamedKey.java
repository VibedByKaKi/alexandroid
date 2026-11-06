package com.amazon.ds2.oobe.metrics;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class NamedKey {
    private final String name;

    @Generated
    public NamedKey(String str) {
        this.name = str;
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof NamedKey;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NamedKey)) {
            return false;
        }
        NamedKey namedKey = (NamedKey) obj;
        if (!namedKey.canEqual(this)) {
            return false;
        }
        String name = getName();
        String name2 = namedKey.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public int hashCode() {
        String name = getName();
        return 59 + (name == null ? 43 : name.hashCode());
    }

    @Generated
    public String toString() {
        return "NamedKey(name=" + getName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
