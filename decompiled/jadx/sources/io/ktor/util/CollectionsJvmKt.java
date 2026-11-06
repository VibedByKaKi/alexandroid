package io.ktor.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007¨\u0006\u0003"}, d2 = {"unmodifiable", "", ExifInterface.GPS_DIRECTION_TRUE, "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class CollectionsJvmKt {
    @InternalAPI
    @NotNull
    public static final <T> Set<T> unmodifiable(@NotNull Set<? extends T> set) {
        set.getClass();
        Set<T> unmodifiableSet = Collections.unmodifiableSet(set);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }
}
