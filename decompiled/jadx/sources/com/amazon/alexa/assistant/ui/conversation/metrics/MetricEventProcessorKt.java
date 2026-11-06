package com.amazon.alexa.assistant.ui.conversation.metrics;

import com.amazon.alexa.assistant.foundation.metric.model.MetricInteractionType;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import com.amazon.alexa.ra.common.metrics.CoreUiInteractionType;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"toEmittedName", "", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "toMetricInteractionType", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;", "Lcom/amazon/alexa/ra/common/metrics/CoreUiInteractionType;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MetricEventProcessorKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CoreUiEventName.values().length];
            try {
                iArr[CoreUiEventName.LIVE_MODE_ONBOARDING_CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_ONBOARDING_LEARN_MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_BACKGROUND_CONVERSATIONS_DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_BACKGROUND_CONVERSATIONS_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CoreUiEventName.RA_TEXTFIELD_FOCUS_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_SHOWN_AGENT_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_SHOWN_USER_REQUEST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CoreUiEventName.FEEDBACK_API_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CoreUiEventName.OVERFLOW_PRIVACY_TAPPED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CoreUiEventName.OVERFLOW_PRIVACY_DASHBOARD_OPENED_WEBVIEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_MUTE_TAPPED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_USER_UNMUTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_APP_BACKGROUNDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_AUTO_MUTE_TRIGGERED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CoreUiEventName.USER_PERCEIVED_LATENCY_VISUAL_TAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CoreUiInteractionType.values().length];
            try {
                iArr2[CoreUiInteractionType.PAGE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CoreUiInteractionType.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CoreUiInteractionType.VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CoreUiInteractionType.APP_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CoreUiInteractionType.SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[CoreUiInteractionType.DEEP_LINK_CLICK.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CoreUiInteractionType.UTTERANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CoreUiInteractionType.LONG_PRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[CoreUiInteractionType.COMMS_MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CoreUiInteractionType.COMMS_CALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toEmittedName(CoreUiEventName coreUiEventName) {
        switch (WhenMappings.$EnumSwitchMapping$0[coreUiEventName.ordinal()]) {
            case 1:
                return "OnboardingSheet_Continue";
            case 2:
                return "OnboardingSheet_LearnMore";
            case 3:
                return "BackgroundConversations_TurnedOff";
            case 4:
                return "BackgroundConversations_TurnedOn";
            case 5:
                return "CONVERSATION_TEXTFIELD_FOCUS_FAILURE";
            case 6:
                return "QUICKACTION_SHOWN:AGENT";
            case 7:
                return "QUICKACTION_SHOWN:USER";
            case 8:
                return "QUICK_ACTION_FEEDBACK_SENT_FAIL";
            case 9:
                return "OVERFLOW_ALEXA_PRIVACY_TAPPED";
            case 10:
                return "PRIVACY_DASHBOARD_OPENED_WEBVIEW";
            case 11:
                return "LIVE_MODE_MUTE_TOGGLED";
            case 12:
                return "MuteButton_TurnedOff";
            case 13:
                return "App_Backgrounded";
            case 14:
                return "VoiceChat.Manager.AutoMute.Triggered";
            case 15:
                return "UserPerceivedLatency.Visual";
            default:
                return coreUiEventName.name();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MetricInteractionType toMetricInteractionType(CoreUiInteractionType coreUiInteractionType) {
        switch (WhenMappings.$EnumSwitchMapping$1[coreUiInteractionType.ordinal()]) {
            case 1:
                return MetricInteractionType.PAGE_VIEW;
            case 2:
                return MetricInteractionType.CLICK;
            case 3:
                return MetricInteractionType.VIEW;
            case 4:
                return MetricInteractionType.APP_START;
            case 5:
                return MetricInteractionType.SLIDER;
            case 6:
                return MetricInteractionType.DEEP_LINK_CLICK;
            case 7:
                return MetricInteractionType.UTTERANCE;
            case 8:
                return MetricInteractionType.LONG_PRESS;
            case 9:
                return MetricInteractionType.COMMS_MESSAGE;
            case 10:
                return MetricInteractionType.COMMS_CALL;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }
}
