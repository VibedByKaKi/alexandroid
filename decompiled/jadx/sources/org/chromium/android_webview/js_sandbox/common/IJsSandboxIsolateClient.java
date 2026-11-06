package org.chromium.android_webview.js_sandbox.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes11.dex */
public interface IJsSandboxIsolateClient extends IInterface {
    public static final String DESCRIPTOR = "org$chromium$android_webview$js_sandbox$common$IJsSandboxIsolateClient".replace('$', '.');
    public static final int TERMINATE_MEMORY_LIMIT_EXCEEDED = 3;
    public static final int TERMINATE_SANDBOX_DEAD = 2;
    public static final int TERMINATE_UNKNOWN_ERROR = 1;
    public static final int VERSION = 1;

    int getInterfaceVersion() throws RemoteException;

    void onTerminated(int i, String str) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IJsSandboxIsolateClient {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onTerminated = 2;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IJsSandboxIsolateClient {
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
                return IJsSandboxIsolateClient.DESCRIPTOR;
            }

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateClient
            public int getInterfaceVersion() throws RemoteException {
                if (this.mCachedVersion == -1) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IJsSandboxIsolateClient.DESCRIPTOR);
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

            @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateClient
            public void onTerminated(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IJsSandboxIsolateClient.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0)) {
                        throw new RemoteException("Method onTerminated is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IJsSandboxIsolateClient.DESCRIPTOR);
        }

        public static IJsSandboxIsolateClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IJsSandboxIsolateClient.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IJsSandboxIsolateClient)) ? new Proxy(iBinder) : (IJsSandboxIsolateClient) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IJsSandboxIsolateClient.DESCRIPTOR;
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
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onTerminated(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Default implements IJsSandboxIsolateClient {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateClient
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateClient
        public void onTerminated(int i, String str) throws RemoteException {
        }
    }
}
