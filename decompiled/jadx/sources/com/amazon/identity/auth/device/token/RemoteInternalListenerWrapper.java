package com.amazon.identity.auth.device.token;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.identity.auth.device.token.IInternalListener;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RemoteInternalListenerWrapper extends c implements Parcelable {
    public static final Parcelable.Creator<RemoteInternalListenerWrapper> CREATOR = new k();
    private static final String TAG = "RemoteInternalListenerWrapper";
    private final IInternalListener mIInternalListener;

    public RemoteInternalListenerWrapper(Parcel parcel) {
        this(IInternalListener.Stub.asInterface(parcel.readStrongBinder()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.identity.auth.device.token.c
    public void finish(Bundle bundle) {
        IInternalListener iInternalListener = this.mIInternalListener;
        if (iInternalListener != null) {
            try {
                iInternalListener.finish(bundle);
            } catch (RemoteException e) {
                Log.e(yf.a(TAG), "finish callback failed", e);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        IInternalListener iInternalListener = this.mIInternalListener;
        if (iInternalListener != null) {
            parcel.writeStrongBinder(iInternalListener.asBinder());
        }
    }

    public RemoteInternalListenerWrapper(c cVar) {
        this(new l(cVar));
    }

    public RemoteInternalListenerWrapper(IInternalListener iInternalListener) {
        this.mIInternalListener = iInternalListener;
    }
}
