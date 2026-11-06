package com.amazon.alexa.fva;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.alexa.fva.IResultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface IWakewordSettingsService extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.fva.IWakewordSettingsService";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* renamed from: -$$Nest$smreadTypedObject, reason: not valid java name */
        public static /* bridge */ /* synthetic */ Object m16195$$Nest$smreadTypedObject(Parcel parcel) {
            return readTypedObject(parcel, Bundle.CREATOR);
        }

        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
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

    void getParams(Bundle bundle, IResultCallback iResultCallback) throws RemoteException;

    boolean isWakewordEnabled() throws RemoteException;

    void setParams(Bundle bundle, IResultCallback iResultCallback) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IWakewordSettingsService {
        static final int TRANSACTION_getParams = 2;
        static final int TRANSACTION_isWakewordEnabled = 3;
        static final int TRANSACTION_setParams = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IWakewordSettingsService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWakewordSettingsService.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.fva.IWakewordSettingsService
            public void getParams(Bundle bundle, IResultCallback iResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWakewordSettingsService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iResultCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IWakewordSettingsService
            public boolean isWakewordEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWakewordSettingsService.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IWakewordSettingsService
            public void setParams(Bundle bundle, IResultCallback iResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IWakewordSettingsService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iResultCallback);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWakewordSettingsService.DESCRIPTOR);
        }

        public static IWakewordSettingsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IWakewordSettingsService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IWakewordSettingsService)) ? new Proxy(iBinder) : (IWakewordSettingsService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWakewordSettingsService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWakewordSettingsService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                Parcelable.Creator creator = Bundle.CREATOR;
                setParams((Bundle) _Parcel.m16195$$Nest$smreadTypedObject(parcel), IResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i == 2) {
                Parcelable.Creator creator2 = Bundle.CREATOR;
                getParams((Bundle) _Parcel.m16195$$Nest$smreadTypedObject(parcel), IResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean isWakewordEnabled = isWakewordEnabled();
            parcel2.writeNoException();
            parcel2.writeInt(isWakewordEnabled ? 1 : 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IWakewordSettingsService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.fva.IWakewordSettingsService
        public boolean isWakewordEnabled() throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.fva.IWakewordSettingsService
        public void getParams(Bundle bundle, IResultCallback iResultCallback) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IWakewordSettingsService
        public void setParams(Bundle bundle, IResultCallback iResultCallback) throws RemoteException {
        }
    }
}
