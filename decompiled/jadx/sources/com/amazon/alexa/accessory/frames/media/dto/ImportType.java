package com.amazon.alexa.accessory.frames.media.dto;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/ImportType;", "", "metricSuffix", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMetricSuffix", "()Ljava/lang/String;", "AUTO", "MANUAL", "UNKNOWN", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ImportType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImportType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String metricSuffix;
    public static final ImportType AUTO = new ImportType("AUTO", 0, "_auto_import");
    public static final ImportType MANUAL = new ImportType("MANUAL", 1, "_manual_import");
    public static final ImportType UNKNOWN = new ImportType("UNKNOWN", 2, "_unknown_import");

    private static final /* synthetic */ ImportType[] $values() {
        return new ImportType[]{AUTO, MANUAL, UNKNOWN};
    }

    static {
        ImportType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ImportType(String str, int i, String str2) {
        this.metricSuffix = str2;
    }

    @JvmStatic
    @NotNull
    public static final ImportType fromString(@Nullable String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<ImportType> getEntries() {
        return $ENTRIES;
    }

    public static ImportType valueOf(String str) {
        return (ImportType) Enum.valueOf(ImportType.class, str);
    }

    public static ImportType[] values() {
        return (ImportType[]) $VALUES.clone();
    }

    @NotNull
    public final String getMetricSuffix() {
        return this.metricSuffix;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/ImportType$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/accessory/frames/media/dto/ImportType;", "value", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nImportType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportType.kt\ncom/amazon/alexa/accessory/frames/media/dto/ImportType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,26:1\n1400#2,2:27\n*S KotlinDebug\n*F\n+ 1 ImportType.kt\ncom/amazon/alexa/accessory/frames/media/dto/ImportType$Companion\n*L\n23#1:27,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ImportType fromString(@Nullable String value) {
            ImportType importType;
            ImportType[] values = ImportType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    importType = null;
                    break;
                }
                importType = values[i];
                if (Intrinsics.areEqual(importType.name(), value)) {
                    break;
                }
                i++;
            }
            return importType == null ? ImportType.UNKNOWN : importType;
        }

        private Companion() {
        }
    }
}
