package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.InstallErrorCode;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class InstallException extends ApiException {
    public InstallException(@InstallErrorCode int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i), com.google.android.play.core.install.model.zza.zza(i))));
        if (i != 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("errorCode should not be 0.");
        throw null;
    }

    @InstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}
