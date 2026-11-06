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
public interface IAlexaStateManagerService extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.fva.IAlexaStateManagerService";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* renamed from: -$$Nest$smreadTypedObject, reason: not valid java name */
        public static /* bridge */ /* synthetic */ Object m16177$$Nest$smreadTypedObject(Parcel parcel) {
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

    void start(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    void stop(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IAlexaStateManagerService {
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_stop = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IAlexaStateManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAlexaStateManagerService.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.fva.IAlexaStateManagerService
            public void start(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAlexaStateManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IAlexaStateManagerService
            public void stop(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAlexaStateManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAlexaStateManagerService.DESCRIPTOR);
        }

        public static IAlexaStateManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAlexaStateManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAlexaStateManagerService)) ? new Proxy(iBinder) : (IAlexaStateManagerService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAlexaStateManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAlexaStateManagerService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                IResultCallback asInterface = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = Bundle.CREATOR;
                start(asInterface, (Bundle) _Parcel.m16177$$Nest$smreadTypedObject(parcel));
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            IResultCallback asInterface2 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
            Parcelable.Creator creator2 = Bundle.CREATOR;
            stop(asInterface2, (Bundle) _Parcel.m16177$$Nest$smreadTypedObject(parcel));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IAlexaStateManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.fva.IAlexaStateManagerService
        public void start(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IAlexaStateManagerService
        public void stop(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }
    }
}
