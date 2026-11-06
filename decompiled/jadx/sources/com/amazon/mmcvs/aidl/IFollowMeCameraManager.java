package com.amazon.mmcvs.aidl;

import android.graphics.RectF;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.Surface;
import com.amazon.mmcvs.aidl.IFollowMeCameraListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IFollowMeCameraManager extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.mmcvs.aidl.IFollowMeCameraManager";

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

    RectF getROI() throws RemoteException;

    boolean isEnabled() throws RemoteException;

    Surface registerClient(int i, int i2, IFollowMeCameraListener iFollowMeCameraListener) throws RemoteException;

    void setEnableStatus(boolean z) throws RemoteException;

    void unregisterClient() throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IFollowMeCameraManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
        public RectF getROI() throws RemoteException {
            return null;
        }

        @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
        public boolean isEnabled() throws RemoteException {
            return false;
        }

        @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
        public Surface registerClient(int i, int i2, IFollowMeCameraListener iFollowMeCameraListener) throws RemoteException {
            return null;
        }

        @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
        public void unregisterClient() throws RemoteException {
        }

        @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
        public void setEnableStatus(boolean z) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IFollowMeCameraManager {
        static final int TRANSACTION_getROI = 3;
        static final int TRANSACTION_isEnabled = 4;
        static final int TRANSACTION_registerClient = 1;
        static final int TRANSACTION_setEnableStatus = 5;
        static final int TRANSACTION_unregisterClient = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IFollowMeCameraManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IFollowMeCameraManager.DESCRIPTOR;
            }

            @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
            public RectF getROI() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFollowMeCameraManager.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (RectF) _Parcel.readTypedObject(obtain2, RectF.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
            public boolean isEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFollowMeCameraManager.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
            public Surface registerClient(int i, int i2, IFollowMeCameraListener iFollowMeCameraListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFollowMeCameraManager.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongInterface(iFollowMeCameraListener);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Surface) _Parcel.readTypedObject(obtain2, Surface.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
            public void setEnableStatus(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFollowMeCameraManager.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.mmcvs.aidl.IFollowMeCameraManager
            public void unregisterClient() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFollowMeCameraManager.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IFollowMeCameraManager.DESCRIPTOR);
        }

        public static IFollowMeCameraManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IFollowMeCameraManager.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IFollowMeCameraManager)) ? new Proxy(iBinder) : (IFollowMeCameraManager) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IFollowMeCameraManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IFollowMeCameraManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                Surface registerClient = registerClient(parcel.readInt(), parcel.readInt(), IFollowMeCameraListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, registerClient, 1);
                return true;
            }
            if (i == 2) {
                unregisterClient();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                RectF roi = getROI();
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, roi, 1);
                return true;
            }
            if (i == 4) {
                boolean isEnabled = isEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(isEnabled ? 1 : 0);
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            setEnableStatus(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
