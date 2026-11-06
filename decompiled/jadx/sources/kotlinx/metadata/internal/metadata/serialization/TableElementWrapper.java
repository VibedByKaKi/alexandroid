package kotlinx.metadata.internal.metadata.serialization;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.metadata.internal.protobuf.GeneratedMessageLite;
import kotlinx.metadata.internal.protobuf.GeneratedMessageLite.Builder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/metadata/internal/metadata/serialization/TableElementWrapper;", "Element", "Lkotlinx/metadata/internal/protobuf/GeneratedMessageLite$Builder;", "", "builder", "(Lorg/jetbrains/kotlin/protobuf/GeneratedMessageLite$Builder;)V", "getBuilder", "()Lorg/jetbrains/kotlin/protobuf/GeneratedMessageLite$Builder;", "Lkotlinx/metadata/internal/protobuf/GeneratedMessageLite$Builder;", "bytes", "", "hashCode", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
final class TableElementWrapper<Element extends GeneratedMessageLite.Builder<?, Element>> {

    @NotNull
    private final Element builder;

    @NotNull
    private final byte[] bytes;
    private final int hashCode;

    public TableElementWrapper(@NotNull Element element) {
        element.getClass();
        this.builder = element;
        byte[] byteArray = element.build().toByteArray();
        byteArray.getClass();
        this.bytes = byteArray;
        this.hashCode = Arrays.hashCode(byteArray);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof TableElementWrapper) && Arrays.equals(this.bytes, ((TableElementWrapper) other).bytes);
    }

    @NotNull
    public final Element getBuilder() {
        return this.builder;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getHashCode() {
        return this.hashCode;
    }
}
