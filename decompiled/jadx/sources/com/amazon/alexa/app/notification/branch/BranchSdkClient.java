package com.amazon.alexa.app.notification.branch;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface BranchSdkClient {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SessionCallback {
        void onComplete(@Nullable JSONObject jSONObject, @Nullable String str);
    }

    void initialize(Context context);

    boolean isSessionInitialized();

    boolean isSessionInitializing();

    boolean logEvent(Context context, String str, String str2, String str3);

    void reinitializeSession(Activity activity, SessionCallback sessionCallback);

    void setRequestMetadata(String str, String str2);

    void startSession(Activity activity, @Nullable Uri uri, SessionCallback sessionCallback);

    void validateIntegration(Context context);

    default void clearIdentity() {
    }

    default void setIdentity(String str) {
    }
}
