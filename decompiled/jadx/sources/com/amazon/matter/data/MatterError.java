package com.amazon.matter.data;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MatterError {
    private String errorMessage;
    private MatterErrorType errorType;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public MatterError(MatterErrorType matterErrorType, String str) {
        this.errorType = matterErrorType;
        this.errorMessage = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public MatterErrorType getErrorType() {
        return this.errorType;
    }
}
