package com.amazon.alexa.fva;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.alexa.fva.IResultCallback;
import com.amazon.alexa.fva.IUVRUtteranceTrainingCallback;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface IUVREnrollmentService extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.fva.IUVREnrollmentService";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* renamed from: -$$Nest$smreadTypedObject, reason: not valid java name */
        public static /* bridge */ /* synthetic */ Object m16183$$Nest$smreadTypedObject(Parcel parcel) {
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

    void cancelUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    void cancelUtteranceTraining(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    void finishUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    List<Bundle> getUtterancesInfo(Bundle bundle) throws RemoteException;

    void startUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException;

    void startUtteranceTraining(IUVRUtteranceTrainingCallback iUVRUtteranceTrainingCallback, Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IUVREnrollmentService {
        static final int TRANSACTION_cancelUserVoiceEnrollment = 3;
        static final int TRANSACTION_cancelUtteranceTraining = 6;
        static final int TRANSACTION_finishUserVoiceEnrollment = 2;
        static final int TRANSACTION_getUtterancesInfo = 4;
        static final int TRANSACTION_startUserVoiceEnrollment = 1;
        static final int TRANSACTION_startUtteranceTraining = 5;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IUVREnrollmentService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.alexa.fva.IUVREnrollmentService
            public void cancelUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVREnrollmentService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVREnrollmentService
            public void cancelUtteranceTraining(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVREnrollmentService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVREnrollmentService
            public void finishUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVREnrollmentService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IUVREnrollmentService.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.fva.IUVREnrollmentService
            public List<Bundle> getUtterancesInfo(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVREnrollmentService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVREnrollmentService
            public void startUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVREnrollmentService.DESCRIPTOR);
                    obtain.writeStrongInterface(iResultCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVREnrollmentService
            public void startUtteranceTraining(IUVRUtteranceTrainingCallback iUVRUtteranceTrainingCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVREnrollmentService.DESCRIPTOR);
                    obtain.writeStrongInterface(iUVRUtteranceTrainingCallback);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUVREnrollmentService.DESCRIPTOR);
        }

        public static IUVREnrollmentService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUVREnrollmentService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUVREnrollmentService)) ? new Proxy(iBinder) : (IUVREnrollmentService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUVREnrollmentService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUVREnrollmentService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    IResultCallback asInterface = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator = Bundle.CREATOR;
                    startUserVoiceEnrollment(asInterface, (Bundle) _Parcel.m16183$$Nest$smreadTypedObject(parcel));
                    return true;
                case 2:
                    IResultCallback asInterface2 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    finishUserVoiceEnrollment(asInterface2, (Bundle) _Parcel.m16183$$Nest$smreadTypedObject(parcel));
                    return true;
                case 3:
                    IResultCallback asInterface3 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    cancelUserVoiceEnrollment(asInterface3, (Bundle) _Parcel.m16183$$Nest$smreadTypedObject(parcel));
                    return true;
                case 4:
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    List<Bundle> utterancesInfo = getUtterancesInfo((Bundle) _Parcel.m16183$$Nest$smreadTypedObject(parcel));
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, utterancesInfo, 1);
                    return true;
                case 5:
                    IUVRUtteranceTrainingCallback asInterface4 = IUVRUtteranceTrainingCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator5 = Bundle.CREATOR;
                    startUtteranceTraining(asInterface4, (Bundle) _Parcel.m16183$$Nest$smreadTypedObject(parcel));
                    return true;
                case 6:
                    IResultCallback asInterface5 = IResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Parcelable.Creator creator6 = Bundle.CREATOR;
                    cancelUtteranceTraining(asInterface5, (Bundle) _Parcel.m16183$$Nest$smreadTypedObject(parcel));
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
    public static class Default implements IUVREnrollmentService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.fva.IUVREnrollmentService
        public List<Bundle> getUtterancesInfo(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.fva.IUVREnrollmentService
        public void cancelUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVREnrollmentService
        public void cancelUtteranceTraining(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVREnrollmentService
        public void finishUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVREnrollmentService
        public void startUserVoiceEnrollment(IResultCallback iResultCallback, Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVREnrollmentService
        public void startUtteranceTraining(IUVRUtteranceTrainingCallback iUVRUtteranceTrainingCallback, Bundle bundle) throws RemoteException {
        }
    }
}
