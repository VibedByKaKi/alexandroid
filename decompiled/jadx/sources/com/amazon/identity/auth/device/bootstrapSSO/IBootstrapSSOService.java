package com.amazon.identity.auth.device.bootstrapSSO;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IBootstrapSSOService extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.identity.auth.device.bootstrapSSO.IBootstrapSSOService";

    Bundle bootstrapForPackage(Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IBootstrapSSOService {
        static final int TRANSACTION_bootstrapForPackage = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IBootstrapSSOService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.identity.auth.device.bootstrapSSO.IBootstrapSSOService
            public Bundle bootstrapForPackage(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBootstrapSSOService.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle2 = (Bundle) (obtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(obtain2) : null);
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return IBootstrapSSOService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IBootstrapSSOService.DESCRIPTOR);
        }

        public static IBootstrapSSOService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBootstrapSSOService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBootstrapSSOService)) ? new Proxy(iBinder) : (IBootstrapSSOService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBootstrapSSOService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBootstrapSSOService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Bundle bootstrapForPackage = bootstrapForPackage((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            if (bootstrapForPackage != null) {
                parcel2.writeInt(1);
                bootstrapForPackage.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
