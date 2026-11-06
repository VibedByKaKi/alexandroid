package com.amazon.alexa.assistant.foundation.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Profile;", "", "personId", "", "firstName", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "()Ljava/lang/String;", "getFirstName", "getLastName", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Profile {

    @NotNull
    private final String firstName;

    @Nullable
    private final String lastName;

    @NotNull
    private final String personId;

    public Profile(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.personId = str;
        this.firstName = str2;
        this.lastName = str3;
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.personId;
        }
        if ((i & 2) != 0) {
            str2 = profile.firstName;
        }
        if ((i & 4) != 0) {
            str3 = profile.lastName;
        }
        return profile.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPersonId() {
        return this.personId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final Profile copy(@NotNull String personId, @NotNull String firstName, @Nullable String lastName) {
        personId.getClass();
        firstName.getClass();
        return new Profile(personId, firstName, lastName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) other;
        return Intrinsics.areEqual(this.personId, profile.personId) && Intrinsics.areEqual(this.firstName, profile.firstName) && Intrinsics.areEqual(this.lastName, profile.lastName);
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getPersonId() {
        return this.personId;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.personId.hashCode() * 31, 31, this.firstName);
        String str = this.lastName;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.personId;
        String str2 = this.firstName;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Profile(personId=", str, ", firstName=", str2, ", lastName="), this.lastName, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ Profile(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
