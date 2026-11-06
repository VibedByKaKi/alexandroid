package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {
    private final List<LogRequest> logRequests;

    public AutoValue_BatchedLogRequest(List<LogRequest> list) {
        if (list != null) {
            this.logRequests = list;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null logRequests");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.logRequests.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @NonNull
    @Encodable.Field(name = "logRequest")
    public List<LogRequest> getLogRequests() {
        return this.logRequests;
    }

    public int hashCode() {
        return this.logRequests.hashCode() ^ 1000003;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.logRequests, new StringBuilder("BatchedLogRequest{logRequests="));
    }
}
