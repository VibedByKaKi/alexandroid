package expo.modules.kotlin.jni;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"nextValue", "", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCppType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CppType.kt\nexpo/modules/kotlin/jni/CppTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes9.dex */
public final class CppTypeKt {
    private static int nextValue;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nextValue() {
        int i = nextValue;
        int i2 = 1 << i;
        nextValue = i + 1;
        return i2;
    }
}
