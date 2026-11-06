package com.mrousavy.camera.core.types;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/mrousavy/camera/core/types/PermissionStatus;", "Lcom/mrousavy/camera/core/types/JSUnionValue;", "", "unionValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUnionValue", "()Ljava/lang/String;", "DENIED", "NOT_DETERMINED", "GRANTED", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PermissionStatus implements JSUnionValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PermissionStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String unionValue;
    public static final PermissionStatus DENIED = new PermissionStatus("DENIED", 0, "denied");
    public static final PermissionStatus NOT_DETERMINED = new PermissionStatus("NOT_DETERMINED", 1, "not-determined");
    public static final PermissionStatus GRANTED = new PermissionStatus("GRANTED", 2, "granted");

    private static final /* synthetic */ PermissionStatus[] $values() {
        return new PermissionStatus[]{DENIED, NOT_DETERMINED, GRANTED};
    }

    static {
        PermissionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private PermissionStatus(String str, int i, String str2) {
        this.unionValue = str2;
    }

    @NotNull
    public static EnumEntries<PermissionStatus> getEntries() {
        return $ENTRIES;
    }

    public static PermissionStatus valueOf(String str) {
        return (PermissionStatus) Enum.valueOf(PermissionStatus.class, str);
    }

    public static PermissionStatus[] values() {
        return (PermissionStatus[]) $VALUES.clone();
    }

    @Override // com.mrousavy.camera.core.types.JSUnionValue
    @NotNull
    public String getUnionValue() {
        return this.unionValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mrousavy/camera/core/types/PermissionStatus$Companion;", "", "<init>", "()V", "fromPermissionStatus", "Lcom/mrousavy/camera/core/types/PermissionStatus;", "status", "", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PermissionStatus fromPermissionStatus(int status) {
            return status != -1 ? status != 0 ? PermissionStatus.NOT_DETERMINED : PermissionStatus.GRANTED : PermissionStatus.DENIED;
        }

        private Companion() {
        }
    }
}
