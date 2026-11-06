package com.amazon.alexa.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AlexaAudioPlaybackListenerProxy extends IInterface {
    void onAudioPlaybackChanged(AlexaPlaybackState alexaPlaybackState) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements AlexaAudioPlaybackListenerProxy {
        private static final String DESCRIPTOR = "com.amazon.alexa.api.AlexaAudioPlaybackListenerProxy";
        static final int TRANSACTION_onAudioPlaybackChanged = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements AlexaAudioPlaybackListenerProxy {
            public static AlexaAudioPlaybackListenerProxy sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.api.AlexaAudioPlaybackListenerProxy
            public void onAudioPlaybackChanged(AlexaPlaybackState alexaPlaybackState) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (alexaPlaybackState != null) {
                        obtain.writeInt(1);
                        alexaPlaybackState.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onAudioPlaybackChanged(alexaPlaybackState);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static AlexaAudioPlaybackListenerProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AlexaAudioPlaybackListenerProxy)) ? new Proxy(iBinder) : (AlexaAudioPlaybackListenerProxy) queryLocalInterface;
        }

        public static AlexaAudioPlaybackListenerProxy getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(AlexaAudioPlaybackListenerProxy alexaAudioPlaybackListenerProxy) {
            if (Proxy.sDefaultImpl != null) {
                Single$$ExternalSyntheticBUOutline0.m$2("setDefaultImpl() called twice");
                return false;
            }
            if (alexaAudioPlaybackListenerProxy == null) {
                return false;
            }
            Proxy.sDefaultImpl = alexaAudioPlaybackListenerProxy;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onAudioPlaybackChanged(parcel.readInt() != 0 ? AlexaPlaybackState.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements AlexaAudioPlaybackListenerProxy {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.api.AlexaAudioPlaybackListenerProxy
        public void onAudioPlaybackChanged(AlexaPlaybackState alexaPlaybackState) throws RemoteException {
        }
    }
}
