package com.amazon.alexa.redesign.client;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.identity.api.ProfileAttributes;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006("}, d2 = {"Lcom/amazon/alexa/redesign/client/GetContentRequest;", "", "trigger", "Lcom/amazon/alexa/redesign/client/GetContentTrigger;", ProfileAttributes.PERSON_ID, "", "sections", "", "timezone", "bypassRanking", "", "limit", "", "token", "<init>", "(Lcom/amazon/alexa/redesign/client/GetContentTrigger;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZILjava/lang/String;)V", "getTrigger", "()Lcom/amazon/alexa/redesign/client/GetContentTrigger;", "getPersonIdV2", "()Ljava/lang/String;", "getSections", "()Ljava/util/List;", "getTimezone", "getBypassRanking", "()Z", "getLimit", "()I", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GetContentRequest {
    public static final int $stable = 8;
    private final boolean bypassRanking;
    private final int limit;

    @Nullable
    private final String personIdV2;

    @NotNull
    private final List<String> sections;

    @NotNull
    private final String timezone;

    @NotNull
    private final String token;

    @NotNull
    private final GetContentTrigger trigger;

    public /* synthetic */ GetContentRequest(GetContentTrigger getContentTrigger, String str, List list, String str2, boolean z, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(getContentTrigger, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? TimeZone.getDefault().getID() : str2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 100 : i, (i2 & 64) != 0 ? "" : str3);
    }

    public static /* synthetic */ GetContentRequest copy$default(GetContentRequest getContentRequest, GetContentTrigger getContentTrigger, String str, List list, String str2, boolean z, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            getContentTrigger = getContentRequest.trigger;
        }
        if ((i2 & 2) != 0) {
            str = getContentRequest.personIdV2;
        }
        if ((i2 & 4) != 0) {
            list = getContentRequest.sections;
        }
        if ((i2 & 8) != 0) {
            str2 = getContentRequest.timezone;
        }
        if ((i2 & 16) != 0) {
            z = getContentRequest.bypassRanking;
        }
        if ((i2 & 32) != 0) {
            i = getContentRequest.limit;
        }
        if ((i2 & 64) != 0) {
            str3 = getContentRequest.token;
        }
        int i3 = i;
        String str4 = str3;
        boolean z2 = z;
        List list2 = list;
        return getContentRequest.copy(getContentTrigger, str, list2, str2, z2, i3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GetContentTrigger getTrigger() {
        return this.trigger;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPersonIdV2() {
        return this.personIdV2;
    }

    @NotNull
    public final List<String> component3() {
        return this.sections;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBypassRanking() {
        return this.bypassRanking;
    }

    /* renamed from: component6, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final GetContentRequest copy(@NotNull GetContentTrigger trigger, @Nullable String personIdV2, @NotNull List<String> sections, @NotNull String timezone, boolean bypassRanking, int limit, @NotNull String token) {
        trigger.getClass();
        sections.getClass();
        timezone.getClass();
        token.getClass();
        return new GetContentRequest(trigger, personIdV2, sections, timezone, bypassRanking, limit, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetContentRequest)) {
            return false;
        }
        GetContentRequest getContentRequest = (GetContentRequest) other;
        return this.trigger == getContentRequest.trigger && Intrinsics.areEqual(this.personIdV2, getContentRequest.personIdV2) && Intrinsics.areEqual(this.sections, getContentRequest.sections) && Intrinsics.areEqual(this.timezone, getContentRequest.timezone) && this.bypassRanking == getContentRequest.bypassRanking && this.limit == getContentRequest.limit && Intrinsics.areEqual(this.token, getContentRequest.token);
    }

    public final boolean getBypassRanking() {
        return this.bypassRanking;
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getPersonIdV2() {
        return this.personIdV2;
    }

    @NotNull
    public final List<String> getSections() {
        return this.sections;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final GetContentTrigger getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        int hashCode = this.trigger.hashCode() * 31;
        String str = this.personIdV2;
        return this.token.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.limit, DoubleList$$ExternalSyntheticOutline0.m(this.bypassRanking, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.sections, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.timezone), 31), 31);
    }

    @NotNull
    public String toString() {
        GetContentTrigger getContentTrigger = this.trigger;
        String str = this.personIdV2;
        List<String> list = this.sections;
        String str2 = this.timezone;
        boolean z = this.bypassRanking;
        int i = this.limit;
        String str3 = this.token;
        StringBuilder sb = new StringBuilder("GetContentRequest(trigger=");
        sb.append(getContentTrigger);
        sb.append(", personIdV2=");
        sb.append(str);
        sb.append(", sections=");
        sb.append(list);
        sb.append(", timezone=");
        sb.append(str2);
        sb.append(", bypassRanking=");
        sb.append(z);
        sb.append(", limit=");
        sb.append(i);
        sb.append(", token=");
        return a$$ExternalSyntheticOutline0.m(sb, str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public GetContentRequest(@NotNull GetContentTrigger getContentTrigger, @Nullable String str, @NotNull List<String> list, @NotNull String str2, boolean z, int i, @NotNull String str3) {
        getContentTrigger.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        this.trigger = getContentTrigger;
        this.personIdV2 = str;
        this.sections = list;
        this.timezone = str2;
        this.bypassRanking = z;
        this.limit = i;
        this.token = str3;
    }
}
