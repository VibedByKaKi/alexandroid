package com.amazon.alexa.voice.handsfree.decider.stepcommand;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.notificationmetadata.NotificationMetadata;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.voice.handsfree.decider.StepType;
import com.amazon.alexa.voice.handsfree.metrics.MetricType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaAppSignInStepCommand extends StepCommand {

    @VisibleForTesting
    static final String ALEXA_APP_NAME = "com.amazon.dee.app";

    public AlexaAppSignInStepCommand(@NonNull Context context) {
        this(context, StepType.ALEXA_APP_SIGN_IN, MetricsBuilderProvider.getInstance(context), NotificationMetadata.ALEXA_APP_SIGN_IN, MetricType.ALEXA_APP_SIGNIN_NOTIFICATION_METADATA_CALLED);
    }

    @Override // com.amazon.alexa.voice.handsfree.decider.stepcommand.StepCommand
    public Intent getStepIntent() {
        return getContext().getPackageManager().getLaunchIntentForPackage("com.amazon.dee.app");
    }

    @VisibleForTesting
    public AlexaAppSignInStepCommand(@NonNull Context context, @NonNull StepType stepType, @NonNull MetricsBuilderProvider metricsBuilderProvider, @NonNull NotificationMetadata notificationMetadata, @NonNull MetricType metricType) {
        super(context, stepType, metricsBuilderProvider, notificationMetadata, metricType);
    }
}
