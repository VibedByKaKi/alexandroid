package com.amazon.alexa.client.alexaservice.networking.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.utils.TimeProvider;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.Call;
import okhttp3.EventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class NetworkEventListenerFactory implements EventListener.Factory {
    private static final String TAG = "NetworkLatencyEventListenerFactory";
    private final NetworkEventListenerReporter networkEventListenerReporter;
    private final TimeProvider timeProvider;

    @Inject
    public NetworkEventListenerFactory(NetworkEventListenerReporter networkEventListenerReporter, TimeProvider timeProvider) {
        this.networkEventListenerReporter = networkEventListenerReporter;
        this.timeProvider = timeProvider;
    }

    @Override // okhttp3.EventListener.Factory
    @NonNull
    public EventListener create(@NonNull Call call) {
        return new NetworkEventListener(this.networkEventListenerReporter, this.timeProvider);
    }
}
