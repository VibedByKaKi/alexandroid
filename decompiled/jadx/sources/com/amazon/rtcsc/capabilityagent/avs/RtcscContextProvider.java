package com.amazon.rtcsc.capabilityagent.avs;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.model.AlexaContext;
import com.amazon.alexa.api.compat.model.AlexaContextsProvider;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import com.amazon.rtcsc.capabilityagent.common.core.RtcscConstants;
import com.amazon.rtcsc.capabilityagent.common.dependencies.RtcscDaggerWrapper;
import com.amazon.rtcsc.capabilityagent.common.util.RtcscLogger;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class RtcscContextProvider implements AlexaContextsProvider {
    private static final String TAG = "RtcscContextProvider";

    @VisibleForTesting
    volatile AlexaContext mRtcscContext;

    @Inject
    public RtcscContextProvider() {
        RtcscDaggerWrapper.getComponent().inject(this);
        RtcscLogger.i(TAG, "created new RtcscContextProvider", new Object[0]);
    }

    @NonNull
    @VisibleForTesting
    public AlexaHeader createHeader() {
        RtcscLogger.d(TAG, "createHeader", new Object[0]);
        return AlexaHeader.builder().setNamespace("Alexa.RTCSessionController").setName(RtcscConstants.RTCSC_CONTEXT_STATE_NAME).build();
    }

    @NonNull
    @VisibleForTesting
    public AlexaPayload createPayload(@NonNull String str) {
        RtcscLogger.d(TAG, "createPayload", new Object[0]);
        return new AlexaPayload(str);
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaContextsProvider
    @NonNull
    public Set<AlexaContext> getAlexaContexts() {
        if (this.mRtcscContext == null) {
            RtcscLogger.d(TAG, "getAlexaContexts -- no session context yet, returning empty", new Object[0]);
            return Collections.EMPTY_SET;
        }
        RtcscLogger.d(TAG, "getAlexaContext", new Object[0]);
        return Collections.singleton(this.mRtcscContext);
    }

    public synchronized void setRtcscSessionContext(@NonNull String str) {
        try {
            RtcscLogger.i(TAG, "setRtcscSessionContext", new Object[0]);
            if (str == null || str.isEmpty()) {
                RtcscLogger.w(TAG, "rtcscSessionContext is empty. skipping to update context", new Object[0]);
            } else {
                this.mRtcscContext = new AlexaContext(createHeader(), createPayload(str));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public RtcscContextProvider(String str) {
    }
}
