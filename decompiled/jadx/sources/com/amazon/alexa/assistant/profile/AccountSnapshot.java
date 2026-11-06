package com.amazon.alexa.assistant.profile;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/profile/AccountSnapshot;", "", BizMetricsConstants.CUSTOMER_ID, "", "profiles", "", "Lcom/amazon/alexa/assistant/profile/ProfileQueryResult;", "defaultPersonId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "getProfiles", "()Ljava/util/List;", "getDefaultPersonId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AccountSnapshot {

    @Nullable
    private final String customerId;

    @Nullable
    private final String defaultPersonId;

    @NotNull
    private final List<ProfileQueryResult> profiles;

    public AccountSnapshot(@Nullable String str, @NotNull List<ProfileQueryResult> list, @Nullable String str2) {
        list.getClass();
        this.customerId = str;
        this.profiles = list;
        this.defaultPersonId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountSnapshot copy$default(AccountSnapshot accountSnapshot, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountSnapshot.customerId;
        }
        if ((i & 2) != 0) {
            list = accountSnapshot.profiles;
        }
        if ((i & 4) != 0) {
            str2 = accountSnapshot.defaultPersonId;
        }
        return accountSnapshot.copy(str, list, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final List<ProfileQueryResult> component2() {
        return this.profiles;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDefaultPersonId() {
        return this.defaultPersonId;
    }

    @NotNull
    public final AccountSnapshot copy(@Nullable String customerId, @NotNull List<ProfileQueryResult> profiles, @Nullable String defaultPersonId) {
        profiles.getClass();
        return new AccountSnapshot(customerId, profiles, defaultPersonId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSnapshot)) {
            return false;
        }
        AccountSnapshot accountSnapshot = (AccountSnapshot) other;
        return Intrinsics.areEqual(this.customerId, accountSnapshot.customerId) && Intrinsics.areEqual(this.profiles, accountSnapshot.profiles) && Intrinsics.areEqual(this.defaultPersonId, accountSnapshot.defaultPersonId);
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getDefaultPersonId() {
        return this.defaultPersonId;
    }

    @NotNull
    public final List<ProfileQueryResult> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        String str = this.customerId;
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.profiles, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.defaultPersonId;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.customerId;
        List<ProfileQueryResult> list = this.profiles;
        return a$$ExternalSyntheticOutline0.m(AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("AccountSnapshot(customerId=", str, ", profiles=", (List) list, ", defaultPersonId="), this.defaultPersonId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
