package expo.modules.interfaces.permissions;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lexpo/modules/interfaces/permissions/PermissionsResponse;", "", "status", "Lexpo/modules/interfaces/permissions/PermissionsStatus;", PermissionsResponse.CAN_ASK_AGAIN_KEY, "", "<init>", "(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)V", "getStatus", "()Lexpo/modules/interfaces/permissions/PermissionsStatus;", "getCanAskAgain", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PermissionsResponse {

    @NotNull
    public static final String CAN_ASK_AGAIN_KEY = "canAskAgain";

    @NotNull
    public static final String EXPIRES_KEY = "expires";

    @NotNull
    public static final String GRANTED_KEY = "granted";

    @NotNull
    public static final String PERMISSION_EXPIRES_NEVER = "never";

    @NotNull
    public static final String SCOPE_ALWAYS = "always";

    @NotNull
    public static final String SCOPE_IN_USE = "whenInUse";

    @NotNull
    public static final String SCOPE_KEY = "scope";

    @NotNull
    public static final String SCOPE_NONE = "none";

    @NotNull
    public static final String STATUS_KEY = "status";
    private final boolean canAskAgain;

    @NotNull
    private final PermissionsStatus status;

    public PermissionsResponse(@NotNull PermissionsStatus permissionsStatus, boolean z) {
        permissionsStatus.getClass();
        this.status = permissionsStatus;
        this.canAskAgain = z;
    }

    public static /* synthetic */ PermissionsResponse copy$default(PermissionsResponse permissionsResponse, PermissionsStatus permissionsStatus, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionsStatus = permissionsResponse.status;
        }
        if ((i & 2) != 0) {
            z = permissionsResponse.canAskAgain;
        }
        return permissionsResponse.copy(permissionsStatus, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PermissionsStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanAskAgain() {
        return this.canAskAgain;
    }

    @NotNull
    public final PermissionsResponse copy(@NotNull PermissionsStatus status, boolean canAskAgain) {
        status.getClass();
        return new PermissionsResponse(status, canAskAgain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionsResponse)) {
            return false;
        }
        PermissionsResponse permissionsResponse = (PermissionsResponse) other;
        return this.status == permissionsResponse.status && this.canAskAgain == permissionsResponse.canAskAgain;
    }

    public final boolean getCanAskAgain() {
        return this.canAskAgain;
    }

    @NotNull
    public final PermissionsStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canAskAgain) + (this.status.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PermissionsResponse(status=" + this.status + ", canAskAgain=" + this.canAskAgain + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ PermissionsResponse(PermissionsStatus permissionsStatus, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(permissionsStatus, (i & 2) != 0 ? true : z);
    }
}
