package com.amazon.alexa.ra.core.ui.custom;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/CameraPreviewError;", "", "<init>", "(Ljava/lang/String;I)V", "IN_USE", "UNAVAILABLE", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CameraPreviewError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraPreviewError[] $VALUES;
    public static final CameraPreviewError IN_USE = new CameraPreviewError("IN_USE", 0);
    public static final CameraPreviewError UNAVAILABLE = new CameraPreviewError("UNAVAILABLE", 1);

    private static final /* synthetic */ CameraPreviewError[] $values() {
        return new CameraPreviewError[]{IN_USE, UNAVAILABLE};
    }

    static {
        CameraPreviewError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CameraPreviewError(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CameraPreviewError> getEntries() {
        return $ENTRIES;
    }

    public static CameraPreviewError valueOf(String str) {
        return (CameraPreviewError) Enum.valueOf(CameraPreviewError.class, str);
    }

    public static CameraPreviewError[] values() {
        return (CameraPreviewError[]) $VALUES.clone();
    }
}
