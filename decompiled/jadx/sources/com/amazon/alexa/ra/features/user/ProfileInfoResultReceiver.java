package com.amazon.alexa.ra.features.user;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.simba.api.data.ProfileServiceData;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/features/user/ProfileInfoResultReceiver;", "Landroid/os/ResultReceiver;", "userSourceRef", "Ljava/lang/ref/WeakReference;", "Lcom/amazon/alexa/ra/features/user/UserSource;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ProfileInfoResultReceiver extends ResultReceiver {
    public static final int $stable = 8;

    @NotNull
    private final WeakReference<UserSource> userSourceRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileInfoResultReceiver(@NotNull WeakReference<UserSource> weakReference) {
        super(null);
        weakReference.getClass();
        this.userSourceRef = weakReference;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int resultCode, @Nullable Bundle resultData) {
        ProfileServiceData profileServiceData;
        super.onReceiveResult(resultCode, resultData);
        UserSource userSource = this.userSourceRef.get();
        if (userSource == null) {
            return;
        }
        if (resultCode != 1 || resultData == null || (profileServiceData = (ProfileServiceData) resultData.getParcelable("profileData")) == null) {
            userSource.onAuthTokenFetchFailed$AVSMobileFramework_ra_android_ui_prodRelease();
        } else {
            userSource.setAuthToken(profileServiceData.getAuthToken());
        }
    }
}
