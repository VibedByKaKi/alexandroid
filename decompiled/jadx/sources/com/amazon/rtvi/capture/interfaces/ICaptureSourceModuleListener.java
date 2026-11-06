package com.amazon.rtvi.capture.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.amazon.rtvi.capture.model.FrameData;
import com.amazon.rtvi.capture.model.FrameMetadata;
import com.amazon.rtvi.capture.model.RtviError;
import com.amazon.rtvi.capture.model.SessionData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface ICaptureSourceModuleListener extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener";

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

    void onCaptureStarted(SessionData sessionData) throws RemoteException;

    void onCaptureStopped(String str) throws RemoteException;

    void onCorrelationIdGenerationSignal() throws RemoteException;

    void onError(RtviError rtviError) throws RemoteException;

    void onExpectVisualContext(int i) throws RemoteException;

    void onFrameCaptured(FrameData frameData) throws RemoteException;

    void onFrameMetadata(FrameMetadata frameMetadata) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements ICaptureSourceModuleListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
        public void onCorrelationIdGenerationSignal() throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
        public void onCaptureStarted(SessionData sessionData) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
        public void onCaptureStopped(String str) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
        public void onError(RtviError rtviError) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
        public void onExpectVisualContext(int i) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
        public void onFrameCaptured(FrameData frameData) throws RemoteException {
        }

        @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
        public void onFrameMetadata(FrameMetadata frameMetadata) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ICaptureSourceModuleListener {
        static final int TRANSACTION_onCaptureStarted = 2;
        static final int TRANSACTION_onCaptureStopped = 3;
        static final int TRANSACTION_onCorrelationIdGenerationSignal = 6;
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onExpectVisualContext = 7;
        static final int TRANSACTION_onFrameCaptured = 4;
        static final int TRANSACTION_onFrameMetadata = 5;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ICaptureSourceModuleListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICaptureSourceModuleListener.DESCRIPTOR;
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
            public void onCaptureStarted(SessionData sessionData) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, sessionData, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
            public void onCaptureStopped(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleListener.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
            public void onCorrelationIdGenerationSignal() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleListener.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
            public void onError(RtviError rtviError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rtviError, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
            public void onExpectVisualContext(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
            public void onFrameCaptured(FrameData frameData) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, frameData, 0);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener
            public void onFrameMetadata(FrameMetadata frameMetadata) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICaptureSourceModuleListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, frameMetadata, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICaptureSourceModuleListener.DESCRIPTOR);
        }

        public static ICaptureSourceModuleListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICaptureSourceModuleListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICaptureSourceModuleListener)) ? new Proxy(iBinder) : (ICaptureSourceModuleListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICaptureSourceModuleListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICaptureSourceModuleListener.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onError((RtviError) _Parcel.readTypedObject(parcel, RtviError.CREATOR));
                    return true;
                case 2:
                    onCaptureStarted((SessionData) _Parcel.readTypedObject(parcel, SessionData.CREATOR));
                    return true;
                case 3:
                    onCaptureStopped(parcel.readString());
                    return true;
                case 4:
                    onFrameCaptured((FrameData) _Parcel.readTypedObject(parcel, FrameData.CREATOR));
                    return true;
                case 5:
                    onFrameMetadata((FrameMetadata) _Parcel.readTypedObject(parcel, FrameMetadata.CREATOR));
                    return true;
                case 6:
                    onCorrelationIdGenerationSignal();
                    return true;
                case 7:
                    onExpectVisualContext(parcel.readInt());
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
}
