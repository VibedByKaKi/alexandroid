package com.amazon.alexa.ra.core.features.dictation.codec;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/TranscriptEvent;", "", LivePreviewBundleKeys.TRANSCRIPT, "Lcom/amazon/alexa/ra/core/features/dictation/codec/Transcript;", "<init>", "(Lcom/amazon/alexa/ra/core/features/dictation/codec/Transcript;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/amazon/alexa/ra/core/features/dictation/codec/Transcript;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTranscript$annotations", "()V", "getTranscript", "()Lcom/amazon/alexa/ra/core/features/dictation/codec/Transcript;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ui_core_release", "$serializer", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes18.dex */
public final /* data */ class TranscriptEvent {

    @Nullable
    private final Transcript transcript;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ TranscriptEvent(int i, Transcript transcript, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transcript = null;
        } else {
            this.transcript = transcript;
        }
    }

    public static /* synthetic */ TranscriptEvent copy$default(TranscriptEvent transcriptEvent, Transcript transcript, int i, Object obj) {
        if ((i & 1) != 0) {
            transcript = transcriptEvent.transcript;
        }
        return transcriptEvent.copy(transcript);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ui_core_release(TranscriptEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.transcript == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, Transcript$$serializer.INSTANCE, self.transcript);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Transcript getTranscript() {
        return this.transcript;
    }

    @NotNull
    public final TranscriptEvent copy(@Nullable Transcript transcript) {
        return new TranscriptEvent(transcript);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TranscriptEvent) && Intrinsics.areEqual(this.transcript, ((TranscriptEvent) other).transcript);
    }

    @Nullable
    public final Transcript getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        Transcript transcript = this.transcript;
        if (transcript == null) {
            return 0;
        }
        return transcript.hashCode();
    }

    @NotNull
    public String toString() {
        return "TranscriptEvent(transcript=" + this.transcript + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/TranscriptEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/TranscriptEvent;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<TranscriptEvent> serializer() {
            return TranscriptEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TranscriptEvent() {
        this((Transcript) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public TranscriptEvent(@Nullable Transcript transcript) {
        this.transcript = transcript;
    }

    @SerialName("Transcript")
    public static /* synthetic */ void getTranscript$annotations() {
    }

    public /* synthetic */ TranscriptEvent(Transcript transcript, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transcript);
    }
}
