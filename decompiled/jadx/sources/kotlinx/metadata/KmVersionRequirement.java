package kotlinx.metadata;

import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.mapbox.common.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001J1\u0010%\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010&J \u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lkotlinx/metadata/KmVersionRequirement;", "Lkotlinx/metadata/KmVersionRequirementVisitor;", "()V", "errorCode", "", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Lkotlinx/metadata/KmVersionRequirementVersionKind;", "getKind", "()Lkotlinx/metadata/KmVersionRequirementVersionKind;", "setKind", "(Lkotlinx/metadata/KmVersionRequirementVersionKind;)V", ModelTransformer.KEY_BATTERY_LEVEL, "Lkotlinx/metadata/KmVersionRequirementLevel;", "getLevel", "()Lkotlinx/metadata/KmVersionRequirementLevel;", "setLevel", "(Lkotlinx/metadata/KmVersionRequirementLevel;)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "version", "Lkotlinx/metadata/KmVersion;", "getVersion", "()Lkotlinx/metadata/KmVersion;", "setVersion", "(Lkotlinx/metadata/KmVersion;)V", HttpHeaders.ACCEPT, "", "visitor", "visit", "(Lkotlinx/metadata/KmVersionRequirementVersionKind;Lkotlinx/metadata/KmVersionRequirementLevel;Ljava/lang/Integer;Ljava/lang/String;)V", "visitVersion", "major", "minor", "patch", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class KmVersionRequirement extends KmVersionRequirementVisitor {

    @Nullable
    private Integer errorCode;
    public KmVersionRequirementVersionKind kind;
    public KmVersionRequirementLevel level;

    @Nullable
    private String message;
    public KmVersion version;

    public KmVersionRequirement() {
        super(null, 1, null);
    }

    public final void accept(@NotNull KmVersionRequirementVisitor visitor) {
        visitor.getClass();
        visitor.visit(getKind(), getLevel(), this.errorCode, this.message);
        visitor.visitVersion(getVersion().getMajor(), getVersion().getMinor(), getVersion().getPatch());
        visitor.visitEnd();
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final KmVersionRequirementVersionKind getKind() {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind = this.kind;
        if (kmVersionRequirementVersionKind != null) {
            return kmVersionRequirementVersionKind;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME);
        return null;
    }

    @NotNull
    public final KmVersionRequirementLevel getLevel() {
        KmVersionRequirementLevel kmVersionRequirementLevel = this.level;
        if (kmVersionRequirementLevel != null) {
            return kmVersionRequirementLevel;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ModelTransformer.KEY_BATTERY_LEVEL);
        return null;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final KmVersion getVersion() {
        KmVersion kmVersion = this.version;
        if (kmVersion != null) {
            return kmVersion;
        }
        Intrinsics.throwUninitializedPropertyAccessException("version");
        return null;
    }

    public final void setErrorCode(@Nullable Integer num) {
        this.errorCode = num;
    }

    public final void setKind(@NotNull KmVersionRequirementVersionKind kmVersionRequirementVersionKind) {
        kmVersionRequirementVersionKind.getClass();
        this.kind = kmVersionRequirementVersionKind;
    }

    public final void setLevel(@NotNull KmVersionRequirementLevel kmVersionRequirementLevel) {
        kmVersionRequirementLevel.getClass();
        this.level = kmVersionRequirementLevel;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setVersion(@NotNull KmVersion kmVersion) {
        kmVersion.getClass();
        this.version = kmVersion;
    }

    @Override // kotlinx.metadata.KmVersionRequirementVisitor
    public void visit(@NotNull KmVersionRequirementVersionKind kind, @NotNull KmVersionRequirementLevel level, @Nullable Integer errorCode, @Nullable String message) {
        kind.getClass();
        level.getClass();
        setKind(kind);
        setLevel(level);
        this.errorCode = errorCode;
        this.message = message;
    }

    @Override // kotlinx.metadata.KmVersionRequirementVisitor
    public void visitVersion(int major, int minor, int patch) {
        setVersion(new KmVersion(major, minor, patch));
    }
}
