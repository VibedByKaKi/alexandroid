package com.amazon.alexa.externalnotifications.capability.dependencies;

import android.content.Context;
import android.os.Handler;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApis;
import com.amazon.alexa.externalnotifications.capability.ExternalNotificationsDirectiveReceiver;
import com.amazon.alexa.externalnotifications.capability.ExternalNotificationsMetricsRecorder;
import com.amazon.alexa.externalnotifications.capability.directive.ExternalNotificationsDirectiveListener;
import com.amazon.alexa.externalnotifications.capability.events.AmfExternalNotificationsEventSender;
import com.amazon.alexa.externalnotifications.capability.events.ExternalNotificationsEventSender;
import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ExternalNotificationsCapabilityAgentModule {
    private final ExternalNotificationsDirectiveListener directiveListener;
    private final ExternalNotificationsMetricsRecorder metricsRecorder;

    public ExternalNotificationsCapabilityAgentModule(ExternalNotificationsDirectiveListener externalNotificationsDirectiveListener, ExternalNotificationsMetricsRecorder externalNotificationsMetricsRecorder) {
        Preconditions.checkNotNull(externalNotificationsDirectiveListener, "Directive listener cannot be null");
        this.directiveListener = externalNotificationsDirectiveListener;
        this.metricsRecorder = externalNotificationsMetricsRecorder;
    }

    @Provides
    @Singleton
    public ExternalNotificationsDirectiveReceiver providesDirectiveReceiver(Gson gson, Context context, Handler handler) {
        return new ExternalNotificationsDirectiveReceiver(gson, context, handler, this.directiveListener);
    }

    @Provides
    @Singleton
    public Handler providesDirectiveReceiverHandler() {
        return new Handler(DoubleList$$ExternalSyntheticOutline0.m("External_Notifications_Directive_Receiver_Thread").getLooper());
    }

    @Provides
    @Singleton
    public ExternalNotificationsEventSender providesEventSender(Gson gson, AlexaMobileFrameworkApis alexaMobileFrameworkApis) {
        return new AmfExternalNotificationsEventSender(gson, alexaMobileFrameworkApis, this.metricsRecorder);
    }
}
