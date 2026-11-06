package com.mapbox.common.core.module;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.common.module.LibraryLoader;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u000eR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;", "", "()V", "loaderInstance", "Lcom/mapbox/common/module/LibraryLoader;", "getLoaderInstance", "()Lcom/mapbox/common/module/LibraryLoader;", "loaderInstance$delegate", "Lkotlin/Lazy;", "paramsProvider", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "type", "Lcom/mapbox/annotation/module/MapboxModuleType;", "(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonSingletonModuleProvider {

    @NotNull
    public static final CommonSingletonModuleProvider INSTANCE = new CommonSingletonModuleProvider();

    /* renamed from: loaderInstance$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy loaderInstance = LazyKt.lazy(new Function0<LibraryLoader>() { // from class: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2$1, reason: invalid class name */
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<MapboxModuleType, ModuleProviderArgument[]> {
            public AnonymousClass1(Object obj) {
                super(1, obj, CommonSingletonModuleProvider.class, "paramsProvider", "paramsProvider(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ModuleProviderArgument[] invoke(@NotNull MapboxModuleType mapboxModuleType) {
                ModuleProviderArgument[] paramsProvider;
                mapboxModuleType.getClass();
                paramsProvider = ((CommonSingletonModuleProvider) this.receiver).paramsProvider(mapboxModuleType);
                return paramsProvider;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LibraryLoader invoke() {
            return (LibraryLoader) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.CommonLibraryLoader, new AnonymousClass1(CommonSingletonModuleProvider.INSTANCE));
        }
    });

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapboxModuleType.values().length];
            try {
                iArr[MapboxModuleType.CommonLogger.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapboxModuleType.CommonLibraryLoader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CommonSingletonModuleProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(MapboxModuleType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return new ModuleProviderArgument[0];
        }
        if (i == 2) {
            return new ModuleProviderArgument[0];
        }
        Gson$$ExternalSyntheticBUOutline0.m((Object) type, "unsupported module type - ");
        return null;
    }

    @NotNull
    public final LibraryLoader getLoaderInstance() {
        return (LibraryLoader) loaderInstance.getValue();
    }
}
