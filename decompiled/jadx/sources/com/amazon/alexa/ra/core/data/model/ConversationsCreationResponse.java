package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ConversationsCreationResponse;", "", "time", "", "origin", "Lcom/amazon/alexa/ra/core/data/model/ConversationsOrigin;", "personId", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/ConversationsOrigin;Ljava/lang/String;)V", "getTime", "()Ljava/lang/String;", "getOrigin", "()Lcom/amazon/alexa/ra/core/data/model/ConversationsOrigin;", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ConversationsCreationResponse {
    public static final int $stable = 0;

    @SerializedName("origin")
    @Nullable
    private final ConversationsOrigin origin;

    @SerializedName("personId")
    @Nullable
    private final String personId;

    @SerializedName("time")
    @NotNull
    private final String time;

    public ConversationsCreationResponse(@NotNull String str, @Nullable ConversationsOrigin conversationsOrigin, @Nullable String str2) {
        str.getClass();
        this.time = str;
        this.origin = conversationsOrigin;
        this.personId = str2;
    }

    public static /* synthetic */ ConversationsCreationResponse copy$default(ConversationsCreationResponse conversationsCreationResponse, String str, ConversationsOrigin conversationsOrigin, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationsCreationResponse.time;
        }
        if ((i & 2) != 0) {
            conversationsOrigin = conversationsCreationResponse.origin;
        }
        if ((i & 4) != 0) {
            str2 = conversationsCreationResponse.personId;
        }
        return conversationsCreationResponse.copy(str, conversationsOrigin, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ConversationsOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPersonId() {
        return this.personId;
    }

    @NotNull
    public final ConversationsCreationResponse copy(@NotNull String time, @Nullable ConversationsOrigin origin, @Nullable String personId) {
        time.getClass();
        return new ConversationsCreationResponse(time, origin, personId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationsCreationResponse)) {
            return false;
        }
        ConversationsCreationResponse conversationsCreationResponse = (ConversationsCreationResponse) other;
        return Intrinsics.areEqual(this.time, conversationsCreationResponse.time) && Intrinsics.areEqual(this.origin, conversationsCreationResponse.origin) && Intrinsics.areEqual(this.personId, conversationsCreationResponse.personId);
    }

    @Nullable
    public final ConversationsOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public final String getPersonId() {
        return this.personId;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        int hashCode = this.time.hashCode() * 31;
        ConversationsOrigin conversationsOrigin = this.origin;
        int hashCode2 = (hashCode + (conversationsOrigin == null ? 0 : conversationsOrigin.hashCode())) * 31;
        String str = this.personId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.time;
        ConversationsOrigin conversationsOrigin = this.origin;
        String str2 = this.personId;
        StringBuilder sb = new StringBuilder("ConversationsCreationResponse(time=");
        sb.append(str);
        sb.append(", origin=");
        sb.append(conversationsOrigin);
        sb.append(", personId=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ ConversationsCreationResponse(String str, ConversationsOrigin conversationsOrigin, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : conversationsOrigin, str2);
    }
}
