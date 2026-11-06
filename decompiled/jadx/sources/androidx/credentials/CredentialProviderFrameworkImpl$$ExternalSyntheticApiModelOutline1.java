package androidx.credentials;

import android.content.pm.SigningInfo;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.GetCredentialException;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.CallingAppInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract /* synthetic */ class CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline1 {
    public static /* synthetic */ ClearCredentialStateException m(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* synthetic */ void m$3() {
    }

    public static /* synthetic */ void m$4() {
    }

    public static /* synthetic */ void m$5() {
    }

    public static /* synthetic */ void m$6() {
    }

    public static /* synthetic */ android.credentials.ClearCredentialStateRequest m(Bundle bundle) {
        return new android.credentials.ClearCredentialStateRequest(bundle);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ CreateCredentialException m7680m(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetCredentialException m7681m(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* synthetic */ BeginCreateCredentialRequest m(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        return new BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }

    public static /* synthetic */ BeginGetCredentialOption m(Bundle bundle, String str, String str2) {
        return new BeginGetCredentialOption(str, str2, bundle);
    }

    public static /* synthetic */ CallingAppInfo m(String str, SigningInfo signingInfo, String str2) {
        return new CallingAppInfo(str, signingInfo, str2);
    }

    public static /* synthetic */ void m() {
    }
}
