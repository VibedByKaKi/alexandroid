package amazon.speech.simclient.event;

import amazon.speech.simclient.event.IEventCallback;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface ISimClientEventServer extends IInterface {
    void addDeathEvent(EventMetadata eventMetadata, String str, IBinder iBinder) throws RemoteException;

    void clearDeathEvents(IBinder iBinder) throws RemoteException;

    void sendEvent(EventMetadata eventMetadata, String str, IEventCallback iEventCallback) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements ISimClientEventServer {
        private static final String DESCRIPTOR = "amazon.speech.simclient.event.ISimClientEventServer";
        static final int TRANSACTION_addDeathEvent = 2;
        static final int TRANSACTION_clearDeathEvents = 3;
        static final int TRANSACTION_sendEvent = 1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements ISimClientEventServer {
            public static ISimClientEventServer sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // amazon.speech.simclient.event.ISimClientEventServer
            public void addDeathEvent(EventMetadata eventMetadata, String str, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (eventMetadata != null) {
                        obtain.writeInt(1);
                        eventMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().addDeathEvent(eventMetadata, str, iBinder);
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // amazon.speech.simclient.event.ISimClientEventServer
            public void clearDeathEvents(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().clearDeathEvents(iBinder);
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // amazon.speech.simclient.event.ISimClientEventServer
            public void sendEvent(EventMetadata eventMetadata, String str, IEventCallback iEventCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (eventMetadata != null) {
                        obtain.writeInt(1);
                        eventMetadata.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iEventCallback != null ? iEventCallback.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().sendEvent(eventMetadata, str, iEventCallback);
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

        public static ISimClientEventServer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISimClientEventServer)) ? new Proxy(iBinder) : (ISimClientEventServer) queryLocalInterface;
        }

        public static ISimClientEventServer getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISimClientEventServer iSimClientEventServer) {
            if (Proxy.sDefaultImpl != null) {
                Single$$ExternalSyntheticBUOutline0.m$2("setDefaultImpl() called twice");
                return false;
            }
            if (iSimClientEventServer == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSimClientEventServer;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                sendEvent(parcel.readInt() != 0 ? EventMetadata.CREATOR.createFromParcel(parcel) : null, parcel.readString(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                addDeathEvent(parcel.readInt() != 0 ? EventMetadata.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readStrongBinder());
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                clearDeathEvents(parcel.readStrongBinder());
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
    public static class Default implements ISimClientEventServer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // amazon.speech.simclient.event.ISimClientEventServer
        public void clearDeathEvents(IBinder iBinder) throws RemoteException {
        }

        @Override // amazon.speech.simclient.event.ISimClientEventServer
        public void addDeathEvent(EventMetadata eventMetadata, String str, IBinder iBinder) throws RemoteException {
        }

        @Override // amazon.speech.simclient.event.ISimClientEventServer
        public void sendEvent(EventMetadata eventMetadata, String str, IEventCallback iEventCallback) throws RemoteException {
        }
    }
}
