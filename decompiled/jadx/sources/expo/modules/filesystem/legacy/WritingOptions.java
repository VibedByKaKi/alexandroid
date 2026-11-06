package expo.modules.filesystem.legacy;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/filesystem/legacy/WritingOptions;", "Lexpo/modules/kotlin/records/Record;", "encoding", "Lexpo/modules/filesystem/legacy/EncodingType;", "<init>", "(Lexpo/modules/filesystem/legacy/EncodingType;)V", "getEncoding$annotations", "()V", "getEncoding", "()Lexpo/modules/filesystem/legacy/EncodingType;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WritingOptions implements Record {

    @NotNull
    private final EncodingType encoding;

    public /* synthetic */ WritingOptions(EncodingType encodingType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EncodingType.UTF8 : encodingType);
    }

    public static /* synthetic */ WritingOptions copy$default(WritingOptions writingOptions, EncodingType encodingType, int i, Object obj) {
        if ((i & 1) != 0) {
            encodingType = writingOptions.encoding;
        }
        return writingOptions.copy(encodingType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    @NotNull
    public final WritingOptions copy(@NotNull EncodingType encoding) {
        encoding.getClass();
        return new WritingOptions(encoding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WritingOptions) && this.encoding == ((WritingOptions) other).encoding;
    }

    @NotNull
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return this.encoding.hashCode();
    }

    @NotNull
    public String toString() {
        return "WritingOptions(encoding=" + this.encoding + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public WritingOptions(@NotNull EncodingType encodingType) {
        encodingType.getClass();
        this.encoding = encodingType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WritingOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Field
    public static /* synthetic */ void getEncoding$annotations() {
    }
}
