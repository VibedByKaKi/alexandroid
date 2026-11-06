package com.amazon.bluefront.api.v2;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RecognitionParameters implements Comparable<RecognitionParameters> {
    private String applicationId;
    private DialogHint dialogHint;
    private int maxNBest;
    private String modelSetVersion;
    private String outputFormat;
    private WakewordIndices wwIndices;

    @Override // java.lang.Comparable
    public int compareTo(RecognitionParameters recognitionParameters) {
        return new CompareToBuilder().append(getMaxNBest(), recognitionParameters.getMaxNBest()).append(getOutputFormat(), recognitionParameters.getOutputFormat()).append(getApplicationId(), recognitionParameters.getApplicationId()).append(getDialogHint(), recognitionParameters.getDialogHint()).append(getModelSetVersion(), recognitionParameters.getModelSetVersion()).append(getWwIndices(), recognitionParameters.getWwIndices()).toComparison();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RecognitionParameters) && compareTo((RecognitionParameters) obj) == 0;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public DialogHint getDialogHint() {
        return this.dialogHint;
    }

    public int getMaxNBest() {
        return this.maxNBest;
    }

    public String getModelSetVersion() {
        return this.modelSetVersion;
    }

    public String getOutputFormat() {
        return this.outputFormat;
    }

    public WakewordIndices getWwIndices() {
        return this.wwIndices;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(getMaxNBest()).append(getOutputFormat()).append(getApplicationId()).append(getDialogHint()).append(getModelSetVersion()).append(getWwIndices()).hashCode();
    }

    public void setApplicationId(String str) {
        this.applicationId = str;
    }

    public void setDialogHint(DialogHint dialogHint) {
        this.dialogHint = dialogHint;
    }

    public void setMaxNBest(int i) {
        this.maxNBest = i;
    }

    public void setModelSetVersion(String str) {
        this.modelSetVersion = str;
    }

    public void setOutputFormat(String str) {
        this.outputFormat = str;
    }

    public void setWwIndices(WakewordIndices wakewordIndices) {
        this.wwIndices = wakewordIndices;
    }
}
