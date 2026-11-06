package com.amazon.alexa.accessory.notificationpublisher.notificationlistener;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface INotificationListenerServiceBridge extends IInterface {
    public static final String DESCRIPTOR = "com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class _Parcel {
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

        private static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean cancelNotification(String str) throws RemoteException;

    boolean doesNotificationExistInStatusBar(String str) throws RemoteException;

    boolean doesNotificationSupportReply(String str) throws RemoteException;

    List<StatusBarNotification> getActiveNotificationsWithKeys(String[] strArr) throws RemoteException;

    int getInterruptionFilter() throws RemoteException;

    boolean isListenerConnected() throws RemoteException;

    boolean isReplyNotification(String str, String str2, String str3) throws RemoteException;

    void onDeviceConnectionChanged(boolean z) throws RemoteException;

    boolean sendReply(String str, String str2) throws RemoteException;

    void setApplicationRunning(boolean z) throws RemoteException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends Binder implements INotificationListenerServiceBridge {
        static final int TRANSACTION_cancelNotification = 10;
        static final int TRANSACTION_doesNotificationExistInStatusBar = 9;
        static final int TRANSACTION_doesNotificationSupportReply = 6;
        static final int TRANSACTION_getActiveNotificationsWithKeys = 5;
        static final int TRANSACTION_getInterruptionFilter = 2;
        static final int TRANSACTION_isListenerConnected = 1;
        static final int TRANSACTION_isReplyNotification = 8;
        static final int TRANSACTION_onDeviceConnectionChanged = 4;
        static final int TRANSACTION_sendReply = 7;
        static final int TRANSACTION_setApplicationRunning = 3;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy implements INotificationListenerServiceBridge {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public boolean cancelNotification(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public boolean doesNotificationExistInStatusBar(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public boolean doesNotificationSupportReply(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public List<StatusBarNotification> getActiveNotificationsWithKeys(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(StatusBarNotification.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return INotificationListenerServiceBridge.DESCRIPTOR;
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public int getInterruptionFilter() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public boolean isListenerConnected() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public boolean isReplyNotification(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public void onDeviceConnectionChanged(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public boolean sendReply(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
            public void setApplicationRunning(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationListenerServiceBridge.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationListenerServiceBridge.DESCRIPTOR);
        }

        public static INotificationListenerServiceBridge asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(INotificationListenerServiceBridge.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationListenerServiceBridge)) ? new Proxy(iBinder) : (INotificationListenerServiceBridge) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INotificationListenerServiceBridge.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INotificationListenerServiceBridge.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    boolean isListenerConnected = isListenerConnected();
                    parcel2.writeNoException();
                    parcel2.writeInt(isListenerConnected ? 1 : 0);
                    return true;
                case 2:
                    int interruptionFilter = getInterruptionFilter();
                    parcel2.writeNoException();
                    parcel2.writeInt(interruptionFilter);
                    return true;
                case 3:
                    setApplicationRunning(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onDeviceConnectionChanged(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    List<StatusBarNotification> activeNotificationsWithKeys = getActiveNotificationsWithKeys(parcel.createStringArray());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, activeNotificationsWithKeys, 1);
                    return true;
                case 6:
                    boolean doesNotificationSupportReply = doesNotificationSupportReply(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(doesNotificationSupportReply ? 1 : 0);
                    return true;
                case 7:
                    boolean sendReply = sendReply(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(sendReply ? 1 : 0);
                    return true;
                case 8:
                    boolean isReplyNotification = isReplyNotification(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isReplyNotification ? 1 : 0);
                    return true;
                case 9:
                    boolean doesNotificationExistInStatusBar = doesNotificationExistInStatusBar(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(doesNotificationExistInStatusBar ? 1 : 0);
                    return true;
                case 10:
                    boolean cancelNotification = cancelNotification(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(cancelNotification ? 1 : 0);
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
    public static class Default implements INotificationListenerServiceBridge {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public boolean cancelNotification(String str) throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public boolean doesNotificationExistInStatusBar(String str) throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public boolean doesNotificationSupportReply(String str) throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public List<StatusBarNotification> getActiveNotificationsWithKeys(String[] strArr) throws RemoteException {
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public int getInterruptionFilter() throws RemoteException {
            return 0;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public boolean isListenerConnected() throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public boolean isReplyNotification(String str, String str2, String str3) throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public boolean sendReply(String str, String str2) throws RemoteException {
            return false;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public void onDeviceConnectionChanged(boolean z) throws RemoteException {
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.notificationlistener.INotificationListenerServiceBridge
        public void setApplicationRunning(boolean z) throws RemoteException {
        }
    }
}
