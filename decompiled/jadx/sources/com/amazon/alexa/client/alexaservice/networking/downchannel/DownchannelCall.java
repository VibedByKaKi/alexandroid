package com.amazon.alexa.client.alexaservice.networking.downchannel;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority;
import com.amazon.alexa.client.alexaservice.base.system.EndpointAuthority;
import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DownchannelEstablishmentFailureEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.DownchannelFalseAuthorizationErrorEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.DownchannelStateEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ResponseReceivedEvent;
import com.amazon.alexa.client.alexaservice.networking.ConnectivityAuthority;
import com.amazon.alexa.client.alexaservice.networking.NetworkAuthority;
import com.amazon.alexa.client.alexaservice.networking.response.ResponseHandler;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import dagger.Lazy;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DownchannelCall implements Callable<Void> {
    private static final double CRASH_REPORT_PROBABILITY = 0.001d;

    @VisibleForTesting
    static final int HTTP_STATUS_CODE_UNAUTHORIZED = 403;
    private static final String TAG = "DownchannelCall";
    private final AlexaClientEventBus alexaClientEventBus;
    private final Lazy<AuthorizationAuthority> authorizationAuthority;
    private Call call;
    private final ConnectivityAuthority connectivityAuthority;
    private final CrashReporter crashReporter;
    private final Lazy<EndpointAuthority> endpointAuthority;
    private volatile boolean isAbandoned;
    private volatile boolean isCancelled;
    private volatile boolean isClosed;
    private final OkHttpClient okHttpClient;
    private final ResponseHandler responseHandler;
    private final Object callLock = new Object();
    private final DownchannelIdentifier downchannelId = DownchannelIdentifier.createRandom();

    public DownchannelCall(ConnectivityAuthority connectivityAuthority, NetworkAuthority networkAuthority, Lazy<EndpointAuthority> lazy, ResponseHandler responseHandler, AlexaClientEventBus alexaClientEventBus, Lazy<AuthorizationAuthority> lazy2, CrashReporter crashReporter) {
        this.connectivityAuthority = connectivityAuthority;
        this.okHttpClient = networkAuthority.getDownchannelClient();
        this.endpointAuthority = lazy;
        this.responseHandler = responseHandler;
        this.alexaClientEventBus = alexaClientEventBus;
        this.authorizationAuthority = lazy2;
        this.crashReporter = crashReporter;
    }

    private void closeResponse(Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            body.close();
        }
    }

    private boolean createCall(Request request) {
        synchronized (this.callLock) {
            try {
                if (this.isCancelled) {
                    Log.e(TAG, "Downchannel has been cancelled: " + this.downchannelId);
                    return false;
                }
                if (!this.isAbandoned) {
                    this.call = this.okHttpClient.newCall(request);
                    return true;
                }
                Log.e(TAG, "Downchannel has been abandoned: " + this.downchannelId);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private Response retryWithFreshAuthorizationToken(Request request, Response response) throws IOException {
        AuthorizationAuthority authorizationAuthority = this.authorizationAuthority.get();
        authorizationAuthority.forceAccountRefresh();
        if (!authorizationAuthority.isLoggedIn()) {
            Log.i(TAG, "There is no account, cannot establish a downchannel");
            this.alexaClientEventBus.post(DownchannelEstablishmentFailureEvent.create(DownchannelEstablishmentFailureEvent.DownchannelEstablishmentFailureType.AUTHORIZATION, Integer.valueOf(response.code())));
            return response;
        }
        Log.i(TAG, "Despite having an account the downchannel was unauthorized. Retrying with a fresh token.");
        closeResponse(response);
        this.alexaClientEventBus.post(DownchannelFalseAuthorizationErrorEvent.create());
        if (createCall(request)) {
            return this.call.execute();
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        if (this.isClosed || this.isAbandoned || this.isCancelled) {
            Log.e(TAG, "Attempted to restart a finished downchannel: " + this.downchannelId);
            this.alexaClientEventBus.post(DownchannelStateEvent.create(false, this.downchannelId));
            return null;
        }
        if (!this.connectivityAuthority.hasNetworkConnectivity()) {
            Objects.toString(this.downchannelId);
            this.alexaClientEventBus.post(DownchannelEstablishmentFailureEvent.create(DownchannelEstablishmentFailureEvent.DownchannelEstablishmentFailureType.NO_NETWORK));
            this.alexaClientEventBus.post(DownchannelStateEvent.create(false, this.downchannelId));
            return null;
        }
        Request build = new Request.Builder().tag(RequestIdentifier.createRandom()).url(this.endpointAuthority.get().getDirectivesHttpUrl()).get().build();
        try {
            try {
                if (!createCall(build)) {
                    return null;
                }
                String str = TAG;
                Log.i(str, "Starting downchannel: " + this.downchannelId);
                Response execute = this.call.execute();
                checkForDownchannelException();
                if (403 == getStatusCode(execute) && (execute = retryWithFreshAuthorizationToken(build, execute)) == null) {
                    Log.i(str, "Closing downchannel: " + this.downchannelId);
                    this.alexaClientEventBus.post(DownchannelStateEvent.create(false, this.downchannelId));
                    this.isClosed = true;
                    return null;
                }
                int statusCode = getStatusCode(execute);
                AlexaClientEventBus alexaClientEventBus = this.alexaClientEventBus;
                if (200 == statusCode) {
                    alexaClientEventBus.post(DownchannelStateEvent.create(true, this.downchannelId));
                    Log.i(str, "Downchannel established downchannel: " + this.downchannelId);
                } else {
                    alexaClientEventBus.post(DownchannelEstablishmentFailureEvent.create(DownchannelEstablishmentFailureEvent.DownchannelEstablishmentFailureType.AVS_FAILURE, Integer.valueOf(statusCode)));
                }
                this.responseHandler.onResponse(ResponseReceivedEvent.createDownchannelResponse(execute, ResponseReceivedEvent.ResponseInfo.create(true)));
                Log.i(str, "Closing downchannel: " + this.downchannelId);
                this.alexaClientEventBus.post(DownchannelStateEvent.create(false, this.downchannelId));
                this.isClosed = true;
                return null;
            } catch (IOException e) {
                String str2 = TAG;
                Log.e(str2, e.getMessage(), e);
                this.alexaClientEventBus.post(DownchannelEstablishmentFailureEvent.create(DownchannelEstablishmentFailureEvent.DownchannelEstablishmentFailureType.IO_EXCEPTION, e));
                if (!ConnectivityAuthority.isCausedByUnknownHostException(e)) {
                    this.crashReporter.notifyHandledException(e, 0.001d);
                }
                Log.i(str2, "Closing downchannel: " + this.downchannelId);
                this.alexaClientEventBus.post(DownchannelStateEvent.create(false, this.downchannelId));
                this.isClosed = true;
                return null;
            }
        } finally {
            Log.i(TAG, "Closing downchannel: " + this.downchannelId);
            this.alexaClientEventBus.post(DownchannelStateEvent.create(false, this.downchannelId));
            this.isClosed = true;
        }
    }

    public void cancel() {
        synchronized (this.callLock) {
            try {
                this.isCancelled = true;
                Call call = this.call;
                if (call != null && !call.isCanceled()) {
                    Log.i(TAG, "Downchannel cancelled: " + this.downchannelId);
                    this.call.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DownchannelIdentifier getDownchannelIdentifier() {
        return this.downchannelId;
    }

    @VisibleForTesting
    public int getStatusCode(Response response) {
        return response.code();
    }

    public boolean isAbandoned() {
        boolean z;
        synchronized (this.callLock) {
            z = this.isAbandoned;
        }
        return z;
    }

    public void onAbandon() {
        Log.i(TAG, "Downchannel abandoned: " + this.downchannelId);
        synchronized (this.callLock) {
            this.isAbandoned = true;
        }
    }

    @VisibleForTesting
    public void checkForDownchannelException() throws IOException {
    }
}
