package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@ComposeToolingApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "", "sortedIndex", "", "name", "", "inlineClass", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getSortedIndex", "()I", "getName", "()Ljava/lang/String;", "getInlineClass", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParameterSourceInformation {
    public static final int $stable = 0;

    @Nullable
    private final String inlineClass;

    @Nullable
    private final String name;
    private final int sortedIndex;

    public /* synthetic */ ParameterSourceInformation(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    @Nullable
    public final String getInlineClass() {
        return this.inlineClass;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getSortedIndex() {
        return this.sortedIndex;
    }

    public ParameterSourceInformation(int i, @Nullable String str, @Nullable String str2) {
        this.sortedIndex = i;
        this.name = str;
        this.inlineClass = str2;
    }
}
