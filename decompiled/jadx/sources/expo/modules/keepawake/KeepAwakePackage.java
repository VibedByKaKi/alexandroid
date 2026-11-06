package expo.modules.keepawake;

import android.content.Context;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lexpo/modules/keepawake/KeepAwakePackage;", "Lexpo/modules/core/interfaces/Package;", "<init>", "()V", "createInternalModules", "", "Lexpo/modules/core/interfaces/InternalModule;", "context", "Landroid/content/Context;", "expo-keep-awake_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KeepAwakePackage implements Package {
    @Override // expo.modules.core.interfaces.Package
    @NotNull
    public List<InternalModule> createInternalModules(@NotNull Context context) {
        context.getClass();
        return CollectionsKt.listOf(new ExpoKeepAwakeManager());
    }
}
