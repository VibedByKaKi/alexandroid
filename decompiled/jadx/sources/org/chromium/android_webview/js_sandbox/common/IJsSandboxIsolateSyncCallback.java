package org.chromium.android_webview.js_sandbox.common;

import android.content.res.AssetFileDescriptor;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes11.dex */
public interface IJsSandboxIsolateSyncCallback extends IInterface {
    public static final String DESCRIPTOR = "org$chromium$android_webview$js_sandbox$common$IJsSandboxIsolateSyncCallback".replace('$', '.');
    public static final int FILE_DESCRIPTOR_IO_ERROR = 2;
    public static final int JS_EVALUATION_ERROR = 0;
    public static final int MEMORY_LIMIT_EXCEEDED = 1;
    public static final int VERSION = 1;

    int getInterfaceVersion() throws RemoteException;

    void reportErrorWithFd(int i, AssetFileDescriptor assetFileDescriptor) throws RemoteException;

    void reportResultWithFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IJsSandboxIsolateSyncCallback {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_reportErrorWithFd = 4;
        static final int TRANSACTION_reportResultWithFd = 3;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IJsSandboxIsolateSyncCallback {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IJsSandboxIsolateSyncCallback.DESCRIPTOR;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateSyncCallback
            public int getInterfaceVersion() throws RemoteException {
                if (this.mCachedVersion == -1) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IJsSandboxIsolateSyncCallback.DESCRIPTOR);
                        this.mRemote.transact(16777215, obtain, obtain2, 0);
                        obtain2.readException();
                        this.mCachedVersion = obtain2.readInt();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateSyncCallback
            public void reportErrorWithFd(int i, AssetFileDescriptor assetFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolateSyncCallback.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(assetFileDescriptor, 0);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0)) {
                        throw new RemoteException("Method reportErrorWithFd is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateSyncCallback
            public void reportResultWithFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolateSyncCallback.DESCRIPTOR);
                    obtain.writeTypedObject(assetFileDescriptor, 0);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0)) {
                        throw new RemoteException("Method reportResultWithFd is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IJsSandboxIsolateSyncCallback.DESCRIPTOR);
        }

        public static IJsSandboxIsolateSyncCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IJsSandboxIsolateSyncCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IJsSandboxIsolateSyncCallback)) ? new Proxy(iBinder) : (IJsSandboxIsolateSyncCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IJsSandboxIsolateSyncCallback.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 16777215) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            if (i == 3) {
                reportResultWithFd((AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                reportErrorWithFd(parcel.readInt(), (AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IJsSandboxIsolateSyncCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateSyncCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateSyncCallback
        public void reportResultWithFd(AssetFileDescriptor assetFileDescriptor) throws RemoteException {
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateSyncCallback
        public void reportErrorWithFd(int i, AssetFileDescriptor assetFileDescriptor) throws RemoteException {
        }
    }
}
