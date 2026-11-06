package expo.modules.kotlin.devtools.cdp;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\r\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", "requestTime", "Ljava/math/BigDecimal;", "Lexpo/modules/kotlin/devtools/cdp/MonotonicTime;", "<init>", "(Ljava/math/BigDecimal;)V", "getRequestTime", "()Ljava/math/BigDecimal;", "toJSONObject", "Lorg/json/JSONObject;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConnectTiming implements JsonSerializable {

    @NotNull
    private final BigDecimal requestTime;

    public ConnectTiming(@NotNull BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.requestTime = bigDecimal;
    }

    public static /* synthetic */ ConnectTiming copy$default(ConnectTiming connectTiming, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = connectTiming.requestTime;
        }
        return connectTiming.copy(bigDecimal);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BigDecimal getRequestTime() {
        return this.requestTime;
    }

    @NotNull
    public final ConnectTiming copy(@NotNull BigDecimal requestTime) {
        requestTime.getClass();
        return new ConnectTiming(requestTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConnectTiming) && Intrinsics.areEqual(this.requestTime, ((ConnectTiming) other).requestTime);
    }

    @NotNull
    public final BigDecimal getRequestTime() {
        return this.requestTime;
    }

    public int hashCode() {
        return this.requestTime.hashCode();
    }

    @Override // expo.modules.kotlin.devtools.cdp.JsonSerializable
    @NotNull
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestTime", this.requestTime);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ConnectTiming(requestTime=" + this.requestTime + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
