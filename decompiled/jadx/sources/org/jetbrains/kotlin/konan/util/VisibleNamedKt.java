package org.jetbrains.kotlin.konan.util;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\"%\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"visibleName", "", ExifInterface.GPS_DIRECTION_TRUE, "", "getVisibleName", "(Ljava/lang/Enum;)Ljava/lang/String;", "kotlin-native-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class VisibleNamedKt {
    @NotNull
    public static final <T extends Enum<T>> String getVisibleName(@NotNull T t) {
        t.getClass();
        String lowerCase = t.name().toLowerCase();
        lowerCase.getClass();
        return lowerCase;
    }
}
