package com.amazon.comms.calling.data.dao;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/comms/calling/data/dao/AuthToken;", "", "tokenValue", "", "expirationDate", "Ljava/util/Date;", "createdDate", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getTokenValue", "()Ljava/lang/String;", "getExpirationDate", "()Ljava/util/Date;", "getCreatedDate", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class AuthToken {

    @SerializedName("created")
    @Nullable
    private final Date createdDate;

    @SerializedName(FragmentMetaData.EXPIRATION)
    @Nullable
    private final Date expirationDate;

    @SerializedName("value")
    @Nullable
    private final String tokenValue;

    public AuthToken(@Nullable String str, @Nullable Date date, @Nullable Date date2) {
        this.tokenValue = str;
        this.expirationDate = date;
        this.createdDate = date2;
    }

    public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authToken.tokenValue;
        }
        if ((i & 2) != 0) {
            date = authToken.expirationDate;
        }
        if ((i & 4) != 0) {
            date2 = authToken.createdDate;
        }
        return authToken.copy(str, date, date2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTokenValue() {
        return this.tokenValue;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Date getCreatedDate() {
        return this.createdDate;
    }

    @NotNull
    public final AuthToken copy(@Nullable String tokenValue, @Nullable Date expirationDate, @Nullable Date createdDate) {
        return new AuthToken(tokenValue, expirationDate, createdDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) other;
        return Intrinsics.areEqual(this.tokenValue, authToken.tokenValue) && Intrinsics.areEqual(this.expirationDate, authToken.expirationDate) && Intrinsics.areEqual(this.createdDate, authToken.createdDate);
    }

    @Nullable
    public final Date getCreatedDate() {
        return this.createdDate;
    }

    @Nullable
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    public final String getTokenValue() {
        return this.tokenValue;
    }

    public int hashCode() {
        String str = this.tokenValue;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.expirationDate;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createdDate;
        return hashCode2 + (date2 != null ? date2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AuthToken(tokenValue=" + this.tokenValue + ", expirationDate=" + this.expirationDate + ", createdDate=" + this.createdDate + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
