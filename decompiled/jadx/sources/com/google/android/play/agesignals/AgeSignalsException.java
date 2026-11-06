package com.google.android.play.agesignals;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class AgeSignalsException extends ApiException {
    public AgeSignalsException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i))));
        if (i != 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("errorCode should not be 0.");
        throw null;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }

    public AgeSignalsException(@NonNull Status status) {
        super(status);
    }
}
