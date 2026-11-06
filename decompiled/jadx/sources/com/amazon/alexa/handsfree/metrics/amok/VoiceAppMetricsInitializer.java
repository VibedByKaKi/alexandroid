package com.amazon.alexa.handsfree.metrics.amok;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.metricsprovider.AlexaMetricsContract;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.identity.api.IdentityEvent;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class VoiceAppMetricsInitializer {
    private static final String TAG = "VoiceAppMetricsInitializer";

    @VisibleForTesting
    static final String VOICE_APP_METRICS = "ALEXA_HANDS_FREE_METRICS_PROVIDER";
    private final FeatureServiceV2 mFeatureServiceV2;

    @Inject
    public VoiceAppMetricsInitializer(@Nullable FeatureServiceV2 featureServiceV2) {
        this.mFeatureServiceV2 = featureServiceV2;
    }

    @VisibleForTesting
    public void checkUserIdentityHasFeature(@NonNull Context context, @NonNull AlexaMetricsContentObserver alexaMetricsContentObserver) {
        FeatureServiceV2 featureServiceV2 = this.mFeatureServiceV2;
        if (featureServiceV2 == null || !featureServiceV2.hasAccess(VOICE_APP_METRICS, false)) {
            context.getContentResolver().unregisterContentObserver(alexaMetricsContentObserver);
            Log.d(TAG, "unregistering the metrics content observer.");
        } else {
            try {
                context.getContentResolver().registerContentObserver(AlexaMetricsContract.AlexaMetricsTable.CONTENT_URI, true, alexaMetricsContentObserver);
                Log.d(TAG, "registering the metrics content observer.");
            } catch (Exception unused) {
                Log.w(TAG, "no partner app with metrics provider");
            }
        }
        Log.d(TAG, "call: partner app with metrics content provider is available");
    }

    public void initialize(@NonNull Context context, @NonNull AMPDInformationProvider aMPDInformationProvider) {
        if (aMPDInformationProvider.isHandsFreeMike()) {
            if (this.mFeatureServiceV2 == null) {
                Log.w(TAG, "Feature Service V2 could not be found.");
            } else {
                registerContentObserver(context, new AlexaMetricsContentObserver(context, new Handler()));
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public EventBus provideEventBus() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        return (EventBus) obj;
    }

    @VisibleForTesting
    public void registerContentObserver(@NonNull final Context context, @NonNull final AlexaMetricsContentObserver alexaMetricsContentObserver) {
        try {
            FeatureServiceV2 featureServiceV2 = this.mFeatureServiceV2;
            if (featureServiceV2 == null || !featureServiceV2.hasAccess(VOICE_APP_METRICS, false)) {
                context.getContentResolver().unregisterContentObserver(alexaMetricsContentObserver);
                Log.d(TAG, "initialize: unregistering the metrics content observer.");
            } else {
                context.getContentResolver().registerContentObserver(AlexaMetricsContract.AlexaMetricsTable.CONTENT_URI, true, alexaMetricsContentObserver);
                Log.d(TAG, "initialize: registering the metrics content observer.");
            }
            Log.d(TAG, "initialize: partner app with metrics content provider is available");
            provideEventBus().getSubscriber().subscribeFilter(new EventTypeMessageFilter(IdentityEvent.IDENTITY_CHANGED), new MessageHandler() { // from class: com.amazon.alexa.handsfree.metrics.amok.VoiceAppMetricsInitializer.1
                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public void lambda$subscribe$1(@NonNull Message message) {
                    VoiceAppMetricsInitializer.this.checkUserIdentityHasFeature(context, alexaMetricsContentObserver);
                }
            });
        } catch (Exception unused) {
            Log.d(TAG, "initialize: no partner app with metrics provider");
        }
    }

    public void initialize(@NonNull Context context) {
        initialize(context, AMPDInformationProvider.getInstance(context));
    }
}
