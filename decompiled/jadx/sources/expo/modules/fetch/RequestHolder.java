package expo.modules.fetch;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lexpo/modules/fetch/RequestHolder;", "", MissingTokenPull.TRIGGER_REQUEST, "Lokhttp3/Request;", "<init>", "(Lokhttp3/Request;)V", "getRequest", "()Lokhttp3/Request;", "setRequest", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class RequestHolder {

    @Nullable
    private Request request;

    public RequestHolder(@Nullable Request request) {
        this.request = request;
    }

    public static /* synthetic */ RequestHolder copy$default(RequestHolder requestHolder, Request request, int i, Object obj) {
        if ((i & 1) != 0) {
            request = requestHolder.request;
        }
        return requestHolder.copy(request);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    @NotNull
    public final RequestHolder copy(@Nullable Request request) {
        return new RequestHolder(request);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestHolder) && Intrinsics.areEqual(this.request, ((RequestHolder) other).request);
    }

    @Nullable
    public final Request getRequest() {
        return this.request;
    }

    public int hashCode() {
        Request request = this.request;
        if (request == null) {
            return 0;
        }
        return request.hashCode();
    }

    public final void setRequest(@Nullable Request request) {
        this.request = request;
    }

    @NotNull
    public String toString() {
        return "RequestHolder(request=" + this.request + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
