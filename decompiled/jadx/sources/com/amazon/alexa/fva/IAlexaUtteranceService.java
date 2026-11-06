package com.amazon.alexa.fva;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.alexa.fva.IResultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface IAlexaUtteranceService extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.fva.IAlexaUtteranceService";

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

    void onUtteranceReceived(ParcelFileDescriptor parcelFileDescriptor, IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IAlexaUtteranceService {
        static final int TRANSACTION_onUtteranceReceived = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IAlexaUtteranceService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAlexaUtteranceService.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.fva.IAlexaUtteranceService
            public void onUtteranceReceived(ParcelFileDescriptor parcelFileDescriptor, IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAlexaUtteranceService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, parcelFileDescriptor, 0);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAlexaUtteranceService.DESCRIPTOR);
        }

        public static IAlexaUtteranceService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAlexaUtteranceService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAlexaUtteranceService)) ? new Proxy(iBinder) : (IAlexaUtteranceService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAlexaUtteranceService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAlexaUtteranceService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onUtteranceReceived((ParcelFileDescriptor) _Parcel.readTypedObject(parcel, ParcelFileDescriptor.CREATOR), IResultCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IAlexaUtteranceService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.fva.IAlexaUtteranceService
        public void onUtteranceReceived(ParcelFileDescriptor parcelFileDescriptor, IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }
    }
}
