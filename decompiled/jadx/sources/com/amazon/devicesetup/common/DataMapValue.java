package com.amazon.devicesetup.common;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common/")
@CoralSuppressWarnings
@Generated
@XmlName("DataMapValue")
@Documentation("Generic structure for data map in which value can be int, string, bool or bytes")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class DataMapValue {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.DataMapValue");
    private boolean boolValue;
    private ByteBuffer bytesValue;
    private int integerValue;
    private String stringValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected boolean boolValue;
        protected ByteBuffer bytesValue;
        protected int integerValue;
        protected String stringValue;

        public DataMapValue build() {
            DataMapValue dataMapValue = new DataMapValue();
            populate(dataMapValue);
            return dataMapValue;
        }

        public void populate(DataMapValue dataMapValue) {
            dataMapValue.setBytesValue(this.bytesValue);
            dataMapValue.setStringValue(this.stringValue);
            dataMapValue.setIntegerValue(this.integerValue);
            dataMapValue.setBoolValue(this.boolValue);
        }

        public Builder withBoolValue(boolean z) {
            this.boolValue = z;
            return this;
        }

        public Builder withBytesValue(ByteBuffer byteBuffer) {
            this.bytesValue = byteBuffer;
            return this;
        }

        public Builder withIntegerValue(int i) {
            this.integerValue = i;
            return this;
        }

        public Builder withStringValue(String str) {
            this.stringValue = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataMapValue)) {
            return false;
        }
        DataMapValue dataMapValue = (DataMapValue) obj;
        return Objects.equals(getBytesValue(), dataMapValue.getBytesValue()) && Objects.equals(getStringValue(), dataMapValue.getStringValue()) && Integer.valueOf(getIntegerValue()).equals(Integer.valueOf(dataMapValue.getIntegerValue())) && Boolean.valueOf(isBoolValue()).equals(Boolean.valueOf(dataMapValue.isBoolValue()));
    }

    public ByteBuffer getBytesValue() {
        return this.bytesValue;
    }

    public int getIntegerValue() {
        return this.integerValue;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getBytesValue(), getStringValue(), Integer.valueOf(getIntegerValue()), Boolean.valueOf(isBoolValue()));
    }

    public boolean isBoolValue() {
        return this.boolValue;
    }

    public void setBoolValue(boolean z) {
        this.boolValue = z;
    }

    public void setBytesValue(ByteBuffer byteBuffer) {
        this.bytesValue = byteBuffer;
    }

    public void setIntegerValue(int i) {
        this.integerValue = i;
    }

    public void setStringValue(String str) {
        this.stringValue = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withBytesValue(getBytesValue());
        builder.withStringValue(getStringValue());
        builder.withIntegerValue(getIntegerValue());
        builder.withBoolValue(isBoolValue());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataMapValue(bytesValue=");
        sb.append(String.valueOf(this.bytesValue));
        sb.append(", stringValue=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.stringValue, ", integerValue=", sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", boolValue=", this.integerValue, sb);
        sb.append(String.valueOf(this.boolValue));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
