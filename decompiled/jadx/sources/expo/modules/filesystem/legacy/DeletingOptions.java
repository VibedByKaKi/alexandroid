package expo.modules.filesystem.legacy;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lexpo/modules/filesystem/legacy/DeletingOptions;", "Lexpo/modules/kotlin/records/Record;", "idempotent", "", "<init>", "(Z)V", "getIdempotent$annotations", "()V", "getIdempotent", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeletingOptions implements Record {
    private final boolean idempotent;

    public /* synthetic */ DeletingOptions(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ DeletingOptions copy$default(DeletingOptions deletingOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deletingOptions.idempotent;
        }
        return deletingOptions.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIdempotent() {
        return this.idempotent;
    }

    @NotNull
    public final DeletingOptions copy(boolean idempotent) {
        return new DeletingOptions(idempotent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeletingOptions) && this.idempotent == ((DeletingOptions) other).idempotent;
    }

    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.idempotent);
    }

    @NotNull
    public String toString() {
        return Automotive$$ExternalSyntheticOutline0.m("DeletingOptions(idempotent=", MarkdownConstants.RIGHT_PARENTHESIS, this.idempotent);
    }

    public DeletingOptions(boolean z) {
        this.idempotent = z;
    }

    public DeletingOptions() {
        this(false, 1, null);
    }

    @Field
    public static /* synthetic */ void getIdempotent$annotations() {
    }
}
