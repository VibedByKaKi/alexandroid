package expo.modules.kotlin.jni;

import com.amazon.alexa.presence.utils.MetricsUtil;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.PromiseAlreadySettledException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\u001e\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0017H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0018H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0019H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001aH\u0016J$\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0017\u0010 \u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0082\bJ$\u0010#\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lexpo/modules/kotlin/jni/PromiseImpl;", "Lexpo/modules/kotlin/Promise;", "callback", "Lexpo/modules/kotlin/jni/JavaCallback;", "<init>", "(Lexpo/modules/kotlin/jni/JavaCallback;)V", "getCallback$expo_modules_core_release", "()Lexpo/modules/kotlin/jni/JavaCallback;", "value", "", "wasSettled", "getWasSettled$expo_modules_core_release", "()Z", "appContextHolder", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/AppContext;", "fullFunctionName", "", MetricsUtil.MetricsId.RESOLVE, "", "", "result", "", "", "", "", "", "reject", "code", "message", "cause", "", "checkIfWasSettled", "body", "Lkotlin/Function0;", "decorateWithDebugInformation", "moduleName", "functionName", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
@SourceDebugExtension({"SMAP\nPromiseImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromiseImpl.kt\nexpo/modules/kotlin/jni/PromiseImpl\n*L\n1#1,90:1\n63#1,17:91\n63#1,17:108\n63#1,17:125\n63#1,17:142\n63#1,17:159\n63#1,17:176\n63#1,17:193\n63#1,17:210\n*S KotlinDebug\n*F\n+ 1 PromiseImpl.kt\nexpo/modules/kotlin/jni/PromiseImpl\n*L\n20#1:91,17\n24#1:108,17\n28#1:125,17\n32#1:142,17\n36#1:159,17\n40#1:176,17\n44#1:193,17\n57#1:210,17\n*E\n"})
/* loaded from: classes9.dex */
public final class PromiseImpl implements Promise {

    @Nullable
    private WeakReference<AppContext> appContextHolder;

    @DoNotStrip
    @NotNull
    private final JavaCallback callback;

    @Nullable
    private String fullFunctionName;
    private boolean wasSettled;

    @DoNotStrip
    public PromiseImpl(@NotNull JavaCallback javaCallback) {
        javaCallback.getClass();
        this.callback = javaCallback;
    }

    private final void checkIfWasSettled(Function0<Unit> body) {
        if (!this.wasSettled) {
            body.invoke();
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
        WeakReference<AppContext> weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw promiseAlreadySettledException;
        }
        AppContext appContext = weakReference.get();
        if (appContext == null) {
            throw promiseAlreadySettledException;
        }
        appContext.getErrorManager();
        throw promiseAlreadySettledException;
    }

    public final void decorateWithDebugInformation(@NotNull WeakReference<AppContext> appContextHolder, @NotNull String moduleName, @NotNull String functionName) {
        appContextHolder.getClass();
        moduleName.getClass();
        functionName.getClass();
        this.appContextHolder = appContextHolder;
        this.fullFunctionName = a$$ExternalSyntheticOutline0.m$1(moduleName, ".", functionName);
    }

    @NotNull
    /* renamed from: getCallback$expo_modules_core_release, reason: from getter */
    public final JavaCallback getCallback() {
        return this.callback;
    }

    /* renamed from: getWasSettled$expo_modules_core_release, reason: from getter */
    public final boolean getWasSettled() {
        return this.wasSettled;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(@NotNull String code, @Nullable String message, @Nullable Throwable cause) {
        code.getClass();
        if (!this.wasSettled) {
            JavaCallback javaCallback = this.callback;
            if (message == null) {
                message = cause != null ? cause.getMessage() : null;
                if (message == null) {
                    message = "unknown";
                }
            }
            javaCallback.invoke(code, message);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str != null ? str : "unknown");
        WeakReference<AppContext> weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw promiseAlreadySettledException;
        }
        AppContext appContext = weakReference.get();
        if (appContext == null) {
            throw promiseAlreadySettledException;
        }
        appContext.getErrorManager();
        throw promiseAlreadySettledException;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@NotNull String result) {
        result.getClass();
        if (!this.wasSettled) {
            this.callback.invoke(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
        WeakReference<AppContext> weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw promiseAlreadySettledException;
        }
        AppContext appContext = weakReference.get();
        if (appContext == null) {
            throw promiseAlreadySettledException;
        }
        appContext.getErrorManager();
        throw promiseAlreadySettledException;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@NotNull Map<String, ? extends Object> result) {
        result.getClass();
        this.callback.invoke(result);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@Nullable Object value) {
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null) {
                throw promiseAlreadySettledException;
            }
            AppContext appContext = weakReference.get();
            if (appContext != null) {
                appContext.getErrorManager();
                throw promiseAlreadySettledException;
            }
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(value);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve() {
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null) {
                throw promiseAlreadySettledException;
            }
            AppContext appContext = weakReference.get();
            if (appContext != null) {
                appContext.getErrorManager();
                throw promiseAlreadySettledException;
            }
            throw promiseAlreadySettledException;
        }
        this.callback.invoke();
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(int result) {
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null) {
                throw promiseAlreadySettledException;
            }
            AppContext appContext = weakReference.get();
            if (appContext != null) {
                appContext.getErrorManager();
                throw promiseAlreadySettledException;
            }
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(@NotNull CodedException codedException) {
        Promise.DefaultImpls.reject(this, codedException);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(boolean result) {
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null) {
                throw promiseAlreadySettledException;
            }
            AppContext appContext = weakReference.get();
            if (appContext != null) {
                appContext.getErrorManager();
                throw promiseAlreadySettledException;
            }
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(double result) {
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null) {
                throw promiseAlreadySettledException;
            }
            AppContext appContext = weakReference.get();
            if (appContext != null) {
                appContext.getErrorManager();
                throw promiseAlreadySettledException;
            }
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(float result) {
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            if (str == null) {
                str = "unknown";
            }
            PromiseAlreadySettledException promiseAlreadySettledException = new PromiseAlreadySettledException(str);
            WeakReference<AppContext> weakReference = this.appContextHolder;
            if (weakReference == null) {
                throw promiseAlreadySettledException;
            }
            AppContext appContext = weakReference.get();
            if (appContext != null) {
                appContext.getErrorManager();
                throw promiseAlreadySettledException;
            }
            throw promiseAlreadySettledException;
        }
        this.callback.invoke(result);
        this.wasSettled = true;
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(@NotNull Collection<? extends Object> result) {
        result.getClass();
        this.callback.invoke(result);
    }
}
