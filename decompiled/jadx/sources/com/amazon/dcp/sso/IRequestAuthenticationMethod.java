package com.amazon.dcp.sso;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface IRequestAuthenticationMethod extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.dcp.sso.IRequestAuthenticationMethod";

    String getAdpToken(String str, String str2) throws RemoteException;

    String getAdpTokenByDirectedId(String str) throws RemoteException;

    ReturnValueOrError getAuthenticationParametersForRequest(String str, String str2, String str3, Uri uri, String str4, Map map, byte[] bArr) throws RemoteException;

    ReturnValueOrError getAuthenticationParametersForRequestByDirectedId(String str, String str2, Uri uri, String str3, Map map, byte[] bArr) throws RemoteException;

    ReturnValueOrError signCorpus(String str, String str2, String str3, byte[] bArr) throws RemoteException;

    ReturnValueOrError signCorpusByDirectedId(String str, String str2, byte[] bArr) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements IRequestAuthenticationMethod {
        static final int TRANSACTION_getAdpToken = 3;
        static final int TRANSACTION_getAdpTokenByDirectedId = 6;
        static final int TRANSACTION_getAuthenticationParametersForRequest = 1;
        static final int TRANSACTION_getAuthenticationParametersForRequestByDirectedId = 4;
        static final int TRANSACTION_signCorpus = 2;
        static final int TRANSACTION_signCorpusByDirectedId = 5;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements IRequestAuthenticationMethod {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.dcp.sso.IRequestAuthenticationMethod
            public String getAdpToken(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRequestAuthenticationMethod.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IRequestAuthenticationMethod
            public String getAdpTokenByDirectedId(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRequestAuthenticationMethod.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.dcp.sso.IRequestAuthenticationMethod
            public ReturnValueOrError getAuthenticationParametersForRequest(String str, String str2, String str3, Uri uri, String str4, Map map, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRequestAuthenticationMethod.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str4);
                    obtain.writeMap(map);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    ReturnValueOrError createFromParcel = obtain2.readInt() != 0 ? ReturnValueOrError.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.amazon.dcp.sso.IRequestAuthenticationMethod
            public ReturnValueOrError getAuthenticationParametersForRequestByDirectedId(String str, String str2, Uri uri, String str3, Map map, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRequestAuthenticationMethod.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str3);
                    obtain.writeMap(map);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    ReturnValueOrError createFromParcel = obtain2.readInt() != 0 ? ReturnValueOrError.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return IRequestAuthenticationMethod.DESCRIPTOR;
            }

            @Override // com.amazon.dcp.sso.IRequestAuthenticationMethod
            public ReturnValueOrError signCorpus(String str, String str2, String str3, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRequestAuthenticationMethod.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    ReturnValueOrError createFromParcel = obtain2.readInt() != 0 ? ReturnValueOrError.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.amazon.dcp.sso.IRequestAuthenticationMethod
            public ReturnValueOrError signCorpusByDirectedId(String str, String str2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRequestAuthenticationMethod.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    ReturnValueOrError createFromParcel = obtain2.readInt() != 0 ? ReturnValueOrError.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IRequestAuthenticationMethod.DESCRIPTOR);
        }

        public static IRequestAuthenticationMethod asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRequestAuthenticationMethod.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRequestAuthenticationMethod)) ? new Proxy(iBinder) : (IRequestAuthenticationMethod) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRequestAuthenticationMethod.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRequestAuthenticationMethod.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    ReturnValueOrError authenticationParametersForRequest = getAuthenticationParametersForRequest(parcel.readString(), parcel.readString(), parcel.readString(), (Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()), parcel.createByteArray());
                    parcel2.writeNoException();
                    if (authenticationParametersForRequest != null) {
                        parcel2.writeInt(1);
                        authenticationParametersForRequest.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    ReturnValueOrError signCorpus = signCorpus(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    if (signCorpus != null) {
                        parcel2.writeInt(1);
                        signCorpus.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    String adpToken = getAdpToken(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(adpToken);
                    return true;
                case 4:
                    ReturnValueOrError authenticationParametersForRequestByDirectedId = getAuthenticationParametersForRequestByDirectedId(parcel.readString(), parcel.readString(), (Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()), parcel.createByteArray());
                    parcel2.writeNoException();
                    if (authenticationParametersForRequestByDirectedId != null) {
                        parcel2.writeInt(1);
                        authenticationParametersForRequestByDirectedId.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    ReturnValueOrError signCorpusByDirectedId = signCorpusByDirectedId(parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    if (signCorpusByDirectedId != null) {
                        parcel2.writeInt(1);
                        signCorpusByDirectedId.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    String adpTokenByDirectedId = getAdpTokenByDirectedId(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(adpTokenByDirectedId);
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
