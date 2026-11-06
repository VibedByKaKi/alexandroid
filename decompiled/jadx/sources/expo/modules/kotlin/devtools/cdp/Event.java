package expo.modules.kotlin.devtools.cdp;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.metrics.MetricsConstants;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\r\u0010\u000f\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/Event;", "", MetricsConstants.NativeFetch.METHOD, "", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", "Lexpo/modules/kotlin/devtools/cdp/EventParams;", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;)V", "getMethod", "()Ljava/lang/String;", "getParams", "()Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", "toJson", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Event {

    @NotNull
    private final String method;

    @NotNull
    private final JsonSerializable params;

    public Event(@NotNull String str, @NotNull JsonSerializable jsonSerializable) {
        str.getClass();
        jsonSerializable.getClass();
        this.method = str;
        this.params = jsonSerializable;
    }

    public static /* synthetic */ Event copy$default(Event event, String str, JsonSerializable jsonSerializable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = event.method;
        }
        if ((i & 2) != 0) {
            jsonSerializable = event.params;
        }
        return event.copy(str, jsonSerializable);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final JsonSerializable getParams() {
        return this.params;
    }

    @NotNull
    public final Event copy(@NotNull String method, @NotNull JsonSerializable params) {
        method.getClass();
        params.getClass();
        return new Event(method, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.areEqual(this.method, event.method) && Intrinsics.areEqual(this.params, event.params);
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final JsonSerializable getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.method.hashCode() * 31);
    }

    @NotNull
    public final String toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MetricsConstants.NativeFetch.METHOD, this.method);
        jSONObject.put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, this.params.toJSONObject());
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    @NotNull
    public String toString() {
        return "Event(method=" + this.method + ", params=" + this.params + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
