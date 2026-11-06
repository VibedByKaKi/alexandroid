package expo.modules.filesystem;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\b\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lexpo/modules/filesystem/PathInfo;", "Lexpo/modules/kotlin/records/Record;", "exists", "", "isDirectory", "<init>", "(ZLjava/lang/Boolean;)V", "getExists$annotations", "()V", "getExists", "()Z", "setExists", "(Z)V", "isDirectory$annotations", "()Ljava/lang/Boolean;", "setDirectory", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(ZLjava/lang/Boolean;)Lexpo/modules/filesystem/PathInfo;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PathInfo implements Record {
    private boolean exists;

    @Nullable
    private Boolean isDirectory;

    public PathInfo(boolean z, @Nullable Boolean bool) {
        this.exists = z;
        this.isDirectory = bool;
    }

    public static /* synthetic */ PathInfo copy$default(PathInfo pathInfo, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pathInfo.exists;
        }
        if ((i & 2) != 0) {
            bool = pathInfo.isDirectory;
        }
        return pathInfo.copy(z, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsDirectory() {
        return this.isDirectory;
    }

    @NotNull
    public final PathInfo copy(boolean exists, @Nullable Boolean isDirectory) {
        return new PathInfo(exists, isDirectory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathInfo)) {
            return false;
        }
        PathInfo pathInfo = (PathInfo) other;
        return this.exists == pathInfo.exists && Intrinsics.areEqual(this.isDirectory, pathInfo.isDirectory);
    }

    public final boolean getExists() {
        return this.exists;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.exists) * 31;
        Boolean bool = this.isDirectory;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Nullable
    public final Boolean isDirectory() {
        return this.isDirectory;
    }

    public final void setDirectory(@Nullable Boolean bool) {
        this.isDirectory = bool;
    }

    public final void setExists(boolean z) {
        this.exists = z;
    }

    @NotNull
    public String toString() {
        return "PathInfo(exists=" + this.exists + ", isDirectory=" + this.isDirectory + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Field
    public static /* synthetic */ void getExists$annotations() {
    }

    @Field
    public static /* synthetic */ void isDirectory$annotations() {
    }
}
