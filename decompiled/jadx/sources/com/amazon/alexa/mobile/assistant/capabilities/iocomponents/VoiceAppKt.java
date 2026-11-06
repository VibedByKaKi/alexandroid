package com.amazon.alexa.mobile.assistant.capabilities.iocomponents;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVoiceApp", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/VoiceApp;", "Lcom/amazon/alexa/handsfree/devices/constants/VoiceApp;", "capabilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VoiceAppKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.amazon.alexa.handsfree.devices.constants.VoiceApp.values().length];
            try {
                iArr[com.amazon.alexa.handsfree.devices.constants.VoiceApp.QUEBEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.alexa.handsfree.devices.constants.VoiceApp.MIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.alexa.handsfree.devices.constants.VoiceApp.METRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.alexa.handsfree.devices.constants.VoiceApp.FOXTROT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final VoiceApp toVoiceApp(@NotNull com.amazon.alexa.handsfree.devices.constants.VoiceApp voiceApp) {
        voiceApp.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[voiceApp.ordinal()];
        if (i == 1) {
            return VoiceApp.QUEBEC;
        }
        if (i == 2) {
            return VoiceApp.MIKE;
        }
        if (i == 3) {
            return VoiceApp.METRO;
        }
        if (i == 4) {
            return VoiceApp.FOXTROT;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
