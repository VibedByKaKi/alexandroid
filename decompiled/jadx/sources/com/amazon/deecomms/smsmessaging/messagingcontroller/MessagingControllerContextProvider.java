package com.amazon.deecomms.smsmessaging.messagingcontroller;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.api.compat.model.AlexaContext;
import com.amazon.alexa.api.compat.model.AlexaContextsProvider;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MessagingControllerContextProvider implements AlexaContextsProvider {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MessagingControllerContextProvider.class);

    @Inject
    Context mContext;
    private volatile AlexaContext mDeviceContext;
    private volatile AlexaHeader mDeviceContextHeader = createHeader();
    private volatile JSONObject mDeviceContextPayload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ContextUpdated {
        void onContextUpdated();
    }

    public MessagingControllerContextProvider() {
        CommsDaggerWrapper.getComponent().inject(this);
        updateContext(null);
    }

    @NonNull
    private AlexaHeader createHeader() {
        return AlexaHeader.builder().setNamespace(MessagingControllerConstant.MESSAGING_CONTROLLER_NAMESPACE).setName(MessagingControllerConstant.MESSAGING_CONTROLLER_CONTEXT_STATE_NAME).build();
    }

    @NonNull
    private AlexaPayload createPayload(@NonNull String str) {
        return new AlexaPayload(str);
    }

    private synchronized void createPayloadJSON() {
        try {
            this.mDeviceContextPayload = new JSONObject();
            try {
                JSONObject jSONObject = new JSONObject();
                String str = ContextCompat.checkSelfPermission(this.mContext, "android.permission.SEND_SMS") == 0 ? "ON" : "OFF";
                String str2 = ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_SMS") == 0 ? "ON" : "OFF";
                jSONObject.put(MessagingControllerConstant.MESSAGING_CONTROLLER_ENDPOINT_SEND_PERMISSION_KEY, str);
                jSONObject.put(MessagingControllerConstant.MESSAGING_CONTROLLER_ENDPOINT_READ_PERMISSION_KEY, str2);
                this.mDeviceContextPayload.put(MessagingControllerConstant.MESSAGING_CONTROLLER_ENDPOINT_PERMISSIONS_KEY, jSONObject);
            } catch (JSONException e) {
                LOG.e("JSON error while creating Messaging Controller device context payload.", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaContextsProvider
    @NonNull
    public Set<AlexaContext> getAlexaContexts() {
        if (this.mDeviceContext != null) {
            updateContext(null);
            return Collections.singleton(this.mDeviceContext);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Messaging Controller Context is null. Call updateContextWithAccessoryInformation()");
        return null;
    }

    public synchronized void updateContext(@Nullable ContextUpdated contextUpdated) {
        createPayloadJSON();
        this.mDeviceContext = new AlexaContext(this.mDeviceContextHeader, createPayload(this.mDeviceContextPayload.toString()));
        if (contextUpdated != null) {
            contextUpdated.onContextUpdated();
        }
    }
}
