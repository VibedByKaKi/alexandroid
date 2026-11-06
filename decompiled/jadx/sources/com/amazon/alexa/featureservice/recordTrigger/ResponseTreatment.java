package com.amazon.alexa.featureservice.recordTrigger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class ResponseTreatment {
    private final String allocationId;
    private final String featureName;
    private final String namespace;
    private final String recordStatus;
    private final String treatment;
    private final boolean triggerOnUse;

    public ResponseTreatment(@NonNull String str, @Nullable String str2, @NonNull String str3, @Nullable String str4, boolean z, String str5) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str3);
        this.featureName = str;
        this.namespace = str2;
        this.treatment = str3;
        this.allocationId = str4;
        this.triggerOnUse = z;
        this.recordStatus = str5;
    }

    @Nullable
    public String getAllocationId() {
        return this.allocationId;
    }

    @NonNull
    public String getFeatureName() {
        return this.featureName;
    }

    @Nullable
    public String getNamespace() {
        return this.namespace;
    }

    public String getRecordStatus() {
        return this.recordStatus;
    }

    @NonNull
    public String getTreatment() {
        return this.treatment;
    }

    public boolean isTriggerOnUse() {
        return this.triggerOnUse;
    }

    @NonNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(this.featureName);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.namespace);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.treatment);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.allocationId);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.triggerOnUse);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.recordStatus);
        stringBuffer.append(AbstractJsonLexerKt.END_OBJ);
        return stringBuffer.toString();
    }
}
