package org.jetbrains.kotlin.konan.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.lang3.SystemProperties;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 org.jetbrains.kotlin.konan.util.ArchiveType, still in use, count: 1, list:
  (r0v0 org.jetbrains.kotlin.konan.util.ArchiveType) from ?: TERNARY null = ((r2v6 boolean) == true) ? (r0v0 org.jetbrains.kotlin.konan.util.ArchiveType) : (r1v1 org.jetbrains.kotlin.konan.util.ArchiveType)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/konan/util/ArchiveType;", "", "fileExtension", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFileExtension", "()Ljava/lang/String;", "ZIP", "TAR_GZ", "Companion", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class ArchiveType {
    ZIP("zip"),
    TAR_GZ("tar.gz");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArchiveType systemDefault;

    @NotNull
    private final String fileExtension;

    static {
        boolean startsWith$default;
        String property = System.getProperty(SystemProperties.OS_NAME);
        property.getClass();
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(property, "Windows", false, 2, null);
        systemDefault = startsWith$default ? r0 : r1;
    }

    private ArchiveType(String str) {
        this.fileExtension = str;
    }

    public static ArchiveType valueOf(String str) {
        return (ArchiveType) Enum.valueOf(ArchiveType.class, str);
    }

    public static ArchiveType[] values() {
        return (ArchiveType[]) $VALUES.clone();
    }

    @NotNull
    public final String getFileExtension() {
        return this.fileExtension;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/konan/util/ArchiveType$Companion;", "", "()V", "systemDefault", "Lorg/jetbrains/kotlin/konan/util/ArchiveType;", "getSystemDefault", "()Lorg/jetbrains/kotlin/konan/util/ArchiveType;", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArchiveType getSystemDefault() {
            return ArchiveType.systemDefault;
        }

        private Companion() {
        }
    }
}
