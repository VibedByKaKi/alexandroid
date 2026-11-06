package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CertificateSettings {

    @NonNull
    public String certFileBlob;

    @NonNull
    public String clientCertFileBlob;

    @NonNull
    public String clientKeyFileBlob;

    public CertificateSettings(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.clientCertFileBlob = str;
        this.clientKeyFileBlob = str2;
        this.certFileBlob = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificateSettings)) {
            return false;
        }
        CertificateSettings certificateSettings = (CertificateSettings) obj;
        return Objects.equals(this.clientCertFileBlob, certificateSettings.clientCertFileBlob) && Objects.equals(this.clientKeyFileBlob, certificateSettings.clientKeyFileBlob) && Objects.equals(this.certFileBlob, certificateSettings.certFileBlob);
    }

    public int hashCode() {
        String str = this.clientCertFileBlob;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.clientKeyFileBlob;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.certFileBlob;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
