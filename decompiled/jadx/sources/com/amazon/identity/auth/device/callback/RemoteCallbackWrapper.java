package com.amazon.identity.auth.device.callback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.callback.IRemoteCallback;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RemoteCallbackWrapper implements Callback, Parcelable {
    public static final Parcelable.Creator<RemoteCallbackWrapper> CREATOR = new a();
    private static final int MAX_RETRIES = 1;
    private static final String TAG = "RemoteCallbackWrapper";
    private final IRemoteCallback mCallback;

    public RemoteCallbackWrapper(Parcel parcel) {
        this(IRemoteCallback.Stub.asInterface(parcel.readStrongBinder()));
    }

    public static IRemoteCallback toRemoteCallback(Callback callback) {
        return new d(callback);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onError(Bundle bundle) {
        boolean z = false;
        int i = 0;
        while (!z && i <= 1) {
            i++;
            try {
                IRemoteCallback iRemoteCallback = this.mCallback;
                if (iRemoteCallback != null) {
                    iRemoteCallback.onError(bundle);
                } else {
                    Log.e(yf.a(TAG), "Not calling onError because mCallback is null");
                }
                z = true;
            } catch (RemoteException e) {
                Log.e(yf.a(TAG), "onError callback failed", e);
            } catch (Exception e2) {
                Log.e(yf.a(TAG), "Exception onError", e2);
            }
        }
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public void onSuccess(Bundle bundle) {
        boolean z = false;
        int i = 0;
        while (!z && i <= 1) {
            i++;
            try {
                IRemoteCallback iRemoteCallback = this.mCallback;
                if (iRemoteCallback != null) {
                    iRemoteCallback.onSuccess(bundle);
                } else {
                    Log.e(yf.a(TAG), "Not calling onSuccess because mCallback is null");
                }
                z = true;
            } catch (RemoteException e) {
                Log.e(yf.a(TAG), "onSuccess callback failed", e);
            } catch (Exception e2) {
                Log.e(yf.a(TAG), "Exception onSuccess", e2);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        IRemoteCallback iRemoteCallback = this.mCallback;
        if (iRemoteCallback != null) {
            parcel.writeStrongBinder(iRemoteCallback.asBinder());
        } else {
            parcel.writeStrongBinder(null);
        }
    }

    public RemoteCallbackWrapper(Callback callback) {
        this(new d(callback));
    }

    public RemoteCallbackWrapper(IRemoteCallback iRemoteCallback) {
        this.mCallback = iRemoteCallback;
    }
}
