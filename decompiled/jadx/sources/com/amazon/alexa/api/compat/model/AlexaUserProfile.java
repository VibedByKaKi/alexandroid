package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserProfile;", "", "personId", "", "firstName", "isChildProfile", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "()Ljava/lang/String;", "getFirstName", "()Z", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaUserProfile {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String firstName;
    private final boolean isChildProfile;

    @NotNull
    private final String personId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserProfile$Builder;", "", "<init>", "()V", "personId", "", "firstName", "isChildProfile", "", "setPersonId", "setFirstName", "setIsChildProfile", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaUserProfile;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaUserProfile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaUserProfile.kt\ncom/amazon/alexa/api/compat/model/AlexaUserProfile$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String firstName;
        private boolean isChildProfile;

        @Nullable
        private String personId;

        @NotNull
        public final AlexaUserProfile build() {
            if (this.personId == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Person id can not be null");
                return null;
            }
            if (this.firstName == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("First name can not be null");
                return null;
            }
            String str = this.personId;
            str.getClass();
            String str2 = this.firstName;
            str2.getClass();
            return new AlexaUserProfile(str, str2, this.isChildProfile);
        }

        @NotNull
        public final Builder setFirstName(@NotNull String firstName) {
            firstName.getClass();
            this.firstName = firstName;
            return this;
        }

        @NotNull
        public final Builder setIsChildProfile(boolean isChildProfile) {
            this.isChildProfile = isChildProfile;
            return this;
        }

        @NotNull
        public final Builder setPersonId(@NotNull String personId) {
            personId.getClass();
            this.personId = personId;
            return this;
        }
    }

    public AlexaUserProfile(@NotNull String str, @NotNull String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.personId = str;
        this.firstName = str2;
        this.isChildProfile = z;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaUserProfile copy$default(AlexaUserProfile alexaUserProfile, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaUserProfile.personId;
        }
        if ((i & 2) != 0) {
            str2 = alexaUserProfile.firstName;
        }
        if ((i & 4) != 0) {
            z = alexaUserProfile.isChildProfile;
        }
        return alexaUserProfile.copy(str, str2, z);
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

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChildProfile() {
        return this.isChildProfile;
    }

    @NotNull
    public final AlexaUserProfile copy(@NotNull String personId, @NotNull String firstName, boolean isChildProfile) {
        personId.getClass();
        firstName.getClass();
        return new AlexaUserProfile(personId, firstName, isChildProfile);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaUserProfile)) {
            return false;
        }
        AlexaUserProfile alexaUserProfile = (AlexaUserProfile) other;
        return Intrinsics.areEqual(this.personId, alexaUserProfile.personId) && Intrinsics.areEqual(this.firstName, alexaUserProfile.firstName) && this.isChildProfile == alexaUserProfile.isChildProfile;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getPersonId() {
        return this.personId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isChildProfile) + ArcMode$$ExternalSyntheticOutline0.m(this.personId.hashCode() * 31, 31, this.firstName);
    }

    public final boolean isChildProfile() {
        return this.isChildProfile;
    }

    @NotNull
    public String toString() {
        String str = this.personId;
        String str2 = this.firstName;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("AlexaUserProfile(personId=", str, ", firstName=", str2, ", isChildProfile="), this.isChildProfile, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserProfile$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaUserProfile$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AlexaUserProfile(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
