package com.reactnativedocumentpicker;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/reactnativedocumentpicker/CopyDestination;", "", "preset", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPreset", "()Ljava/lang/String;", "CACHES_DIRECTORY", "DOCUMENT_DIRECTORY", "Companion", "react-native-documents_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CopyDestination {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CopyDestination[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String preset;
    public static final CopyDestination CACHES_DIRECTORY = new CopyDestination("CACHES_DIRECTORY", 0, "cachesDirectory");
    public static final CopyDestination DOCUMENT_DIRECTORY = new CopyDestination("DOCUMENT_DIRECTORY", 1, "documentDirectory");

    private static final /* synthetic */ CopyDestination[] $values() {
        return new CopyDestination[]{CACHES_DIRECTORY, DOCUMENT_DIRECTORY};
    }

    static {
        CopyDestination[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CopyDestination(String str, int i, String str2) {
        this.preset = str2;
    }

    @NotNull
    public static EnumEntries<CopyDestination> getEntries() {
        return $ENTRIES;
    }

    public static CopyDestination valueOf(String str) {
        return (CopyDestination) Enum.valueOf(CopyDestination.class, str);
    }

    public static CopyDestination[] values() {
        return (CopyDestination[]) $VALUES.clone();
    }

    @NotNull
    public final String getPreset() {
        return this.preset;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/reactnativedocumentpicker/CopyDestination$Companion;", "", "<init>", "()V", "fromPath", "Lcom/reactnativedocumentpicker/CopyDestination;", "path", "", "react-native-documents_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCopyDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyDestination.kt\ncom/reactnativedocumentpicker/CopyDestination$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CopyDestination fromPath(@NotNull String path) {
            Object obj;
            path.getClass();
            Iterator<E> it2 = CopyDestination.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((CopyDestination) obj).getPreset(), path)) {
                    break;
                }
            }
            CopyDestination copyDestination = (CopyDestination) obj;
            return copyDestination == null ? CopyDestination.CACHES_DIRECTORY : copyDestination;
        }

        private Companion() {
        }
    }
}
