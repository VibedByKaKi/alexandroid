package com.amazon.alexa.assistant.profile;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/assistant/profile/ProfileQueryResult;", "", "status", "Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus;", BizMetricsConstants.CUSTOMER_ID, "", "firstName", "lastName", "personId", "<init>", "(Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus;", "getCustomerId", "()Ljava/lang/String;", "getFirstName", "getLastName", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProfileQueryResult {

    @Nullable
    private final String customerId;

    @Nullable
    private final String firstName;

    @Nullable
    private final String lastName;

    @Nullable
    private final String personId;

    @NotNull
    private final AlexaTermsConditionsStatus status;

    public ProfileQueryResult(@NotNull AlexaTermsConditionsStatus alexaTermsConditionsStatus, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        alexaTermsConditionsStatus.getClass();
        this.status = alexaTermsConditionsStatus;
        this.customerId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.personId = str4;
    }

    public static /* synthetic */ ProfileQueryResult copy$default(ProfileQueryResult profileQueryResult, AlexaTermsConditionsStatus alexaTermsConditionsStatus, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            alexaTermsConditionsStatus = profileQueryResult.status;
        }
        if ((i & 2) != 0) {
            str = profileQueryResult.customerId;
        }
        if ((i & 4) != 0) {
            str2 = profileQueryResult.firstName;
        }
        if ((i & 8) != 0) {
            str3 = profileQueryResult.lastName;
        }
        if ((i & 16) != 0) {
            str4 = profileQueryResult.personId;
        }
        String str5 = str4;
        String str6 = str2;
        return profileQueryResult.copy(alexaTermsConditionsStatus, str, str6, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AlexaTermsConditionsStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPersonId() {
        return this.personId;
    }

    @NotNull
    public final ProfileQueryResult copy(@NotNull AlexaTermsConditionsStatus status, @Nullable String customerId, @Nullable String firstName, @Nullable String lastName, @Nullable String personId) {
        status.getClass();
        return new ProfileQueryResult(status, customerId, firstName, lastName, personId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileQueryResult)) {
            return false;
        }
        ProfileQueryResult profileQueryResult = (ProfileQueryResult) other;
        return this.status == profileQueryResult.status && Intrinsics.areEqual(this.customerId, profileQueryResult.customerId) && Intrinsics.areEqual(this.firstName, profileQueryResult.firstName) && Intrinsics.areEqual(this.lastName, profileQueryResult.lastName) && Intrinsics.areEqual(this.personId, profileQueryResult.personId);
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getPersonId() {
        return this.personId;
    }

    @NotNull
    public final AlexaTermsConditionsStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.customerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.personId;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AlexaTermsConditionsStatus alexaTermsConditionsStatus = this.status;
        String str = this.customerId;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.personId;
        StringBuilder sb = new StringBuilder("ProfileQueryResult(status=");
        sb.append(alexaTermsConditionsStatus);
        sb.append(", customerId=");
        sb.append(str);
        sb.append(", firstName=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str2, ", lastName=", str3, ", personId=");
        return a$$ExternalSyntheticOutline0.m(sb, str4, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ ProfileQueryResult(AlexaTermsConditionsStatus alexaTermsConditionsStatus, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(alexaTermsConditionsStatus, str, str2, str3, (i & 16) != 0 ? null : str4);
    }
}
