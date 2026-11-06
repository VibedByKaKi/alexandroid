package com.facebook.fresco.ui.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/fresco/ui/common/ImageRenderingInfra;", "", "<init>", "(Ljava/lang/String;I)V", "VITO_V2", "VITO_V1", "DRAWEE", "OTHER", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageRenderingInfra {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageRenderingInfra[] $VALUES;
    public static final ImageRenderingInfra VITO_V2 = new ImageRenderingInfra("VITO_V2", 0);
    public static final ImageRenderingInfra VITO_V1 = new ImageRenderingInfra("VITO_V1", 1);
    public static final ImageRenderingInfra DRAWEE = new ImageRenderingInfra("DRAWEE", 2);
    public static final ImageRenderingInfra OTHER = new ImageRenderingInfra("OTHER", 3);

    private static final /* synthetic */ ImageRenderingInfra[] $values() {
        return new ImageRenderingInfra[]{VITO_V2, VITO_V1, DRAWEE, OTHER};
    }

    static {
        ImageRenderingInfra[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ImageRenderingInfra(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ImageRenderingInfra> getEntries() {
        return $ENTRIES;
    }

    public static ImageRenderingInfra valueOf(String str) {
        return (ImageRenderingInfra) Enum.valueOf(ImageRenderingInfra.class, str);
    }

    public static ImageRenderingInfra[] values() {
        return (ImageRenderingInfra[]) $VALUES.clone();
    }
}
