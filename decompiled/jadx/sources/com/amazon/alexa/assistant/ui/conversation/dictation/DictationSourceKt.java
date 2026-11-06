package com.amazon.alexa.assistant.ui.conversation.dictation;

import com.amazon.alexa.assistant.ui.conversation.dictation.TranscriptionEvent;
import com.amazon.alexa.ra.core.features.dictation.DictationError;
import com.amazon.alexa.ra.core.features.dictation.DictationEvent;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"isTerminal", "", "Lcom/amazon/alexa/assistant/ui/conversation/dictation/TranscriptionEvent;", "toDictationEvent", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEvent;", "toDictationError", "Lcom/amazon/alexa/ra/core/features/dictation/DictationError;", "Lcom/amazon/alexa/assistant/ui/conversation/dictation/TranscriptionError;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DictationSourceKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TranscriptionError.values().length];
            try {
                iArr[TranscriptionError.MIC_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TranscriptionError.MIC_INTERRUPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TranscriptionError.CONNECTION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TranscriptionError.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TranscriptionError.SERVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTerminal(TranscriptionEvent transcriptionEvent) {
        return (transcriptionEvent instanceof TranscriptionEvent.Final) || (transcriptionEvent instanceof TranscriptionEvent.Error);
    }

    private static final DictationError toDictationError(TranscriptionError transcriptionError) {
        int i = WhenMappings.$EnumSwitchMapping$0[transcriptionError.ordinal()];
        if (i == 1) {
            return DictationError.MIC_DENIED;
        }
        if (i == 2) {
            return DictationError.MIC_INTERRUPTED;
        }
        if (i == 3) {
            return DictationError.CONNECTION_FAILED;
        }
        if (i == 4) {
            return DictationError.NETWORK;
        }
        if (i == 5) {
            return DictationError.SERVICE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DictationEvent toDictationEvent(TranscriptionEvent transcriptionEvent) {
        if (Intrinsics.areEqual(transcriptionEvent, TranscriptionEvent.Ready.INSTANCE)) {
            return DictationEvent.Ready.INSTANCE;
        }
        if (transcriptionEvent instanceof TranscriptionEvent.Partial) {
            return new DictationEvent.Partial(((TranscriptionEvent.Partial) transcriptionEvent).getText());
        }
        if (transcriptionEvent instanceof TranscriptionEvent.Final) {
            return new DictationEvent.Final(((TranscriptionEvent.Final) transcriptionEvent).getText());
        }
        if (transcriptionEvent instanceof TranscriptionEvent.Error) {
            return new DictationEvent.Error(toDictationError(((TranscriptionEvent.Error) transcriptionEvent).getError()));
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
