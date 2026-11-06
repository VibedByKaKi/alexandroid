package com.amazon.mmcvs.aidl;

import android.graphics.RectF;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IFollowMeCameraListener extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.mmcvs.aidl.IFollowMeCameraListener";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
        /* renamed from: -$$Nest$smreadTypedObject, reason: not valid java name */
        public static /* bridge */ /* synthetic */ Object m22759$$Nest$smreadTypedObject(Parcel parcel) {
            return readTypedObject(parcel, RectF.CREATOR);
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

    void onNewROIAvailable(RectF rectF) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IFollowMeCameraListener {
        static final int TRANSACTION_onNewROIAvailable = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IFollowMeCameraListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IFollowMeCameraListener.DESCRIPTOR;
            }

            @Override // com.amazon.mmcvs.aidl.IFollowMeCameraListener
            public void onNewROIAvailable(RectF rectF) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFollowMeCameraListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, rectF, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IFollowMeCameraListener.DESCRIPTOR);
        }

        public static IFollowMeCameraListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IFollowMeCameraListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IFollowMeCameraListener)) ? new Proxy(iBinder) : (IFollowMeCameraListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IFollowMeCameraListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IFollowMeCameraListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Parcelable.Creator creator = RectF.CREATOR;
            onNewROIAvailable((RectF) _Parcel.m22759$$Nest$smreadTypedObject(parcel));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IFollowMeCameraListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.mmcvs.aidl.IFollowMeCameraListener
        public void onNewROIAvailable(RectF rectF) throws RemoteException {
        }
    }
}
