package com.amazon.alexa.redesign.entity.cosmo;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J \u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0006HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00065"}, d2 = {"Lcom/amazon/alexa/redesign/entity/cosmo/ListParams;", "", "requestId", "", "reason", "limit", "", "cursor", "sort", "tag", "", "status", "archived", "", "pinned", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getReason", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCursor", "getSort", "getTag", "()Ljava/util/List;", "getStatus", "getArchived", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPinned", "getKind", "getOrigin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/amazon/alexa/redesign/entity/cosmo/ListParams;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ListParams {
    public static final int $stable = 8;

    @Nullable
    private final Boolean archived;

    @Nullable
    private final String cursor;

    @Nullable
    private final List<String> kind;

    @Nullable
    private final Integer limit;

    @Nullable
    private final String origin;

    @Nullable
    private final String pinned;

    @NotNull
    private final String reason;

    @NotNull
    private final String requestId;

    @Nullable
    private final String sort;

    @Nullable
    private final List<String> status;

    @Nullable
    private final List<String> tag;

    public /* synthetic */ ListParams(String str, String str2, Integer num, String str3, String str4, List list, List list2, Boolean bool, String str5, List list3, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, str4, list, list2, bool, str5, list3, (i & 1024) != 0 ? null : str6);
    }

    public static /* synthetic */ ListParams copy$default(ListParams listParams, String str, String str2, Integer num, String str3, String str4, List list, List list2, Boolean bool, String str5, List list3, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listParams.requestId;
        }
        if ((i & 2) != 0) {
            str2 = listParams.reason;
        }
        if ((i & 4) != 0) {
            num = listParams.limit;
        }
        if ((i & 8) != 0) {
            str3 = listParams.cursor;
        }
        if ((i & 16) != 0) {
            str4 = listParams.sort;
        }
        if ((i & 32) != 0) {
            list = listParams.tag;
        }
        if ((i & 64) != 0) {
            list2 = listParams.status;
        }
        if ((i & 128) != 0) {
            bool = listParams.archived;
        }
        if ((i & 256) != 0) {
            str5 = listParams.pinned;
        }
        if ((i & 512) != 0) {
            list3 = listParams.kind;
        }
        if ((i & 1024) != 0) {
            str6 = listParams.origin;
        }
        List list4 = list3;
        String str7 = str6;
        Boolean bool2 = bool;
        String str8 = str5;
        List list5 = list;
        List list6 = list2;
        String str9 = str4;
        Integer num2 = num;
        return listParams.copy(str, str2, num2, str3, str9, list5, list6, bool2, str8, list4, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final List<String> component10() {
        return this.kind;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSort() {
        return this.sort;
    }

    @Nullable
    public final List<String> component6() {
        return this.tag;
    }

    @Nullable
    public final List<String> component7() {
        return this.status;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getArchived() {
        return this.archived;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getPinned() {
        return this.pinned;
    }

    @NotNull
    public final ListParams copy(@NotNull String requestId, @NotNull String reason, @Nullable Integer limit, @Nullable String cursor, @Nullable String sort, @Nullable List<String> tag, @Nullable List<String> status, @Nullable Boolean archived, @Nullable String pinned, @Nullable List<String> kind, @Nullable String origin) {
        requestId.getClass();
        reason.getClass();
        return new ListParams(requestId, reason, limit, cursor, sort, tag, status, archived, pinned, kind, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListParams)) {
            return false;
        }
        ListParams listParams = (ListParams) other;
        return Intrinsics.areEqual(this.requestId, listParams.requestId) && Intrinsics.areEqual(this.reason, listParams.reason) && Intrinsics.areEqual(this.limit, listParams.limit) && Intrinsics.areEqual(this.cursor, listParams.cursor) && Intrinsics.areEqual(this.sort, listParams.sort) && Intrinsics.areEqual(this.tag, listParams.tag) && Intrinsics.areEqual(this.status, listParams.status) && Intrinsics.areEqual(this.archived, listParams.archived) && Intrinsics.areEqual(this.pinned, listParams.pinned) && Intrinsics.areEqual(this.kind, listParams.kind) && Intrinsics.areEqual(this.origin, listParams.origin);
    }

    @Nullable
    public final Boolean getArchived() {
        return this.archived;
    }

    @Nullable
    public final String getCursor() {
        return this.cursor;
    }

    @Nullable
    public final List<String> getKind() {
        return this.kind;
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    @Nullable
    public final String getPinned() {
        return this.pinned;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final String getSort() {
        return this.sort;
    }

    @Nullable
    public final List<String> getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getTag() {
        return this.tag;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.requestId.hashCode() * 31, 31, this.reason);
        Integer num = this.limit;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cursor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sort;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.tag;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.status;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.archived;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.pinned;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list3 = this.kind;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.origin;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.requestId;
        String str2 = this.reason;
        Integer num = this.limit;
        String str3 = this.cursor;
        String str4 = this.sort;
        List<String> list = this.tag;
        List<String> list2 = this.status;
        Boolean bool = this.archived;
        String str5 = this.pinned;
        List<String> list3 = this.kind;
        String str6 = this.origin;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ListParams(requestId=", str, ", reason=", str2, ", limit=");
        m.append(num);
        m.append(", cursor=");
        m.append(str3);
        m.append(", sort=");
        m.append(str4);
        m.append(", tag=");
        m.append(list);
        m.append(", status=");
        m.append(list2);
        m.append(", archived=");
        m.append(bool);
        m.append(", pinned=");
        m.append(str5);
        m.append(", kind=");
        m.append(list3);
        m.append(", origin=");
        return a$$ExternalSyntheticOutline0.m(m, str6, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ListParams(@NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Boolean bool, @Nullable String str5, @Nullable List<String> list3, @Nullable String str6) {
        str.getClass();
        str2.getClass();
        this.requestId = str;
        this.reason = str2;
        this.limit = num;
        this.cursor = str3;
        this.sort = str4;
        this.tag = list;
        this.status = list2;
        this.archived = bool;
        this.pinned = str5;
        this.kind = list3;
        this.origin = str6;
    }
}
