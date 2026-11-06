package com.amazon.alexa.assistant.toolkit.session.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionUser;", "", "userId", "", "token", "deviceSerialNumber", "deviceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getToken", "getDeviceSerialNumber", "getDeviceType", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AuthorizationSessionUser {

    @NotNull
    private final String deviceSerialNumber;

    @NotNull
    private final String deviceType;

    @NotNull
    private final String token;

    @Nullable
    private final String userId;

    public AuthorizationSessionUser(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str2, str3, str4);
        this.userId = str;
        this.token = str2;
        this.deviceSerialNumber = str3;
        this.deviceType = str4;
    }

    public static /* synthetic */ AuthorizationSessionUser copy$default(AuthorizationSessionUser authorizationSessionUser, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizationSessionUser.userId;
        }
        if ((i & 2) != 0) {
            str2 = authorizationSessionUser.token;
        }
        if ((i & 4) != 0) {
            str3 = authorizationSessionUser.deviceSerialNumber;
        }
        if ((i & 8) != 0) {
            str4 = authorizationSessionUser.deviceType;
        }
        return authorizationSessionUser.copy(str, str2, str3, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final AuthorizationSessionUser copy(@Nullable String userId, @NotNull String token, @NotNull String deviceSerialNumber, @NotNull String deviceType) {
        token.getClass();
        deviceSerialNumber.getClass();
        deviceType.getClass();
        return new AuthorizationSessionUser(userId, token, deviceSerialNumber, deviceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizationSessionUser)) {
            return false;
        }
        AuthorizationSessionUser authorizationSessionUser = (AuthorizationSessionUser) other;
        return Intrinsics.areEqual(this.userId, authorizationSessionUser.userId) && Intrinsics.areEqual(this.token, authorizationSessionUser.token) && Intrinsics.areEqual(this.deviceSerialNumber, authorizationSessionUser.deviceSerialNumber) && Intrinsics.areEqual(this.deviceType, authorizationSessionUser.deviceType);
    }

    @NotNull
    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        return this.deviceType.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.token), 31, this.deviceSerialNumber);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AuthorizationSessionUser(userId=***, token=***, deviceSerialNumber=***, deviceType=", this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
