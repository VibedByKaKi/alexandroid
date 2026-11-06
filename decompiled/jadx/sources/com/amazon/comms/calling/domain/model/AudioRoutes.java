package com.amazon.comms.calling.domain.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/domain/model/AudioRoutes;", "", "sname", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSname", "()Ljava/lang/String;", "EARPIECE", "SPEAKER", "WIREDHEADSET", "BLUETOOTH", "toString", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AudioRoutes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioRoutes[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String WIRED_HEADSET = "WIRED_HEADSET";

    @NotNull
    private final String sname;
    public static final AudioRoutes EARPIECE = new AudioRoutes("EARPIECE", 0, "EARPIECE");
    public static final AudioRoutes SPEAKER = new AudioRoutes("SPEAKER", 1, "SPEAKER");
    public static final AudioRoutes WIREDHEADSET = new AudioRoutes("WIREDHEADSET", 2, "WIRED HEADSET");
    public static final AudioRoutes BLUETOOTH = new AudioRoutes("BLUETOOTH", 3, "BLUETOOTH");

    private static final /* synthetic */ AudioRoutes[] $values() {
        return new AudioRoutes[]{EARPIECE, SPEAKER, WIREDHEADSET, BLUETOOTH};
    }

    static {
        AudioRoutes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private AudioRoutes(String str, int i, String str2) {
        this.sname = str2;
    }

    @NotNull
    public static EnumEntries<AudioRoutes> getEntries() {
        return $ENTRIES;
    }

    public static AudioRoutes valueOf(String str) {
        return (AudioRoutes) Enum.valueOf(AudioRoutes.class, str);
    }

    public static AudioRoutes[] values() {
        return (AudioRoutes[]) $VALUES.clone();
    }

    @NotNull
    public final String getSname() {
        return this.sname;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.sname;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/comms/calling/domain/model/AudioRoutes$Companion;", "", "<init>", "()V", "WIRED_HEADSET", "", "isValidEnum", "", "name", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isValidEnum(@NotNull String name) {
            name.getClass();
            Iterator it2 = ArrayIteratorKt.iterator(AudioRoutes.class.getEnumConstants());
            while (it2.hasNext()) {
                if (StringsKt.equals(((AudioRoutes) it2.next()).toString(), name, true)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
