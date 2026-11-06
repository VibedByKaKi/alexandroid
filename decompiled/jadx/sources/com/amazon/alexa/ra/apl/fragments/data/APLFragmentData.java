package com.amazon.alexa.ra.apl.fragments.data;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.Gson;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010(\u001a\u00020\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R.\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R)\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010 0 ¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "", "document", "", "data", "display", "expanded", "", FragmentMetaData.EXPIRATION, "", "uri", "purpose", "parentUri", "expandPolicy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocument", "()Ljava/lang/String;", "getData", "getDisplay", "getExpanded", "()Z", "getExpiration", "()J", "getUri", "getPurpose", "getParentUri", "getExpandPolicy", "clickable", "getClickable", Content.AUTHORITIES, "", "", "getAuthorities", "()Ljava/util/List;", "setAuthorities", "(Ljava/util/List;)V", "environment", "getEnvironment", "()Ljava/util/Map;", "contentProvider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAPLFragmentData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APLFragmentData.kt\ncom/amazon/alexa/ra/apl/fragments/data/APLFragmentData\n+ 2 Json.kt\ncom/amazon/alexa/ra/apl/fragments/utils/JsonKt\n*L\n1#1,107:1\n21#2:108\n21#2:109\n*S KotlinDebug\n*F\n+ 1 APLFragmentData.kt\ncom/amazon/alexa/ra/apl/fragments/data/APLFragmentData\n*L\n73#1:108\n75#1:109\n*E\n"})
/* loaded from: classes18.dex */
public final /* data */ class APLFragmentData {
    public static final int $stable = 8;

    @Nullable
    private List<? extends Map<String, String>> authorities;
    private final boolean clickable;

    @NotNull
    private final String data;

    @NotNull
    private final String display;

    @NotNull
    private final String document;

    @NotNull
    private final Map<String, Map<String, Object>> environment;

    @Nullable
    private final String expandPolicy;
    private final boolean expanded;
    private final long expiration;

    @NotNull
    private final String parentUri;

    @NotNull
    private final String purpose;

    @NotNull
    private final String uri;

    public APLFragmentData(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable String str7) {
        AssetAuth assetAuth;
        FragmentControl fragmentControl;
        Boolean respondToPress;
        Automotive$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        this.document = str;
        this.data = str2;
        this.display = str3;
        this.expanded = z;
        this.expiration = j;
        this.uri = str4;
        this.purpose = str5;
        this.parentUri = str6;
        this.expandPolicy = str7;
        Settings settings = ((Document) new Gson().fromJson(str, Document.class)).getSettings();
        this.clickable = (settings == null || (fragmentControl = settings.getFragmentControl()) == null || (respondToPress = fragmentControl.getRespondToPress()) == null) ? false : respondToPress.booleanValue();
        Settings settings2 = ((Document) new Gson().fromJson(str, Document.class)).getSettings();
        this.authorities = (settings2 == null || (assetAuth = settings2.getAssetAuth()) == null) ? null : assetAuth.getAuthorities();
        this.environment = MapsKt.mapOf(TuplesKt.to("fragment", MapsKt.mapOf(TuplesKt.to("display", str3), TuplesKt.to("expanded", Boolean.valueOf(z)), TuplesKt.to(FragmentMetaData.EXPIRATION, Long.valueOf(j)), TuplesKt.to("fragmentURI", str4), TuplesKt.to("purpose", str5))));
    }

    public static /* synthetic */ APLFragmentData copy$default(APLFragmentData aPLFragmentData, String str, String str2, String str3, boolean z, long j, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPLFragmentData.document;
        }
        if ((i & 2) != 0) {
            str2 = aPLFragmentData.data;
        }
        if ((i & 4) != 0) {
            str3 = aPLFragmentData.display;
        }
        if ((i & 8) != 0) {
            z = aPLFragmentData.expanded;
        }
        if ((i & 16) != 0) {
            j = aPLFragmentData.expiration;
        }
        if ((i & 32) != 0) {
            str4 = aPLFragmentData.uri;
        }
        if ((i & 64) != 0) {
            str5 = aPLFragmentData.purpose;
        }
        if ((i & 128) != 0) {
            str6 = aPLFragmentData.parentUri;
        }
        if ((i & 256) != 0) {
            str7 = aPLFragmentData.expandPolicy;
        }
        long j2 = j;
        String str8 = str3;
        boolean z2 = z;
        return aPLFragmentData.copy(str, str2, str8, z2, j2, str4, str5, str6, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    /* renamed from: component5, reason: from getter */
    public final long getExpiration() {
        return this.expiration;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getParentUri() {
        return this.parentUri;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getExpandPolicy() {
        return this.expandPolicy;
    }

    @NotNull
    public final String contentProvider() {
        int lastIndexOf$default;
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(this.uri, "/", 0, false, 6, (Object) null);
        String str = this.uri;
        return lastIndexOf$default != -1 ? str.substring(0, lastIndexOf$default) : str;
    }

    @NotNull
    public final APLFragmentData copy(@NotNull String document, @NotNull String data, @NotNull String display, boolean expanded, long expiration, @NotNull String uri, @NotNull String purpose, @NotNull String parentUri, @Nullable String expandPolicy) {
        Automotive$$ExternalSyntheticOutline0.m(document, data, display, uri, purpose);
        parentUri.getClass();
        return new APLFragmentData(document, data, display, expanded, expiration, uri, purpose, parentUri, expandPolicy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APLFragmentData)) {
            return false;
        }
        APLFragmentData aPLFragmentData = (APLFragmentData) other;
        return Intrinsics.areEqual(this.document, aPLFragmentData.document) && Intrinsics.areEqual(this.data, aPLFragmentData.data) && Intrinsics.areEqual(this.display, aPLFragmentData.display) && this.expanded == aPLFragmentData.expanded && this.expiration == aPLFragmentData.expiration && Intrinsics.areEqual(this.uri, aPLFragmentData.uri) && Intrinsics.areEqual(this.purpose, aPLFragmentData.purpose) && Intrinsics.areEqual(this.parentUri, aPLFragmentData.parentUri) && Intrinsics.areEqual(this.expandPolicy, aPLFragmentData.expandPolicy);
    }

    @Nullable
    public final List<Map<String, String>> getAuthorities() {
        return this.authorities;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getDisplay() {
        return this.display;
    }

    @NotNull
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    public final Map<String, Map<String, Object>> getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final String getExpandPolicy() {
        return this.expandPolicy;
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    public final long getExpiration() {
        return this.expiration;
    }

    @NotNull
    public final String getParentUri() {
        return this.parentUri;
    }

    @NotNull
    public final String getPurpose() {
        return this.purpose;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(BitVector$$ExternalSyntheticOutline0.m(this.expiration, DoubleList$$ExternalSyntheticOutline0.m(this.expanded, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.document.hashCode() * 31, 31, this.data), 31, this.display), 31), 31), 31, this.uri), 31, this.purpose), 31, this.parentUri);
        String str = this.expandPolicy;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final void setAuthorities(@Nullable List<? extends Map<String, String>> list) {
        this.authorities = list;
    }

    @NotNull
    public String toString() {
        String str = this.document;
        String str2 = this.data;
        String str3 = this.display;
        boolean z = this.expanded;
        long j = this.expiration;
        String str4 = this.uri;
        String str5 = this.purpose;
        String str6 = this.parentUri;
        String str7 = this.expandPolicy;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("APLFragmentData(document=", str, ", data=", str2, ", display=");
        Automotive$$ExternalSyntheticOutline0.m(m, str3, ", expanded=", z, ", expiration=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j, ", uri=", str4, m);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", purpose=", str5, ", parentUri=", str6);
        return ErrorUtils$$ExternalSyntheticOutline0.m(m, ", expandPolicy=", str7, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ APLFragmentData(String str, String str2, String str3, boolean z, long j, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, j, str4, str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? null : str7);
    }
}
