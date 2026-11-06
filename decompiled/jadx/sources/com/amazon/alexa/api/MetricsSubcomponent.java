package com.amazon.alexa.api;

import android.util.Log;
import com.amazon.alexa.api.AlexaMobileFrameworkApisSpecification;
import com.amazon.alexa.client.annotations.NonNull;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class MetricsSubcomponent extends AlexaMobileFrameworkApisSpecification.Subcomponent implements MetricsApi {
    private static final Runnable NO_OP = new MetricsSubcomponent$$ExternalSyntheticLambda1();
    private static final String TAG = "MetricsSubcomponent";
    private ConversationLoadSourceHistory latestLoadSourceHistory;
    private final Runnable latestLoadSourceHistorySender;
    private final Object loadSourceHistoryLock;
    private final Object loadSourceHistoryRegistration;

    public MetricsSubcomponent(AlexaServicesConnection alexaServicesConnection, AtomicBoolean atomicBoolean, ConcurrentLinkedQueue<ApiCall> concurrentLinkedQueue) {
        super(alexaServicesConnection, atomicBoolean, concurrentLinkedQueue);
        this.loadSourceHistoryRegistration = new Object();
        this.latestLoadSourceHistorySender = new Runnable() { // from class: com.amazon.alexa.api.MetricsSubcomponent$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MetricsSubcomponent.this.sendLatestLoadSourceHistory();
            }
        };
        this.loadSourceHistoryLock = new Object();
    }

    private boolean isNewerThanLatest(ConversationLoadSourceHistory conversationLoadSourceHistory) {
        return this.latestLoadSourceHistory == null || conversationLoadSourceHistory.getRevision() > this.latestLoadSourceHistory.getRevision();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLatestLoadSourceHistory() {
        ConversationLoadSourceHistory conversationLoadSourceHistory;
        synchronized (this.loadSourceHistoryLock) {
            conversationLoadSourceHistory = this.latestLoadSourceHistory;
        }
        try {
            Metrics.setConversationLoadSourceHistory(this.connection, conversationLoadSourceHistory);
        } catch (Exception e) {
            Log.e(TAG, "Unable to send the conversation load source history: ".concat(e.getClass().getName()));
        }
    }

    @Override // com.amazon.alexa.api.MetricsApi
    public void deregisterListener(@NonNull AlexaMetricsListener alexaMetricsListener) {
        deregisterCallbacksObject(alexaMetricsListener);
    }

    @Override // com.amazon.alexa.api.MetricsApi
    public void registerListener(@NonNull final AlexaMetricsListener alexaMetricsListener, @NonNull final AlexaMetricsFilter alexaMetricsFilter) {
        registerCallbacksObject(alexaMetricsListener, new Runnable() { // from class: com.amazon.alexa.api.MetricsSubcomponent.1
            @Override // java.lang.Runnable
            public void run() {
                Metrics.registerListener(MetricsSubcomponent.this.connection, alexaMetricsListener, alexaMetricsFilter);
            }
        }, new Runnable() { // from class: com.amazon.alexa.api.MetricsSubcomponent.2
            @Override // java.lang.Runnable
            public void run() {
                Metrics.deregisterListener(MetricsSubcomponent.this.connection, alexaMetricsListener);
            }
        });
    }

    @Override // com.amazon.alexa.api.MetricsApi
    public void reportUiEvent(final AlexaResponseUiEvent alexaResponseUiEvent) {
        executeApi(new ApiCall() { // from class: com.amazon.alexa.api.MetricsSubcomponent.4
            @Override // com.amazon.alexa.api.ApiCall
            public void call() throws Exception {
                Metrics.reportUiEvent(MetricsSubcomponent.this.connection, alexaResponseUiEvent);
            }
        });
    }

    @Override // com.amazon.alexa.api.MetricsApi
    public void setAttributionTag(@NonNull final String str) {
        executeApi(new ApiCall() { // from class: com.amazon.alexa.api.MetricsSubcomponent.3
            @Override // com.amazon.alexa.api.ApiCall
            public void call() throws Exception {
                Metrics.setAttributionTag(MetricsSubcomponent.this.connection, str);
            }
        });
    }

    @Override // com.amazon.alexa.api.MetricsApi
    public void setConversationLoadSourceHistory(@NonNull ConversationLoadSourceHistory conversationLoadSourceHistory) {
        if (conversationLoadSourceHistory == null) {
            Log.w(TAG, "Ignoring a null conversation load source history");
            return;
        }
        synchronized (this.loadSourceHistoryLock) {
            try {
                if (isNewerThanLatest(conversationLoadSourceHistory)) {
                    this.latestLoadSourceHistory = conversationLoadSourceHistory;
                    registerCallbacksObject(this.loadSourceHistoryRegistration, this.latestLoadSourceHistorySender, NO_OP);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
    }

    @Override // com.amazon.alexa.api.MetricsApi
    public void registerListener(@NonNull AlexaMetricsListener alexaMetricsListener) {
        registerListener(alexaMetricsListener, new AlexaMetricsFilter());
    }
}
