package com.amazon.alexa.accessory.frames.media.revert;

import com.amazon.alexa.accessory.frames.media.models.Media;
import com.amazon.comms.models.gui.MediaSettingsInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/revert/RevertState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", MediaSettingsInfo.ENHANCED_PROCESSING_NOT_APPLICABLE, "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RevertState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevertState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RevertState ENABLED = new RevertState("ENABLED", 0);
    public static final RevertState DISABLED = new RevertState("DISABLED", 1);
    public static final RevertState NOT_APPLICABLE = new RevertState(MediaSettingsInfo.ENHANCED_PROCESSING_NOT_APPLICABLE, 2);

    private static final /* synthetic */ RevertState[] $values() {
        return new RevertState[]{ENABLED, DISABLED, NOT_APPLICABLE};
    }

    static {
        RevertState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private RevertState(String str, int i) {
    }

    @JvmStatic
    @NotNull
    public static final RevertState from(@NotNull Media media) {
        return INSTANCE.from(media);
    }

    @NotNull
    public static EnumEntries<RevertState> getEntries() {
        return $ENTRIES;
    }

    public static RevertState valueOf(String str) {
        return (RevertState) Enum.valueOf(RevertState.class, str);
    }

    public static RevertState[] values() {
        return (RevertState[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/revert/RevertState$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/accessory/frames/media/revert/RevertState;", "media", "Lcom/amazon/alexa/accessory/frames/media/models/Media;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RevertState from(@NotNull Media media) {
            String str;
            media.getClass();
            return (!media.isEnhanced || (str = media.snapshotPath) == null || str.length() == 0) ? media.isEnhanced ? RevertState.DISABLED : RevertState.NOT_APPLICABLE : RevertState.ENABLED;
        }

        private Companion() {
        }
    }
}
