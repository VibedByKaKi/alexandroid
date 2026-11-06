package com.amazon.alexa.fva;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.alexa.fva.IResultCallback;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface IUVRSettingsService extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.fva.IUVRSettingsService";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* renamed from: -$$Nest$smreadTypedObject, reason: not valid java name */
        public static /* bridge */ /* synthetic */ Object m16186$$Nest$smreadTypedObject(Parcel parcel) {
            return readTypedObject(parcel, Bundle.CREATOR);
        }

        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
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

    void disableUVR(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    void enableUVR(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    List<Bundle> getEnrolledUsers(Bundle bundle) throws RemoteException;

    void getParams(IResultCallback iResultCallback) throws RemoteException;

    boolean isUVRAvailable(Bundle bundle) throws RemoteException;

    boolean isUVREnrolled(Bundle bundle) throws RemoteException;

    void loadDefaultVoiceModel(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    void removeUVRModel(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    void setParams(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IUVRSettingsService {
        static final int TRANSACTION_disableUVR = 6;
        static final int TRANSACTION_enableUVR = 5;
        static final int TRANSACTION_getEnrolledUsers = 9;
        static final int TRANSACTION_getParams = 2;
        static final int TRANSACTION_isUVRAvailable = 3;
        static final int TRANSACTION_isUVREnrolled = 4;
        static final int TRANSACTION_loadDefaultVoiceModel = 8;
        static final int TRANSACTION_removeUVRModel = 7;
        static final int TRANSACTION_setParams = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IUVRSettingsService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public void disableUVR(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public void enableUVR(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public List<Bundle> getEnrolledUsers(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IUVRSettingsService.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public void getParams(IResultCallback iResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public boolean isUVRAvailable(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public boolean isUVREnrolled(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public void loadDefaultVoiceModel(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public void removeUVRModel(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRSettingsService
            public void setParams(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRSettingsService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUVRSettingsService.DESCRIPTOR);
        }

        public static IUVRSettingsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUVRSettingsService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUVRSettingsService)) ? new Proxy(iBinder) : (IUVRSettingsService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUVRSettingsService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUVRSettingsService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    IResultCallback asInterface = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator = Bundle.CREATOR;
                    setParams(asInterface, (Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    return true;
                case 2:
                    getParams(IResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    boolean isUVRAvailable = isUVRAvailable((Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(isUVRAvailable ? 1 : 0);
                    return true;
                case 4:
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    boolean isUVREnrolled = isUVREnrolled((Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(isUVREnrolled ? 1 : 0);
                    return true;
                case 5:
                    IResultCallback asInterface2 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    enableUVR(asInterface2, (Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    return true;
                case 6:
                    IResultCallback asInterface3 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator5 = Bundle.CREATOR;
                    disableUVR(asInterface3, (Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    return true;
                case 7:
                    IResultCallback asInterface4 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator6 = Bundle.CREATOR;
                    removeUVRModel(asInterface4, (Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    return true;
                case 8:
                    IResultCallback asInterface5 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator7 = Bundle.CREATOR;
                    loadDefaultVoiceModel(asInterface5, (Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    return true;
                case 9:
                    Parcelable.Creator creator8 = Bundle.CREATOR;
                    List<Bundle> enrolledUsers = getEnrolledUsers((Bundle) _Parcel.m16186$$Nest$smreadTypedObject(parcel));
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, enrolledUsers, 1);
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

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IUVRSettingsService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public List<Bundle> getEnrolledUsers(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public boolean isUVRAvailable(Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public boolean isUVREnrolled(Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public void getParams(IResultCallback iResultCallback) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public void disableUVR(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public void enableUVR(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public void loadDefaultVoiceModel(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public void removeUVRModel(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRSettingsService
        public void setParams(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }
    }
}
