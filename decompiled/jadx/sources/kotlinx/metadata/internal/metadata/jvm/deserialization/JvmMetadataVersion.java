package kotlinx.metadata.internal.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.metadata.internal.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0013\b\u0016\u0012\n\u0010\u0002\u001a\u00020\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\bH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\r"}, d2 = {"Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmMetadataVersion;", "Lkotlinx/metadata/internal/metadata/deserialization/BinaryVersion;", "numbers", "", "", "([I)V", "versionArray", "isStrictSemantics", "", "([IZ)V", "()Z", "isCompatible", "Companion", "metadata.jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmMetadataVersion extends BinaryVersion {

    @JvmField
    @NotNull
    public static final JvmMetadataVersion INSTANCE = new JvmMetadataVersion(1, 7, 1);

    @JvmField
    @NotNull
    public static final JvmMetadataVersion INVALID_VERSION = new JvmMetadataVersion(new int[0]);
    private final boolean isStrictSemantics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.isStrictSemantics = z;
    }

    @Override // kotlinx.metadata.internal.metadata.deserialization.BinaryVersion
    public boolean isCompatible() {
        boolean z;
        if (getMajor() != 1 || getMinor() != 0) {
            if (this.isStrictSemantics) {
                z = isCompatibleTo(INSTANCE);
            } else {
                int major = getMajor();
                JvmMetadataVersion jvmMetadataVersion = INSTANCE;
                z = major == jvmMetadataVersion.getMajor() && getMinor() <= jvmMetadataVersion.getMinor() + 1;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isStrictSemantics, reason: from getter */
    public final boolean getIsStrictSemantics() {
        return this.isStrictSemantics;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
