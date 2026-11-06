package com.amazon.alexa.assistant.ui.conversation.alexaserviceapis;

import com.amazon.alexa.assistant.foundation.metric.model.RenderSignal;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toRenderSignalOrNull", "Lcom/amazon/alexa/assistant/foundation/metric/model/RenderSignal;", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlexaServicesWrapperKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoreUiEventName.values().length];
            try {
                iArr[CoreUiEventName.USER_REQUEST_RENDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreUiEventName.USER_NAVIGATED_AWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDER_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDERED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CoreUiEventName.LOCAL_VISUAL_ERROR_RENDERED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CoreUiEventName.LOCAL_VISUAL_RESPONSE_RENDERED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CoreUiEventName.SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CoreUiEventName.SUGGESTION_CONTAINER_FRAGMENT_RECEIVED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_AGENT_FRAGMENT_PARSED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RenderSignal toRenderSignalOrNull(CoreUiEventName coreUiEventName) {
        switch (WhenMappings.$EnumSwitchMapping$0[coreUiEventName.ordinal()]) {
            case 1:
                return RenderSignal.USER_REQUEST_RENDERED;
            case 2:
                return RenderSignal.USER_NAVIGATED_AWAY;
            case 3:
                return RenderSignal.REMOTE_VISUAL_RESPONSE_RENDERED;
            case 4:
                return RenderSignal.REMOTE_VISUAL_RESPONSE_RENDER_STARTED;
            case 5:
                return RenderSignal.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED;
            case 6:
                return RenderSignal.REMOTE_VISUAL_PREAMBLE_RENDERED;
            case 7:
                return RenderSignal.LOCAL_VISUAL_ERROR_RENDERED;
            case 8:
                return RenderSignal.LOCAL_VISUAL_RESPONSE_RENDERED;
            case 9:
                return RenderSignal.SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED;
            case 10:
                return RenderSignal.SUGGESTION_CONTAINER_FRAGMENT_RECEIVED;
            case 11:
                return RenderSignal.REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION;
            case 12:
                return RenderSignal.REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION;
            case 13:
                return RenderSignal.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION;
            case 14:
                return RenderSignal.REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION;
            case 15:
                return RenderSignal.REMOTE_VISUAL_AGENT_FRAGMENT_PARSED;
            case 16:
                return RenderSignal.REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED;
            case 17:
                return RenderSignal.REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING;
            case 18:
                return RenderSignal.REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE;
            default:
                return null;
        }
    }
}
