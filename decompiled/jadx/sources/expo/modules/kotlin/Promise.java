package expo.modules.kotlin;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.presence.utils.MetricsUtil;
import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0007H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\tH\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0016J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0016J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/Promise;", "", MetricsUtil.MetricsId.RESOLVE, "", "value", "result", "", "", "", "", "", "", "", "reject", "code", "message", "cause", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Lexpo/modules/kotlin/exception/CodedException;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Promise {
    void reject(@NotNull CodedException exception);

    void reject(@NotNull String code, @Nullable String message, @Nullable Throwable cause);

    void resolve();

    void resolve(double result);

    void resolve(float result);

    void resolve(int result);

    void resolve(@Nullable Object value);

    void resolve(@NotNull String result);

    void resolve(@NotNull Collection<? extends Object> result);

    void resolve(@NotNull Map<String, ? extends Object> result);

    void resolve(boolean result);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void reject(@NotNull Promise promise, @NotNull CodedException codedException) {
            codedException.getClass();
            promise.reject(codedException.getCode(), codedException.getLocalizedMessage(), codedException.getCause());
        }

        public static void resolve(@NotNull Promise promise, @NotNull Collection<? extends Object> collection) {
            collection.getClass();
            promise.resolve((Object) collection);
        }

        public static void resolve(@NotNull Promise promise, int i) {
            promise.resolve(Integer.valueOf(i));
        }

        public static void resolve(@NotNull Promise promise, boolean z) {
            promise.resolve(Boolean.valueOf(z));
        }

        public static void resolve(@NotNull Promise promise, double d) {
            promise.resolve(Double.valueOf(d));
        }

        public static void resolve(@NotNull Promise promise, float f) {
            promise.resolve(Float.valueOf(f));
        }

        public static void resolve(@NotNull Promise promise, @NotNull String str) {
            str.getClass();
            promise.resolve((Object) str);
        }

        public static void resolve(@NotNull Promise promise) {
            promise.resolve((Object) null);
        }

        public static void resolve(@NotNull Promise promise, @NotNull Map<String, ? extends Object> map) {
            map.getClass();
            promise.resolve((Object) map);
        }
    }
}
