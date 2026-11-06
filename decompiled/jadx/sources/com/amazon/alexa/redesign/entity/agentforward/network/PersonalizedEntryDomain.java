package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/PersonalizedEntryDomain;", "", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "", "eventDate", "fillerGreetings", "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "standaloneGreetings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getKind", "()Ljava/lang/String;", "getEventDate", "getFillerGreetings", "()Ljava/util/List;", "getStandaloneGreetings", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class PersonalizedEntryDomain {
    public static final int $stable = 8;

    @Nullable
    private final String eventDate;

    @Nullable
    private final List<GreetingItemDomain> fillerGreetings;

    @Nullable
    private final String kind;

    @Nullable
    private final List<GreetingItemDomain> standaloneGreetings;

    public /* synthetic */ PersonalizedEntryDomain(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonalizedEntryDomain copy$default(PersonalizedEntryDomain personalizedEntryDomain, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalizedEntryDomain.kind;
        }
        if ((i & 2) != 0) {
            str2 = personalizedEntryDomain.eventDate;
        }
        if ((i & 4) != 0) {
            list = personalizedEntryDomain.fillerGreetings;
        }
        if ((i & 8) != 0) {
            list2 = personalizedEntryDomain.standaloneGreetings;
        }
        return personalizedEntryDomain.copy(str, str2, list, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEventDate() {
        return this.eventDate;
    }

    @Nullable
    public final List<GreetingItemDomain> component3() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItemDomain> component4() {
        return this.standaloneGreetings;
    }

    @NotNull
    public final PersonalizedEntryDomain copy(@Nullable String kind, @Nullable String eventDate, @Nullable List<GreetingItemDomain> fillerGreetings, @Nullable List<GreetingItemDomain> standaloneGreetings) {
        return new PersonalizedEntryDomain(kind, eventDate, fillerGreetings, standaloneGreetings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalizedEntryDomain)) {
            return false;
        }
        PersonalizedEntryDomain personalizedEntryDomain = (PersonalizedEntryDomain) other;
        return Intrinsics.areEqual(this.kind, personalizedEntryDomain.kind) && Intrinsics.areEqual(this.eventDate, personalizedEntryDomain.eventDate) && Intrinsics.areEqual(this.fillerGreetings, personalizedEntryDomain.fillerGreetings) && Intrinsics.areEqual(this.standaloneGreetings, personalizedEntryDomain.standaloneGreetings);
    }

    @Nullable
    public final String getEventDate() {
        return this.eventDate;
    }

    @Nullable
    public final List<GreetingItemDomain> getFillerGreetings() {
        return this.fillerGreetings;
    }

    @Nullable
    public final String getKind() {
        return this.kind;
    }

    @Nullable
    public final List<GreetingItemDomain> getStandaloneGreetings() {
        return this.standaloneGreetings;
    }

    public int hashCode() {
        String str = this.kind;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<GreetingItemDomain> list = this.fillerGreetings;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GreetingItemDomain> list2 = this.standaloneGreetings;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.kind;
        String str2 = this.eventDate;
        List<GreetingItemDomain> list = this.fillerGreetings;
        List<GreetingItemDomain> list2 = this.standaloneGreetings;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("PersonalizedEntryDomain(kind=", str, ", eventDate=", str2, ", fillerGreetings=");
        m.append(list);
        m.append(", standaloneGreetings=");
        m.append(list2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public PersonalizedEntryDomain(@Nullable String str, @Nullable String str2, @Nullable List<GreetingItemDomain> list, @Nullable List<GreetingItemDomain> list2) {
        this.kind = str;
        this.eventDate = str2;
        this.fillerGreetings = list;
        this.standaloneGreetings = list2;
    }

    public PersonalizedEntryDomain() {
        this(null, null, null, null, 15, null);
    }
}
