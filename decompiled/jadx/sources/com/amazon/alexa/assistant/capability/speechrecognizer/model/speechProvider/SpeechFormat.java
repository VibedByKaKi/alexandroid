package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat;", "", "<init>", "()V", "Pcm", "Opus", "OpusBitrate", "Companion", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$Opus;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$Pcm;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = SpeechFormatSerializer.class)
/* loaded from: classes15.dex */
public abstract class SpeechFormat {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$Opus;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat;", "bitrate", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$OpusBitrate;", "<init>", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$OpusBitrate;)V", "getBitrate", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$OpusBitrate;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Opus extends SpeechFormat {

        @NotNull
        private final OpusBitrate bitrate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Opus(@NotNull OpusBitrate opusBitrate) {
            super(null);
            opusBitrate.getClass();
            this.bitrate = opusBitrate;
        }

        public static /* synthetic */ Opus copy$default(Opus opus, OpusBitrate opusBitrate, int i, Object obj) {
            if ((i & 1) != 0) {
                opusBitrate = opus.bitrate;
            }
            return opus.copy(opusBitrate);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OpusBitrate getBitrate() {
            return this.bitrate;
        }

        @NotNull
        public final Opus copy(@NotNull OpusBitrate bitrate) {
            bitrate.getClass();
            return new Opus(bitrate);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Opus) && this.bitrate == ((Opus) other).bitrate;
        }

        @NotNull
        public final OpusBitrate getBitrate() {
            return this.bitrate;
        }

        public int hashCode() {
            return this.bitrate.hashCode();
        }

        @NotNull
        public String toString() {
            return "Opus(bitrate=" + this.bitrate + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$OpusBitrate;", "", "<init>", "(Ljava/lang/String;I)V", "KBPS_32", "KBPS_64", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpusBitrate {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OpusBitrate[] $VALUES;
        public static final OpusBitrate KBPS_32 = new OpusBitrate("KBPS_32", 0);
        public static final OpusBitrate KBPS_64 = new OpusBitrate("KBPS_64", 1);

        private static final /* synthetic */ OpusBitrate[] $values() {
            return new OpusBitrate[]{KBPS_32, KBPS_64};
        }

        static {
            OpusBitrate[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private OpusBitrate(String str, int i) {
        }

        @NotNull
        public static EnumEntries<OpusBitrate> getEntries() {
            return $ENTRIES;
        }

        public static OpusBitrate valueOf(String str) {
            return (OpusBitrate) Enum.valueOf(OpusBitrate.class, str);
        }

        public static OpusBitrate[] values() {
            return (OpusBitrate[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$Pcm;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Pcm extends SpeechFormat {

        @NotNull
        public static final Pcm INSTANCE = new Pcm();

        private Pcm() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Pcm);
        }

        public int hashCode() {
            return -260613295;
        }

        @NotNull
        public String toString() {
            return "Pcm";
        }
    }

    public /* synthetic */ SpeechFormat(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SpeechFormat> serializer() {
            return SpeechFormatSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private SpeechFormat() {
    }
}
