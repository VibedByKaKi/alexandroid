package com.amazon.alexa.mobile.assistant.client.apis;

import android.util.Log;
import com.amazon.alexa.api.compat.model.AlexaAudioChannel;
import com.amazon.alexa.assistant.audio.AudioTaskPriority;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toAudioTaskPriority", "Lcom/amazon/alexa/assistant/audio/AudioTaskPriority;", "Lcom/amazon/alexa/api/compat/model/AlexaAudioChannel;", "client_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AudioTaskSchedulerApiImplKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlexaAudioChannel.values().length];
            try {
                iArr[AlexaAudioChannel.IMPORTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlexaAudioChannel.DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlexaAudioChannel.COMMUNICATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlexaAudioChannel.ALERTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AlexaAudioChannel.CONTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioTaskPriority toAudioTaskPriority(AlexaAudioChannel alexaAudioChannel) {
        int i = WhenMappings.$EnumSwitchMapping$0[alexaAudioChannel.ordinal()];
        if (i == 1) {
            return AudioTaskPriority.HIGH;
        }
        if (i == 2) {
            return AudioTaskPriority.HIGH;
        }
        if (i == 3) {
            return AudioTaskPriority.HIGH;
        }
        if (i == 4) {
            return AudioTaskPriority.NORMAL;
        }
        if (i == 5) {
            return AudioTaskPriority.LOW;
        }
        Log.w("AudioTaskSchedulerApi", "Unknown AlexaAudioChannel: " + alexaAudioChannel + ", defaulting to NORMAL");
        return AudioTaskPriority.NORMAL;
    }
}
