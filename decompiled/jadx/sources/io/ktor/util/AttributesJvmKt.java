package io.ktor.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"Attributes", "Lio/ktor/util/Attributes;", "concurrent", "", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class AttributesJvmKt {
    @NotNull
    public static final Attributes Attributes(boolean z) {
        return z ? new ConcurrentSafeAttributes() : new HashMapAttributes();
    }

    @NotNull
    public static /* synthetic */ Attributes Attributes$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Attributes(z);
    }
}
