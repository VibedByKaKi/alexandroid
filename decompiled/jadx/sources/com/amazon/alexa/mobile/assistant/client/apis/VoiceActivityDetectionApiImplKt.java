package com.amazon.alexa.mobile.assistant.client.apis;

import com.amazon.alexa.api.compat.model.VoiceChatModeChangeReason;
import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeStopReason;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toStopReason", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;", "Lcom/amazon/alexa/api/compat/model/VoiceChatModeChangeReason;", "client_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VoiceActivityDetectionApiImplKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceChatModeChangeReason.values().length];
            try {
                iArr[VoiceChatModeChangeReason.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoiceChatModeChangeReason.NETWORK_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoiceChatModeChangeReason.AUDIO_FOCUS_LOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoiceChatModeChangeReason.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoiceChatModeChangeReason.USER_EXIT_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoiceChatModeChangeReason.USER_CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VoiceChatModeChangeReason.AUTO_CLOSE_TIMER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VoiceChatModeChangeReason.DEEPLINK_NAVIGATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VoiceChatModeChangeReason.BACKGROUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceChatModeStopReason toStopReason(VoiceChatModeChangeReason voiceChatModeChangeReason) {
        switch (WhenMappings.$EnumSwitchMapping$0[voiceChatModeChangeReason.ordinal()]) {
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
                return VoiceChatModeStopReason.None;
        }
    }
}
