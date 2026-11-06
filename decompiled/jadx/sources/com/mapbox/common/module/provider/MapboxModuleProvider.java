package com.mapbox.common.module.provider;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricsConstants;
import com.mapbox.annotation.MapboxAnnotationConstants;
import com.mapbox.annotation.module.MapboxModuleType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0004\u0006\r\u0010\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\u001a¢\u0006\u0002\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider;", "", "()V", Constants.LOG_TAG, "", "defaultMapboxModuleCreator", "com/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;", "instanceCreators", "", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "kotlinObjectReferenceProvider", "com/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;", "noArgConstructorCreator", "com/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;", "singletonReferenceProvider", "com/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;", "createModule", ExifInterface.GPS_DIRECTION_TRUE, "type", "Lcom/mapbox/annotation/module/MapboxModuleType;", "paramsProvider", "Lkotlin/Function1;", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "(Lcom/mapbox/annotation/module/MapboxModuleType;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "asGetterFun", "ModuleInstanceProvider", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxModuleProvider {

    @NotNull
    public static final MapboxModuleProvider INSTANCE = new MapboxModuleProvider();

    @NotNull
    private static final String TAG = "MapboxModuleProvider";

    @NotNull
    private static final MapboxModuleProvider$defaultMapboxModuleCreator$1 defaultMapboxModuleCreator;

    @NotNull
    private static final ModuleInstanceProvider[] instanceCreators;

    @NotNull
    private static final MapboxModuleProvider$kotlinObjectReferenceProvider$1 kotlinObjectReferenceProvider;

    @NotNull
    private static final MapboxModuleProvider$noArgConstructorCreator$1 noArgConstructorCreator;

    @NotNull
    private static final MapboxModuleProvider$singletonReferenceProvider$1 singletonReferenceProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "", "getInstance", MapboxAnnotationConstants.MODULE_CONFIGURATION_DISABLED_CLASS, "Ljava/lang/Class;", "type", "Lcom/mapbox/annotation/module/MapboxModuleType;", "paramsProvider", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ModuleInstanceProvider {
        @Nullable
        Object getInstance(@NotNull Class<?> implClass, @NotNull MapboxModuleType type, @NotNull Function1<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1] */
    static {
        ?? r0 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            @Nullable
            public Object getInstance(@NotNull Class<?> implClass, @NotNull MapboxModuleType type, @NotNull Function1<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                Constructor<?> constructor = implClass.getConstructor(null);
                constructor.getClass();
                return constructor.newInstance(null);
            }
        };
        noArgConstructorCreator = r0;
        ?? r1 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            @Nullable
            public Object getInstance(@NotNull Class<?> implClass, @NotNull MapboxModuleType type, @NotNull Function1<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                return implClass.getField("INSTANCE").get(null);
            }
        };
        kotlinObjectReferenceProvider = r1;
        ?? r2 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            @Nullable
            public Object getInstance(@NotNull Class<?> implClass, @NotNull MapboxModuleType type, @NotNull Function1<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                return implClass.getMethod("getInstance", null).invoke(null, null);
            }
        };
        singletonReferenceProvider = r2;
        ?? r3 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            @Nullable
            public Object getInstance(@NotNull Class<?> implClass, @NotNull MapboxModuleType type, @NotNull Function1<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                ModuleProviderArgument[] invoke = paramsProvider.invoke(type);
                ArrayList arrayList = new ArrayList(invoke.length);
                for (ModuleProviderArgument moduleProviderArgument : invoke) {
                    arrayList.add(moduleProviderArgument.getExpectedArgumentClass());
                }
                Object[] array = arrayList.toArray(new Class[0]);
                array.getClass();
                Class[] clsArr = (Class[]) array;
                Constructor<?> constructor = implClass.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                constructor.getClass();
                ArrayList arrayList2 = new ArrayList(invoke.length);
                for (ModuleProviderArgument moduleProviderArgument2 : invoke) {
                    arrayList2.add(moduleProviderArgument2.getArgumentInstance());
                }
                Object[] array2 = arrayList2.toArray(new Object[0]);
                array2.getClass();
                return constructor.newInstance(Arrays.copyOf(array2, array2.length));
            }
        };
        defaultMapboxModuleCreator = r3;
        instanceCreators = new ModuleInstanceProvider[]{r0, r1, r2, r3};
    }

    private MapboxModuleProvider() {
    }

    private final String asGetterFun(String str) {
        return MetricsConstants.Method.CACHE_GET + Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public final <T> T createModule(@NotNull MapboxModuleType type, @NotNull Function1<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) {
        type.getClass();
        paramsProvider.getClass();
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Class<?> cls = Class.forName("com.mapbox.module.".concat(String.format(MapboxAnnotationConstants.MODULE_CONFIGURATION_CLASS_NAME_FORMAT, Arrays.copyOf(new Object[]{type.getSimplifiedName()}, 1))));
            T t = null;
            Object invoke = cls.getMethod(asGetterFun(MapboxAnnotationConstants.MODULE_CONFIGURATION_ENABLE_CONFIGURATION), null).invoke(null, null);
            invoke.getClass();
            if (((Boolean) invoke).booleanValue()) {
                Field declaredField = cls.getDeclaredField(MapboxAnnotationConstants.MODULE_CONFIGURATION_PROVIDER_VARIABLE_NAME);
                declaredField.getClass();
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new MapboxInvalidModuleException(type);
                }
                Class<?> type2 = declaredField.getType();
                type2.getClass();
                Method declaredMethod = type2.getDeclaredMethod(String.format(MapboxAnnotationConstants.MODULE_CONFIGURATION_PROVIDER_METHOD_FORMAT, Arrays.copyOf(new Object[]{type.getSimplifiedName()}, 1)), null);
                declaredMethod.getClass();
                T t2 = (T) declaredMethod.invoke(obj, null);
                t2.getClass();
                return t2;
            }
            Object invoke2 = cls.getMethod(asGetterFun(MapboxAnnotationConstants.MODULE_CONFIGURATION_DISABLED_CLASS), null).invoke(null, null);
            invoke2.getClass();
            Class<?> cls2 = (Class) invoke2;
            ArrayList arrayList = new ArrayList();
            for (ModuleInstanceProvider moduleInstanceProvider : instanceCreators) {
                try {
                    t = (T) moduleInstanceProvider.getInstance(cls2, type, paramsProvider);
                } catch (Exception e) {
                    if (e instanceof MapboxInvalidModuleException) {
                        throw e;
                    }
                    arrayList.add(e);
                }
                if (t != null) {
                    break;
                }
            }
            if (t == null) {
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Log.e(TAG, "Module loading failed", (Throwable) it2.next());
                }
            }
            if (t != null) {
                return t;
            }
            throw new MapboxInvalidModuleException(type);
        } catch (Exception e2) {
            if (e2 instanceof MapboxInvalidModuleException) {
                throw e2;
            }
            e2.printStackTrace();
            throw new MapboxInvalidModuleException(type);
        }
    }
}
