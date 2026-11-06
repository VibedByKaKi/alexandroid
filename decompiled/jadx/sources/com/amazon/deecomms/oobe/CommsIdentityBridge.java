package com.amazon.deecomms.oobe;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.AlertSource;
import com.amazon.deecomms.oobe.structures.CVFResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsIdentityBridge {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CommsIdentityBridge.class);
    private final CommsIdentityReceiver identityReceiver;

    public CommsIdentityBridge(@NonNull CommsIdentityReceiver commsIdentityReceiver) {
        this.identityReceiver = commsIdentityReceiver;
    }

    @JavascriptInterface
    public void onVerificationFailure() {
        LOG.e("Received onVerificationFailure call from CVF");
        this.identityReceiver.onVerificationFailure(new VerificationFailure(CVFResult.SERVICE_INDICATED_FAILURE, AlertSource.newClassSource(this)));
    }

    @JavascriptInterface
    public void onVerifiedIdentity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            this.identityReceiver.onVerifiedIdentity(str, str2, str3);
        } else {
            LOG.e("The (directedId, commsId, phone) triple injected by the service wasincomplete, aborting identity verification.");
            this.identityReceiver.onVerificationFailure(new VerificationFailure(CVFResult.SERVICE_RESPONSE_MISSING_INFO, AlertSource.newClassSource(this)));
        }
    }
}
