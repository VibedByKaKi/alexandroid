package kotlinx.metadata.jvm;

import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.metadata.internal.metadata.jvm.deserialization.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBY\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rBc\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fR\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lkotlinx/metadata/jvm/KotlinClassHeader;", "", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "", "metadataVersion", "", "data1", "", "", "data2", "extraString", "packageName", "extraInt", "(Ljava/lang/Integer;[I[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "bytecodeVersion", "(Ljava/lang/Integer;[I[I[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBytecodeVersion$annotations", "()V", "getBytecodeVersion", "()[I", "getData1", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getData2", "getExtraInt", "()I", "getExtraString", "()Ljava/lang/String;", "getKind", "getMetadataVersion", "getPackageName", "Companion", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class KotlinClassHeader {
    public static final int CLASS_KIND = 1;

    @JvmField
    @NotNull
    public static final int[] COMPATIBLE_BYTECODE_VERSION;

    @JvmField
    @NotNull
    public static final int[] COMPATIBLE_METADATA_VERSION;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FILE_FACADE_KIND = 2;
    public static final int MULTI_FILE_CLASS_FACADE_KIND = 4;
    public static final int MULTI_FILE_CLASS_PART_KIND = 5;
    public static final int SYNTHETIC_CLASS_KIND = 3;

    @NotNull
    private final int[] bytecodeVersion;

    @NotNull
    private final String[] data1;

    @NotNull
    private final String[] data2;
    private final int extraInt;

    @NotNull
    private final String extraString;
    private final int kind;

    @NotNull
    private final int[] metadataVersion;

    @NotNull
    private final String packageName;

    static {
        int[] numbers = JvmMetadataVersion.INSTANCE.getNumbers();
        COMPATIBLE_METADATA_VERSION = Arrays.copyOf(numbers, numbers.length);
        COMPATIBLE_BYTECODE_VERSION = new int[]{1, 0, 3};
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use another constructor, which doesn't take bytecodeVersion as a parameter.", replaceWith = @ReplaceWith(expression = "KotlinClassHeader(kind, metadataVersion, data1, data2, extraString, packageName, extraInt)", imports = {}))
    public KotlinClassHeader(@Nullable Integer num, @Nullable int[] iArr, @Nullable int[] iArr2, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String str, @Nullable String str2, @Nullable Integer num2) {
        this.kind = num != null ? num.intValue() : 1;
        this.metadataVersion = iArr == null ? new int[0] : iArr;
        this.bytecodeVersion = iArr2 == null ? new int[0] : iArr2;
        this.data1 = strArr == null ? new String[0] : strArr;
        this.data2 = strArr2 == null ? new String[0] : strArr2;
        this.extraString = str == null ? "" : str;
        this.packageName = str2 == null ? "" : str2;
        this.extraInt = num2 != null ? num2.intValue() : 0;
    }

    @NotNull
    public final int[] getBytecodeVersion() {
        return this.bytecodeVersion;
    }

    @NotNull
    public final String[] getData1() {
        return this.data1;
    }

    @NotNull
    public final String[] getData2() {
        return this.data2;
    }

    public final int getExtraInt() {
        return this.extraInt;
    }

    @NotNull
    public final String getExtraString() {
        return this.extraString;
    }

    public final int getKind() {
        return this.kind;
    }

    @NotNull
    public final int[] getMetadataVersion() {
        return this.metadataVersion;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/metadata/jvm/KotlinClassHeader$Companion;", "", "()V", "CLASS_KIND", "", "COMPATIBLE_BYTECODE_VERSION", "", "getCOMPATIBLE_BYTECODE_VERSION$annotations", "COMPATIBLE_METADATA_VERSION", "FILE_FACADE_KIND", "MULTI_FILE_CLASS_FACADE_KIND", "MULTI_FILE_CLASS_PART_KIND", "SYNTHETIC_CLASS_KIND", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void getCOMPATIBLE_BYTECODE_VERSION$annotations() {
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
    public static /* synthetic */ void getBytecodeVersion$annotations() {
    }

    public KotlinClassHeader(@Nullable Integer num, @Nullable int[] iArr, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String str, @Nullable String str2, @Nullable Integer num2) {
        this(num, iArr, null, strArr, strArr2, str, str2, num2);
    }
}
