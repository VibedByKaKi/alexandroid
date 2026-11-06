package com.amazon.deecomms.oobe;

import androidx.annotation.NonNull;
import com.amazon.deecomms.common.metrics.AlertSource;
import com.amazon.deecomms.oobe.structures.CVFResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class VerificationFailure {
    private final AlertSource alertSource;
    private final String clientId;
    private final CVFResult errorClass;
    private final String requestId;

    public VerificationFailure(CVFResult cVFResult, String str, String str2, @NonNull AlertSource alertSource) {
        this.errorClass = cVFResult;
        this.requestId = str;
        this.clientId = str2;
        this.alertSource = alertSource;
    }

    public AlertSource getAlertSource() {
        return this.alertSource;
    }

    public String getClientId() {
        return this.clientId;
    }

    public CVFResult getErrorClass() {
        return this.errorClass;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public VerificationFailure(CVFResult cVFResult, @NonNull AlertSource alertSource) {
        this(cVFResult, null, null, alertSource);
    }
}
