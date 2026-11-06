package com.amazon.alexa.assistant.toolkit.metric;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/ApplicationContextHolder;", "", "applicationAppId", "", "applicationTitle", "applicationPackageName", "applicationProcessName", "applicationVersionName", "applicationVersionCode", "applicationSdkName", "applicationSdkVersion", "applicationBuildVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationAppId", "()Ljava/lang/String;", "getApplicationTitle", "getApplicationPackageName", "getApplicationProcessName", "getApplicationVersionName", "getApplicationVersionCode", "getApplicationSdkName", "getApplicationSdkVersion", "getApplicationBuildVariant", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ApplicationContextHolder {

    @Nullable
    private final String applicationAppId;

    @Nullable
    private final String applicationBuildVariant;

    @NotNull
    private final String applicationPackageName;

    @NotNull
    private final String applicationProcessName;

    @NotNull
    private final String applicationSdkName;

    @NotNull
    private final String applicationSdkVersion;

    @NotNull
    private final String applicationTitle;

    @NotNull
    private final String applicationVersionCode;

    @Nullable
    private final String applicationVersionName;

    public ApplicationContextHolder(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable String str9) {
        Automotive$$ExternalSyntheticOutline0.m(str2, str3, str4, str6, str7);
        str8.getClass();
        this.applicationAppId = str;
        this.applicationTitle = str2;
        this.applicationPackageName = str3;
        this.applicationProcessName = str4;
        this.applicationVersionName = str5;
        this.applicationVersionCode = str6;
        this.applicationSdkName = str7;
        this.applicationSdkVersion = str8;
        this.applicationBuildVariant = str9;
    }

    public static /* synthetic */ ApplicationContextHolder copy$default(ApplicationContextHolder applicationContextHolder, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationContextHolder.applicationAppId;
        }
        if ((i & 2) != 0) {
            str2 = applicationContextHolder.applicationTitle;
        }
        if ((i & 4) != 0) {
            str3 = applicationContextHolder.applicationPackageName;
        }
        if ((i & 8) != 0) {
            str4 = applicationContextHolder.applicationProcessName;
        }
        if ((i & 16) != 0) {
            str5 = applicationContextHolder.applicationVersionName;
        }
        if ((i & 32) != 0) {
            str6 = applicationContextHolder.applicationVersionCode;
        }
        if ((i & 64) != 0) {
            str7 = applicationContextHolder.applicationSdkName;
        }
        if ((i & 128) != 0) {
            str8 = applicationContextHolder.applicationSdkVersion;
        }
        if ((i & 256) != 0) {
            str9 = applicationContextHolder.applicationBuildVariant;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return applicationContextHolder.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getApplicationAppId() {
        return this.applicationAppId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getApplicationTitle() {
        return this.applicationTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getApplicationPackageName() {
        return this.applicationPackageName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getApplicationProcessName() {
        return this.applicationProcessName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getApplicationVersionName() {
        return this.applicationVersionName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getApplicationVersionCode() {
        return this.applicationVersionCode;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getApplicationSdkName() {
        return this.applicationSdkName;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getApplicationSdkVersion() {
        return this.applicationSdkVersion;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getApplicationBuildVariant() {
        return this.applicationBuildVariant;
    }

    @NotNull
    public final ApplicationContextHolder copy(@Nullable String applicationAppId, @NotNull String applicationTitle, @NotNull String applicationPackageName, @NotNull String applicationProcessName, @Nullable String applicationVersionName, @NotNull String applicationVersionCode, @NotNull String applicationSdkName, @NotNull String applicationSdkVersion, @Nullable String applicationBuildVariant) {
        Automotive$$ExternalSyntheticOutline0.m(applicationTitle, applicationPackageName, applicationProcessName, applicationVersionCode, applicationSdkName);
        applicationSdkVersion.getClass();
        return new ApplicationContextHolder(applicationAppId, applicationTitle, applicationPackageName, applicationProcessName, applicationVersionName, applicationVersionCode, applicationSdkName, applicationSdkVersion, applicationBuildVariant);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationContextHolder)) {
            return false;
        }
        ApplicationContextHolder applicationContextHolder = (ApplicationContextHolder) other;
        return Intrinsics.areEqual(this.applicationAppId, applicationContextHolder.applicationAppId) && Intrinsics.areEqual(this.applicationTitle, applicationContextHolder.applicationTitle) && Intrinsics.areEqual(this.applicationPackageName, applicationContextHolder.applicationPackageName) && Intrinsics.areEqual(this.applicationProcessName, applicationContextHolder.applicationProcessName) && Intrinsics.areEqual(this.applicationVersionName, applicationContextHolder.applicationVersionName) && Intrinsics.areEqual(this.applicationVersionCode, applicationContextHolder.applicationVersionCode) && Intrinsics.areEqual(this.applicationSdkName, applicationContextHolder.applicationSdkName) && Intrinsics.areEqual(this.applicationSdkVersion, applicationContextHolder.applicationSdkVersion) && Intrinsics.areEqual(this.applicationBuildVariant, applicationContextHolder.applicationBuildVariant);
    }

    @Nullable
    public final String getApplicationAppId() {
        return this.applicationAppId;
    }

    @Nullable
    public final String getApplicationBuildVariant() {
        return this.applicationBuildVariant;
    }

    @NotNull
    public final String getApplicationPackageName() {
        return this.applicationPackageName;
    }

    @NotNull
    public final String getApplicationProcessName() {
        return this.applicationProcessName;
    }

    @NotNull
    public final String getApplicationSdkName() {
        return this.applicationSdkName;
    }

    @NotNull
    public final String getApplicationSdkVersion() {
        return this.applicationSdkVersion;
    }

    @NotNull
    public final String getApplicationTitle() {
        return this.applicationTitle;
    }

    @NotNull
    public final String getApplicationVersionCode() {
        return this.applicationVersionCode;
    }

    @Nullable
    public final String getApplicationVersionName() {
        return this.applicationVersionName;
    }

    public int hashCode() {
        String str = this.applicationAppId;
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.applicationTitle), 31, this.applicationPackageName), 31, this.applicationProcessName);
        String str2 = this.applicationVersionName;
        int m2 = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.applicationVersionCode), 31, this.applicationSdkName), 31, this.applicationSdkVersion);
        String str3 = this.applicationBuildVariant;
        return m2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.applicationAppId;
        String str2 = this.applicationTitle;
        String str3 = this.applicationPackageName;
        String str4 = this.applicationProcessName;
        String str5 = this.applicationVersionName;
        String str6 = this.applicationVersionCode;
        String str7 = this.applicationSdkName;
        String str8 = this.applicationSdkVersion;
        String str9 = this.applicationBuildVariant;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ApplicationContextHolder(applicationAppId=", str, ", applicationTitle=", str2, ", applicationPackageName=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", applicationProcessName=", str4, ", applicationVersionName=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str5, ", applicationVersionCode=", str6, ", applicationSdkName=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str7, ", applicationSdkVersion=", str8, ", applicationBuildVariant=");
        return a$$ExternalSyntheticOutline0.m(m, str9, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ ApplicationContextHolder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, str4, (i & 16) != 0 ? null : str5, str6, str7, str8, (i & 256) != 0 ? null : str9);
    }
}
