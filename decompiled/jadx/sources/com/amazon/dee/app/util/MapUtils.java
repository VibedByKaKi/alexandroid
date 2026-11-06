package com.amazon.dee.app.util;

import com.amazon.alexa.auth.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/dee/app/util/MapUtils;", "", "<init>", "()V", "getAsDouble", "", BuildConfig.FLAVOR_authType, "", "key", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Double;", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapUtils {

    @NotNull
    public static final MapUtils INSTANCE = new MapUtils();

    private MapUtils() {
    }

    @JvmStatic
    @Nullable
    public static final Double getAsDouble(@NotNull Map<?, ?> map, @NotNull Object key) {
        map.getClass();
        key.getClass();
        Object obj = map.get(key);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }
}
