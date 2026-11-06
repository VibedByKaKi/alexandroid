package com.amazon.dee.app.util;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/dee/app/util/BundleUtils;", "", "<init>", "()V", "equals", "", "left", "Landroid/os/Bundle;", "right", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BundleUtils {

    @NotNull
    public static final BundleUtils INSTANCE = new BundleUtils();

    private BundleUtils() {
    }

    @JvmStatic
    public static final boolean equals(@Nullable Bundle left, @Nullable Bundle right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left == right) {
            return true;
        }
        if (left.size() != right.size()) {
            return false;
        }
        for (String str : left.keySet()) {
            Object obj = left.get(str);
            Object obj2 = right.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!equals((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj != null) {
                if (!Intrinsics.areEqual(obj, obj2)) {
                    return false;
                }
            } else if (obj2 != null && right.containsKey(str)) {
                return false;
            }
        }
        return true;
    }
}
