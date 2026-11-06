package io.ktor.client.response;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.client.call.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lio/ktor/client/response/HttpResponseContainer;", "", "expectedType", "Lio/ktor/client/call/TypeInfo;", "response", "(Lio/ktor/client/call/TypeInfo;Ljava/lang/Object;)V", "getExpectedType", "()Lio/ktor/client/call/TypeInfo;", "getResponse", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ktor-client-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final /* data */ class HttpResponseContainer {

    @NotNull
    private final TypeInfo expectedType;

    @NotNull
    private final Object response;

    public HttpResponseContainer(@NotNull TypeInfo typeInfo, @NotNull Object obj) {
        typeInfo.getClass();
        obj.getClass();
        this.expectedType = typeInfo;
        this.response = obj;
    }

    @NotNull
    public static /* synthetic */ HttpResponseContainer copy$default(HttpResponseContainer httpResponseContainer, TypeInfo typeInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            typeInfo = httpResponseContainer.expectedType;
        }
        if ((i & 2) != 0) {
            obj = httpResponseContainer.response;
        }
        return httpResponseContainer.copy(typeInfo, obj);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TypeInfo getExpectedType() {
        return this.expectedType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Object getResponse() {
        return this.response;
    }

    @NotNull
    public final HttpResponseContainer copy(@NotNull TypeInfo expectedType, @NotNull Object response) {
        expectedType.getClass();
        response.getClass();
        return new HttpResponseContainer(expectedType, response);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponseContainer)) {
            return false;
        }
        HttpResponseContainer httpResponseContainer = (HttpResponseContainer) other;
        return Intrinsics.areEqual(this.expectedType, httpResponseContainer.expectedType) && Intrinsics.areEqual(this.response, httpResponseContainer.response);
    }

    @NotNull
    public final TypeInfo getExpectedType() {
        return this.expectedType;
    }

    @NotNull
    public final Object getResponse() {
        return this.response;
    }

    public int hashCode() {
        TypeInfo typeInfo = this.expectedType;
        int hashCode = (typeInfo != null ? typeInfo.hashCode() : 0) * 31;
        Object obj = this.response;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponseContainer(expectedType=");
        sb.append(this.expectedType);
        sb.append(", response=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_PARENTHESIS, this.response);
    }
}
