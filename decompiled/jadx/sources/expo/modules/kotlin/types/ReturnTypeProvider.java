package expo.modules.kotlin.types;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/types/ReturnTypeProvider;", "", "<init>", "()V", "types", "", "Lkotlin/reflect/KClass;", "Lexpo/modules/kotlin/types/ReturnType;", "getTypes", "()Ljava/util/Map;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReturnTypeProvider {

    @NotNull
    public static final ReturnTypeProvider INSTANCE = new ReturnTypeProvider();

    @NotNull
    private static final Map<KClass<?>, ReturnType> types = new LinkedHashMap();

    private ReturnTypeProvider() {
    }

    @NotNull
    public final Map<KClass<?>, ReturnType> getTypes() {
        return types;
    }
}
