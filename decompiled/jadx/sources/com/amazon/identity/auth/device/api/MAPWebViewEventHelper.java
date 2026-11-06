package com.amazon.identity.auth.device.api;

import android.os.Bundle;
import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public final class MAPWebViewEventHelper {

    @FireOsSdk
    public static final String AUTHENTICATION_EVENT = "authentication_event";

    @FireOsSdk
    public static final String AUTHENTICATION_ONLY_EVENT = "authentication_only_event";

    @FireOsSdk
    public static final String ERROR_EVENT = "error_event";

    @FireOsSdk
    public static final String ERROR_EVENT_VALUE = "error_event_value";

    @FireOsSdk
    public static final String KEY_ERRORS = "errors";

    @FireOsSdk
    public static final String KEY_EVENT_TYPE = "event_type";

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f511a;

    @FireOsSdk
    public MAPWebViewEventHelper(Bundle bundle) {
        this.f511a = bundle;
    }

    @FireOsSdk
    public boolean isAuthenticationEvent() {
        Bundle bundle = this.f511a;
        if (bundle == null ? false : bundle.containsKey("event_type")) {
            return this.f511a.getString("event_type").equals(AUTHENTICATION_EVENT);
        }
        return false;
    }

    @FireOsSdk
    public boolean isErrorEvent() {
        Bundle bundle = this.f511a;
        if (bundle == null ? false : bundle.containsKey("event_type")) {
            return this.f511a.getString("event_type").equals(ERROR_EVENT);
        }
        return false;
    }
}
