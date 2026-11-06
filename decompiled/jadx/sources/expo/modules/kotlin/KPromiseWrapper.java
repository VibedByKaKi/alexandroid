package expo.modules.kotlin;

import com.amazon.alexa.presence.utils.MetricsUtil;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.types.JSTypeConverter;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/KPromiseWrapper;", "Lexpo/modules/kotlin/Promise;", "bridgePromise", "Lcom/facebook/react/bridge/Promise;", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", MetricsUtil.MetricsId.RESOLVE, "", "value", "", "reject", "code", "", "message", "cause", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KPromiseWrapper implements Promise {

    @NotNull
    private final com.facebook.react.bridge.Promise bridgePromise;

    public KPromiseWrapper(@NotNull com.facebook.react.bridge.Promise promise) {
        promise.getClass();
        this.bridgePromise = promise;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(@NotNull String code, @Nullable String message, @Nullable Throwable cause) {
        code.getClass();
        this.bridgePromise.reject(code, message, cause);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@Nullable Object value) {
        this.bridgePromise.resolve(JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, value, null, false, 6, null));
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(@NotNull CodedException codedException) {
        Promise.DefaultImpls.reject(this, codedException);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(double d) {
        Promise.DefaultImpls.resolve(this, d);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(float f) {
        Promise.DefaultImpls.resolve((Promise) this, f);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(int i) {
        Promise.DefaultImpls.resolve((Promise) this, i);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@NotNull String str) {
        Promise.DefaultImpls.resolve(this, str);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@NotNull Collection<? extends Object> collection) {
        Promise.DefaultImpls.resolve(this, collection);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@NotNull Map<String, ? extends Object> map) {
        Promise.DefaultImpls.resolve(this, map);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(boolean z) {
        Promise.DefaultImpls.resolve(this, z);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve() {
        Promise.DefaultImpls.resolve(this);
    }
}
