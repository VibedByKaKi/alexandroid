package kotlinx.coroutines.io.internal;

import com.dee.app.metrics.MetricsConstants;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.EventLoopKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H ¢\u0006\u0002\b\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/io/internal/CoroutinesEventLoop;", "", "()V", "processEventLoop", "", "processEventLoop$kotlinx_coroutines_io", "FutureReflectionImpl", "Stub", "Lkotlinx/coroutines/io/internal/CoroutinesEventLoop$Stub;", "Lkotlinx/coroutines/io/internal/CoroutinesEventLoop$FutureReflectionImpl;", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public abstract class CoroutinesEventLoop {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\n\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\fR\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/io/internal/CoroutinesEventLoop$FutureReflectionImpl;", "Lkotlinx/coroutines/io/internal/CoroutinesEventLoop;", "()V", "clazz", "Ljava/lang/Class;", "isApplicable", "", "()Z", MetricsConstants.NativeFetch.METHOD, "Ljava/lang/reflect/Method;", "processEventLoop", "", "processEventLoop$kotlinx_coroutines_io", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
    public static final class FutureReflectionImpl extends CoroutinesEventLoop {
        public static final FutureReflectionImpl INSTANCE = new FutureReflectionImpl();
        private static final Class<?> clazz = EventLoopKt.class;
        private static final boolean isApplicable;
        private static final Method method;

        static {
            Method[] methods;
            Method method2 = null;
            if (EventLoopKt.class != 0 && (methods = EventLoopKt.class.getMethods()) != null) {
                int length = methods.length;
                Method method3 = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    if (i < length) {
                        Method method4 = methods[i];
                        method4.getClass();
                        if (Intrinsics.areEqual(method4.getName(), "processNextEventInCurrentThread") && Intrinsics.areEqual(method4.getReturnType(), Long.TYPE)) {
                            Class<?>[] parameterTypes = method4.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && Modifier.isStatic(method4.getModifiers())) {
                                if (z) {
                                    break;
                                }
                                z = true;
                                method3 = method4;
                            }
                        }
                        i++;
                    } else if (z) {
                        method2 = method3;
                    }
                }
            }
            method = method2;
            isApplicable = method2 != null;
        }

        private FutureReflectionImpl() {
            super(null);
        }

        public final boolean isApplicable() {
            return isApplicable;
        }

        @Override // kotlinx.coroutines.io.internal.CoroutinesEventLoop
        public long processEventLoop$kotlinx_coroutines_io() {
            Method method2 = method;
            if (method2 == null) {
                Intrinsics.throwNpe();
            }
            Object invoke = method2.invoke(null, null);
            if (invoke != null) {
                return ((Long) invoke).longValue();
            }
            CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.Long");
            return 0L;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0010¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/io/internal/CoroutinesEventLoop$Stub;", "Lkotlinx/coroutines/io/internal/CoroutinesEventLoop;", "()V", "processEventLoop", "", "processEventLoop$kotlinx_coroutines_io", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
    public static final class Stub extends CoroutinesEventLoop {
        public static final Stub INSTANCE = new Stub();

        private Stub() {
            super(null);
        }

        @Override // kotlinx.coroutines.io.internal.CoroutinesEventLoop
        public long processEventLoop$kotlinx_coroutines_io() {
            return Long.MAX_VALUE;
        }
    }

    private CoroutinesEventLoop() {
    }

    public abstract long processEventLoop$kotlinx_coroutines_io();

    public /* synthetic */ CoroutinesEventLoop(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
