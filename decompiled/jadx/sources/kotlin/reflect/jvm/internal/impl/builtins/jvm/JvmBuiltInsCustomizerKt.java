package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class JvmBuiltInsCustomizerKt {

    @NotNull
    private static final Name GET_FIRST_LIST_NAME;

    @NotNull
    private static final Name GET_LAST_LIST_NAME;

    static {
        Name identifier = Name.identifier("getFirst");
        identifier.getClass();
        GET_FIRST_LIST_NAME = identifier;
        Name identifier2 = Name.identifier("getLast");
        identifier2.getClass();
        GET_LAST_LIST_NAME = identifier2;
    }
}
