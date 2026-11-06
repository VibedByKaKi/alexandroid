package com.amazon.alexa.api.compat.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AlexaDirectiveProcessingCallbacksProxy extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy";

    void onCancelFinished() throws RemoteException;

    void onCancelStarted() throws RemoteException;

    void onError() throws RemoteException;

    void onProcessFinished() throws RemoteException;

    void onProcessStarted() throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements AlexaDirectiveProcessingCallbacksProxy {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onCancelFinished() throws RemoteException {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onCancelStarted() throws RemoteException {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onError() throws RemoteException {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onProcessFinished() throws RemoteException {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onProcessStarted() throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements AlexaDirectiveProcessingCallbacksProxy {
        static final int TRANSACTION_onCancelFinished = 4;
        static final int TRANSACTION_onCancelStarted = 3;
        static final int TRANSACTION_onError = 5;
        static final int TRANSACTION_onProcessFinished = 2;
        static final int TRANSACTION_onProcessStarted = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements AlexaDirectiveProcessingCallbacksProxy {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
            public void onCancelFinished() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
            public void onCancelStarted() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
            public void onError() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
            public void onProcessFinished() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
            public void onProcessStarted() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
        }

        public static AlexaDirectiveProcessingCallbacksProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AlexaDirectiveProcessingCallbacksProxy)) ? new Proxy(iBinder) : (AlexaDirectiveProcessingCallbacksProxy) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(AlexaDirectiveProcessingCallbacksProxy.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onProcessStarted();
            } else if (i == 2) {
                onProcessFinished();
            } else if (i == 3) {
                onCancelStarted();
            } else if (i == 4) {
                onCancelFinished();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
