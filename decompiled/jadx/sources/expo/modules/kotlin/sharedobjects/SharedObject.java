package expo.modules.kotlin.sharedobjects;

import com.amazon.dee.app.elements.ElementsRouteKeys;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.types.JSTypeConverter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0003J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J+\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J\b\u0010(\u001a\u00020\u001fH\u0017J\b\u0010)\u001a\u00020\u0011H\u0016R\u001c\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", "", "runtimeContext", "Lexpo/modules/kotlin/RuntimeContext;", "<init>", "(Lexpo/modules/kotlin/RuntimeContext;)V", "appContext", "Lexpo/modules/kotlin/AppContext;", "(Lexpo/modules/kotlin/AppContext;)V", "sharedObjectId", "Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", "getSharedObjectId-HSeVr_g$expo_modules_core_release", "()I", "setSharedObjectId-kyJHjyY$expo_modules_core_release", "(I)V", "I", "getSharedObjectId", "", "runtimeContextHolder", "Ljava/lang/ref/WeakReference;", "getRuntimeContextHolder", "()Ljava/lang/ref/WeakReference;", "setRuntimeContextHolder", "(Ljava/lang/ref/WeakReference;)V", "getRuntimeContext", "()Lexpo/modules/kotlin/RuntimeContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "getJavaScriptObject", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "emit", "", "eventName", "", ElementsRouteKeys.ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "onStartListeningToEvent", "onStopListeningToEvent", "sharedObjectDidRelease", "deallocate", "getAdditionalMemoryPressure", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
@SourceDebugExtension({"SMAP\nSharedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedObject.kt\nexpo/modules/kotlin/sharedobjects/SharedObject\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,90:1\n11228#2:91\n11563#2,3:92\n37#3:95\n36#3,3:96\n*S KotlinDebug\n*F\n+ 1 SharedObject.kt\nexpo/modules/kotlin/sharedobjects/SharedObject\n*L\n53#1:91\n53#1:92,3\n54#1:95\n54#1:96,3\n*E\n"})
/* loaded from: classes9.dex */
public class SharedObject {

    @NotNull
    private WeakReference<RuntimeContext> runtimeContextHolder;
    private int sharedObjectId;

    public SharedObject(@Nullable RuntimeContext runtimeContext) {
        this.sharedObjectId = SharedObjectId.m25194constructorimpl(0);
        this.runtimeContextHolder = UtilsKt.weak(runtimeContext);
    }

    private final JavaScriptWeakObject getJavaScriptObject() {
        int m25194constructorimpl = SharedObjectId.m25194constructorimpl(this.sharedObjectId);
        RuntimeContext runtimeContext = getRuntimeContext();
        if (runtimeContext == null) {
            return null;
        }
        return SharedObjectId.m25202toWeakJavaScriptObjectNullimpl(m25194constructorimpl, runtimeContext);
    }

    private final RuntimeContext getRuntimeContext() {
        return this.runtimeContextHolder.get();
    }

    @DoNotStrip
    private final int getSharedObjectId() {
        return this.sharedObjectId;
    }

    public final void emit(@NotNull String eventName, @NotNull Object... args) {
        RuntimeContext runtimeContext;
        JSIContext jsiContext$expo_modules_core_release;
        eventName.getClass();
        args.getClass();
        JavaScriptWeakObject javaScriptObject = getJavaScriptObject();
        if (javaScriptObject == null || (runtimeContext = getRuntimeContext()) == null || (jsiContext$expo_modules_core_release = runtimeContext.getJsiContext$expo_modules_core_release()) == null) {
            return;
        }
        try {
            JNIUtils.Companion companion = JNIUtils.INSTANCE;
            ArrayList arrayList = new ArrayList(args.length);
            for (Object obj : args) {
                arrayList.add(JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, obj, null, false, 6, null));
            }
            companion.emitEvent(javaScriptObject, jsiContext$expo_modules_core_release, eventName, arrayList.toArray(new Object[0]));
        } catch (Throwable th) {
            CoreLoggerKt.getLogger().error(a$$ExternalSyntheticOutline0.m("Unable to send event '", eventName, "' by shared object of type ", getClass().getSimpleName()), th);
        }
    }

    public int getAdditionalMemoryPressure() {
        return 0;
    }

    @Nullable
    public final AppContext getAppContext() {
        RuntimeContext runtimeContext = getRuntimeContext();
        if (runtimeContext != null) {
            return runtimeContext.getAppContext();
        }
        return null;
    }

    @NotNull
    public final WeakReference<RuntimeContext> getRuntimeContextHolder() {
        return this.runtimeContextHolder;
    }

    /* renamed from: getSharedObjectId-HSeVr_g$expo_modules_core_release, reason: not valid java name */
    public final int m25191getSharedObjectIdHSeVr_g$expo_modules_core_release() {
        return this.sharedObjectId;
    }

    public void onStartListeningToEvent(@NotNull String eventName) {
        eventName.getClass();
    }

    public void onStopListeningToEvent(@NotNull String eventName) {
        eventName.getClass();
    }

    public final void setRuntimeContextHolder(@NotNull WeakReference<RuntimeContext> weakReference) {
        weakReference.getClass();
        this.runtimeContextHolder = weakReference;
    }

    /* renamed from: setSharedObjectId-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final void m25192setSharedObjectIdkyJHjyY$expo_modules_core_release(int i) {
        this.sharedObjectId = i;
    }

    public void sharedObjectDidRelease() {
        deallocate();
    }

    @Deprecated(message = "Use sharedObjectDidRelease() instead.", replaceWith = @ReplaceWith(expression = "sharedObjectDidRelease()", imports = {}))
    public void deallocate() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedObject() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SharedObject(RuntimeContext runtimeContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runtimeContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedObject(@NotNull AppContext appContext) {
        this(appContext.getHostingRuntimeContext());
        appContext.getClass();
    }
}
