package expo.modules.kotlin.types.folly;

import android.util.ArrayMap;
import com.dee.app.metrics.MetricsConstants;
import expo.modules.core.interfaces.DoNotStrip;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;", "", "<init>", "()V", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
/* loaded from: classes9.dex */
public final class FollyDynamicExtensionConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayMap<Integer, Object> instanceMap = new ArrayMap<>();
    private static int nextId;

    @JvmStatic
    @DoNotStrip
    @Nullable
    public static final synchronized Object get(@NotNull String str) {
        Object obj;
        synchronized (FollyDynamicExtensionConverter.class) {
            obj = INSTANCE.get(str);
        }
        return obj;
    }

    @JvmStatic
    @DoNotStrip
    @NotNull
    public static final synchronized String put(@NotNull Object obj) {
        String put;
        synchronized (FollyDynamicExtensionConverter.class) {
            put = INSTANCE.put(obj);
        }
        return put;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\tH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$Companion;", "", "<init>", "()V", "instanceMap", "Landroid/util/ArrayMap;", "", "nextId", MetricsConstants.Method.CACHE_PUT, "", Languages.ANY, MetricsConstants.Method.CACHE_GET, "payload", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @DoNotStrip
        @Nullable
        public final synchronized Object get(@NotNull String payload) {
            boolean startsWith$default;
            payload.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(payload, FollyDynamicExtensionConverterKt.DYNAMIC_EXTENSION_PREFIX, false, 2, null);
            if (!startsWith$default) {
                throw new InvalidDynamicExtensionFormatException();
            }
            return FollyDynamicExtensionConverter.instanceMap.remove(Integer.valueOf(Integer.parseInt(payload.substring(27))));
        }

        @JvmStatic
        @DoNotStrip
        @NotNull
        public final synchronized String put(@NotNull Object any) {
            int i;
            any.getClass();
            i = FollyDynamicExtensionConverter.nextId;
            FollyDynamicExtensionConverter.nextId = i + 1;
            FollyDynamicExtensionConverter.instanceMap.put(Integer.valueOf(i), any);
            return FollyDynamicExtensionConverterKt.DYNAMIC_EXTENSION_PREFIX + i;
        }

        private Companion() {
        }
    }
}
