package com.amazon.alexa.assistant.opusencoder.model;

import com.amazon.opus.OpusEncoder;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants;", "", "<init>", "()V", "FORMAT", "", "FRAME_SIZE_SAMPLES", "", "INPUT_CHUNK_SIZE_BYTES", "OUTPUT_FRAME_LENGTH_BYTES", "MAX_PACKET_SIZE_BYTES", "ApplicationType", "SampleRate", "Channels", "Bitrate", "Complexity", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OpusConstants {

    @NotNull
    public static final String FORMAT = "OPUS";
    public static final int FRAME_SIZE_SAMPLES = 320;
    public static final int INPUT_CHUNK_SIZE_BYTES = 640;

    @NotNull
    public static final OpusConstants INSTANCE = new OpusConstants();
    public static final int MAX_PACKET_SIZE_BYTES = 80;
    public static final int OUTPUT_FRAME_LENGTH_BYTES = 80;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$ApplicationType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VOIP", "AUDIO", "RESTRICTED_LOW_DELAY", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ApplicationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ApplicationType[] $VALUES;
        private final int value;
        public static final ApplicationType VOIP = new ApplicationType("VOIP", 0, 2048);
        public static final ApplicationType AUDIO = new ApplicationType("AUDIO", 1, OpusEncoder.OPUS_APPLICATION_AUDIO);
        public static final ApplicationType RESTRICTED_LOW_DELAY = new ApplicationType("RESTRICTED_LOW_DELAY", 2, OpusEncoder.OPUS_APPLICATION_RESTRICTED_LOWDELAY);

        private static final /* synthetic */ ApplicationType[] $values() {
            return new ApplicationType[]{VOIP, AUDIO, RESTRICTED_LOW_DELAY};
        }

        static {
            ApplicationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ApplicationType(String str, int i, int i2) {
            this.value = i2;
        }

        @NotNull
        public static EnumEntries<ApplicationType> getEntries() {
            return $ENTRIES;
        }

        public static ApplicationType valueOf(String str) {
            return (ApplicationType) Enum.valueOf(ApplicationType.class, str);
        }

        public static ApplicationType[] values() {
            return (ApplicationType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Bitrate;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BITRATE_32K", "BITRATE_64K", "BITRATE_MAX", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Bitrate {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Bitrate[] $VALUES;
        public static final Bitrate BITRATE_32K = new Bitrate("BITRATE_32K", 0, 32000);
        public static final Bitrate BITRATE_64K = new Bitrate("BITRATE_64K", 1, 64000);
        public static final Bitrate BITRATE_MAX = new Bitrate("BITRATE_MAX", 2, -1);
        private final int value;

        private static final /* synthetic */ Bitrate[] $values() {
            return new Bitrate[]{BITRATE_32K, BITRATE_64K, BITRATE_MAX};
        }

        static {
            Bitrate[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Bitrate(String str, int i, int i2) {
            this.value = i2;
        }

        @NotNull
        public static EnumEntries<Bitrate> getEntries() {
            return $ENTRIES;
        }

        public static Bitrate valueOf(String str) {
            return (Bitrate) Enum.valueOf(Bitrate.class, str);
        }

        public static Bitrate[] values() {
            return (Bitrate[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Channels;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MONO", "STEREO", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Channels {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Channels[] $VALUES;
        public static final Channels MONO = new Channels("MONO", 0, 1);
        public static final Channels STEREO = new Channels("STEREO", 1, 2);
        private final int value;

        private static final /* synthetic */ Channels[] $values() {
            return new Channels[]{MONO, STEREO};
        }

        static {
            Channels[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Channels(String str, int i, int i2) {
            this.value = i2;
        }

        @NotNull
        public static EnumEntries<Channels> getEntries() {
            return $ENTRIES;
        }

        public static Channels valueOf(String str) {
            return (Channels) Enum.valueOf(Channels.class, str);
        }

        public static Channels[] values() {
            return (Channels[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$Complexity;", "", "<init>", "()V", "MIN", "", "AVS_STANDARD", "MAX", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Complexity {
        public static final int AVS_STANDARD = 4;

        @NotNull
        public static final Complexity INSTANCE = new Complexity();
        public static final int MAX = 10;
        public static final int MIN = 0;

        private Complexity() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusConstants$SampleRate;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RATE_8000", "RATE_12000", "RATE_16000", "RATE_24000", "RATE_48000", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SampleRate {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SampleRate[] $VALUES;
        private final int value;
        public static final SampleRate RATE_8000 = new SampleRate("RATE_8000", 0, 8000);
        public static final SampleRate RATE_12000 = new SampleRate("RATE_12000", 1, 12000);
        public static final SampleRate RATE_16000 = new SampleRate("RATE_16000", 2, 16000);
        public static final SampleRate RATE_24000 = new SampleRate("RATE_24000", 3, 24000);
        public static final SampleRate RATE_48000 = new SampleRate("RATE_48000", 4, 48000);

        private static final /* synthetic */ SampleRate[] $values() {
            return new SampleRate[]{RATE_8000, RATE_12000, RATE_16000, RATE_24000, RATE_48000};
        }

        static {
            SampleRate[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private SampleRate(String str, int i, int i2) {
            this.value = i2;
        }

        @NotNull
        public static EnumEntries<SampleRate> getEntries() {
            return $ENTRIES;
        }

        public static SampleRate valueOf(String str) {
            return (SampleRate) Enum.valueOf(SampleRate.class, str);
        }

        public static SampleRate[] values() {
            return (SampleRate[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    private OpusConstants() {
    }
}
