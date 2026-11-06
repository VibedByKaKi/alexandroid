package androidx.compose.ui.platform;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0005H\u0000\u001a0\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\n\u0010\n\u001a\u00060\u0005j\u0002`\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0081\b¢\u0006\u0004\b\u000e\u0010\u000f*\f\b\u0000\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0010"}, d2 = {"AtomicInt", "Ljava/util/concurrent/atomic/AtomicInteger;", "simpleIdentityToString", "", "obj", "", "name", "nativeClass", "oldSynchronized", "R", JoinPoint.SYNCHRONIZATION_LOCK, "Landroidx/compose/ui/platform/SynchronizedObject;", "block", "Lkotlin/Function0;", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JvmActuals_jvmKt {
    @NotNull
    public static final Object nativeClass(@NotNull Object obj) {
        return obj.getClass();
    }

    @NotNull
    public static final String simpleIdentityToString(@NotNull Object obj, @Nullable String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder m = AppLaunchChecker$$ExternalSyntheticOutline0.m(str, '@');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        m.append(String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
        return m.toString();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    @PublishedApi
    @JvmName(name = "synchronized")
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m6519synchronized(Object obj, Function0<? extends R> function0) {
        R invoke;
        synchronized (obj) {
            try {
                invoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return invoke;
    }
}
