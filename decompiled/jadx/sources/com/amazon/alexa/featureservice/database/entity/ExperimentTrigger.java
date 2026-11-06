package com.amazon.alexa.featureservice.database.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index({"uploaded"})}, primaryKeys = {"feature_name", "namespace"})
/* loaded from: classes17.dex */
public class ExperimentTrigger {

    @NonNull
    @ColumnInfo(name = "allocation_id")
    public String allocationId;

    @NonNull
    @ColumnInfo(name = "feature_name")
    public String featureName;

    @NonNull
    @ColumnInfo(name = "namespace")
    public String namespace;

    @NonNull
    @ColumnInfo(name = "time_used")
    public long timeUsed;

    @NonNull
    @ColumnInfo(name = "treatment_used")
    public String treatmentUsed;

    @ColumnInfo(name = "uploaded")
    public boolean uploaded;

    @Ignore
    public ExperimentTrigger(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull Long l, boolean z) {
        this.featureName = str;
        this.namespace = str2;
        this.allocationId = str3;
        this.treatmentUsed = str4;
        this.timeUsed = l.longValue();
        this.uploaded = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExperimentTrigger) {
            ExperimentTrigger experimentTrigger = (ExperimentTrigger) obj;
            if (this.timeUsed == experimentTrigger.timeUsed && this.uploaded == experimentTrigger.uploaded && this.featureName.equals(experimentTrigger.featureName) && this.namespace.equals(experimentTrigger.namespace) && this.allocationId.equals(experimentTrigger.allocationId) && this.treatmentUsed.equals(experimentTrigger.treatmentUsed)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAllocationId() {
        return this.allocationId;
    }

    @NonNull
    public String getFeatureName() {
        return this.featureName;
    }

    @NonNull
    public String getNamespace() {
        return this.namespace;
    }

    public long getTimeUsed() {
        return this.timeUsed;
    }

    @NonNull
    public String getTreatmentUsed() {
        return this.treatmentUsed;
    }

    public int hashCode() {
        return BitVector$$ExternalSyntheticOutline0.m(this.timeUsed, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.featureName.hashCode() * 31, 31, this.namespace), 31, this.allocationId), 31, this.treatmentUsed), 31) + (this.uploaded ? 1 : 0);
    }

    public boolean isUploaded() {
        return this.uploaded;
    }

    public void setAllocationId(@NonNull String str) {
        this.allocationId = str;
    }

    public void setFeatureName(@NonNull String str) {
        this.featureName = str;
    }

    public void setNamespace(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.namespace = str;
    }

    public void setTimeUsed(long j) {
        this.timeUsed = j;
    }

    public void setTreatmentUsed(@NonNull String str) {
        this.treatmentUsed = str;
    }

    public void setUploaded(boolean z) {
        this.uploaded = z;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Trigger{featureName='");
        sb.append(this.featureName);
        sb.append("', namespace='");
        sb.append(this.namespace);
        sb.append("', allocationId='");
        sb.append(this.allocationId);
        sb.append("', treatmentUsed='");
        sb.append(this.treatmentUsed);
        sb.append("', timeUsed=");
        sb.append(this.timeUsed);
        sb.append(", uploaded=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.uploaded, AbstractJsonLexerKt.END_OBJ);
    }

    public ExperimentTrigger() {
        this.namespace = "";
    }
}
