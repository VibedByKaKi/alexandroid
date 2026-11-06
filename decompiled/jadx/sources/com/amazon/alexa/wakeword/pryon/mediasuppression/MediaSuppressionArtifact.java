package com.amazon.alexa.wakeword.pryon.mediasuppression;

import com.amazon.alexa.wakeword.davs.ArtifactInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/wakeword/pryon/mediasuppression/MediaSuppressionArtifact;", "", "(Ljava/lang/String;I)V", "artifactInfo", "Lcom/amazon/alexa/wakeword/davs/ArtifactInfo;", "getArtifactInfo", "()Lcom/amazon/alexa/wakeword/davs/ArtifactInfo;", "artifactMetadataPreferenceKey", "", "getArtifactMetadataPreferenceKey", "()Ljava/lang/String;", "preloadedFileName", "getPreloadedFileName", "FINGERPRINT", "WATERMARK", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class MediaSuppressionArtifact {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaSuppressionArtifact[] $VALUES;
    public static final MediaSuppressionArtifact FINGERPRINT = new MediaSuppressionArtifact("FINGERPRINT", 0) { // from class: com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact.FINGERPRINT

        @NotNull
        private final FingerprintArtifactInfo artifactInfo = new FingerprintArtifactInfo();

        @NotNull
        private final String preloadedFileName = "";

        @NotNull
        private final String artifactMetadataPreferenceKey = "davs_fingerprint_shared_preference";

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact
        @NotNull
        public String getArtifactMetadataPreferenceKey() {
            return this.artifactMetadataPreferenceKey;
        }

        @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact
        @NotNull
        public String getPreloadedFileName() {
            return this.preloadedFileName;
        }

        @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact
        @NotNull
        public FingerprintArtifactInfo getArtifactInfo() {
            return this.artifactInfo;
        }
    };
    public static final MediaSuppressionArtifact WATERMARK = new MediaSuppressionArtifact("WATERMARK", 1) { // from class: com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact.WATERMARK

        @NotNull
        private final WatermarkArtifactInfo artifactInfo = new WatermarkArtifactInfo();

        @NotNull
        private final String preloadedFileName = "watermark.prod.alexa+echo.bin";

        @NotNull
        private final String artifactMetadataPreferenceKey = "davs_watermark_shared_preference";

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact
        @NotNull
        public String getArtifactMetadataPreferenceKey() {
            return this.artifactMetadataPreferenceKey;
        }

        @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact
        @NotNull
        public String getPreloadedFileName() {
            return this.preloadedFileName;
        }

        @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionArtifact
        @NotNull
        public WatermarkArtifactInfo getArtifactInfo() {
            return this.artifactInfo;
        }
    };

    private static final /* synthetic */ MediaSuppressionArtifact[] $values() {
        return new MediaSuppressionArtifact[]{FINGERPRINT, WATERMARK};
    }

    static {
        MediaSuppressionArtifact[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public /* synthetic */ MediaSuppressionArtifact(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public static EnumEntries<MediaSuppressionArtifact> getEntries() {
        return $ENTRIES;
    }

    public static MediaSuppressionArtifact valueOf(String str) {
        return (MediaSuppressionArtifact) Enum.valueOf(MediaSuppressionArtifact.class, str);
    }

    public static MediaSuppressionArtifact[] values() {
        return (MediaSuppressionArtifact[]) $VALUES.clone();
    }

    @NotNull
    public abstract ArtifactInfo getArtifactInfo();

    @NotNull
    public abstract String getArtifactMetadataPreferenceKey();

    @NotNull
    public abstract String getPreloadedFileName();

    private MediaSuppressionArtifact(String str, int i) {
    }
}
