package com.amazon.rtvi.capture.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleCallback;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener;
import com.amazon.rtvi.capture.model.CaptureConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface ICaptureSourceModule extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.rtvi.capture.interfaces.ICaptureSourceModule";

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

    void addListener(ICaptureSourceModuleListener iCaptureSourceModuleListener) throws RemoteException;

    void close() throws RemoteException;

    void configureCapture(CaptureConfiguration captureConfiguration, ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException;

    void pauseCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException;

    void removeListener(ICaptureSourceModuleListener iCaptureSourceModuleListener) throws RemoteException;

    void resumeCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException;

    void startCapture(String str, CaptureConfiguration captureConfiguration, ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException;

    void stopCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ICaptureSourceModule {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void close() throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void addListener(ICaptureSourceModuleListener iCaptureSourceModuleListener) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void pauseCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void removeListener(ICaptureSourceModuleListener iCaptureSourceModuleListener) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void resumeCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void stopCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void configureCapture(CaptureConfiguration captureConfiguration, ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
        public void startCapture(String str, CaptureConfiguration captureConfiguration, ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ICaptureSourceModule {
        static final int TRANSACTION_addListener = 7;
        static final int TRANSACTION_close = 9;
        static final int TRANSACTION_configureCapture = 4;
        static final int TRANSACTION_pauseCapture = 3;
        static final int TRANSACTION_removeListener = 8;
        static final int TRANSACTION_resumeCapture = 5;
        static final int TRANSACTION_startCapture = 2;
        static final int TRANSACTION_stopCapture = 6;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ICaptureSourceModule {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void addListener(ICaptureSourceModuleListener iCaptureSourceModuleListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceModuleListener);
                    this.mRemote.transact(7, obtain, obtain2, 0);
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

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void close() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void configureCapture(CaptureConfiguration captureConfiguration, ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, captureConfiguration, 0);
                    obtain.writeStrongInterface(iCaptureSourceModuleCallback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICaptureSourceModule.DESCRIPTOR;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void pauseCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceModuleCallback);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void removeListener(ICaptureSourceModuleListener iCaptureSourceModuleListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceModuleListener);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void resumeCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceModuleCallback);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void startCapture(String str, CaptureConfiguration captureConfiguration, ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, captureConfiguration, 0);
                    obtain.writeStrongInterface(iCaptureSourceModuleCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModule
            public void stopCapture(ICaptureSourceModuleCallback iCaptureSourceModuleCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModule.DESCRIPTOR);
                    obtain.writeStrongInterface(iCaptureSourceModuleCallback);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICaptureSourceModule.DESCRIPTOR);
        }

        public static ICaptureSourceModule asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICaptureSourceModule.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICaptureSourceModule)) ? new Proxy(iBinder) : (ICaptureSourceModule) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICaptureSourceModule.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICaptureSourceModule.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 2:
                    startCapture(parcel.readString(), (CaptureConfiguration) _Parcel.readTypedObject(parcel, CaptureConfiguration.CREATOR), ICaptureSourceModuleCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    pauseCapture(ICaptureSourceModuleCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    configureCapture((CaptureConfiguration) _Parcel.readTypedObject(parcel, CaptureConfiguration.CREATOR), ICaptureSourceModuleCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    resumeCapture(ICaptureSourceModuleCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    stopCapture(ICaptureSourceModuleCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    addListener(ICaptureSourceModuleListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    removeListener(ICaptureSourceModuleListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
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
