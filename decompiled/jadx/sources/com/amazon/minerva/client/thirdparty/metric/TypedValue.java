package com.amazon.minerva.client.thirdparty.metric;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import dagger.internal.codegen.binding.MapKeys$$ExternalSyntheticBUOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TypedValue<T> {
    private ValueType type;
    private T value;

    public TypedValue(ValueType valueType, T t) {
        Objects.requireNonNull(valueType, "type can not be null.");
        Objects.requireNonNull(t, "value can not be null.");
        if (valueType.getCompatibleClass().isInstance(t)) {
            this.type = valueType;
            this.value = t;
            return;
        }
        StringBuilder sb = new StringBuilder("value (");
        sb.append(t);
        sb.append(") is not compatible with the type, type:");
        sb.append(valueType);
        MapKeys$$ExternalSyntheticBUOutline0.m(sb, " (", valueType.getCompatibleClass(), MarkdownConstants.RIGHT_PARENTHESIS);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TypedValue typedValue = (TypedValue) obj;
            if (Objects.equals(this.type, typedValue.type) && Objects.equals(this.value, typedValue.value)) {
                return true;
            }
        }
        return false;
    }

    public int getSizeInBytes() {
        return this.type.getSizeInBytes(this.value);
    }

    public ValueType getType() {
        return this.type;
    }

    public T getValue() {
        return this.value;
    }

    public String getValueAsString() {
        return this.type.toString(this.value);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.value);
    }

    public boolean isEmpty() {
        return this.type.isEmpty(this.value);
    }

    public String toString() {
        return "<" + this.type + ">" + this.value;
    }
}
