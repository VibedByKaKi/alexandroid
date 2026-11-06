package com.amazon.comms.calling.domain.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/Party;", "", "name", "", "endpointDescription", "credit", "dropInPermission", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getEndpointDescription", "getCredit", "getDropInPermission", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/amazon/comms/calling/domain/model/Party;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Party {

    @SerializedName("credit")
    @Nullable
    private final String credit;

    @SerializedName("dropInPermission")
    @Nullable
    private final Boolean dropInPermission;

    @SerializedName("endpointDescription")
    @Nullable
    private final String endpointDescription;

    @SerializedName("name")
    @Nullable
    private final String name;

    public /* synthetic */ Party(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }

    public static /* synthetic */ Party copy$default(Party party, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = party.name;
        }
        if ((i & 2) != 0) {
            str2 = party.endpointDescription;
        }
        if ((i & 4) != 0) {
            str3 = party.credit;
        }
        if ((i & 8) != 0) {
            bool = party.dropInPermission;
        }
        return party.copy(str, str2, str3, bool);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEndpointDescription() {
        return this.endpointDescription;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCredit() {
        return this.credit;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getDropInPermission() {
        return this.dropInPermission;
    }

    @NotNull
    public final Party copy(@Nullable String name, @Nullable String endpointDescription, @Nullable String credit, @Nullable Boolean dropInPermission) {
        return new Party(name, endpointDescription, credit, dropInPermission);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Party)) {
            return false;
        }
        Party party = (Party) other;
        return Intrinsics.areEqual(this.name, party.name) && Intrinsics.areEqual(this.endpointDescription, party.endpointDescription) && Intrinsics.areEqual(this.credit, party.credit) && Intrinsics.areEqual(this.dropInPermission, party.dropInPermission);
    }

    @Nullable
    public final String getCredit() {
        return this.credit;
    }

    @Nullable
    public final Boolean getDropInPermission() {
        return this.dropInPermission;
    }

    @Nullable
    public final String getEndpointDescription() {
        return this.endpointDescription;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endpointDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.credit;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.dropInPermission;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.endpointDescription;
        String str3 = this.credit;
        Boolean bool = this.dropInPermission;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Party(name=", str, ", endpointDescription=", str2, ", credit=");
        m.append(str3);
        m.append(", dropInPermission=");
        m.append(bool);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public Party(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        this.name = str;
        this.endpointDescription = str2;
        this.credit = str3;
        this.dropInPermission = bool;
    }

    public Party() {
        this(null, null, null, null, 15, null);
    }
}
