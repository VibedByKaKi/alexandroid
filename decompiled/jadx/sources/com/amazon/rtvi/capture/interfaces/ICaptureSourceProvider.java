package com.amazon.rtvi.capture.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderCallback;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceProviderListener;
import com.amazon.rtvi.capture.model.CaptureSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface ICaptureSourceProvider extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider";

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

    void addListener(ICaptureSourceProviderListener iCaptureSourceProviderListener) throws RemoteException;

    void close() throws RemoteException;

    void getAvailableCaptureSources(ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException;

    void getCaptureSourceCapabilities(CaptureSource captureSource, ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException;

    void getId(ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException;

    void makeModule(CaptureSource captureSource, ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException;

    void removeListener(ICaptureSourceProviderListener iCaptureSourceProviderListener) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ICaptureSourceProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
        public void close() throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
        public void addListener(ICaptureSourceProviderListener iCaptureSourceProviderListener) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
        public void getAvailableCaptureSources(ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
        public void getId(ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
        public void removeListener(ICaptureSourceProviderListener iCaptureSourceProviderListener) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
        public void getCaptureSourceCapabilities(CaptureSource captureSource, ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
        public void makeModule(CaptureSource captureSource, ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ICaptureSourceProvider {
        static final int TRANSACTION_addListener = 6;
        static final int TRANSACTION_close = 8;
        static final int TRANSACTION_getAvailableCaptureSources = 3;
        static final int TRANSACTION_getCaptureSourceCapabilities = 4;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_makeModule = 5;
        static final int TRANSACTION_removeListener = 7;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ICaptureSourceProvider {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
            public void addListener(ICaptureSourceProviderListener iCaptureSourceProviderListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProvider.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceProviderListener);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
            public void close() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProvider.DESCRIPTOR);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
            public void getAvailableCaptureSources(ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProvider.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceProviderCallback);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
            public void getCaptureSourceCapabilities(CaptureSource captureSource, ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProvider.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, captureSource, 0);
                    obtain.writeStrongInterface(iCaptureSourceProviderCallback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
            public void getId(ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProvider.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceProviderCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICaptureSourceProvider.DESCRIPTOR;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
            public void makeModule(CaptureSource captureSource, ICaptureSourceProviderCallback iCaptureSourceProviderCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProvider.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, captureSource, 0);
                    obtain.writeStrongInterface(iCaptureSourceProviderCallback);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider
            public void removeListener(ICaptureSourceProviderListener iCaptureSourceProviderListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceProvider.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceProviderListener);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICaptureSourceProvider.DESCRIPTOR);
        }

        public static ICaptureSourceProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICaptureSourceProvider.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICaptureSourceProvider)) ? new Proxy(iBinder) : (ICaptureSourceProvider) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICaptureSourceProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICaptureSourceProvider.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 2:
                    getId(ICaptureSourceProviderCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    getAvailableCaptureSources(ICaptureSourceProviderCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    getCaptureSourceCapabilities((CaptureSource) _Parcel.readTypedObject(parcel, CaptureSource.CREATOR), ICaptureSourceProviderCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    makeModule((CaptureSource) _Parcel.readTypedObject(parcel, CaptureSource.CREATOR), ICaptureSourceProviderCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    addListener(ICaptureSourceProviderListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    removeListener(ICaptureSourceProviderListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    close();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
