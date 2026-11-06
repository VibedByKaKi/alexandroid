package com.amazon.alexa.redesign.entity.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.entity.agentforward.domain.GetHomeContentResponse;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/amazon/alexa/redesign/entity/network/NetworkResponse;", "", "body", "Lorg/json/JSONObject;", "byteArray", "", "contentLength", "", "homeContentResponse", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/GetHomeContentResponse;", "<init>", "(Lorg/json/JSONObject;[BLjava/lang/Long;Lcom/amazon/alexa/redesign/entity/agentforward/domain/GetHomeContentResponse;)V", "getBody", "()Lorg/json/JSONObject;", "getByteArray", "()[B", "getContentLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHomeContentResponse", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/GetHomeContentResponse;", "component1", "component2", "component3", "component4", "copy", "(Lorg/json/JSONObject;[BLjava/lang/Long;Lcom/amazon/alexa/redesign/entity/agentforward/domain/GetHomeContentResponse;)Lcom/amazon/alexa/redesign/entity/network/NetworkResponse;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class NetworkResponse {
    public static final int $stable = 8;

    @NotNull
    private final JSONObject body;

    @Nullable
    private final byte[] byteArray;

    @Nullable
    private final Long contentLength;

    @NotNull
    private final GetHomeContentResponse homeContentResponse;

    public NetworkResponse(@NotNull JSONObject jSONObject, @Nullable byte[] bArr, @Nullable Long l, @NotNull GetHomeContentResponse getHomeContentResponse) {
        jSONObject.getClass();
        getHomeContentResponse.getClass();
        this.body = jSONObject;
        this.byteArray = bArr;
        this.contentLength = l;
        this.homeContentResponse = getHomeContentResponse;
    }

    public static /* synthetic */ NetworkResponse copy$default(NetworkResponse networkResponse, JSONObject jSONObject, byte[] bArr, Long l, GetHomeContentResponse getHomeContentResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = networkResponse.body;
        }
        if ((i & 2) != 0) {
            bArr = networkResponse.byteArray;
        }
        if ((i & 4) != 0) {
            l = networkResponse.contentLength;
        }
        if ((i & 8) != 0) {
            getHomeContentResponse = networkResponse.homeContentResponse;
        }
        return networkResponse.copy(jSONObject, bArr, l, getHomeContentResponse);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final JSONObject getBody() {
        return this.body;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getContentLength() {
        return this.contentLength;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final GetHomeContentResponse getHomeContentResponse() {
        return this.homeContentResponse;
    }

    @NotNull
    public final NetworkResponse copy(@NotNull JSONObject body, @Nullable byte[] byteArray, @Nullable Long contentLength, @NotNull GetHomeContentResponse homeContentResponse) {
        body.getClass();
        homeContentResponse.getClass();
        return new NetworkResponse(body, byteArray, contentLength, homeContentResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) other;
        return Intrinsics.areEqual(this.body, networkResponse.body) && Intrinsics.areEqual(this.byteArray, networkResponse.byteArray) && Intrinsics.areEqual(this.contentLength, networkResponse.contentLength) && Intrinsics.areEqual(this.homeContentResponse, networkResponse.homeContentResponse);
    }

    @NotNull
    public final JSONObject getBody() {
        return this.body;
    }

    @Nullable
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    @Nullable
    public final Long getContentLength() {
        return this.contentLength;
    }

    @NotNull
    public final GetHomeContentResponse getHomeContentResponse() {
        return this.homeContentResponse;
    }

    public int hashCode() {
        int hashCode = this.body.hashCode() * 31;
        byte[] bArr = this.byteArray;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Long l = this.contentLength;
        return this.homeContentResponse.hashCode() + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "NetworkResponse(body=" + this.body + ", byteArray=" + Arrays.toString(this.byteArray) + ", contentLength=" + this.contentLength + ", homeContentResponse=" + this.homeContentResponse + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
