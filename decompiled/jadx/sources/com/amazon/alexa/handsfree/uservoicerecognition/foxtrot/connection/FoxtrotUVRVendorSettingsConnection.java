package com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.connection;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessoryclient.common.util.MetricsConstants;
import com.amazon.alexa.fva.IUVRSettingsService;
import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIConstants;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UserInfo;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.provider.EnrollmentStateProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.callback.EnrollmentStatusCallback;
import com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.callback.FoxtrotResponseCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FoxtrotUVRVendorSettingsConnection implements ServiceConnection {
    private static final String SERVICE = "IUVRSettingsService";
    private static final String TAG = "FoxtrotUVRVendorSettingsConnection";
    private static final String VENDOR_SETTINGS_SERVICE_CRASHED = "%s: vendor settings service has crashed";
    private static final String VENDOR_SETTINGS_SERVICE_NOT_CONNECTED = "%s: vendor settings service not connected";
    private final EnrollmentStateProvider mEnrollmentStateProvider;
    private IUVRSettingsService mIUVRVendorSettings;
    private boolean mIsVendorSettingsServiceBound;

    public FoxtrotUVRVendorSettingsConnection(@NonNull EnrollmentStateProvider enrollmentStateProvider) {
        this.mEnrollmentStateProvider = enrollmentStateProvider;
    }

    @NonNull
    private Bundle getUserInfoBundle(@NonNull UserInfo userInfo) {
        Bundle bundle = new Bundle();
        bundle.putString(FoxtrotAPIConstants.UVR_USER_INFO_ID, userInfo.getUserId());
        return bundle;
    }

    public void disableUVR(@NonNull UserInfo userInfo, @NonNull FoxtrotResponseCallback foxtrotResponseCallback) throws RemoteException {
        if (this.mIsVendorSettingsServiceBound) {
            this.mIUVRVendorSettings.disableUVR(foxtrotResponseCallback, getUserInfoBundle(userInfo));
        } else {
            foxtrotResponseCallback.onServiceNotConnected("disableUVR", SERVICE);
        }
    }

    public void enableUVR(@NonNull UserInfo userInfo, @NonNull FoxtrotResponseCallback foxtrotResponseCallback) throws RemoteException {
        if (this.mIsVendorSettingsServiceBound) {
            this.mIUVRVendorSettings.enableUVR(foxtrotResponseCallback, getUserInfoBundle(userInfo));
        } else {
            foxtrotResponseCallback.onServiceNotConnected("enableUVR", SERVICE);
        }
    }

    @VisibleForTesting
    public IUVRSettingsService getServiceFromBinder(@NonNull IBinder iBinder) {
        return IUVRSettingsService.Stub.asInterface(iBinder);
    }

    public boolean isEnrollmentResumeSupported() {
        return true;
    }

    public boolean isUVRAvailable() {
        return false;
    }

    public boolean isUVREnrolled(@NonNull UserInfo userInfo) throws RemoteException {
        return false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        Log.d(TAG, "onServiceConnected");
        this.mIUVRVendorSettings = getServiceFromBinder(iBinder);
        this.mIsVendorSettingsServiceBound = true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NonNull ComponentName componentName) {
        Log.d(TAG, MetricsConstants.CLIENT_CONNECTION_ON_SERVICE_DISCONNECTED);
        this.mIUVRVendorSettings = null;
        this.mIsVendorSettingsServiceBound = false;
    }

    public void removeUVRModel(@NonNull UserInfo userInfo, @NonNull FoxtrotResponseCallback foxtrotResponseCallback) throws RemoteException {
        if (!this.mIsVendorSettingsServiceBound) {
            foxtrotResponseCallback.onServiceNotConnected("removeUVRModel", SERVICE);
            return;
        }
        this.mEnrollmentStateProvider.setUserInfo(userInfo);
        this.mIUVRVendorSettings.removeUVRModel(new EnrollmentStatusCallback(foxtrotResponseCallback, this.mEnrollmentStateProvider, false), getUserInfoBundle(userInfo));
    }

    public void setEnrollmentTimeout(@NonNull Integer num, @NonNull FoxtrotResponseCallback foxtrotResponseCallback) throws RemoteException {
        if (!this.mIsVendorSettingsServiceBound) {
            foxtrotResponseCallback.onServiceNotConnected("setEnrollmentTimeout", SERVICE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(FoxtrotAPIConstants.UVR_UTTERANCE_TRAINING_TIMEOUT, num.intValue());
        this.mIUVRVendorSettings.setParams(foxtrotResponseCallback, bundle);
    }
}
