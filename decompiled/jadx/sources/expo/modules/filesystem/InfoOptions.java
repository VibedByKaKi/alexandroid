package expo.modules.filesystem;

import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u001a\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\n\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lexpo/modules/filesystem/InfoOptions;", "Lexpo/modules/kotlin/records/Record;", SierraContentProviderContract.MD5_VALUE, "", "<init>", "(Ljava/lang/Boolean;)V", "getMd5$annotations", "()V", "getMd5", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lexpo/modules/filesystem/InfoOptions;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InfoOptions implements Record {

    @Nullable
    private final Boolean md5;

    public InfoOptions(@Nullable Boolean bool) {
        this.md5 = bool;
    }

    public static /* synthetic */ InfoOptions copy$default(InfoOptions infoOptions, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = infoOptions.md5;
        }
        return infoOptions.copy(bool);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getMd5() {
        return this.md5;
    }

    @NotNull
    public final InfoOptions copy(@Nullable Boolean md5) {
        return new InfoOptions(md5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InfoOptions) && Intrinsics.areEqual(this.md5, ((InfoOptions) other).md5);
    }

    @Nullable
    public final Boolean getMd5() {
        return this.md5;
    }

    public int hashCode() {
        Boolean bool = this.md5;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "InfoOptions(md5=" + this.md5 + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Field
    public static /* synthetic */ void getMd5$annotations() {
    }
}
