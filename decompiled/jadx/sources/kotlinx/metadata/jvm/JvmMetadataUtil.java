package kotlinx.metadata.jvm;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.metadata.ClassNameKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\u00020\u0001*\u00060\u0001j\u0002`\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"jvmInternalName", "", "Lkotlinx/metadata/ClassName;", "getJvmInternalName", "(Ljava/lang/String;)Ljava/lang/String;", "kotlinx-metadata-jvm"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "JvmMetadataUtil")
/* loaded from: classes10.dex */
public final class JvmMetadataUtil {
    @NotNull
    public static final String getJvmInternalName(@NotNull String str) {
        String replace$default;
        str.getClass();
        if (ClassNameKt.isLocal(str)) {
            return str.substring(1);
        }
        replace$default = StringsKt__StringsJVMKt.replace$default(str, '.', '$', false, 4, (Object) null);
        return replace$default;
    }
}
