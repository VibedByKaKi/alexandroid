package com.amazon.tarazed.type;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/amazon/tarazed/type/Account;", "Ljava/io/Serializable;", "accountId", "", "preferredMarketplace", "deviceType", "deviceSerialNumber", "environment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getDeviceSerialNumber", "getDeviceType", "getEnvironment", "getPreferredMarketplace", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class Account implements Serializable {

    @Nullable
    private final String accountId;

    @Nullable
    private final String deviceSerialNumber;

    @Nullable
    private final String deviceType;

    @Nullable
    private final String environment;

    @Nullable
    private final String preferredMarketplace;

    public Account(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.accountId = str;
        this.preferredMarketplace = str2;
        this.deviceType = str3;
        this.deviceSerialNumber = str4;
        this.environment = str5;
    }

    public static /* synthetic */ Account copy$default(Account account, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = account.accountId;
        }
        if ((i & 2) != 0) {
            str2 = account.preferredMarketplace;
        }
        if ((i & 4) != 0) {
            str3 = account.deviceType;
        }
        if ((i & 8) != 0) {
            str4 = account.deviceSerialNumber;
        }
        if ((i & 16) != 0) {
            str5 = account.environment;
        }
        String str6 = str5;
        String str7 = str3;
        return account.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPreferredMarketplace() {
        return this.preferredMarketplace;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final Account copy(@Nullable String accountId, @Nullable String preferredMarketplace, @Nullable String deviceType, @Nullable String deviceSerialNumber, @Nullable String environment) {
        return new Account(accountId, preferredMarketplace, deviceType, deviceSerialNumber, environment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Account)) {
            return false;
        }
        Account account = (Account) other;
        return Intrinsics.areEqual(this.accountId, account.accountId) && Intrinsics.areEqual(this.preferredMarketplace, account.preferredMarketplace) && Intrinsics.areEqual(this.deviceType, account.deviceType) && Intrinsics.areEqual(this.deviceSerialNumber, account.deviceSerialNumber) && Intrinsics.areEqual(this.environment, account.environment);
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
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
    public final String getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final String getPreferredMarketplace() {
        return this.preferredMarketplace;
    }

    public int hashCode() {
        String str = this.accountId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preferredMarketplace;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceSerialNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.environment;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accountId;
        String str2 = this.preferredMarketplace;
        String str3 = this.deviceType;
        String str4 = this.deviceSerialNumber;
        String str5 = this.environment;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Account(accountId=", str, ", preferredMarketplace=", str2, ", deviceType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", deviceSerialNumber=", str4, ", environment=");
        return a$$ExternalSyntheticOutline0.m(m, str5, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
