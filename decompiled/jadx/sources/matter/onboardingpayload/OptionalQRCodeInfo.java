package matter.onboardingpayload;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u001d"}, d2 = {"Lmatter/onboardingpayload/OptionalQRCodeInfo;", "", "<init>", "()V", "tag", "", "getTag", "()I", "setTag", "(I)V", "type", "Lmatter/onboardingpayload/OptionalQRCodeInfoType;", "getType", "()Lmatter/onboardingpayload/OptionalQRCodeInfoType;", "setType", "(Lmatter/onboardingpayload/OptionalQRCodeInfoType;)V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "int32", "getInt32", "setInt32", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public class OptionalQRCodeInfo {

    @Nullable
    private String data;
    private int int32;
    private int tag;

    @NotNull
    private OptionalQRCodeInfoType type = OptionalQRCodeInfoType.TYPE_UNKNOWN;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionalQRCodeInfo)) {
            return false;
        }
        OptionalQRCodeInfo optionalQRCodeInfo = (OptionalQRCodeInfo) other;
        return this.tag == optionalQRCodeInfo.tag && this.type == optionalQRCodeInfo.type && Intrinsics.areEqual(this.data, optionalQRCodeInfo.data) && this.int32 == optionalQRCodeInfo.int32;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public final int getInt32() {
        return this.int32;
    }

    public final int getTag() {
        return this.tag;
    }

    @NotNull
    public final OptionalQRCodeInfoType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.tag * 31)) * 31;
        String str = this.data;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.int32;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setInt32(int i) {
        this.int32 = i;
    }

    public final void setTag(int i) {
        this.tag = i;
    }

    public final void setType(@NotNull OptionalQRCodeInfoType optionalQRCodeInfoType) {
        optionalQRCodeInfoType.getClass();
        this.type = optionalQRCodeInfoType;
    }
}
