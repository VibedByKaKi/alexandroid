package kotlinx.io.core;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001\"\u001d\u0010\u0000\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003*\n\u0010\n\"\u00020\u000b2\u00020\u000b¨\u0006\f"}, d2 = {"AddSuppressedMethod", "Ljava/lang/reflect/Method;", "getAddSuppressedMethod", "()Ljava/lang/reflect/Method;", "AddSuppressedMethod$delegate", "Lkotlin/Lazy;", "addSuppressedInternal", "", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "Closeable", "Ljava/io/Closeable;", "kotlinx-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class CloseableJVMKt {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(CloseableJVMKt.class, "kotlinx-io"), "AddSuppressedMethod", "getAddSuppressedMethod()Ljava/lang/reflect/Method;"))};
    private static final Lazy AddSuppressedMethod$delegate = LazyKt.lazy(new Function0<Method>() { // from class: kotlinx.io.core.CloseableJVMKt$AddSuppressedMethod$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Method invoke() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    });

    @PublishedApi
    public static final void addSuppressedInternal(@NotNull Throwable th, @NotNull Throwable th2) {
        th.getClass();
        th2.getClass();
        Method addSuppressedMethod = getAddSuppressedMethod();
        if (addSuppressedMethod != null) {
            addSuppressedMethod.invoke(th, th2);
        }
    }

    private static final Method getAddSuppressedMethod() {
        Lazy lazy = AddSuppressedMethod$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }
}
