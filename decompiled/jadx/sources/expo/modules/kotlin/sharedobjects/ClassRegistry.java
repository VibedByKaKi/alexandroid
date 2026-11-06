package expo.modules.kotlin.sharedobjects;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import expo.modules.core.logging.PersistentFileLog$$ExternalSyntheticLambda2;
import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.project.model.KotlinPlatformTypeAttribute;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0010J\u0014\u0010\u0011\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u0013R*\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "", "<init>", "()V", "pairs", "", "Ljava/lang/Class;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "getPairs$expo_modules_core_release", "()Ljava/util/Map;", "setPairs$expo_modules_core_release", "(Ljava/util/Map;)V", BulkOperationType.add, "", "native", KotlinPlatformTypeAttribute.JS, "add$expo_modules_core_release", "delete", "toJavaScriptObject", "toJavaScriptObject$expo_modules_core_release", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClassRegistry {

    @NotNull
    private Map<Class<?>, JavaScriptObject> pairs = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit add$lambda$0(ClassRegistry classRegistry, Class cls) {
        classRegistry.delete(cls);
        return Unit.INSTANCE;
    }

    private final void delete(Class<?> r1) {
        this.pairs.remove(r1);
    }

    public final void add$expo_modules_core_release(@NotNull Class<?> r3, @NotNull JavaScriptObject js) {
        r3.getClass();
        js.getClass();
        js.defineDeallocator$expo_modules_core_release(new PersistentFileLog$$ExternalSyntheticLambda2(this, r3, 2));
        this.pairs.put(r3, js);
    }

    @NotNull
    public final Map<Class<?>, JavaScriptObject> getPairs$expo_modules_core_release() {
        return this.pairs;
    }

    public final void setPairs$expo_modules_core_release(@NotNull Map<Class<?>, JavaScriptObject> map) {
        map.getClass();
        this.pairs = map;
    }

    @Nullable
    public final JavaScriptObject toJavaScriptObject$expo_modules_core_release(@NotNull Class<?> r1) {
        r1.getClass();
        return this.pairs.get(r1);
    }
}
