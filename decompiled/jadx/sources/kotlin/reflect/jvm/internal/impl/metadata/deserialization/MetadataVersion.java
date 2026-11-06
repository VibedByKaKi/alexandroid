package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class MetadataVersion extends BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final MetadataVersion INSTANCE;

    @JvmField
    @NotNull
    public static final MetadataVersion INSTANCE_NEXT;

    @JvmField
    @NotNull
    public static final MetadataVersion INVALID_VERSION;
    private final boolean isStrictSemantics;

    static {
        MetadataVersion metadataVersion = new MetadataVersion(2, 1, 0);
        INSTANCE = metadataVersion;
        INSTANCE_NEXT = metadataVersion.next();
        INVALID_VERSION = new MetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.isStrictSemantics = z;
    }

    private final boolean isCompatibleInternal(MetadataVersion metadataVersion) {
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !newerThan(metadataVersion);
    }

    private final boolean newerThan(MetadataVersion metadataVersion) {
        if (getMajor() > metadataVersion.getMajor()) {
            return true;
        }
        return getMajor() >= metadataVersion.getMajor() && getMinor() > metadataVersion.getMinor();
    }

    public final boolean isCompatible(@NotNull MetadataVersion metadataVersion) {
        metadataVersion.getClass();
        return isCompatibleInternal(metadataVersion.lastSupportedVersionWithThisLanguageVersion(this.isStrictSemantics));
    }

    public final boolean isStrictSemantics() {
        return this.isStrictSemantics;
    }

    @NotNull
    public final MetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z) {
        MetadataVersion metadataVersion = z ? INSTANCE : INSTANCE_NEXT;
        return metadataVersion.newerThan(this) ? metadataVersion : this;
    }

    @NotNull
    public final MetadataVersion next() {
        return (getMajor() == 1 && getMinor() == 9) ? new MetadataVersion(2, 0, 0) : new MetadataVersion(getMajor(), getMinor() + 1, 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
