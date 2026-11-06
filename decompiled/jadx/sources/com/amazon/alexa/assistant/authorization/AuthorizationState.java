package com.amazon.alexa.assistant.authorization;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/authorization/AuthorizationState;", "", "<init>", "()V", "AuthorizationUser", "SignedIn", "SignedOut", "Lcom/amazon/alexa/assistant/authorization/AuthorizationState$SignedIn;", "Lcom/amazon/alexa/assistant/authorization/AuthorizationState$SignedOut;", "authorization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AuthorizationState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/authorization/AuthorizationState$SignedIn;", "Lcom/amazon/alexa/assistant/authorization/AuthorizationState;", "user", "Lcom/amazon/alexa/assistant/authorization/AuthorizationState$AuthorizationUser;", "<init>", "(Lcom/amazon/alexa/assistant/authorization/AuthorizationState$AuthorizationUser;)V", "getUser", "()Lcom/amazon/alexa/assistant/authorization/AuthorizationState$AuthorizationUser;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "authorization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignedIn extends AuthorizationState {

        @NotNull
        private final AuthorizationUser user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(@NotNull AuthorizationUser authorizationUser) {
            super(null);
            authorizationUser.getClass();
            this.user = authorizationUser;
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, AuthorizationUser authorizationUser, int i, Object obj) {
            if ((i & 1) != 0) {
                authorizationUser = signedIn.user;
            }
            return signedIn.copy(authorizationUser);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AuthorizationUser getUser() {
            return this.user;
        }

        @NotNull
        public final SignedIn copy(@NotNull AuthorizationUser user) {
            user.getClass();
            return new SignedIn(user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SignedIn) && Intrinsics.areEqual(this.user, ((SignedIn) other).user);
        }

        @NotNull
        public final AuthorizationUser getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        @NotNull
        public String toString() {
            return "SignedIn(user=" + this.user + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/authorization/AuthorizationState$SignedOut;", "Lcom/amazon/alexa/assistant/authorization/AuthorizationState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "authorization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignedOut extends AuthorizationState {

        @NotNull
        public static final SignedOut INSTANCE = new SignedOut();

        private SignedOut() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SignedOut);
        }

        public int hashCode() {
            return -2011520471;
        }

        @NotNull
        public String toString() {
            return "SignedOut";
        }
    }

    public /* synthetic */ AuthorizationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AuthorizationState() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/assistant/authorization/AuthorizationState$AuthorizationUser;", "", "userId", "", "token", "deviceSerialNumber", "deviceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getToken", "setToken", "getDeviceSerialNumber", "setDeviceSerialNumber", "getDeviceType", "setDeviceType", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "authorization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthorizationUser {

        @Nullable
        private String deviceSerialNumber;

        @Nullable
        private String deviceType;

        @Nullable
        private String token;

        @Nullable
        private String userId;

        public AuthorizationUser(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.userId = str;
            this.token = str2;
            this.deviceSerialNumber = str3;
            this.deviceType = str4;
        }

        public static /* synthetic */ AuthorizationUser copy$default(AuthorizationUser authorizationUser, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationUser.userId;
            }
            if ((i & 2) != 0) {
                str2 = authorizationUser.token;
            }
            if ((i & 4) != 0) {
                str3 = authorizationUser.deviceSerialNumber;
            }
            if ((i & 8) != 0) {
                str4 = authorizationUser.deviceType;
            }
            return authorizationUser.copy(str, str2, str3, str4);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getDeviceSerialNumber() {
            return this.deviceSerialNumber;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        public final AuthorizationUser copy(@Nullable String userId, @Nullable String token, @Nullable String deviceSerialNumber, @Nullable String deviceType) {
            return new AuthorizationUser(userId, token, deviceSerialNumber, deviceType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationUser)) {
                return false;
            }
            AuthorizationUser authorizationUser = (AuthorizationUser) other;
            return Intrinsics.areEqual(this.userId, authorizationUser.userId) && Intrinsics.areEqual(this.token, authorizationUser.token) && Intrinsics.areEqual(this.deviceSerialNumber, authorizationUser.deviceSerialNumber) && Intrinsics.areEqual(this.deviceType, authorizationUser.deviceType);
        }

        @Nullable
        public final String getDeviceSerialNumber() {
            return this.deviceSerialNumber;
        }

        @Nullable
        public final String getDeviceType() {
            return this.deviceType;
        }

        @Nullable
        public final String getToken() {
            return this.token;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.userId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.token;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.deviceSerialNumber;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deviceType;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final void setDeviceSerialNumber(@Nullable String str) {
            this.deviceSerialNumber = str;
        }

        public final void setDeviceType(@Nullable String str) {
            this.deviceType = str;
        }

        public final void setToken(@Nullable String str) {
            this.token = str;
        }

        public final void setUserId(@Nullable String str) {
            this.userId = str;
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("AuthorizationUser(userId=***, token=***, deviceSerialNumber=***, deviceType=", this.deviceType, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public /* synthetic */ AuthorizationUser(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, str3, str4);
        }
    }
}
