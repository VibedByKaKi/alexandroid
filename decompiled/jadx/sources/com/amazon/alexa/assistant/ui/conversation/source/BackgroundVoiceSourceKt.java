package com.amazon.alexa.assistant.ui.conversation.source;

import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeState;
import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeStopReason;
import com.amazon.alexa.ra.core.data.model.VADDismissalReason;
import com.amazon.alexa.ra.core.data.model.VADState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"toVadState", "Lcom/amazon/alexa/ra/core/data/model/VADState;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeState;", "toStopReason", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;", "Lcom/amazon/alexa/ra/core/data/model/VADDismissalReason;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BackgroundVoiceSourceKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoiceChatModeState.values().length];
            try {
                iArr[VoiceChatModeState.Inactive.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoiceChatModeState.Starting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoiceChatModeState.Active.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoiceChatModeState.Muted.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoiceChatModeState.Stopping.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoiceChatModeState.Error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VADDismissalReason.values().length];
            try {
                iArr2[VADDismissalReason.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VADDismissalReason.NETWORK_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VADDismissalReason.AUDIO_FOCUS_LOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VADDismissalReason.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VADDismissalReason.USER_EXIT_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VADDismissalReason.USER_CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[VADDismissalReason.AUTO_CLOSE_TIMER.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[VADDismissalReason.DEEPLINK_NAVIGATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[VADDismissalReason.BACKGROUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceChatModeStopReason toStopReason(VADDismissalReason vADDismissalReason) {
        switch (WhenMappings.$EnumSwitchMapping$1[vADDismissalReason.ordinal()]) {
            case 1:
                return VoiceChatModeStopReason.None;
            case 2:
                return VoiceChatModeStopReason.NetworkLost;
            case 3:
                return VoiceChatModeStopReason.AudioFocusLost;
            case 4:
                return VoiceChatModeStopReason.Error;
            case 5:
                return VoiceChatModeStopReason.UserExitIntent;
            case 6:
                return VoiceChatModeStopReason.UserClosed;
            case 7:
                return VoiceChatModeStopReason.AutoCloseTimer;
            case 8:
                return VoiceChatModeStopReason.DeeplinkNavigation;
            case 9:
                return VoiceChatModeStopReason.Background;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VADState toVadState(VoiceChatModeState voiceChatModeState) {
        switch (WhenMappings.$EnumSwitchMapping$0[voiceChatModeState.ordinal()]) {
            case 1:
                return VADState.INACTIVE;
            case 2:
                return VADState.INITIALIZING;
            case 3:
                return VADState.ACTIVE;
            case 4:
                return VADState.MUTED;
            case 5:
                return VADState.INACTIVE;
            case 6:
                return VADState.ERROR;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }
}
