package com.amazon.alexa.statereporting.lib.model.api;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Date;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Property<PropertyKey, PropertyValue, PropertyInstance> {

    @CheckForNull
    private final PropertyInstance instance;

    @CheckForNull
    private final PropertyKey name;

    @CheckForNull
    private final String namespace;

    @CheckForNull
    private final Date timeOfSample;

    @CheckForNull
    private final Long uncertaintyInMilliseconds;

    @CheckForNull
    private final PropertyValue value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PropertyInstance instance;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PropertyKey name;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String namespace;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Date timeOfSample;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Long uncertaintyInMilliseconds;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PropertyValue value;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Property<PropertyKey, PropertyValue, PropertyInstance> build() {
            return new Property<>(this.namespace, this.name, this.value, this.instance, this.timeOfSample, this.uncertaintyInMilliseconds);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> instance(@CheckForNull PropertyInstance propertyinstance) {
            this.instance = propertyinstance;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> name(@CheckForNull PropertyKey propertykey) {
            this.name = propertykey;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> namespace(@CheckForNull String str) {
            this.namespace = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> timeOfSample(@CheckForNull Date date) {
            this.timeOfSample = date;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            String str = this.namespace;
            String valueOf = String.valueOf(this.name);
            String valueOf2 = String.valueOf(this.value);
            String valueOf3 = String.valueOf(this.instance);
            String valueOf4 = String.valueOf(this.timeOfSample);
            Long l = this.uncertaintyInMilliseconds;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Property.PropertyBuilder(namespace=", str, ", name=", valueOf, ", value=");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, valueOf2, ", instance=", valueOf3, ", timeOfSample=");
            m.append(valueOf4);
            m.append(", uncertaintyInMilliseconds=");
            m.append(l);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> uncertaintyInMilliseconds(@CheckForNull Long l) {
            this.uncertaintyInMilliseconds = l;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> value(@CheckForNull PropertyValue propertyvalue) {
            this.value = propertyvalue;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Property(@CheckForNull String str, @CheckForNull PropertyKey propertykey, @CheckForNull PropertyValue propertyvalue, @CheckForNull PropertyInstance propertyinstance, @CheckForNull Date date, @CheckForNull Long l) {
        this.namespace = str;
        this.name = propertykey;
        this.value = propertyvalue;
        this.instance = propertyinstance;
        this.timeOfSample = date;
        this.uncertaintyInMilliseconds = l;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <PropertyKey, PropertyValue, PropertyInstance> PropertyBuilder<PropertyKey, PropertyValue, PropertyInstance> builder() {
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
        if (!property.canEqual(this)) {
            return false;
        }
        Long uncertaintyInMilliseconds = getUncertaintyInMilliseconds();
        Long uncertaintyInMilliseconds2 = property.getUncertaintyInMilliseconds();
        if (uncertaintyInMilliseconds != null ? !uncertaintyInMilliseconds.equals(uncertaintyInMilliseconds2) : uncertaintyInMilliseconds2 != null) {
            return false;
        }
        String namespace = getNamespace();
        String namespace2 = property.getNamespace();
        if (namespace != null ? !namespace.equals(namespace2) : namespace2 != null) {
            return false;
        }
        PropertyKey name = getName();
        Object name2 = property.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        PropertyValue value = getValue();
        Object value2 = property.getValue();
        if (value != null ? !value.equals(value2) : value2 != null) {
            return false;
        }
        PropertyInstance property2 = getInstance();
        Object property3 = property.getInstance();
        if (property2 != null ? !property2.equals(property3) : property3 != null) {
            return false;
        }
        Date timeOfSample = getTimeOfSample();
        Date timeOfSample2 = property.getTimeOfSample();
        return timeOfSample != null ? timeOfSample.equals(timeOfSample2) : timeOfSample2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PropertyInstance getInstance() {
        return this.instance;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PropertyKey getName() {
        return this.name;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNamespace() {
        return this.namespace;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Date getTimeOfSample() {
        return this.timeOfSample;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getUncertaintyInMilliseconds() {
        return this.uncertaintyInMilliseconds;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PropertyValue getValue() {
        return this.value;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Long uncertaintyInMilliseconds = getUncertaintyInMilliseconds();
        int hashCode = uncertaintyInMilliseconds == null ? 43 : uncertaintyInMilliseconds.hashCode();
        String namespace = getNamespace();
        int hashCode2 = ((hashCode + 59) * 59) + (namespace == null ? 43 : namespace.hashCode());
        PropertyKey name = getName();
        int hashCode3 = (hashCode2 * 59) + (name == null ? 43 : name.hashCode());
        PropertyValue value = getValue();
        int hashCode4 = (hashCode3 * 59) + (value == null ? 43 : value.hashCode());
        PropertyInstance property = getInstance();
        int i = hashCode4 * 59;
        int hashCode5 = property == null ? 43 : property.hashCode();
        Date timeOfSample = getTimeOfSample();
        return ((i + hashCode5) * 59) + (timeOfSample != null ? timeOfSample.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        String namespace = getNamespace();
        String valueOf = String.valueOf(getName());
        String valueOf2 = String.valueOf(getValue());
        String valueOf3 = String.valueOf(getInstance());
        String valueOf4 = String.valueOf(getTimeOfSample());
        Long uncertaintyInMilliseconds = getUncertaintyInMilliseconds();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Property(namespace=", namespace, ", name=", valueOf, ", value=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, valueOf2, ", instance=", valueOf3, ", timeOfSample=");
        m.append(valueOf4);
        m.append(", uncertaintyInMilliseconds=");
        m.append(uncertaintyInMilliseconds);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
