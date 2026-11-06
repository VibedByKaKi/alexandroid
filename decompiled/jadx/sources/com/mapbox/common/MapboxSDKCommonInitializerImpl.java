package com.mapbox.common;

import android.content.Context;
import androidx.startup.Initializer;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;", "Landroidx/startup/Initializer;", "Lcom/mapbox/common/MapboxSDKCommon;", "()V", "create", "context", "Landroid/content/Context;", SmartFragmentContent.DEPENDENCIES, "", "Ljava/lang/Class;", "initTileStoreServiceIfAvailable", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxSDKCommonInitializerImpl implements Initializer<MapboxSDKCommon> {
    private final void initTileStoreServiceIfAvailable(Context context) {
        try {
            Method declaredMethod = Class.forName("com.mapbox.common.tilestore.TileStoreServiceInitializer").getDeclaredMethod("init", Context.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(null, context);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NotNull
    public MapboxSDKCommon create(@NotNull Context context) {
        context.getClass();
        initTileStoreServiceIfAvailable(context);
        return MapboxSDKCommon.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return CollectionsKt.listOf(CoreInitializer.class);
    }
}
