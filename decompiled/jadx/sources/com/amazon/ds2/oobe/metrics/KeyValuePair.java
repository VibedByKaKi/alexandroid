package com.amazon.ds2.oobe.metrics;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class KeyValuePair<T> {
    private final TypedKey<T> key;
    private final T value;

    @Generated
    public KeyValuePair(TypedKey<T> typedKey, T t) {
        this.key = typedKey;
        this.value = t;
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof KeyValuePair;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyValuePair)) {
            return false;
        }
        KeyValuePair keyValuePair = (KeyValuePair) obj;
        if (!keyValuePair.canEqual(this)) {
            return false;
        }
        TypedKey<T> key = getKey();
        TypedKey<T> key2 = keyValuePair.getKey();
        if (key != null ? !key.equals(key2) : key2 != null) {
            return false;
        }
        T value = getValue();
        Object value2 = keyValuePair.getValue();
        return value != null ? value.equals(value2) : value2 == null;
    }

    @Generated
    public TypedKey<T> getKey() {
        return this.key;
    }

    @Generated
    public T getValue() {
        return this.value;
    }

    @Generated
    public int hashCode() {
        TypedKey<T> key = getKey();
        int hashCode = key == null ? 43 : key.hashCode();
        T value = getValue();
        return ((hashCode + 59) * 59) + (value != null ? value.hashCode() : 43);
    }

    @Generated
    public String toString() {
        return "KeyValuePair(key=" + getKey() + ", value=" + getValue() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
