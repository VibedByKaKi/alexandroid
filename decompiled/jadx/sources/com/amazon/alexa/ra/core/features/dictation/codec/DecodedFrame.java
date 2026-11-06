package com.amazon.alexa.ra.core.features.dictation.codec;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame;", "", "Transcript", "Audio", "ServiceException", "Unknown", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$Audio;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$ServiceException;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$Transcript;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$Unknown;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface DecodedFrame {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$Audio;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame;", "payload", "", "<init>", "([B)V", "getPayload", "()[B", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "component1", "copy", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Audio implements DecodedFrame {
        public static final int $stable = 8;

        @NotNull
        private final byte[] payload;

        public Audio(@NotNull byte[] bArr) {
            bArr.getClass();
            this.payload = bArr;
        }

        public static /* synthetic */ Audio copy$default(Audio audio, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = audio.payload;
            }
            return audio.copy(bArr);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final byte[] getPayload() {
            return this.payload;
        }

        @NotNull
        public final Audio copy(@NotNull byte[] payload) {
            payload.getClass();
            return new Audio(payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Audio) {
                return Arrays.equals(this.payload, ((Audio) other).payload);
            }
            return false;
        }

        @NotNull
        public final byte[] getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return Arrays.hashCode(this.payload);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Audio(payload=", Arrays.toString(this.payload), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$ServiceException;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame;", "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServiceException implements DecodedFrame {
        public static final int $stable = 0;

        @Nullable
        private final String message;

        @Nullable
        private final String type;

        public ServiceException(@Nullable String str, @Nullable String str2) {
            this.type = str;
            this.message = str2;
        }

        public static /* synthetic */ ServiceException copy$default(ServiceException serviceException, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serviceException.type;
            }
            if ((i & 2) != 0) {
                str2 = serviceException.message;
            }
            return serviceException.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ServiceException copy(@Nullable String type, @Nullable String message) {
            return new ServiceException(type, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceException)) {
                return false;
            }
            ServiceException serviceException = (ServiceException) other;
            return Intrinsics.areEqual(this.type, serviceException.type) && Intrinsics.areEqual(this.message, serviceException.message);
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ServiceException(type=", this.type, ", message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$Transcript;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame;", "event", "Lcom/amazon/alexa/ra/core/features/dictation/codec/TranscriptEvent;", "<init>", "(Lcom/amazon/alexa/ra/core/features/dictation/codec/TranscriptEvent;)V", "getEvent", "()Lcom/amazon/alexa/ra/core/features/dictation/codec/TranscriptEvent;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Transcript implements DecodedFrame {
        public static final int $stable = 8;

        @NotNull
        private final TranscriptEvent event;

        public Transcript(@NotNull TranscriptEvent transcriptEvent) {
            transcriptEvent.getClass();
            this.event = transcriptEvent;
        }

        public static /* synthetic */ Transcript copy$default(Transcript transcript, TranscriptEvent transcriptEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                transcriptEvent = transcript.event;
            }
            return transcript.copy(transcriptEvent);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TranscriptEvent getEvent() {
            return this.event;
        }

        @NotNull
        public final Transcript copy(@NotNull TranscriptEvent event) {
            event.getClass();
            return new Transcript(event);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transcript) && Intrinsics.areEqual(this.event, ((Transcript) other).event);
        }

        @NotNull
        public final TranscriptEvent getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @NotNull
        public String toString() {
            return "Transcript(event=" + this.event + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame$Unknown;", "Lcom/amazon/alexa/ra/core/features/dictation/codec/DecodedFrame;", "message", "Lcom/amazon/alexa/ra/core/features/dictation/codec/EventStreamMessage;", "<init>", "(Lcom/amazon/alexa/ra/core/features/dictation/codec/EventStreamMessage;)V", "getMessage", "()Lcom/amazon/alexa/ra/core/features/dictation/codec/EventStreamMessage;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown implements DecodedFrame {
        public static final int $stable = 8;

        @NotNull
        private final EventStreamMessage message;

        public Unknown(@NotNull EventStreamMessage eventStreamMessage) {
            eventStreamMessage.getClass();
            this.message = eventStreamMessage;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, EventStreamMessage eventStreamMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                eventStreamMessage = unknown.message;
            }
            return unknown.copy(eventStreamMessage);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final EventStreamMessage getMessage() {
            return this.message;
        }

        @NotNull
        public final Unknown copy(@NotNull EventStreamMessage message) {
            message.getClass();
            return new Unknown(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && Intrinsics.areEqual(this.message, ((Unknown) other).message);
        }

        @NotNull
        public final EventStreamMessage getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Unknown(message=" + this.message + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }
}
