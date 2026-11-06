package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Args", "Landroidx/navigation/NavArgs;", "Lkotlin/Lazy;", "navArgsClass", "Lkotlin/reflect/KClass;", "argumentProducer", "Lkotlin/Function0;", "Landroid/os/Bundle;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/navigation/NavArgs;", "value", "getValue", "()Landroidx/navigation/NavArgs;", "isInitialized", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NavArgsLazy<Args extends NavArgs> implements Lazy<Args> {

    @NotNull
    private final Function0<Bundle> argumentProducer;

    @Nullable
    private Args cached;

    @NotNull
    private final KClass<Args> navArgsClass;

    public NavArgsLazy(@NotNull KClass<Args> kClass, @NotNull Function0<Bundle> function0) {
        kClass.getClass();
        function0.getClass();
        this.navArgsClass = kClass;
        this.argumentProducer = function0;
    }

    @Override // kotlin.Lazy
    @NotNull
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class javaClass = JvmClassMappingKt.getJavaClass((KClass) this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = javaClass.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            method.getClass();
        }
        Object invoke2 = method.invoke(null, invoke);
        invoke2.getClass();
        Args args2 = (Args) invoke2;
        this.cached = args2;
        return args2;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }
}
