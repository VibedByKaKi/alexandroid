package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.MediaSessionManagerImplApi28;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class MediaSessionManager {
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
    public interface RemoteUserInfoImpl {
        String getPackageName();

        int getPid();

        int getUid();
    }

    private MediaSessionManager(Context context) {
        this.mImpl = new MediaSessionManagerImplApi28(context);
    }

    @NonNull
    public static MediaSessionManager getSessionManager(@NonNull Context context) {
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

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfo remoteUserInfo) {
        if (remoteUserInfo != null) {
            return this.mImpl.isTrustedForMediaControl(remoteUserInfo.mImpl);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("userInfo should not be null");
        return false;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RemoteUserInfo {
        public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int UNKNOWN_PID = -1;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int UNKNOWN_UID = -1;
        RemoteUserInfoImpl mImpl;

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
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

        @NonNull
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

        public RemoteUserInfo(@NonNull String str, int i, int i2) {
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
