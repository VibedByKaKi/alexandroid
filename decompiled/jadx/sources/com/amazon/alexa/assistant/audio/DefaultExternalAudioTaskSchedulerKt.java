package com.amazon.alexa.assistant.audio;

import com.amazon.alexa.assistant.audio.AudioTask;
import com.amazon.alexa.assistant.session.audio.model.AudioChannelType;
import com.amazon.alexa.assistant.session.audio.model.AudioTaskState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"toChannelType", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "Lcom/amazon/alexa/assistant/audio/AudioTaskPriority;", "toPublic", "Lcom/amazon/alexa/assistant/audio/AudioTask$StopReason;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$StoppedReason;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultExternalAudioTaskSchedulerKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AudioTaskPriority.values().length];
            try {
                iArr[AudioTaskPriority.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioTaskPriority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioTaskPriority.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AudioTaskState.StoppedReason.values().length];
            try {
                iArr2[AudioTaskState.StoppedReason.INCOMING_NEW_TASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AudioTaskState.StoppedReason.RELEASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AudioTaskState.StoppedReason.INTERRUPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AudioTaskState.StoppedReason.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioChannelType toChannelType(AudioTaskPriority audioTaskPriority) {
        int i = WhenMappings.$EnumSwitchMapping$0[audioTaskPriority.ordinal()];
        if (i == 1) {
            return AudioChannelType.DIALOG;
        }
        if (i == 2) {
            return AudioChannelType.ALERT;
        }
        if (i == 3) {
            return AudioChannelType.CONTENT;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioTask.StopReason toPublic(AudioTaskState.StoppedReason stoppedReason) {
        int i = WhenMappings.$EnumSwitchMapping$1[stoppedReason.ordinal()];
        if (i == 1) {
            return AudioTask.StopReason.INCOMING_NEW_TASK;
        }
        if (i == 2) {
            return AudioTask.StopReason.RELEASED;
        }
        if (i == 3) {
            return AudioTask.StopReason.INTERRUPTED;
        }
        if (i == 4) {
            return AudioTask.StopReason.FAILURE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
