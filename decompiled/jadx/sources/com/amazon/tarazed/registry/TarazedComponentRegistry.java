package com.amazon.tarazed.registry;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.tarazed.registry.component.TarazedComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ%\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u0005¢\u0006\u0002\u0010\u000fJ,\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\r*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\r0\bJ,\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\r*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\r0\bR\u001e\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/tarazed/registry/TarazedComponentRegistry;", "", "()V", "components", "", "Ljava/lang/Class;", "Lcom/amazon/tarazed/registry/component/TarazedComponent;", "creationBlocks", "Lkotlin/Function0;", "clearRegisteredComponents", "", "clearRegisteredComponents$TarazedAndroidLibrary_release", "getComponent", ExifInterface.GPS_DIRECTION_TRUE, "interfaceClass", "(Ljava/lang/Class;)Lcom/amazon/tarazed/registry/component/TarazedComponent;", "registerComponent", "creationBlock", "Lkotlin/reflect/KClass;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TarazedComponentRegistry {

    @NotNull
    public static final TarazedComponentRegistry INSTANCE = new TarazedComponentRegistry();

    @NotNull
    private static final Map<Class<?>, TarazedComponent> components = new LinkedHashMap();

    @NotNull
    private static final Map<Class<?>, Function0<TarazedComponent>> creationBlocks = new LinkedHashMap();

    private TarazedComponentRegistry() {
    }

    public final void clearRegisteredComponents$TarazedAndroidLibrary_release() {
        components.clear();
        creationBlocks.clear();
    }

    @Nullable
    public final <T extends TarazedComponent> T getComponent(@NotNull Class<T> interfaceClass) {
        interfaceClass.getClass();
        Map<Class<?>, TarazedComponent> map = components;
        T t = (T) map.get(interfaceClass);
        if (t != null) {
            return t;
        }
        Function0<TarazedComponent> function0 = creationBlocks.get(interfaceClass);
        if (function0 == null) {
            return null;
        }
        T t2 = (T) function0.invoke();
        map.put(interfaceClass, t2);
        t2.getClass();
        return t2;
    }

    public final <T extends TarazedComponent> void registerComponent(@NotNull KClass<T> interfaceClass, @NotNull Function0<? extends T> creationBlock) {
        interfaceClass.getClass();
        creationBlock.getClass();
        registerComponent(JvmClassMappingKt.getJavaClass((KClass) interfaceClass), creationBlock);
    }

    public final <T extends TarazedComponent> void registerComponent(@NotNull Class<T> interfaceClass, @NotNull Function0<? extends T> creationBlock) {
        interfaceClass.getClass();
        creationBlock.getClass();
        creationBlocks.put(interfaceClass, creationBlock);
    }
}
