package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.ArrayMap;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.core.util.Pair;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@UnstableApi
/* loaded from: classes14.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    private static final float EPSILON = 1.0E-5f;
    public static final String KEY_MEDIA_ITEM = "media_item";
    public static final String KEY_SEARCH_RESULTS = "search_results";
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";

    @Nullable
    ConnectionRecord mCurConnection;
    private MediaBrowserServiceImpl mImpl;

    @Nullable
    MediaSessionCompat.Token mSession;
    static final String TAG = "MBServiceCompat";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private final ServiceBinderImpl mServiceBinderImpl = new ServiceBinderImpl();
    final ConnectionRecord mConnectionFromFwk = new ConnectionRecord("android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<ConnectionRecord> mPendingConnections = new ArrayList<>();
    final ArrayMap<IBinder, ConnectionRecord> mConnections = new ArrayMap<>();
    final ServiceHandler mHandler = new ServiceHandler(this);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";

        @Deprecated
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";

        @Nullable
        private final Bundle mExtras;
        private final String mRootId;

        public BrowserRoot(String str, @Nullable Bundle bundle) {
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
                throw null;
            }
            this.mRootId = str;
            this.mExtras = bundle;
        }

        @Nullable
        public Bundle getExtras() {
            return this.mExtras;
        }

        public String getRootId() {
            return this.mRootId;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ConnectionRecord implements IBinder.DeathRecipient {
        public final MediaSessionManager.RemoteUserInfo browserInfo;

        @Nullable
        public final ServiceCallbacks callbacks;
        public final int pid;

        @Nullable
        public final String pkg;

        @Nullable
        public BrowserRoot root;

        @Nullable
        public final Bundle rootHints;
        public final HashMap<String, List<Pair<IBinder, Bundle>>> subscriptions = new HashMap<>();
        public final int uid;

        public ConnectionRecord(@Nullable String str, int i, int i2, @Nullable Bundle bundle, @Nullable ServiceCallbacks serviceCallbacks) {
            this.pkg = str;
            this.pid = i;
            this.uid = i2;
            this.browserInfo = new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.rootHints = bundle;
            this.callbacks = serviceCallbacks;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = ConnectionRecord.this;
                    MediaBrowserServiceCompat.this.mConnections.remove(((ServiceCallbacks) Assertions.checkNotNull(connectionRecord.callbacks)).asBinder());
                }
            });
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MediaBrowserServiceImpl {
        @Nullable
        Bundle getBrowserRootHints();

        MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle);

        void notifyChildrenChanged(String str, @Nullable Bundle bundle);

        @Nullable
        IBinder onBind(Intent intent);

        void onCreate();

        void setSessionToken(MediaSessionCompat.Token token);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(23)
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            public MediaBrowserServiceApi23(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                MediaBrowserServiceImplApi23.this.onLoadItem(str, new ResultWrapper<>(result));
            }
        }

        public MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.mServiceFwk = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }

        public void onLoadItem(String str, final ResultWrapper<Parcel> resultWrapper) {
            Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    resultWrapper.sendResult(obtain);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadItem(str, result);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(26)
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public MediaBrowserServiceApi26(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                mediaBrowserServiceImplApi26.onLoadChildren(str, new ResultWrapper<>(result), bundle);
                MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        @Nullable
        public Bundle getBrowserRootHints() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ConnectionRecord connectionRecord = mediaBrowserServiceCompat.mCurConnection;
            if (connectionRecord == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (connectionRecord == mediaBrowserServiceCompat.mConnectionFromFwk) {
                return ((MediaBrowserService) Assertions.checkNotNull(this.mServiceFwk)).getBrowserRootHints();
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        public void notifyChildrenChangedForFramework(String str, @Nullable Bundle bundle) {
            if (bundle != null) {
                ((MediaBrowserService) Assertions.checkNotNull(this.mServiceFwk)).notifyChildrenChanged(str, bundle);
            } else {
                super.notifyChildrenChangedForFramework(str, bundle);
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.mServiceFwk = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }

        public void onLoadChildren(String str, final ResultWrapper<List<Parcel>> resultWrapper, final Bundle bundle) {
            Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                    if (list == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    if ((getFlags() & 1) != 0) {
                        list = MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                    }
                    ArrayList arrayList = new ArrayList(list == null ? 0 : list.size());
                    if (list != null) {
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result, bundle);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(28)
    public class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        public MediaBrowserServiceImplApi28() {
            super();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ConnectionRecord connectionRecord = mediaBrowserServiceCompat.mCurConnection;
            if (connectionRecord != null) {
                return connectionRecord == mediaBrowserServiceCompat.mConnectionFromFwk ? new MediaSessionManager.RemoteUserInfo(((MediaBrowserService) Assertions.checkNotNull(this.mServiceFwk)).getCurrentBrowserInfo()) : connectionRecord.browserInfo;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(21)
    public static class ResultWrapper<T> {
        MediaBrowserService.Result mResultFwk;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.mResultFwk = result;
        }

        public void detach() {
            this.mResultFwk.detach();
        }

        @Nullable
        public List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void sendResult(@Nullable T t) {
            if (t instanceof List) {
                this.mResultFwk.sendResult(parcelListToItemList((List) t));
                return;
            }
            if (!(t instanceof Parcel)) {
                this.mResultFwk.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            this.mResultFwk.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ServiceBinderImpl {
        public ServiceBinderImpl() {
        }

        public void addSubscription(@Nullable final String str, @Nullable final IBinder iBinder, @Nullable final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.addSubscription(str, connectionRecord, iBinder, bundle);
                    } else {
                        AppLaunchChecker$$ExternalSyntheticOutline0.m(str, MediaBrowserServiceCompat.TAG, new StringBuilder("addSubscription for callback that isn't registered id="));
                    }
                }
            });
        }

        public void connect(@Nullable final String str, final int i, final int i2, @Nullable final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            if (MediaBrowserServiceCompat.this.isValidPackage(str, i2)) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IBinder asBinder = serviceCallbacks.asBinder();
                        MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                        ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(str, i, i2, bundle, serviceCallbacks);
                        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                        mediaBrowserServiceCompat.mCurConnection = connectionRecord;
                        BrowserRoot onGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i2, bundle);
                        connectionRecord.root = onGetRoot;
                        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                        mediaBrowserServiceCompat2.mCurConnection = null;
                        if (onGetRoot == null) {
                            Log.i(MediaBrowserServiceCompat.TAG, "No root for client " + str + " from service " + getClass().getName());
                            try {
                                serviceCallbacks.onConnectFailed();
                                return;
                            } catch (RemoteException unused) {
                                AppLaunchChecker$$ExternalSyntheticOutline0.m(str, MediaBrowserServiceCompat.TAG, new StringBuilder("Calling onConnectFailed() failed. Ignoring. pkg="));
                                return;
                            }
                        }
                        try {
                            mediaBrowserServiceCompat2.mConnections.put(asBinder, connectionRecord);
                            asBinder.linkToDeath(connectionRecord, 0);
                            if (MediaBrowserServiceCompat.this.mSession != null) {
                                serviceCallbacks.onConnect(onGetRoot.getRootId(), MediaBrowserServiceCompat.this.mSession, onGetRoot.getExtras());
                            }
                        } catch (RemoteException unused2) {
                            AppLaunchChecker$$ExternalSyntheticOutline0.m(str, MediaBrowserServiceCompat.TAG, new StringBuilder("Calling onConnect() failed. Dropping client. pkg="));
                            MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                        }
                    }
                });
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(i2, "Package/uid mismatch: uid=", " package=", str));
            }
        }

        public void disconnect(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord remove = MediaBrowserServiceCompat.this.mConnections.remove(serviceCallbacks.asBinder());
                    if (remove != null) {
                        ((ServiceCallbacks) Assertions.checkNotNull(remove.callbacks)).asBinder().unlinkToDeath(remove, 0);
                    }
                }
            });
        }

        public void getMediaItem(@Nullable final String str, @Nullable final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.performLoadItem(str, connectionRecord, resultReceiver);
                    } else {
                        AppLaunchChecker$$ExternalSyntheticOutline0.m(str, MediaBrowserServiceCompat.TAG, new StringBuilder("getMediaItem for callback that isn't registered id="));
                    }
                }
            });
        }

        public void registerCallbacks(final ServiceCallbacks serviceCallbacks, @Nullable final String str, final int i, final int i2, @Nullable final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord;
                    IBinder asBinder = serviceCallbacks.asBinder();
                    MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                    Iterator<ConnectionRecord> it2 = MediaBrowserServiceCompat.this.mPendingConnections.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ConnectionRecord next = it2.next();
                        if (next.uid == i2) {
                            connectionRecord = (TextUtils.isEmpty(str) || i <= 0) ? MediaBrowserServiceCompat.this.new ConnectionRecord(next.pkg, next.pid, next.uid, bundle, serviceCallbacks) : null;
                            it2.remove();
                        }
                    }
                    if (connectionRecord == null) {
                        connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(str, i, i2, bundle, serviceCallbacks);
                    }
                    MediaBrowserServiceCompat.this.mConnections.put(asBinder, connectionRecord);
                    try {
                        asBinder.linkToDeath(connectionRecord, 0);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserServiceCompat.TAG, "IBinder is already dead.");
                    }
                }
            });
        }

        public void removeSubscription(@Nullable final String str, @Nullable final IBinder iBinder, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        AppLaunchChecker$$ExternalSyntheticOutline0.m(str, MediaBrowserServiceCompat.TAG, new StringBuilder("removeSubscription for callback that isn't registered id="));
                    } else {
                        if (MediaBrowserServiceCompat.this.removeSubscription(str, connectionRecord, iBinder)) {
                            return;
                        }
                        a$$ExternalSyntheticOutline0.m(new StringBuilder("removeSubscription called for "), str, " which is not subscribed", MediaBrowserServiceCompat.TAG);
                    }
                }
            });
        }

        public void search(@Nullable final String str, @Nullable final Bundle bundle, @Nullable final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.performSearch(str, bundle, connectionRecord, resultReceiver);
                    } else {
                        AppLaunchChecker$$ExternalSyntheticOutline0.m(str, MediaBrowserServiceCompat.TAG, new StringBuilder("search for callback that isn't registered query="));
                    }
                }
            });
        }

        public void sendCustomAction(@Nullable final String str, @Nullable final Bundle bundle, @Nullable final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.performCustomAction(str, bundle, connectionRecord, resultReceiver);
                        return;
                    }
                    Log.w(MediaBrowserServiceCompat.TAG, "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                }
            });
        }

        public void unregisterCallbacks(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    IBinder asBinder = serviceCallbacks.asBinder();
                    ConnectionRecord remove = MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                    if (remove != null) {
                        asBinder.unlinkToDeath(remove, 0);
                    }
                }
            });
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String str, @Nullable MediaSessionCompat.Token token, @Nullable Bundle bundle) throws RemoteException;

        void onConnectFailed() throws RemoteException;

        void onLoadChildren(@Nullable String str, @Nullable List<MediaBrowserCompat.MediaItem> list, @Nullable Bundle bundle, @Nullable Bundle bundle2) throws RemoteException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger mCallbacks;

        public ServiceCallbacksCompat(Messenger messenger) {
            this.mCallbacks = messenger;
        }

        private void sendRequest(int i, @Nullable Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            if (bundle != null) {
                obtain.setData(bundle);
            }
            this.mCallbacks.send(obtain);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.mCallbacks.getBinder();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(String str, @Nullable MediaSessionCompat.Token token, @Nullable Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", LegacyParcelableUtil.convert(token, MediaSessionCompat.Token.CREATOR));
            bundle2.putBundle("data_root_hints", bundle);
            sendRequest(1, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() throws RemoteException {
            sendRequest(2, null);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(@Nullable String str, @Nullable List<MediaBrowserCompat.MediaItem> list, @Nullable Bundle bundle, @Nullable Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", LegacyParcelableUtil.convertList(list, MediaBrowserCompat.MediaItem.CREATOR));
            }
            sendRequest(3, bundle3);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ServiceHandler extends Handler {

        @Nullable
        private MediaBrowserServiceCompat mService;

        @MainThread
        public ServiceHandler(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.mService = mediaBrowserServiceCompat;
        }

        @Override // android.os.Handler
        @MainThread
        public void handleMessage(Message message) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.mService;
            if (mediaBrowserServiceCompat != null) {
                mediaBrowserServiceCompat.handleMessageInternal(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        public void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @MainThread
        public void release() {
            this.mService = null;
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader((ClassLoader) Assertions.checkNotNull(MediaBrowserCompat.class.getClassLoader()));
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void addSubscription(@Nullable String str, ConnectionRecord connectionRecord, @Nullable IBinder iBinder, @Nullable Bundle bundle) {
        List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (Pair<IBinder, Bundle> pair : list) {
            if (iBinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, pair.second)) {
                return;
            }
        }
        list.add(new Pair<>(iBinder, bundle));
        connectionRecord.subscriptions.put(str, list);
        performLoadChildren(str, connectionRecord, bundle, null);
        this.mCurConnection = connectionRecord;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    @Nullable
    public List<MediaBrowserCompat.MediaItem> applyOptions(@Nullable List<MediaBrowserCompat.MediaItem> list, @Nullable Bundle bundle) {
        if (list == null) {
            return null;
        }
        if (bundle != null) {
            int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
            int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
            if (i != -1 || i2 != -1) {
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }
        }
        return list;
    }

    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    @Nullable
    public final Bundle getBrowserRootHints() {
        return ((MediaBrowserServiceImpl) Assertions.checkNotNull(this.mImpl)).getBrowserRootHints();
    }

    public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        return ((MediaBrowserServiceImpl) Assertions.checkNotNull(this.mImpl)).getCurrentBrowserInfo();
    }

    @Nullable
    public MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    @SuppressLint({"RestrictedApi"})
    public void handleMessageInternal(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle);
                this.mServiceBinderImpl.connect(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new ServiceCallbacksCompat(message.replyTo));
                break;
            case 2:
                this.mServiceBinderImpl.disconnect(new ServiceCallbacksCompat(message.replyTo));
                break;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.ensureClassLoader(bundle2);
                this.mServiceBinderImpl.addSubscription(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2, new ServiceCallbacksCompat(message.replyTo));
                break;
            case 4:
                this.mServiceBinderImpl.removeSubscription(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), new ServiceCallbacksCompat(message.replyTo));
                break;
            case 5:
                this.mServiceBinderImpl.getMediaItem(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                break;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle3);
                this.mServiceBinderImpl.registerCallbacks(new ServiceCallbacksCompat(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                break;
            case 7:
                this.mServiceBinderImpl.unregisterCallbacks(new ServiceCallbacksCompat(message.replyTo));
                break;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                MediaSessionCompat.ensureClassLoader(bundle4);
                this.mServiceBinderImpl.search(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                break;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.ensureClassLoader(bundle5);
                this.mServiceBinderImpl.sendCustomAction(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                break;
            default:
                StringBuilder sb = new StringBuilder("Unhandled message: ");
                sb.append(message);
                sb.append("\n  Service version: 2\n  Client version: ");
                ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.arg1, sb);
                break;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isValidPackage(@Nullable String str, int i) {
        String[] packagesForUid;
        if (str == null || (packagesForUid = getPackageManager().getPackagesForUid(i)) == null) {
            return false;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
        if (remoteUserInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("remoteUserInfo cannot be null in notifyChildrenChanged");
            return;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            ((MediaBrowserServiceImpl) Assertions.checkNotNull(this.mImpl)).notifyChildrenChanged(remoteUserInfo, str, bundle);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("options cannot be null in notifyChildrenChanged");
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return ((MediaBrowserServiceImpl) Assertions.checkNotNull(this.mImpl)).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        MediaBrowserServiceImplApi28 mediaBrowserServiceImplApi28 = new MediaBrowserServiceImplApi28();
        this.mImpl = mediaBrowserServiceImplApi28;
        mediaBrowserServiceImplApi28.onCreate();
    }

    public void onCustomAction(String str, Bundle bundle, Result<Bundle> result) {
        result.sendError(null);
    }

    @Override // android.app.Service
    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mHandler.release();
    }

    @Nullable
    public abstract BrowserRoot onGetRoot(@Nullable String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@Nullable String str, Result<List<MediaBrowserCompat.MediaItem>> result);

    public void onLoadChildren(@Nullable String str, Result<List<MediaBrowserCompat.MediaItem>> result, Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, Result<MediaBrowserCompat.MediaItem> result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    public void onSearch(String str, @Nullable Bundle bundle, Result<List<MediaBrowserCompat.MediaItem>> result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    public void performCustomAction(String str, @Nullable Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<Bundle> result = new Result<Bundle>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.4
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onErrorSent(@Nullable Bundle bundle2) {
                resultReceiver.send(-1, bundle2);
            }

            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onProgressUpdateSent(@Nullable Bundle bundle2) {
                resultReceiver.send(1, bundle2);
            }

            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(@Nullable Bundle bundle2) {
                resultReceiver.send(0, bundle2);
            }
        };
        this.mCurConnection = connectionRecord;
        onCustomAction(str, bundle == null ? Bundle.EMPTY : bundle, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m$1("onCustomAction must call detach() or sendResult() or sendError() before returning for action=", str, " extras=", bundle);
    }

    public void performLoadChildren(@Nullable final String str, final ConnectionRecord connectionRecord, @Nullable final Bundle bundle, @Nullable final Bundle bundle2) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.1
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                ConnectionRecord connectionRecord2 = MediaBrowserServiceCompat.this.mConnections.get(((ServiceCallbacks) Assertions.checkNotNull(connectionRecord.callbacks)).asBinder());
                ConnectionRecord connectionRecord3 = connectionRecord;
                if (connectionRecord2 != connectionRecord3) {
                    if (MediaBrowserServiceCompat.DEBUG) {
                        String str2 = connectionRecord3.pkg;
                        return;
                    }
                    return;
                }
                if ((getFlags() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                }
                try {
                    connectionRecord.callbacks.onLoadChildren(str, list, bundle, bundle2);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder("Calling onLoadChildren() failed for id=");
                    sb.append(str);
                    sb.append(" package=");
                    AppLaunchChecker$$ExternalSyntheticOutline0.m(connectionRecord.pkg, MediaBrowserServiceCompat.TAG, sb);
                }
            }
        };
        this.mCurConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, result);
        } else {
            onLoadChildren(str, result, bundle);
        }
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), connectionRecord.pkg, " id=", str));
    }

    public void performLoadItem(String str, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.2
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            @SuppressLint({"RestrictedApi"})
            public void onResultSent(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
                if ((getFlags() & 2) != 0) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", LegacyParcelableUtil.convert(mediaItem, MediaBrowserCompat.MediaItem.CREATOR));
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onLoadItem(str, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("onLoadItem must call detach() or sendResult() before returning for id=", str));
    }

    public void performSearch(String str, @Nullable Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.3
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            @SuppressLint({"RestrictedApi"})
            public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                if ((getFlags() & 4) != 0 || list == null) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray("search_results", (Parcelable[]) LegacyParcelableUtil.convertList(list, MediaBrowserCompat.MediaItem.CREATOR).toArray(new MediaBrowserCompat.MediaItem[0]));
                resultReceiver.send(0, bundle2);
            }
        };
        this.mCurConnection = connectionRecord;
        onSearch(str, bundle, result);
        this.mCurConnection = null;
        if (result.isDone()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("onSearch must call detach() or sendResult() before returning for query=", str));
    }

    public boolean removeSubscription(@Nullable String str, ConnectionRecord connectionRecord, @Nullable IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
                if (list != null) {
                    Iterator<Pair<IBinder, Bundle>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (iBinder == it2.next().first) {
                            it2.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        connectionRecord.subscriptions.remove(str);
                    }
                }
            } else if (connectionRecord.subscriptions.remove(str) != null) {
                z = true;
            }
            return z;
        } finally {
            this.mCurConnection = connectionRecord;
            onUnsubscribe(str);
            this.mCurConnection = null;
        }
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Session token may not be null");
        } else if (this.mSession != null) {
            Single$$ExternalSyntheticBUOutline0.m$2("The session token has already been set");
        } else {
            this.mSession = token;
            ((MediaBrowserServiceImpl) Assertions.checkNotNull(this.mImpl)).setSessionToken(token);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(21)
    public class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl {
        Messenger mMessenger;
        final List<Bundle> mRootExtrasList = new ArrayList();
        MediaBrowserService mServiceFwk;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @RequiresApi(21)
        public class MediaBrowserServiceApi21 extends MediaBrowserService {
            public MediaBrowserServiceApi21(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @Nullable
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, @Nullable Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                BrowserRoot onGetRoot = MediaBrowserServiceImplApi21.this.onGetRoot(str, i, bundle == null ? null : new Bundle(bundle));
                if (onGetRoot == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(onGetRoot.mRootId, onGetRoot.mExtras);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceImplApi21.this.onLoadChildren(str, new ResultWrapper<>(result));
            }
        }

        public MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        @Nullable
        public Bundle getBrowserRootHints() {
            if (this.mMessenger == null) {
                return null;
            }
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mCurConnection;
            if (connectionRecord == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mCurConnection;
            if (connectionRecord != null) {
                return connectionRecord.browserInfo;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(String str, @Nullable Bundle bundle) {
            notifyChildrenChangedForFramework(str, bundle);
            notifyChildrenChangedForCompat(str, bundle);
        }

        public void notifyChildrenChangedForCompat(final String str, @Nullable final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.3
                @Override // java.lang.Runnable
                public void run() {
                    Iterator<IBinder> it2 = MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                    while (it2.hasNext()) {
                        MediaBrowserServiceImplApi21.this.notifyChildrenChangedForCompatOnHandler((ConnectionRecord) Assertions.checkNotNull(MediaBrowserServiceCompat.this.mConnections.get(it2.next())), str, bundle);
                    }
                }
            });
        }

        public void notifyChildrenChangedForCompatOnHandler(ConnectionRecord connectionRecord, String str, @Nullable Bundle bundle) {
            List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (Pair<IBinder, Bundle> pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, pair.second)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, pair.second, bundle);
                    }
                }
            }
        }

        public void notifyChildrenChangedForFramework(String str, @Nullable Bundle bundle) {
            ((MediaBrowserService) Assertions.checkNotNull(this.mServiceFwk)).notifyChildrenChanged(str);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            return ((MediaBrowserService) Assertions.checkNotNull(this.mServiceFwk)).onBind(intent);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi21 mediaBrowserServiceApi21 = new MediaBrowserServiceApi21(MediaBrowserServiceCompat.this);
            this.mServiceFwk = mediaBrowserServiceApi21;
            mediaBrowserServiceApi21.onCreate();
        }

        @Nullable
        public BrowserRoot onGetRoot(String str, int i, @Nullable Bundle bundle) {
            Bundle bundle2;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
                bundle2 = ErrorUtils$$ExternalSyntheticOutline0.m(2, "extra_service_version");
                bundle2.putBinder("extra_messenger", this.mMessenger.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.mSession;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    bundle2.putBinder("extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.mRootExtrasList.add(bundle2);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = connectionRecord;
            BrowserRoot onGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.mCurConnection = null;
            if (onGetRoot == null) {
                return null;
            }
            if (this.mMessenger != null) {
                mediaBrowserServiceCompat2.mPendingConnections.add(connectionRecord);
            }
            Bundle extras = onGetRoot.getExtras();
            if (bundle2 == null) {
                bundle2 = extras;
            } else if (extras != null) {
                bundle2.putAll(extras);
            }
            return new BrowserRoot(onGetRoot.getRootId(), bundle2);
        }

        public void onLoadChildren(String str, final ResultWrapper<List<Parcel>> resultWrapper) {
            Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.2
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                    ArrayList arrayList;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList2.add(obtain);
                        }
                        arrayList = arrayList2;
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.1
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserServiceImplApi21.this.setSessionTokenOnHandler(token);
                }
            });
        }

        public void setSessionTokenOnHandler(MediaSessionCompat.Token token) {
            if (!this.mRootExtrasList.isEmpty()) {
                IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    Iterator<Bundle> it2 = this.mRootExtrasList.iterator();
                    while (it2.hasNext()) {
                        it2.next().putBinder("extra_session_binder", extraBinder.asBinder());
                    }
                }
                this.mRootExtrasList.clear();
            }
            ((MediaBrowserService) Assertions.checkNotNull(this.mServiceFwk)).setSessionToken((MediaSession.Token) Assertions.checkNotNull((MediaSession.Token) token.getToken()));
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
            notifyChildrenChangedForCompat(remoteUserInfo, str, bundle);
        }

        public void notifyChildrenChangedForCompat(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.4
                @Override // java.lang.Runnable
                public void run() {
                    for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.getSize(); i++) {
                        ConnectionRecord valueAt = MediaBrowserServiceCompat.this.mConnections.valueAt(i);
                        if (valueAt.browserInfo.equals(remoteUserInfo)) {
                            MediaBrowserServiceImplApi21.this.notifyChildrenChangedForCompatOnHandler(valueAt, str, bundle);
                        }
                    }
                }
            });
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger mMessenger;

        public MediaBrowserServiceImplBase() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        @Nullable
        public Bundle getBrowserRootHints() {
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mCurConnection;
            if (connectionRecord == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mCurConnection;
            if (connectionRecord != null) {
                return connectionRecord.browserInfo;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final String str, @Nullable final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator<IBinder> it2 = MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                    while (it2.hasNext()) {
                        MediaBrowserServiceImplBase.this.notifyChildrenChangedOnHandler((ConnectionRecord) Assertions.checkNotNull(MediaBrowserServiceCompat.this.mConnections.get(it2.next())), str, bundle);
                    }
                }
            });
        }

        public void notifyChildrenChangedOnHandler(ConnectionRecord connectionRecord, String str, @Nullable Bundle bundle) {
            List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (Pair<IBinder, Bundle> pair : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, pair.second)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, pair.second, bundle);
                    }
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        @Nullable
        public IBinder onBind(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return ((Messenger) Assertions.checkNotNull(this.mMessenger)).getBinder();
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator<ConnectionRecord> it2 = MediaBrowserServiceCompat.this.mConnections.values().iterator();
                    while (it2.hasNext()) {
                        ConnectionRecord next = it2.next();
                        try {
                            BrowserRoot browserRoot = (BrowserRoot) Assertions.checkNotNull(next.root);
                            ((ServiceCallbacks) Assertions.checkNotNull(next.callbacks)).onConnect(browserRoot.getRootId(), token, browserRoot.getExtras());
                        } catch (RemoteException unused) {
                            Log.w(MediaBrowserServiceCompat.TAG, "Connection for " + next.pkg + " is no longer valid.");
                            it2.remove();
                        }
                    }
                }
            });
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.3
                @Override // java.lang.Runnable
                public void run() {
                    for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.getSize(); i++) {
                        ConnectionRecord valueAt = MediaBrowserServiceCompat.this.mConnections.valueAt(i);
                        if (valueAt.browserInfo.equals(remoteUserInfo)) {
                            MediaBrowserServiceImplBase.this.notifyChildrenChangedOnHandler(valueAt, str, bundle);
                            return;
                        }
                    }
                }
            });
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result<T> {

        @Nullable
        private final Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendResultCalled;

        public Result(@Nullable Object obj) {
            this.mDebug = obj;
        }

        private void checkExtraFields(@Nullable Bundle bundle) {
            if (bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                float f = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                if (f < -1.0E-5f || f > 1.00001f) {
                    Single$$ExternalSyntheticBUOutline0.m$3("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }

        public void detach() {
            if (this.mDetachCalled) {
                Single$$ExternalSyntheticBUOutline0.m(this.mDebug, "detach() called when detach() had already been called for: ");
                return;
            }
            if (this.mSendResultCalled) {
                Single$$ExternalSyntheticBUOutline0.m(this.mDebug, "detach() called when sendResult() had already been called for: ");
            } else if (this.mSendErrorCalled) {
                Single$$ExternalSyntheticBUOutline0.m(this.mDebug, "detach() called when sendError() had already been called for: ");
            } else {
                this.mDetachCalled = true;
            }
        }

        public int getFlags() {
            return this.mFlags;
        }

        public boolean isDone() {
            return this.mDetachCalled || this.mSendResultCalled || this.mSendErrorCalled;
        }

        public void onErrorSent(@Nullable Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.mDebug);
        }

        public void onProgressUpdateSent(@Nullable Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.mDebug);
        }

        public void sendError(@Nullable Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                Single$$ExternalSyntheticBUOutline0.m(this.mDebug, "sendError() called when either sendResult() or sendError() had already been called for: ");
            } else {
                this.mSendErrorCalled = true;
                onErrorSent(bundle);
            }
        }

        public void sendProgressUpdate(@Nullable Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                Single$$ExternalSyntheticBUOutline0.m(this.mDebug, "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
            } else {
                checkExtraFields(bundle);
                onProgressUpdateSent(bundle);
            }
        }

        public void sendResult(@Nullable T t) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                Single$$ExternalSyntheticBUOutline0.m(this.mDebug, "sendResult() called when either sendResult() or sendError() had already been called for: ");
            } else {
                this.mSendResultCalled = true;
                onResultSent(t);
            }
        }

        public void setFlags(int i) {
            this.mFlags = i;
        }

        public void onResultSent(@Nullable T t) {
        }
    }

    public void onUnsubscribe(@Nullable String str) {
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            ((MediaBrowserServiceImpl) Assertions.checkNotNull(this.mImpl)).notifyChildrenChanged(str, bundle);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("options cannot be null in notifyChildrenChanged");
        }
    }

    public void onSubscribe(@Nullable String str, @Nullable Bundle bundle) {
    }

    public void notifyChildrenChanged(String str) {
        if (str != null) {
            ((MediaBrowserServiceImpl) Assertions.checkNotNull(this.mImpl)).notifyChildrenChanged(str, null);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("parentId cannot be null in notifyChildrenChanged");
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
