package com.amazon.deecomms.calling.controller;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.deecomms.R;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class CallingProviderContract {
    public static final String CALLS_PATH = "calls";
    public static final String CONTENT_SCHEME = "content";

    private CallingProviderContract() {
    }

    public static String getAuthorityId(@Nonnull Context context) {
        return context.getString(R.string.callingProviderAuthoritiesId);
    }

    public static Uri getCallUri(@Nonnull Context context) {
        return ErrorUtils$$ExternalSyntheticOutline0.m28m("content").authority(getAuthorityId(context)).path(CALLS_PATH).build();
    }

    public static String getCallsContentType(@Nonnull Context context) {
        return "vnd.android.cursor.item/vnd." + getAuthorityId(context) + ".calls";
    }

    @VisibleForTesting
    public static CallingProviderContract getInstance() {
        return new CallingProviderContract();
    }
}
