package expo.modules.filesystem.legacy;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lexpo/modules/filesystem/legacy/RelocatingOptions;", "Lexpo/modules/kotlin/records/Record;", "from", "", TypedValues.TransitionType.S_TO, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom$annotations", "()V", "getFrom", "()Ljava/lang/String;", "getTo$annotations", "getTo", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RelocatingOptions implements Record {

    @NotNull
    private final String from;

    @NotNull
    private final String to;

    public RelocatingOptions(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.from = str;
        this.to = str2;
    }

    public static /* synthetic */ RelocatingOptions copy$default(RelocatingOptions relocatingOptions, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relocatingOptions.from;
        }
        if ((i & 2) != 0) {
            str2 = relocatingOptions.to;
        }
        return relocatingOptions.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    public final RelocatingOptions copy(@NotNull String from, @NotNull String to) {
        from.getClass();
        to.getClass();
        return new RelocatingOptions(from, to);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelocatingOptions)) {
            return false;
        }
        RelocatingOptions relocatingOptions = (RelocatingOptions) other;
        return Intrinsics.areEqual(this.from, relocatingOptions.from) && Intrinsics.areEqual(this.to, relocatingOptions.to);
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return this.to.hashCode() + (this.from.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("RelocatingOptions(from=", this.from, ", to=", this.to, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Field
    public static /* synthetic */ void getFrom$annotations() {
    }

    @Field
    public static /* synthetic */ void getTo$annotations() {
    }
}
