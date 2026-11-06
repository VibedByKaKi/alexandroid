package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat;

import com.amazon.alexa.assistant.foundation.voicechat.model.VoiceChatModeStopReason;
import com.facebook.react.modules.appstate.AppStateModule;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"wireString", "", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceChatModeStopReasonWireKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceChatModeStopReason.values().length];
            try {
                iArr[VoiceChatModeStopReason.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoiceChatModeStopReason.NetworkLost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoiceChatModeStopReason.AudioFocusLost.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoiceChatModeStopReason.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoiceChatModeStopReason.UserExitIntent.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoiceChatModeStopReason.UserClosed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VoiceChatModeStopReason.AutoCloseTimer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VoiceChatModeStopReason.DeeplinkNavigation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VoiceChatModeStopReason.Background.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String wireString(@NotNull VoiceChatModeStopReason voiceChatModeStopReason) {
        voiceChatModeStopReason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[voiceChatModeStopReason.ordinal()]) {
            case 1:
                return "none";
            case 2:
                return "network_lost";
            case 3:
                return "audio_focus_lost";
            case 4:
                return "error";
            case 5:
                return "user_exit_intent";
            case 6:
                return "user_closed";
            case 7:
                return "auto_close_timer";
            case 8:
                return "deeplink_navigation";
            case 9:
                return AppStateModule.APP_STATE_BACKGROUND;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }
}
