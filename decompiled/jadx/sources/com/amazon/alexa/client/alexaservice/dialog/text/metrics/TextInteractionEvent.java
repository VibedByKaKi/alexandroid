package com.amazon.alexa.client.alexaservice.dialog.text.metrics;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.client.alexaservice.base.metrics.InvocationTypeClass;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogFailureReason;
import com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.utils.validation.Preconditions;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class TextInteractionEvent extends InteractionEvent {
    private static final String INVOCATION_TYPE_CLASSIC_ALEXA = "AlexaApp.ClassicAlexa";
    private static final String INVOCATION_TYPE_FOR_TYPE_WITH_ALEXA = "AlexaApp.TypeWithAlexa";
    private static final String INVOCATION_TYPE_RA_CAM = "AlexaApp.RA.Cam";
    private static final String INVOCATION_TYPE_RA_TEXT = "AlexaApp.RA.Text";
    private static final String TEXT_INTERACTION_FAILURE_PREFIX_REGEX = AlexaMetricsName.TextInteraction.FAILURE.getValue() + ArcusConfig.PATH_SEPARATOR;
    private static final String INVOCATION_TYPE_RA_INVOKE_OPERATION_CAM = "Conversation.InvokeOperation.AlexaApp.RA.Cam";
    private static final Set<String> TEXT_INVOCATION_TYPES = new HashSet(Arrays.asList("AlexaApp.RA.Text", INVOCATION_TYPE_RA_INVOKE_OPERATION_CAM, "AlexaApp.RA.Cam", "AlexaApp.ClassicAlexa", "AlexaApp.TypeWithAlexa"));

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.dialog.text.metrics.TextInteractionEvent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$client$alexaservice$dialog$core$metrics$DialogInteractionResult$Type;

        static {
            int[] iArr = new int[DialogInteractionResult.Type.values().length];
            $SwitchMap$com$amazon$alexa$client$alexaservice$dialog$core$metrics$DialogInteractionResult$Type = iArr;
            try {
                iArr[DialogInteractionResult.Type.ABANDONED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$dialog$core$metrics$DialogInteractionResult$Type[DialogInteractionResult.Type.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$dialog$core$metrics$DialogInteractionResult$Type[DialogInteractionResult.Type.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class AttemptEvent extends TextInteractionEvent {
        private static String constructAggregateMetricName(@Nullable String str) {
            return (TextInteractionEvent.TEXT_INVOCATION_TYPES.contains(str) ? AlexaMetricsName.TextInteraction.ATTEMPT : AlexaMetricsName.TouchInteraction.ATTEMPT).appendToAlexaMetricsName(InteractionEvent.AGGREGATE_METRIC_SUFFIX).appendWith(InvocationTypeClass.fromInvocationType(str).name());
        }

        private static String constructMetricName(@Nullable String str) {
            return AlexaMetricsName.TextInteraction.ATTEMPT.appendWith(str);
        }

        public static AttemptEvent create(@Nullable String str, DialogRequestIdentifier dialogRequestIdentifier, String str2, @Nullable Long l) {
            return new AutoValue_TextInteractionEvent_AttemptEvent(constructMetricName(str), str, dialogRequestIdentifier, str2, constructAggregateMetricName(str), l);
        }

        public abstract String getAggregateName();

        public abstract String getSoftwareVersion();

        @Nullable
        public abstract Long getTurnStartElapsedRealtimeMs();

        public static AttemptEvent create(@Nullable String str, String str2) {
            return create(str, DialogRequestIdentifier.NONE, str2);
        }

        public static AttemptEvent create(@Nullable String str, DialogRequestIdentifier dialogRequestIdentifier, String str2) {
            return create(str, dialogRequestIdentifier, str2, null);
        }

        public static AttemptEvent create(@Nullable String str) {
            return create(str, DialogRequestIdentifier.NONE, "");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ResultEvent extends TextInteractionEvent {
        private static String constructAggregateMetricName(@Nullable String str, DialogInteractionResult.Type type) {
            return getMetricPrefixForAggregateName(str, type).appendToAlexaMetricsName(InteractionEvent.AGGREGATE_METRIC_SUFFIX).appendWith(InvocationTypeClass.fromInvocationType(str).name());
        }

        private static String constructMetricName(@Nullable String str, DialogInteractionResult.Type type, @Nullable DialogInteractionResult.Reason reason, @Nullable Map<String, String> map) {
            AlexaMetricsName metricPrefix = getMetricPrefix(type, reason);
            if (map != null) {
                String name = DialogInteractionResult.FailureKeys.STATUS_CODE.name();
                if (map.containsKey(name)) {
                    metricPrefix = metricPrefix.appendToAlexaMetricsName(map.get(name));
                }
                if (reason == DialogFailureReason.NETWORK_UNAVAILABLE) {
                    String name2 = DialogInteractionResult.FailureKeys.EXCEPTION_TYPE.name();
                    if (map.containsKey(name2)) {
                        metricPrefix = metricPrefix.appendToAlexaMetricsName(map.get(name2));
                    }
                }
            }
            return metricPrefix.appendWith(str);
        }

        public static ResultEvent create(@Nullable String str, DialogRequestIdentifier dialogRequestIdentifier, DialogInteractionResult.Type type, @Nullable DialogInteractionResult.Reason reason, @Nullable Map<String, String> map, long j) {
            if (reason != null) {
                reason.setTextDialog(true);
            }
            return new AutoValue_TextInteractionEvent_ResultEvent(constructMetricName(str, type, reason, map), str, dialogRequestIdentifier, map, j, constructAggregateMetricName(str, type), type, reason);
        }

        private static AlexaMetricsName getMetricPrefix(DialogInteractionResult.Type type, @Nullable DialogInteractionResult.Reason reason) {
            int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$client$alexaservice$dialog$core$metrics$DialogInteractionResult$Type[type.ordinal()];
            if (i == 1) {
                Preconditions.notNull(reason, "Abandon result should have a reason");
                return reason.getMetricName();
            }
            if (i == 2) {
                Preconditions.notNull(reason, "Failure result should have a reason");
                return reason.getMetricName();
            }
            if (i == 3) {
                return AlexaMetricsName.TextInteraction.SUCCESS;
            }
            Gson$$ExternalSyntheticBUOutline0.m((Object) type, "Unknown result type ");
            return null;
        }

        private static AlexaMetricsName getMetricPrefixForAggregateName(@Nullable String str, DialogInteractionResult.Type type) {
            boolean contains = TextInteractionEvent.TEXT_INVOCATION_TYPES.contains(str);
            int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$client$alexaservice$dialog$core$metrics$DialogInteractionResult$Type[type.ordinal()];
            if (i == 1) {
                return contains ? AlexaMetricsName.TextInteraction.ABANDONED : AlexaMetricsName.TouchInteraction.ABANDONED;
            }
            if (i == 2) {
                return contains ? AlexaMetricsName.TextInteraction.FAILURE : AlexaMetricsName.TouchInteraction.FAILURE;
            }
            if (i == 3) {
                return contains ? AlexaMetricsName.TextInteraction.SUCCESS : AlexaMetricsName.TouchInteraction.SUCCESS;
            }
            Gson$$ExternalSyntheticBUOutline0.m((Object) type, "Unknown result type ");
            return null;
        }

        public String extractFailureReasonFromReason() {
            DialogInteractionResult.Reason resultReason;
            return (getResultType() == DialogInteractionResult.Type.FAILURE && (resultReason = getResultReason()) != null) ? resultReason.getMetricName().getValue().replaceFirst(TextInteractionEvent.TEXT_INTERACTION_FAILURE_PREFIX_REGEX, "") : "Unknown";
        }

        public abstract String getAggregateName();

        @Nullable
        public abstract Map<String, String> getFailureInformation();

        @Nullable
        public abstract DialogInteractionResult.Reason getResultReason();

        public abstract DialogInteractionResult.Type getResultType();

        public abstract long getTime();

        public static ResultEvent create(@Nullable String str, DialogInteractionResult.Type type, @Nullable DialogInteractionResult.Reason reason, long j) {
            return create(str, DialogRequestIdentifier.NONE, type, reason, null, j);
        }

        public static ResultEvent create(@Nullable String str, DialogInteractionResult.Reason reason, long j) {
            return create(str, DialogRequestIdentifier.NONE, reason.getType(), reason, null, j);
        }
    }
}
