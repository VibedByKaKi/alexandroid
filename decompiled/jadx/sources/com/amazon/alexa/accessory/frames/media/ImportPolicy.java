package com.amazon.alexa.accessory.frames.media;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/ImportPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS_NAN", "ALWAYS_P2P", "AMBIVALENT", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ImportPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImportPolicy[] $VALUES;
    public static final ImportPolicy ALWAYS_NAN = new ImportPolicy("ALWAYS_NAN", 0);
    public static final ImportPolicy ALWAYS_P2P = new ImportPolicy("ALWAYS_P2P", 1);
    public static final ImportPolicy AMBIVALENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static volatile ImportPolicy activePolicy;

    private static final /* synthetic */ ImportPolicy[] $values() {
        return new ImportPolicy[]{ALWAYS_NAN, ALWAYS_P2P, AMBIVALENT};
    }

    static {
        ImportPolicy importPolicy = new ImportPolicy("AMBIVALENT", 2);
        AMBIVALENT = importPolicy;
        ImportPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        activePolicy = importPolicy;
    }

    private ImportPolicy(String str, int i) {
    }

    @JvmStatic
    @NotNull
    public static final ImportPolicy current() {
        return INSTANCE.current();
    }

    @NotNull
    public static EnumEntries<ImportPolicy> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static final void setup(@NotNull ImportPolicy importPolicy) {
        INSTANCE.setup(importPolicy);
    }

    public static ImportPolicy valueOf(String str) {
        return (ImportPolicy) Enum.valueOf(ImportPolicy.class, str);
    }

    public static ImportPolicy[] values() {
        return (ImportPolicy[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/ImportPolicy$Companion;", "", "<init>", "()V", "activePolicy", "Lcom/amazon/alexa/accessory/frames/media/ImportPolicy;", "setup", "", "policy", "current", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ImportPolicy current() {
            return ImportPolicy.activePolicy;
        }

        @JvmStatic
        public final void setup(@NotNull ImportPolicy policy) {
            policy.getClass();
            ImportPolicy.activePolicy = policy;
        }

        private Companion() {
        }
    }
}
