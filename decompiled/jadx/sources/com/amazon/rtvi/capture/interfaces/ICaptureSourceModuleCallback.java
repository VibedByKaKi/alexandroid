package com.amazon.rtvi.capture.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.rtvi.capture.model.RtviError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface ICaptureSourceModuleCallback extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleCallback";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onError(RtviError rtviError) throws RemoteException;

    void onSuccess() throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ICaptureSourceModuleCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleCallback
        public void onSuccess() throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleCallback
        public void onError(RtviError rtviError) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ICaptureSourceModuleCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ICaptureSourceModuleCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICaptureSourceModuleCallback.DESCRIPTOR;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleCallback
            public void onError(RtviError rtviError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rtviError, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleCallback
            public void onSuccess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleCallback.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICaptureSourceModuleCallback.DESCRIPTOR);
        }

        public static ICaptureSourceModuleCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICaptureSourceModuleCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICaptureSourceModuleCallback)) ? new Proxy(iBinder) : (ICaptureSourceModuleCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICaptureSourceModuleCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICaptureSourceModuleCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onSuccess();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onError((RtviError) _Parcel.readTypedObject(parcel, RtviError.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
