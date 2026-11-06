package com.amazon.alexa.ra.apl.fragments.data;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.apl.fragments.managers.AuthenticationManager;
import com.amazon.alexa.simba.api.data.ProfileServiceData;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/ProfileServiceDataReceiver;", "Landroid/os/ResultReceiver;", "weakAuthenticationManager", "Ljava/lang/ref/WeakReference;", "Lcom/amazon/alexa/ra/apl/fragments/managers/AuthenticationManager;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "Companion", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ProfileServiceDataReceiver extends ResultReceiver {
    public static final int ERROR_CODE_PROFILE_INFO_API = 1000;

    @NotNull
    public static final String PROFILE_DATA = "profileData";

    @NotNull
    public static final String PROFILE_SERVICE_ERROR = "profile_service_error";
    public static final int SUCCESS_CODE_PROFILE_INFO = 1;

    @NotNull
    public static final String TAG = "ProfileServiceDataReceiver";

    @NotNull
    private final WeakReference<AuthenticationManager> weakAuthenticationManager;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileServiceDataReceiver(@NotNull WeakReference<AuthenticationManager> weakReference) {
        super(null);
        weakReference.getClass();
        this.weakAuthenticationManager = weakReference;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int resultCode, @Nullable Bundle resultData) {
        ProfileServiceData profileServiceData;
        AuthenticationManager authenticationManager;
        super.onReceiveResult(resultCode, resultData);
        if (resultCode != 1) {
            if (resultCode == 1000 && resultData != null) {
                Log.e(TAG, "Unable to fetch profile information because: " + resultData.getString("profile_service_error"));
                return;
            }
            return;
        }
        if (resultData == null || (profileServiceData = (ProfileServiceData) resultData.getParcelable("profileData")) == null || (authenticationManager = this.weakAuthenticationManager.get()) == null) {
            return;
        }
        authenticationManager.setAuthToken(profileServiceData.getAuthToken());
    }
}
