package com.amazon.alexa.fva;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface IUVRUtteranceTrainingCallback extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.fva.IUVRUtteranceTrainingCallback";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* renamed from: -$$Nest$smreadTypedObject, reason: not valid java name */
        public static /* bridge */ /* synthetic */ Object m16189$$Nest$smreadTypedObject(Parcel parcel) {
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

    void onError(Bundle bundle) throws RemoteException;

    void onFeedback(Bundle bundle) throws RemoteException;

    void onStartProcessing(Bundle bundle) throws RemoteException;

    void onStartRecording(Bundle bundle) throws RemoteException;

    void onStopProcessing(Bundle bundle) throws RemoteException;

    void onStopRecording(Bundle bundle) throws RemoteException;

    void onSuccess(Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IUVRUtteranceTrainingCallback {
        static final int TRANSACTION_onError = 6;
        static final int TRANSACTION_onFeedback = 7;
        static final int TRANSACTION_onStartProcessing = 3;
        static final int TRANSACTION_onStartRecording = 1;
        static final int TRANSACTION_onStopProcessing = 4;
        static final int TRANSACTION_onStopRecording = 2;
        static final int TRANSACTION_onSuccess = 5;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IUVRUtteranceTrainingCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IUVRUtteranceTrainingCallback.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
            public void onError(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
            public void onFeedback(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
            public void onStartProcessing(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
            public void onStartRecording(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
            public void onStopProcessing(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
            public void onStopRecording(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
            public void onSuccess(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUVRUtteranceTrainingCallback.DESCRIPTOR);
        }

        public static IUVRUtteranceTrainingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUVRUtteranceTrainingCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUVRUtteranceTrainingCallback)) ? new Proxy(iBinder) : (IUVRUtteranceTrainingCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUVRUtteranceTrainingCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUVRUtteranceTrainingCallback.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    Parcelable.Creator creator = Bundle.CREATOR;
                    onStartRecording((Bundle) _Parcel.m16189$$Nest$smreadTypedObject(parcel));
                    return true;
                case 2:
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    onStopRecording((Bundle) _Parcel.m16189$$Nest$smreadTypedObject(parcel));
                    return true;
                case 3:
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    onStartProcessing((Bundle) _Parcel.m16189$$Nest$smreadTypedObject(parcel));
                    return true;
                case 4:
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    onStopProcessing((Bundle) _Parcel.m16189$$Nest$smreadTypedObject(parcel));
                    return true;
                case 5:
                    Parcelable.Creator creator5 = Bundle.CREATOR;
                    onSuccess((Bundle) _Parcel.m16189$$Nest$smreadTypedObject(parcel));
                    return true;
                case 6:
                    Parcelable.Creator creator6 = Bundle.CREATOR;
                    onError((Bundle) _Parcel.m16189$$Nest$smreadTypedObject(parcel));
                    return true;
                case 7:
                    Parcelable.Creator creator7 = Bundle.CREATOR;
                    onFeedback((Bundle) _Parcel.m16189$$Nest$smreadTypedObject(parcel));
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
    public static class Default implements IUVRUtteranceTrainingCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
        public void onError(Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
        public void onFeedback(Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
        public void onStartProcessing(Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
        public void onStartRecording(Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
        public void onStopProcessing(Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
        public void onStopRecording(Bundle bundle) throws RemoteException {
        }

        @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
        public void onSuccess(Bundle bundle) throws RemoteException {
        }
    }
}
