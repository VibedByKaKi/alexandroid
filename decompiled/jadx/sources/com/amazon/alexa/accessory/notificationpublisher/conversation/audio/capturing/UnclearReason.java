package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import com.amazon.alexa.accessory.notificationpublisher.conversation.DiagnosticText;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.coral.profiler.ProfilerCategory;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \t2\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;", "", "logLabel", "", "getLogLabel", "()Ljava/lang/String;", "NoSpeech", "AmbiguousSpeech", ProfilerCategory.OTHER, "Companion", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$AmbiguousSpeech;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$NoSpeech;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$Other;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UnclearReason {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$AmbiguousSpeech;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AmbiguousSpeech implements UnclearReason {

        @NotNull
        public static final AmbiguousSpeech INSTANCE = new AmbiguousSpeech();

        private AmbiguousSpeech() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof AmbiguousSpeech);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.UnclearReason
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        public int hashCode() {
            return 1347004459;
        }

        @NotNull
        public String toString() {
            return "AmbiguousSpeech";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$Companion;", "", "<init>", "()V", "fromWireReason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;", "wireReason", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final UnclearReason fromWireReason(@Nullable String wireReason) {
            return Intrinsics.areEqual(wireReason, "no_speech") ? NoSpeech.INSTANCE : Intrinsics.areEqual(wireReason, "ambiguous_speech") ? AmbiguousSpeech.INSTANCE : new Other(wireReason);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCaptureTurnOutcome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureTurnOutcome.kt\ncom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
    public static final class DefaultImpls {
        @NotNull
        public static String getLogLabel(@NotNull UnclearReason unclearReason) {
            String safeCode;
            if (Intrinsics.areEqual(unclearReason, NoSpeech.INSTANCE)) {
                return "no_speech";
            }
            if (Intrinsics.areEqual(unclearReason, AmbiguousSpeech.INSTANCE)) {
                return "ambiguous_speech";
            }
            if (unclearReason instanceof Other) {
                String raw = ((Other) unclearReason).getRaw();
                return (raw == null || (safeCode = DiagnosticText.INSTANCE.safeCode(raw)) == null) ? "unspecified" : safeCode;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$NoSpeech;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoSpeech implements UnclearReason {

        @NotNull
        public static final NoSpeech INSTANCE = new NoSpeech();

        private NoSpeech() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NoSpeech);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.UnclearReason
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        public int hashCode() {
            return -353796474;
        }

        @NotNull
        public String toString() {
            return "NoSpeech";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason$Other;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;", "raw", "", "<init>", "(Ljava/lang/String;)V", "getRaw", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Other implements UnclearReason {

        @Nullable
        private final String raw;

        public Other(@Nullable String str) {
            this.raw = str;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.raw;
            }
            return other.copy(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getRaw() {
            return this.raw;
        }

        @NotNull
        public final Other copy(@Nullable String raw) {
            return new Other(raw);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Other) && Intrinsics.areEqual(this.raw, ((Other) other).raw);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.UnclearReason
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        @Nullable
        public final String getRaw() {
            return this.raw;
        }

        public int hashCode() {
            String str = this.raw;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Other(raw=", this.raw, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @JvmStatic
    @NotNull
    static UnclearReason fromWireReason(@Nullable String str) {
        return INSTANCE.fromWireReason(str);
    }

    @NotNull
    String getLogLabel();
}
