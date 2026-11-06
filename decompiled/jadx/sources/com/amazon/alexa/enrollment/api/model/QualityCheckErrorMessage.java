package com.amazon.alexa.enrollment.api.model;

import com.google.common.base.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class QualityCheckErrorMessage {
    private Optional<Integer> errorDescription;
    private Optional<Integer> errorHeader;
    private String qualityCheckError;

    public QualityCheckErrorMessage(Optional<Integer> optional, Optional<Integer> optional2, String str) {
        this.errorHeader = optional;
        this.errorDescription = optional2;
        this.qualityCheckError = str;
    }

    public Optional<Integer> getErrorDescription() {
        return this.errorDescription;
    }

    public Optional<Integer> getErrorHeader() {
        return this.errorHeader;
    }

    public String getQualityCheckError() {
        return this.qualityCheckError;
    }
}
