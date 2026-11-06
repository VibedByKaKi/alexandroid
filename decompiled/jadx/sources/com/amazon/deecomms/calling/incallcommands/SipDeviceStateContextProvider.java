package com.amazon.deecomms.calling.incallcommands;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.api.compat.model.AlexaContext;
import com.amazon.alexa.api.compat.model.AlexaContextsProvider;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SipDeviceStateContextProvider implements AlexaContextsProvider {
    private static volatile SipDeviceStateContextProvider sipDeviceStateContextProvider;
    private volatile String deviceCallStateSerialized;

    @NonNull
    private AlexaHeader createHeader() {
        return AlexaHeader.builder().setNamespace("SipClient").setName("SipClientState").build();
    }

    @NonNull
    private AlexaPayload createPayload(@NonNull String str) {
        return new AlexaPayload(str);
    }

    public static synchronized SipDeviceStateContextProvider getOrCreateSipDeviceStateContextProvider() {
        SipDeviceStateContextProvider sipDeviceStateContextProvider2;
        synchronized (SipDeviceStateContextProvider.class) {
            try {
                if (sipDeviceStateContextProvider == null) {
                    sipDeviceStateContextProvider = new SipDeviceStateContextProvider();
                }
                sipDeviceStateContextProvider2 = sipDeviceStateContextProvider;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sipDeviceStateContextProvider2;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaContextsProvider
    @NonNull
    public Set<AlexaContext> getAlexaContexts() {
        AlexaPayload createPayload;
        AlexaHeader createHeader = createHeader();
        synchronized (this) {
            if (TextUtils.isEmpty(this.deviceCallStateSerialized)) {
                throw new IllegalStateException("deviceCallState is null or is empty. Use setDeviceCallStateMethod");
            }
            createPayload = createPayload(this.deviceCallStateSerialized);
        }
        return Collections.singleton(new AlexaContext(createHeader, createPayload));
    }

    public synchronized void setDeviceCallStateSerialized(@NonNull String str) {
        this.deviceCallStateSerialized = str;
    }
}
