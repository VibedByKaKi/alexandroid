package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazon.alexa.api.AlexaApiCallbacksBundler;
import com.amazon.alexa.client.alexaservice.ApiCallIdentifier;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.concurrent.TimeUnit;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ApiCallback {
    private final ApiCallIdentifier id;

    @Nullable
    private final AlexaApiCallbacksMessageSender messageSender;

    @Nullable
    private final TimeUnit timeoutUnit;
    private final long timeoutValue;

    public ApiCallback(@Nullable Bundle bundle) {
        if (bundle == null) {
            this.timeoutValue = 0L;
            this.timeoutUnit = null;
            this.id = ApiCallIdentifier.createRandom();
            this.messageSender = null;
            return;
        }
        this.id = ApiCallIdentifier.create(Bundles.getString(bundle, AlexaApiCallbacksBundler.ApiCallExtrasKeys.ID));
        this.timeoutUnit = extractTimeUnit(bundle);
        this.timeoutValue = Bundles.getLong(bundle, AlexaApiCallbacksBundler.ApiCallExtrasKeys.TIMEOUT_VALUE);
        IBinder optionalBinder = Bundles.getOptionalBinder(bundle, AlexaApiCallbacksBundler.ApiCallExtrasKeys.CALLBACK);
        if (optionalBinder != null) {
            this.messageSender = createMessageSender(optionalBinder);
        } else {
            this.messageSender = null;
        }
    }

    private TimeUnit extractTimeUnit(Bundle bundle) {
        String optionalString = Bundles.getOptionalString(bundle, AlexaApiCallbacksBundler.ApiCallExtrasKeys.TIMEOUT_UNIT);
        if (!TextUtils.isEmpty(optionalString)) {
            try {
                return TimeUnit.valueOf(optionalString);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public AlexaApiCallbacksMessageSender createMessageSender(IBinder iBinder) {
        return new AlexaApiCallbacksMessageSender(iBinder, AlexaClient.CLIENT);
    }

    public ApiCallIdentifier getId() {
        return this.id;
    }

    @Nullable
    public TimeUnit getTimeoutUnit() {
        return this.timeoutUnit;
    }

    public long getTimeoutValue() {
        return this.timeoutValue;
    }

    public boolean hasTimeoutSpecified() {
        return getTimeoutValue() > 0 && getTimeoutUnit() != null;
    }

    public void onFailure(ApiCallFailure apiCallFailure) throws RemoteException {
        AlexaApiCallbacksMessageSender alexaApiCallbacksMessageSender = this.messageSender;
        if (alexaApiCallbacksMessageSender != null) {
            alexaApiCallbacksMessageSender.onFailure(apiCallFailure);
        }
    }

    public void onSuccess() throws RemoteException {
        AlexaApiCallbacksMessageSender alexaApiCallbacksMessageSender = this.messageSender;
        if (alexaApiCallbacksMessageSender != null) {
            alexaApiCallbacksMessageSender.onSuccess();
        }
    }

    public String toString() {
        return "ApiCallExtras{id=" + this.id + StringSubstitutor.DEFAULT_VAR_END;
    }

    public ApiCallback() {
        this(null);
    }
}
