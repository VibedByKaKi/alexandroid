package com.amazon.alexa.client.alexaservice.ui.conversations;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent;
import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationServiceException;
import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsMetricEvent;
import com.amazon.alexa.client.metrics.core.DefaultMetricsTimer;
import com.amazon.alexa.client.metrics.core.MetricsCounter;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ConversationsMetricsAuthority {

    @VisibleForTesting
    static final String DELETE_CONVERSATIONS_TIMEOUT = "DELETE_CONVERSATIONS_TIMEOUT";

    @VisibleForTesting
    static final String INTERACTION_SUFFIX = ".mobilytics-interaction";

    @VisibleForTesting
    static final String SEPARATOR = ".";
    private static final String TAG = "ConversationsMetricsAuthority";
    private final MetricsService metricsService;

    @Inject
    public ConversationsMetricsAuthority(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    private String getEventName(String str, int i) {
        if (i == 0) {
            return str;
        }
        if (i != 3) {
            return TableInfo$$ExternalSyntheticOutline0.m(i, str, ".");
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ".");
        m1m.append(SystemErrorEvent.ErrorType.NO_NETWORK_CONNECTIVITY.name());
        return m1m.toString();
    }

    private String log(String str) {
        return str.toLowerCase().replace('_', ' ');
    }

    private void recordCounterMetric(String str) {
        MetricsCounter startCounter = this.metricsService.startCounter(str, "vox_conversation", null, null);
        startCounter.incrementCounter();
        this.metricsService.recordCounter(startCounter);
    }

    private void recordLatencyMetric(String str, long j) {
        if (j > 0) {
            this.metricsService.recordTimer(new DefaultMetricsTimer(str, "vox_conversation", null, null, j, false));
        }
    }

    public void on(ConversationsMetricEvent.GetConversationsFailureEvent getConversationsFailureEvent) {
        String eventName;
        if (getConversationsFailureEvent.getIsSingleConversation()) {
            AlexaMetricsName alexaMetricsName = AlexaMetricsName.Conversations.GET_CONVERSATION_FAILURE;
            eventName = getEventName(alexaMetricsName.getValue(), getConversationsFailureEvent.getErrorCode());
            if (getConversationsFailureEvent.getErrorCode() != 0) {
                recordCounterMetric(alexaMetricsName.getValue());
            }
        } else {
            AlexaMetricsName alexaMetricsName2 = AlexaMetricsName.Conversations.GET_CONVERSATIONS_FAILURE;
            eventName = getEventName(alexaMetricsName2.getValue(), getConversationsFailureEvent.getErrorCode());
            if (getConversationsFailureEvent.getErrorCode() != 0) {
                recordCounterMetric(alexaMetricsName2.getValue());
            }
        }
        log(eventName);
        getConversationsFailureEvent.getErrorCode();
        recordCounterMetric(eventName);
    }

    public void on(ConversationsMetricEvent.GetConversationsSuccessEvent getConversationsSuccessEvent) {
        String value;
        if (getConversationsSuccessEvent.getIsSingleConversation()) {
            value = AlexaMetricsName.Conversations.GET_CONVERSATION_SUCCESS.getValue();
        } else {
            value = AlexaMetricsName.Conversations.GET_CONVERSATIONS_SUCCESS.getValue();
        }
        long duration = getConversationsSuccessEvent.getDuration();
        log(value);
        recordLatencyMetric(value, duration);
    }

    public void on(ConversationsMetricEvent.GetFragmentsSuccessEvent getFragmentsSuccessEvent) {
        String value = AlexaMetricsName.Conversations.GET_FRAGMENTS_SUCCESS.getValue();
        long duration = getFragmentsSuccessEvent.getDuration();
        log(value);
        recordLatencyMetric(value, duration);
    }

    public void on(ConversationsMetricEvent.GetFragmentsFailureEvent getFragmentsFailureEvent) {
        AlexaMetricsName alexaMetricsName = AlexaMetricsName.Conversations.GET_FRAGMENTS_FAILURE;
        String eventName = getEventName(alexaMetricsName.getValue(), getFragmentsFailureEvent.getErrorCode());
        log(eventName);
        getFragmentsFailureEvent.getErrorCode();
        recordCounterMetric(eventName);
        if (getFragmentsFailureEvent.getErrorCode() != 0) {
            recordCounterMetric(alexaMetricsName.getValue());
        }
    }

    public void on(ConversationsMetricEvent.CardTranscriptAttemptEvent cardTranscriptAttemptEvent) {
        recordCounterMetric(AlexaMetricsName.Conversations.CARD_TRANSCRIPT_ATTEMPTS.getValue());
    }

    public void on(ConversationsMetricEvent.CardTranscriptFailureEvent cardTranscriptFailureEvent) {
        AlexaMetricsName alexaMetricsName = AlexaMetricsName.Conversations.CARD_TRANSCRIPT_FAILURES;
        String eventName = getEventName(alexaMetricsName.getValue(), cardTranscriptFailureEvent.getErrorCode());
        log(eventName);
        cardTranscriptFailureEvent.getErrorCode();
        recordCounterMetric(eventName);
        if (cardTranscriptFailureEvent.getErrorCode() != 0) {
            recordCounterMetric(alexaMetricsName.getValue());
        }
    }

    public void on(ConversationsMetricEvent.CardTranscriptNoFragmentsFoundEvent cardTranscriptNoFragmentsFoundEvent) {
        recordCounterMetric(AlexaMetricsName.Conversations.CARD_TRANSCRIPT_NO_FRAGMENTS_FOUND.getValue());
    }

    public void on(ConversationsMetricEvent.DeleteFragmentsSuccessEvent deleteFragmentsSuccessEvent) {
        String value = AlexaMetricsName.Conversations.DELETE_FRAGMENTS_SUCCESS.getValue();
        long duration = deleteFragmentsSuccessEvent.getDuration();
        log(value);
        recordLatencyMetric(value, duration);
    }

    public void on(ConversationsMetricEvent.DeleteFragmentsFailureEvent deleteFragmentsFailureEvent) {
        AlexaMetricsName alexaMetricsName = AlexaMetricsName.Conversations.DELETE_FRAGMENTS_FAILURE;
        String eventName = getEventName(alexaMetricsName.getValue(), deleteFragmentsFailureEvent.getErrorCode());
        log(eventName);
        deleteFragmentsFailureEvent.getErrorCode();
        recordCounterMetric(eventName);
        if (deleteFragmentsFailureEvent.getErrorCode() != 0) {
            recordCounterMetric(alexaMetricsName.getValue());
        }
    }

    public void on(ConversationsMetricEvent.DeleteConversationsSuccessEvent deleteConversationsSuccessEvent) {
        String value = AlexaMetricsName.Conversations.DELETE_CONVERSATIONS_SUCCESS.getValue();
        long duration = deleteConversationsSuccessEvent.getDuration();
        log(value);
        recordLatencyMetric(value, duration);
        recordCounterMetric(BitVector$$ExternalSyntheticOutline0.m(value, INTERACTION_SUFFIX));
    }

    public void on(ConversationsMetricEvent.DeleteConversationsFailureEvent deleteConversationsFailureEvent) {
        String value = AlexaMetricsName.Conversations.DELETE_CONVERSATIONS_FAILURE.getValue();
        String eventName = getEventName(value, deleteConversationsFailureEvent.getErrorCode());
        log(eventName);
        deleteConversationsFailureEvent.getErrorCode();
        recordCounterMetric(eventName);
        if (deleteConversationsFailureEvent.getErrorCode() != 0) {
            recordCounterMetric(value);
        }
        if (deleteConversationsFailureEvent.getErrorType() == ConversationServiceException.ErrorType.TIMEOUT) {
            recordCounterMetric("DELETE_CONVERSATIONS_TIMEOUT.mobilytics-interaction");
        } else {
            recordCounterMetric(BitVector$$ExternalSyntheticOutline0.m(value, INTERACTION_SUFFIX));
        }
    }
}
