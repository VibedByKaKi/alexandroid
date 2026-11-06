package com.amazon.alexa.featureservice.recordTrigger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Preconditions;
import com.amazon.alexa.featureservice.util.FeatureServiceNamespace;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RequestTreatment {
    private final String allocationId;
    private final String featureName;
    private final String namespace;

    @VisibleForTesting
    Date timeUsed;
    private final String treatmentUsed;

    public RequestTreatment(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(str3);
        String[] splitFeatureIdentifier = FeatureServiceNamespace.splitFeatureIdentifier(str);
        if (splitFeatureIdentifier.length > 1) {
            this.namespace = splitFeatureIdentifier[0];
            this.featureName = splitFeatureIdentifier[1];
        } else {
            this.namespace = null;
            this.featureName = splitFeatureIdentifier[0];
        }
        this.treatmentUsed = str2;
        this.allocationId = str3;
        this.timeUsed = new Date();
    }

    @NonNull
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

    @NonNull
    public Date getTimeUsed() {
        return this.timeUsed;
    }

    @NonNull
    public String getTreatmentUsed() {
        return this.treatmentUsed;
    }

    @NonNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(this.featureName);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.namespace);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.treatmentUsed);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.allocationId);
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(this.timeUsed);
        stringBuffer.append(AbstractJsonLexerKt.END_OBJ);
        return stringBuffer.toString();
    }
}
