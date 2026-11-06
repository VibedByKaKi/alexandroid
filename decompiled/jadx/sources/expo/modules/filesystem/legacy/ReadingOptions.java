package expo.modules.filesystem.legacy;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lexpo/modules/filesystem/legacy/ReadingOptions;", "Lexpo/modules/kotlin/records/Record;", "encoding", "Lexpo/modules/filesystem/legacy/EncodingType;", "position", "", "length", "<init>", "(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEncoding$annotations", "()V", "getEncoding", "()Lexpo/modules/filesystem/legacy/EncodingType;", "getPosition$annotations", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLength$annotations", "getLength", "component1", "component2", "component3", "copy", "(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)Lexpo/modules/filesystem/legacy/ReadingOptions;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReadingOptions implements Record {

    @NotNull
    private final EncodingType encoding;

    @Nullable
    private final Integer length;

    @Nullable
    private final Integer position;

    public ReadingOptions(@NotNull EncodingType encodingType, @Nullable Integer num, @Nullable Integer num2) {
        encodingType.getClass();
        this.encoding = encodingType;
        this.position = num;
        this.length = num2;
    }

    public static /* synthetic */ ReadingOptions copy$default(ReadingOptions readingOptions, EncodingType encodingType, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            encodingType = readingOptions.encoding;
        }
        if ((i & 2) != 0) {
            num = readingOptions.position;
        }
        if ((i & 4) != 0) {
            num2 = readingOptions.length;
        }
        return readingOptions.copy(encodingType, num, num2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    @NotNull
    public final ReadingOptions copy(@NotNull EncodingType encoding, @Nullable Integer position, @Nullable Integer length) {
        encoding.getClass();
        return new ReadingOptions(encoding, position, length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadingOptions)) {
            return false;
        }
        ReadingOptions readingOptions = (ReadingOptions) other;
        return this.encoding == readingOptions.encoding && Intrinsics.areEqual(this.position, readingOptions.position) && Intrinsics.areEqual(this.length, readingOptions.length);
    }

    @NotNull
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    @Nullable
    public final Integer getLength() {
        return this.length;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = this.encoding.hashCode() * 31;
        Integer num = this.position;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.length;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        EncodingType encodingType = this.encoding;
        Integer num = this.position;
        Integer num2 = this.length;
        StringBuilder sb = new StringBuilder("ReadingOptions(encoding=");
        sb.append(encodingType);
        sb.append(", position=");
        sb.append(num);
        sb.append(", length=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, num2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ ReadingOptions(EncodingType encodingType, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EncodingType.UTF8 : encodingType, num, num2);
    }

    @Field
    public static /* synthetic */ void getEncoding$annotations() {
    }

    @Field
    public static /* synthetic */ void getLength$annotations() {
    }

    @Field
    public static /* synthetic */ void getPosition$annotations() {
    }
}
