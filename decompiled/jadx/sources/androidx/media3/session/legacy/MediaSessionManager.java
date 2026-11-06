package androidx.media3.session.legacy;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.session.MediaSessionManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import androidx.media3.common.util.UnstableApi;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@UnstableApi
/* loaded from: classes14.dex */
public final class MediaSessionManager {

    @Nullable
    private static volatile MediaSessionManager sSessionManager;
    MediaSessionManagerImpl mImpl;
    static final String TAG = "MediaSessionManager";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final Object sLock = new Object();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MediaSessionManagerImpl {
        Context getContext();

        boolean isTrustedForMediaControl(RemoteUserInfoImpl remoteUserInfoImpl);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(21)
    public static class MediaSessionManagerImplApi21 extends MediaSessionManagerImplBase {
        public MediaSessionManagerImplApi21(Context context) {
            super(context);
            this.mContext = context;
        }

        private boolean hasMediaControlPermission(RemoteUserInfoImpl remoteUserInfoImpl) {
            return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase, androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public boolean isTrustedForMediaControl(RemoteUserInfoImpl remoteUserInfoImpl) {
            return hasMediaControlPermission(remoteUserInfoImpl) || super.isTrustedForMediaControl(remoteUserInfoImpl);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaSessionManagerImplBase implements MediaSessionManagerImpl {
        private static final boolean DEBUG = MediaSessionManager.DEBUG;
        private static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
        private static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
        private static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
        private static final String TAG = "MediaSessionManager";
        ContentResolver mContentResolver;
        Context mContext;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class RemoteUserInfoImplBase implements RemoteUserInfoImpl {
            private String mPackageName;
            private int mPid;
            private int mUid;

            public RemoteUserInfoImplBase(String str, int i, int i2) {
                this.mPackageName = str;
                this.mPid = i;
                this.mUid = i2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RemoteUserInfoImplBase)) {
                    return false;
                }
                RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
                return (this.mPid < 0 || remoteUserInfoImplBase.mPid < 0) ? TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mUid == remoteUserInfoImplBase.mUid : TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mPid == remoteUserInfoImplBase.mPid && this.mUid == remoteUserInfoImplBase.mUid;
            }

            @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
            public String getPackageName() {
                return this.mPackageName;
            }

            @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
            public int getPid() {
                return this.mPid;
            }

            @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
            public int getUid() {
                return this.mUid;
            }

            public int hashCode() {
                return ObjectsCompat.hash(this.mPackageName, Integer.valueOf(this.mUid));
            }
        }

        public MediaSessionManagerImplBase(Context context) {
            this.mContext = context;
            this.mContentResolver = context.getContentResolver();
        }

        private boolean isPermissionGranted(RemoteUserInfoImpl remoteUserInfoImpl, String str) {
            int pid = remoteUserInfoImpl.getPid();
            Context context = this.mContext;
            return pid < 0 ? context.getPackageManager().checkPermission(str, remoteUserInfoImpl.getPackageName()) == 0 : context.checkPermission(str, remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public Context getContext() {
            return this.mContext;
        }

        public boolean isEnabledNotificationListener(RemoteUserInfoImpl remoteUserInfoImpl) {
            String string = Settings.Secure.getString(this.mContentResolver, ENABLED_NOTIFICATION_LISTENERS);
            if (string != null) {
                for (String str : string.split(":")) {
                    ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                    if (unflattenFromString != null && unflattenFromString.getPackageName().equals(remoteUserInfoImpl.getPackageName())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public boolean isTrustedForMediaControl(RemoteUserInfoImpl remoteUserInfoImpl) {
            try {
                if (this.mContext.getPackageManager().getApplicationInfo(remoteUserInfoImpl.getPackageName(), 0) == null) {
                    return false;
                }
                return isPermissionGranted(remoteUserInfoImpl, PERMISSION_STATUS_BAR_SERVICE) || isPermissionGranted(remoteUserInfoImpl, PERMISSION_MEDIA_CONTENT_CONTROL) || remoteUserInfoImpl.getUid() == 1000 || isEnabledNotificationListener(remoteUserInfoImpl);
            } catch (PackageManager.NameNotFoundException unused) {
                if (DEBUG) {
                    remoteUserInfoImpl.getPackageName();
                }
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RemoteUserInfoImpl {
        String getPackageName();

        int getPid();

        int getUid();
    }

    private MediaSessionManager(Context context) {
        this.mImpl = new MediaSessionManagerImplApi28(context);
    }

    public static MediaSessionManager getSessionManager(Context context) {
        MediaSessionManager mediaSessionManager;
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context cannot be null");
            return null;
        }
        synchronized (sLock) {
            try {
                if (sSessionManager == null) {
                    sSessionManager = new MediaSessionManager(context.getApplicationContext());
                }
                mediaSessionManager = sSessionManager;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaSessionManager;
    }

    public Context getContext() {
        return this.mImpl.getContext();
    }

    public boolean isTrustedForMediaControl(RemoteUserInfo remoteUserInfo) {
        if (remoteUserInfo != null) {
            return this.mImpl.isTrustedForMediaControl(remoteUserInfo.mImpl);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("userInfo should not be null");
        return false;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(28)
    public static final class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {

        @Nullable
        android.media.session.MediaSessionManager mObject;

        public MediaSessionManagerImplApi28(Context context) {
            super(context);
            this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi21, androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase, androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public boolean isTrustedForMediaControl(RemoteUserInfoImpl remoteUserInfoImpl) {
            return super.isTrustedForMediaControl(remoteUserInfoImpl);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @RequiresApi(28)
        public static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
            final MediaSessionManager.RemoteUserInfo mObject;

            public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
                super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
                this.mObject = remoteUserInfo;
            }

            public static String getPackageName(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
                return remoteUserInfo.getPackageName();
            }

            public RemoteUserInfoImplApi28(String str, int i, int i2) {
                super(str, i, i2);
                this.mObject = new MediaSessionManager.RemoteUserInfo(str, i, i2);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemoteUserInfo {
        public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
        public static final int UNKNOWN_PID = -1;
        public static final int UNKNOWN_UID = -1;
        RemoteUserInfoImpl mImpl;

        @RequiresApi(28)
        public RemoteUserInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName = MediaSessionManagerImplApi28.RemoteUserInfoImplApi28.getPackageName(remoteUserInfo);
            if (packageName == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("package shouldn't be null");
                throw null;
            }
            if (TextUtils.isEmpty(packageName)) {
                Single$$ExternalSyntheticBUOutline0.m$3("packageName should be nonempty");
                throw null;
            }
            this.mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(remoteUserInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfo) {
                return this.mImpl.equals(((RemoteUserInfo) obj).mImpl);
            }
            return false;
        }

        public String getPackageName() {
            return this.mImpl.getPackageName();
        }

        public int getPid() {
            return this.mImpl.getPid();
        }

        public int getUid() {
            return this.mImpl.getUid();
        }

        public int hashCode() {
            return this.mImpl.hashCode();
        }

        public RemoteUserInfo(@Nullable String str, int i, int i2) {
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    this.mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i, i2);
                    return;
                } else {
                    Single$$ExternalSyntheticBUOutline0.m$3("packageName should be nonempty");
                    throw null;
                }
            }
            Single$$ExternalSyntheticBUOutline0.m$1("package shouldn't be null");
            throw null;
        }
    }
}
