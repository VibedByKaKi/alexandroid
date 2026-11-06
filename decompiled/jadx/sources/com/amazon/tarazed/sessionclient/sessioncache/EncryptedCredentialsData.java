package com.amazon.tarazed.sessionclient.sessioncache;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/tarazed/sessionclient/sessioncache/EncryptedCredentialsData;", "", "encryptedKey", "", "iv", "encryptedCredentials", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedCredentials", "()Ljava/lang/String;", "getEncryptedKey", "getIv", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class EncryptedCredentialsData {

    @NotNull
    private final String encryptedCredentials;

    @NotNull
    private final String encryptedKey;

    @NotNull
    private final String iv;

    public EncryptedCredentialsData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.encryptedKey = str;
        this.iv = str2;
        this.encryptedCredentials = str3;
    }

    public static /* synthetic */ EncryptedCredentialsData copy$default(EncryptedCredentialsData encryptedCredentialsData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encryptedCredentialsData.encryptedKey;
        }
        if ((i & 2) != 0) {
            str2 = encryptedCredentialsData.iv;
        }
        if ((i & 4) != 0) {
            str3 = encryptedCredentialsData.encryptedCredentials;
        }
        return encryptedCredentialsData.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIv() {
        return this.iv;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEncryptedCredentials() {
        return this.encryptedCredentials;
    }

    @NotNull
    public final EncryptedCredentialsData copy(@NotNull String encryptedKey, @NotNull String iv, @NotNull String encryptedCredentials) {
        encryptedKey.getClass();
        iv.getClass();
        encryptedCredentials.getClass();
        return new EncryptedCredentialsData(encryptedKey, iv, encryptedCredentials);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedCredentialsData)) {
            return false;
        }
        EncryptedCredentialsData encryptedCredentialsData = (EncryptedCredentialsData) other;
        return Intrinsics.areEqual(this.encryptedKey, encryptedCredentialsData.encryptedKey) && Intrinsics.areEqual(this.iv, encryptedCredentialsData.iv) && Intrinsics.areEqual(this.encryptedCredentials, encryptedCredentialsData.encryptedCredentials);
    }

    @NotNull
    public final String getEncryptedCredentials() {
        return this.encryptedCredentials;
    }

    @NotNull
    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    @NotNull
    public final String getIv() {
        return this.iv;
    }

    public int hashCode() {
        return this.encryptedCredentials.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.encryptedKey.hashCode() * 31, 31, this.iv);
    }

    @NotNull
    public String toString() {
        String str = this.encryptedKey;
        String str2 = this.iv;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("EncryptedCredentialsData(encryptedKey=", str, ", iv=", str2, ", encryptedCredentials="), this.encryptedCredentials, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
