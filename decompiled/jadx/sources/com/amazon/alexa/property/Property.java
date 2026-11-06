package com.amazon.alexa.property;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class Property<NamespaceType, NameType, InstanceType, ValueType> {

    @CheckForNull
    private final InstanceType instance;

    @CheckForNull
    private final NameType name;

    @CheckForNull
    private final NamespaceType namespace;

    @CheckForNull
    private final String timeOfSample;

    @CheckForNull
    private final int uncertaintyInMilliseconds;

    @CheckForNull
    private final ValueType value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private InstanceType instance;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private NameType name;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private NamespaceType namespace;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String timeOfSample;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int uncertaintyInMilliseconds;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private ValueType value;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Property<NamespaceType, NameType, InstanceType, ValueType> build() {
            return new Property<>(this.namespace, this.instance, this.name, this.value, this.timeOfSample, this.uncertaintyInMilliseconds);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> instance(@CheckForNull InstanceType instancetype) {
            this.instance = instancetype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> name(@CheckForNull NameType nametype) {
            this.name = nametype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> namespace(@CheckForNull NamespaceType namespacetype) {
            this.namespace = namespacetype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> timeOfSample(@CheckForNull String str) {
            this.timeOfSample = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            String valueOf = String.valueOf(this.namespace);
            String valueOf2 = String.valueOf(this.instance);
            String valueOf3 = String.valueOf(this.name);
            String valueOf4 = String.valueOf(this.value);
            String str = this.timeOfSample;
            int i = this.uncertaintyInMilliseconds;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Property.PropertyBuilder(namespace=", valueOf, ", instance=", valueOf2, ", name=");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, valueOf3, ", value=", valueOf4, ", timeOfSample=");
            m.append(str);
            m.append(", uncertaintyInMilliseconds=");
            m.append(i);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> uncertaintyInMilliseconds(@CheckForNull int i) {
            this.uncertaintyInMilliseconds = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> value(@CheckForNull ValueType valuetype) {
            this.value = valuetype;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Property(@CheckForNull NamespaceType namespacetype, @CheckForNull InstanceType instancetype, @CheckForNull NameType nametype, @CheckForNull ValueType valuetype, @CheckForNull String str, @CheckForNull int i) {
        this.namespace = namespacetype;
        this.instance = instancetype;
        this.name = nametype;
        this.value = valuetype;
        this.timeOfSample = str;
        this.uncertaintyInMilliseconds = i;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, NameType, InstanceType, ValueType> PropertyBuilder<NamespaceType, NameType, InstanceType, ValueType> builder() {
        return new PropertyBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Property;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Property)) {
            return false;
        }
        Property property = (Property) obj;
        if (!property.canEqual(this) || getUncertaintyInMilliseconds() != property.getUncertaintyInMilliseconds()) {
            return false;
        }
        NamespaceType namespace = getNamespace();
        Object namespace2 = property.getNamespace();
        if (namespace != null ? !namespace.equals(namespace2) : namespace2 != null) {
            return false;
        }
        InstanceType property2 = getInstance();
        Object property3 = property.getInstance();
        if (property2 != null ? !property2.equals(property3) : property3 != null) {
            return false;
        }
        NameType name = getName();
        Object name2 = property.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        ValueType value = getValue();
        Object value2 = property.getValue();
        if (value != null ? !value.equals(value2) : value2 != null) {
            return false;
        }
        String timeOfSample = getTimeOfSample();
        String timeOfSample2 = property.getTimeOfSample();
        return timeOfSample != null ? timeOfSample.equals(timeOfSample2) : timeOfSample2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public InstanceType getInstance() {
        return this.instance;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NameType getName() {
        return this.name;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NamespaceType getNamespace() {
        return this.namespace;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getTimeOfSample() {
        return this.timeOfSample;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getUncertaintyInMilliseconds() {
        return this.uncertaintyInMilliseconds;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ValueType getValue() {
        return this.value;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int uncertaintyInMilliseconds = getUncertaintyInMilliseconds() + 59;
        NamespaceType namespace = getNamespace();
        int hashCode = (uncertaintyInMilliseconds * 59) + (namespace == null ? 43 : namespace.hashCode());
        InstanceType property = getInstance();
        int hashCode2 = (hashCode * 59) + (property == null ? 43 : property.hashCode());
        NameType name = getName();
        int hashCode3 = (hashCode2 * 59) + (name == null ? 43 : name.hashCode());
        ValueType value = getValue();
        int i = hashCode3 * 59;
        int hashCode4 = value == null ? 43 : value.hashCode();
        String timeOfSample = getTimeOfSample();
        return ((i + hashCode4) * 59) + (timeOfSample != null ? timeOfSample.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        String valueOf = String.valueOf(getNamespace());
        String valueOf2 = String.valueOf(getInstance());
        String valueOf3 = String.valueOf(getName());
        String valueOf4 = String.valueOf(getValue());
        String timeOfSample = getTimeOfSample();
        int uncertaintyInMilliseconds = getUncertaintyInMilliseconds();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Property(namespace=", valueOf, ", instance=", valueOf2, ", name=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, valueOf3, ", value=", valueOf4, ", timeOfSample=");
        m.append(timeOfSample);
        m.append(", uncertaintyInMilliseconds=");
        m.append(uncertaintyInMilliseconds);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
