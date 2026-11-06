package com.amazon.dee.app.services.environment;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, d2 = {"Lcom/amazon/dee/app/services/environment/Endpoints;", "", "alexaApiUrl", "", "websiteApiUrl", "websiteUrl", "retailDomain", "retailUrl", "awsRegion", "skillsStoreUrl", "bobDispatchUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlexaApiUrl", "()Ljava/lang/String;", "getWebsiteApiUrl", "getWebsiteUrl", "getRetailDomain", "getRetailUrl", "getAwsRegion", "getSkillsStoreUrl", "getBobDispatchUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Endpoints {

    @NotNull
    public static final String CURRENT_SCHEMA_VERSION = "4";

    @Nullable
    private final String alexaApiUrl;

    @Nullable
    private final String awsRegion;

    @Nullable
    private final String bobDispatchUrl;

    @Nullable
    private final String retailDomain;

    @Nullable
    private final String retailUrl;

    @Nullable
    private final String skillsStoreUrl;

    @Nullable
    private final String websiteApiUrl;

    @Nullable
    private final String websiteUrl;

    public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }

    public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endpoints.alexaApiUrl;
        }
        if ((i & 2) != 0) {
            str2 = endpoints.websiteApiUrl;
        }
        if ((i & 4) != 0) {
            str3 = endpoints.websiteUrl;
        }
        if ((i & 8) != 0) {
            str4 = endpoints.retailDomain;
        }
        if ((i & 16) != 0) {
            str5 = endpoints.retailUrl;
        }
        if ((i & 32) != 0) {
            str6 = endpoints.awsRegion;
        }
        if ((i & 64) != 0) {
            str7 = endpoints.skillsStoreUrl;
        }
        if ((i & 128) != 0) {
            str8 = endpoints.bobDispatchUrl;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return endpoints.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAlexaApiUrl() {
        return this.alexaApiUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getWebsiteApiUrl() {
        return this.websiteApiUrl;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRetailDomain() {
        return this.retailDomain;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRetailUrl() {
        return this.retailUrl;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getAwsRegion() {
        return this.awsRegion;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSkillsStoreUrl() {
        return this.skillsStoreUrl;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getBobDispatchUrl() {
        return this.bobDispatchUrl;
    }

    @NotNull
    public final Endpoints copy(@Nullable String alexaApiUrl, @Nullable String websiteApiUrl, @Nullable String websiteUrl, @Nullable String retailDomain, @Nullable String retailUrl, @Nullable String awsRegion, @Nullable String skillsStoreUrl, @Nullable String bobDispatchUrl) {
        return new Endpoints(alexaApiUrl, websiteApiUrl, websiteUrl, retailDomain, retailUrl, awsRegion, skillsStoreUrl, bobDispatchUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Endpoints)) {
            return false;
        }
        Endpoints endpoints = (Endpoints) other;
        return Intrinsics.areEqual(this.alexaApiUrl, endpoints.alexaApiUrl) && Intrinsics.areEqual(this.websiteApiUrl, endpoints.websiteApiUrl) && Intrinsics.areEqual(this.websiteUrl, endpoints.websiteUrl) && Intrinsics.areEqual(this.retailDomain, endpoints.retailDomain) && Intrinsics.areEqual(this.retailUrl, endpoints.retailUrl) && Intrinsics.areEqual(this.awsRegion, endpoints.awsRegion) && Intrinsics.areEqual(this.skillsStoreUrl, endpoints.skillsStoreUrl) && Intrinsics.areEqual(this.bobDispatchUrl, endpoints.bobDispatchUrl);
    }

    @Nullable
    public final String getAlexaApiUrl() {
        return this.alexaApiUrl;
    }

    @Nullable
    public final String getAwsRegion() {
        return this.awsRegion;
    }

    @Nullable
    public final String getBobDispatchUrl() {
        return this.bobDispatchUrl;
    }

    @Nullable
    public final String getRetailDomain() {
        return this.retailDomain;
    }

    @Nullable
    public final String getRetailUrl() {
        return this.retailUrl;
    }

    @Nullable
    public final String getSkillsStoreUrl() {
        return this.skillsStoreUrl;
    }

    @Nullable
    public final String getWebsiteApiUrl() {
        return this.websiteApiUrl;
    }

    @Nullable
    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public int hashCode() {
        String str = this.alexaApiUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.websiteApiUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.websiteUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.retailDomain;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.retailUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awsRegion;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.skillsStoreUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bobDispatchUrl;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.alexaApiUrl;
        String str2 = this.websiteApiUrl;
        String str3 = this.websiteUrl;
        String str4 = this.retailDomain;
        String str5 = this.retailUrl;
        String str6 = this.awsRegion;
        String str7 = this.skillsStoreUrl;
        String str8 = this.bobDispatchUrl;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Endpoints(alexaApiUrl=", str, ", websiteApiUrl=", str2, ", websiteUrl=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", retailDomain=", str4, ", retailUrl=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str5, ", awsRegion=", str6, ", skillsStoreUrl=");
        return DoubleList$$ExternalSyntheticOutline0.m(m, str7, ", bobDispatchUrl=", str8, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Endpoints(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.alexaApiUrl = str;
        this.websiteApiUrl = str2;
        this.websiteUrl = str3;
        this.retailDomain = str4;
        this.retailUrl = str5;
        this.awsRegion = str6;
        this.skillsStoreUrl = str7;
        this.bobDispatchUrl = str8;
    }

    public Endpoints() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
