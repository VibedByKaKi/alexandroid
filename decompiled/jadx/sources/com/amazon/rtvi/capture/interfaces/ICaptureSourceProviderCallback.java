package com.amazon.rtvi.capture.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceModule;
import com.amazon.rtvi.capture.model.CaptureCapabilities;
import com.amazon.rtvi.capture.model.CaptureSource;
import com.amazon.rtvi.capture.model.RtviError;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface ICaptureSourceProviderCallback extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback";

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
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
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

    void onAvailableSources(List<CaptureSource> list) throws RemoteException;

    void onCapabilities(CaptureSource captureSource, CaptureCapabilities captureCapabilities) throws RemoteException;

    void onError(RtviError rtviError) throws RemoteException;

    void onModule(CaptureSource captureSource, ICaptureSourceModule iCaptureSourceModule) throws RemoteException;

    void onProviderId(String str) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ICaptureSourceProviderCallback {
        static final int TRANSACTION_onAvailableSources = 2;
        static final int TRANSACTION_onCapabilities = 3;
        static final int TRANSACTION_onError = 5;
        static final int TRANSACTION_onModule = 4;
        static final int TRANSACTION_onProviderId = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ICaptureSourceProviderCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICaptureSourceProviderCallback.DESCRIPTOR;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
            public void onAvailableSources(List<CaptureSource> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProviderCallback.DESCRIPTOR);
                    _Parcel.writeTypedList(obtain, list, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
            public void onCapabilities(CaptureSource captureSource, CaptureCapabilities captureCapabilities) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProviderCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, captureSource, 0);
                    _Parcel.writeTypedObject(obtain, captureCapabilities, 0);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
            public void onError(RtviError rtviError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProviderCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rtviError, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
            public void onModule(CaptureSource captureSource, ICaptureSourceModule iCaptureSourceModule) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProviderCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, captureSource, 0);
                    obtain.writeStrongInterface(iCaptureSourceModule);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
            public void onProviderId(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProviderCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICaptureSourceProviderCallback.DESCRIPTOR);
        }

        public static ICaptureSourceProviderCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICaptureSourceProviderCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICaptureSourceProviderCallback)) ? new Proxy(iBinder) : (ICaptureSourceProviderCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICaptureSourceProviderCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICaptureSourceProviderCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onProviderId(parcel.readString());
            } else if (i == 2) {
                onAvailableSources(parcel.createTypedArrayList(CaptureSource.CREATOR));
            } else if (i == 3) {
                onCapabilities((CaptureSource) _Parcel.readTypedObject(parcel, CaptureSource.CREATOR), (CaptureCapabilities) _Parcel.readTypedObject(parcel, CaptureCapabilities.CREATOR));
            } else if (i == 4) {
                onModule((CaptureSource) _Parcel.readTypedObject(parcel, CaptureSource.CREATOR), ICaptureSourceModule.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError((RtviError) _Parcel.readTypedObject(parcel, RtviError.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ICaptureSourceProviderCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
        public void onAvailableSources(List<CaptureSource> list) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
        public void onError(RtviError rtviError) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
        public void onProviderId(String str) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
        public void onCapabilities(CaptureSource captureSource, CaptureCapabilities captureCapabilities) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback
        public void onModule(CaptureSource captureSource, ICaptureSourceModule iCaptureSourceModule) throws RemoteException {
        }
    }
}
