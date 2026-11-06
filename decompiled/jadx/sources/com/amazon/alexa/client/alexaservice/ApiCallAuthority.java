package com.amazon.alexa.client.alexaservice;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.ApiCallFailure;
import com.amazon.alexa.api.ApiCallback;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ApiCallEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ApiCallAuthority {
    private static final String SCHEDULED_EXECUTOR_NAME = "api-call-timeout";
    private static final String TAG = "ApiCallAuthority";
    private final Map<ApiCallMetadata, ScheduledFuture<?>> apiCallTimeoutTasks;
    private final Map<ApiCallMetadata, ApiCallback> apiCallbacks;
    private final Map<ApiCallback, ExtendedClient> clients;
    private final AlexaClientEventBus eventBus;
    private final ScheduledExecutorService scheduledExecutorService;

    public ApiCallAuthority(AlexaClientEventBus alexaClientEventBus, ScheduledExecutorService scheduledExecutorService) {
        this.eventBus = alexaClientEventBus;
        this.scheduledExecutorService = scheduledExecutorService;
        this.apiCallTimeoutTasks = new HashMap();
        this.apiCallbacks = new HashMap();
        this.clients = new HashMap();
        alexaClientEventBus.register(this);
    }

    private void addEvent(ApiCallEvent.RequestApiEvent requestApiEvent) {
        synchronized (this.apiCallbacks) {
            try {
                if (!this.apiCallbacks.containsKey(requestApiEvent.getApiCallMetadata())) {
                    this.apiCallbacks.put(requestApiEvent.getApiCallMetadata(), requestApiEvent.getApiCallback());
                    this.clients.put(requestApiEvent.getApiCallback(), requestApiEvent.getClient());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        scheduleTimeout(requestApiEvent);
    }

    private void cancelTimeoutTask(ApiCallMetadata apiCallMetadata) {
        ScheduledFuture<?> remove = this.apiCallTimeoutTasks.remove(apiCallMetadata);
        if (remove != null) {
            remove.cancel(true);
        }
    }

    private void removeApiCallback(ApiCallback apiCallback, ApiCallMetadata apiCallMetadata) {
        synchronized (this.apiCallbacks) {
            this.clients.remove(apiCallback);
            this.apiCallbacks.remove(apiCallMetadata);
            cancelTimeoutTask(apiCallMetadata);
        }
    }

    private void reportFailure(final ApiCallback apiCallback, ApiCallMetadata apiCallMetadata, final ApiCallFailure apiCallFailure, boolean z) {
        sendApiResult(new Callable<Void>() { // from class: com.amazon.alexa.client.alexaservice.ApiCallAuthority.2
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Log.w(ApiCallAuthority.TAG, "API call " + apiCallback.getId() + " failed due to " + apiCallFailure.getMessage());
                apiCallback.onFailure(apiCallFailure);
                return null;
            }
        }, apiCallMetadata, false);
        if (z) {
            removeApiCallback(apiCallback, apiCallMetadata);
        }
    }

    private void reportSuccess(final ApiCallback apiCallback, ApiCallMetadata apiCallMetadata) {
        sendApiResult(new Callable<Void>() { // from class: com.amazon.alexa.client.alexaservice.ApiCallAuthority.1
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Log.i(ApiCallAuthority.TAG, "API call " + apiCallback.getId() + " succeeded");
                apiCallback.onSuccess();
                return null;
            }
        }, apiCallMetadata, true);
        removeApiCallback(apiCallback, apiCallMetadata);
    }

    private void scheduleTimeout(ApiCallEvent.RequestApiEvent requestApiEvent) {
        ApiCallback apiCallback = requestApiEvent.getApiCallback();
        if (apiCallback.hasTimeoutSpecified()) {
            this.apiCallTimeoutTasks.put(requestApiEvent.getApiCallMetadata(), this.scheduledExecutorService.schedule(new TimeoutRunnable(requestApiEvent.getApiCallMetadata(), this.eventBus, 0), apiCallback.getTimeoutValue(), apiCallback.getTimeoutUnit()));
        }
    }

    private void sendApiResult(Callable<Void> callable, ApiCallMetadata apiCallMetadata, boolean z) {
        String str = z ? "success" : SendEventResultBundleKeys.FAILURE;
        try {
            callable.call();
        } catch (RemoteException e) {
            Log.e(TAG, "RemoteException encountered trying to report api call ".concat(str), e);
            synchronized (this.apiCallbacks) {
                try {
                    ApiCallback apiCallback = this.apiCallbacks.get(apiCallMetadata);
                    ExtendedClient extendedClient = apiCallback != null ? this.clients.get(apiCallback) : null;
                    if (extendedClient != null) {
                        this.eventBus.post(ClientDisconnectedEvent.create(extendedClient));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            Log.e(TAG, "Exception encountered trying to report api call ".concat(str), e2);
        }
    }

    @Subscribe
    public void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        HashMap hashMap = new HashMap();
        synchronized (this.apiCallbacks) {
            try {
                for (Map.Entry<ApiCallMetadata, ApiCallback> entry : this.apiCallbacks.entrySet()) {
                    ExtendedClient extendedClient = this.clients.get(entry.getValue());
                    if (extendedClient != null && extendedClient.equals(clientDisconnectedEvent.getClient())) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            removeApiCallback((ApiCallback) entry2.getValue(), (ApiCallMetadata) entry2.getKey());
            try {
                ((ApiCallback) entry2.getValue()).onFailure(ApiCallFailure.MessagingFailure.create("Client is disconnected"));
            } catch (RemoteException unused) {
                Log.w(TAG, "Unable to report client failure due to RemoteException");
            }
        }
    }

    public void teardown() {
        boolean z;
        ManagedExecutorFactory.shutdown(SCHEDULED_EXECUTOR_NAME);
        this.eventBus.unregister(this);
        synchronized (this.apiCallbacks) {
            try {
                z = false;
                for (Map.Entry<ApiCallMetadata, ApiCallback> entry : this.apiCallbacks.entrySet()) {
                    reportFailure(entry.getValue(), entry.getKey(), ApiCallFailure.UnknownFailure.create("Teardown"), false);
                    cancelTimeoutTask(entry.getKey());
                    z = true;
                }
                this.apiCallbacks.clear();
                this.clients.clear();
                this.apiCallTimeoutTasks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.eventBus.post(ApiCallEvent.TeardownEvent.create());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TimeoutRunnable implements Runnable {
        private final ApiCallMetadata apiCallMetadata;
        private final AlexaClientEventBus eventBus;

        private TimeoutRunnable(ApiCallMetadata apiCallMetadata, AlexaClientEventBus alexaClientEventBus) {
            this.apiCallMetadata = apiCallMetadata;
            this.eventBus = alexaClientEventBus;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.eventBus.post(ApiCallEvent.TimeoutEvent.create(this.apiCallMetadata));
        }

        public /* synthetic */ TimeoutRunnable(ApiCallMetadata apiCallMetadata, AlexaClientEventBus alexaClientEventBus, int i) {
            this(apiCallMetadata, alexaClientEventBus);
        }
    }

    private void reportFailure(ApiCallback apiCallback, ApiCallMetadata apiCallMetadata, ApiCallFailure apiCallFailure) {
        reportFailure(apiCallback, apiCallMetadata, apiCallFailure, true);
    }

    @Inject
    public ApiCallAuthority(AlexaClientEventBus alexaClientEventBus) {
        this(alexaClientEventBus, ManagedExecutorFactory.newSingleThreadScheduledExecutor(SCHEDULED_EXECUTOR_NAME));
    }

    @Subscribe(priority = 100)
    public void on(ApiCallEvent.RequestApiEvent requestApiEvent) {
        addEvent(requestApiEvent);
    }

    @Subscribe
    public void on(ApiCallEvent.SuccessEvent successEvent) {
        ApiCallback apiCallback;
        synchronized (this.apiCallbacks) {
            apiCallback = this.apiCallbacks.get(successEvent.getApiCallMetadata());
        }
        if (apiCallback != null) {
            reportSuccess(apiCallback, successEvent.getApiCallMetadata());
        }
    }

    @Subscribe
    public void on(ApiCallEvent.FailureEvent failureEvent) {
        ApiCallback apiCallback;
        synchronized (this.apiCallbacks) {
            apiCallback = this.apiCallbacks.get(failureEvent.getApiCallMetadata());
        }
        if (apiCallback != null) {
            reportFailure(apiCallback, failureEvent.getApiCallMetadata(), failureEvent.getFailure());
        }
    }
}
