package com.amazon.comms.calling.domain.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import io.ktor.http.auth.HttpAuthHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/domain/model/AuthenticationInfo;", "", HttpAuthHeader.Parameters.Realm, "", "user", "password", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRealm", "()Ljava/lang/String;", "getUser", "getPassword", "getAuthToken", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class AuthenticationInfo {

    @SerializedName("authToken")
    @Nullable
    private final String authToken;

    @SerializedName("password")
    @Nullable
    private final String password;

    @SerializedName(HttpAuthHeader.Parameters.Realm)
    @Nullable
    private final String realm;

    @SerializedName("user")
    @Nullable
    private final String user;

    public /* synthetic */ AuthenticationInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ AuthenticationInfo copy$default(AuthenticationInfo authenticationInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authenticationInfo.realm;
        }
        if ((i & 2) != 0) {
            str2 = authenticationInfo.user;
        }
        if ((i & 4) != 0) {
            str3 = authenticationInfo.password;
        }
        if ((i & 8) != 0) {
            str4 = authenticationInfo.authToken;
        }
        return authenticationInfo.copy(str, str2, str3, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRealm() {
        return this.realm;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final AuthenticationInfo copy(@Nullable String realm, @Nullable String user, @Nullable String password, @Nullable String authToken) {
        return new AuthenticationInfo(realm, user, password, authToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationInfo)) {
            return false;
        }
        AuthenticationInfo authenticationInfo = (AuthenticationInfo) other;
        return Intrinsics.areEqual(this.realm, authenticationInfo.realm) && Intrinsics.areEqual(this.user, authenticationInfo.user) && Intrinsics.areEqual(this.password, authenticationInfo.password) && Intrinsics.areEqual(this.authToken, authenticationInfo.authToken);
    }

    @Nullable
    public final String getAuthToken() {
        return this.authToken;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getRealm() {
        return this.realm;
    }

    @Nullable
    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        String str = this.realm;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.user;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authToken;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.realm;
        String str2 = this.user;
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("AuthenticationInfo(realm=", str, ", user=", str2, ", password="), this.password, ", authToken=", this.authToken, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AuthenticationInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.realm = str;
        this.user = str2;
        this.password = str3;
        this.authToken = str4;
    }

    public AuthenticationInfo() {
        this(null, null, null, null, 15, null);
    }
}
