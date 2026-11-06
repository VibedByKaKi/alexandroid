package com.amazon.leapfrogmapgl.indoor;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.res.AssetManager;
import android.util.Log;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.dee.app.contacts.common.constants.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001b\u0010\b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0000¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\u001c\u001a\u00020\tJ\u0011\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0005H\u0086 J\u0011\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0005H\u0086 J\u0019\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0086 J9\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020,H\u0086 J\u0011\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 J\u0011\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 J\u0011\u00100\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 J\u0011\u00101\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 J\u0011\u00102\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 J\u0011\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0005H\u0086 J\u0011\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u0005H\u0086 J\u0011\u00107\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 J!\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0086 J\u0011\u0010=\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 JY\u0010>\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020:2\u0006\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020:2\u0006\u0010H\u001a\u00020\tH\u0086 J\u0019\u0010I\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010J\u001a\u00020\tH\u0086 J\u0011\u0010O\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0086 J\u0011\u0010P\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0086 J\u0006\u0010S\u001a\u00020%J\u0019\u0010T\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010U\u001a\u00020\u0001H\u0086 J\u0019\u0010V\u001a\u00020\u00132\u0006\u0010W\u001a\u00020,2\u0006\u0010X\u001a\u00020,H\u0086 J\u0019\u0010Y\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010Z\u001a\u00020\u0001H\u0086 J\u0011\u0010[\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0005H\u0086 J\u0011\u0010\\\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0005H\u0086 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010K\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/NativeIndoorApp;", "", "<init>", "()V", Constants.LOG_TAG, "", "REQUIRED_GL_ES_VERSION", "", "supportsRequiredGlEs", "", "context", "Landroid/content/Context;", "readVersion", "Lkotlin/Function0;", "supportsRequiredGlEs$LeapfrogMapGLAndroid_release", "meetsRequiredGlEs", "version", "meetsRequiredGlEs$LeapfrogMapGLAndroid_release", "resetGlEsVersionForTest", "", "resetGlEsVersionForTest$LeapfrogMapGLAndroid_release", "glEsVersion", "Ljava/lang/Integer;", "readGlEsVersion", "value", "loaded", "getLoaded$LeapfrogMapGLAndroid_release", "()Z", "ensureLoaded", "nativeEnableLogFile", "path", "nativeSetGlTrace", "nativeSetBench", "enabled", "gpuSync", "nativeStart", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "", "assetManager", "Landroid/content/res/AssetManager;", "entry", "drawingWidth", "drawingHeight", "pixelRatio", "", "nativeSetLayout", "json", "nativeSetEndpoints", "nativeSetDeviceGroups", "nativeSetUserPreferences", "nativeSetMotionActiveCameras", "nativeSetTimeOfDay", "tod", "nativeSetDemoActors", "mode", "nativeSetSceneUpdate", "nativeSetFitZooms", "fitZoomFar", "", "fitZoomNear", "fitZoom", "nativeSetMapNavigation", "nativeRender", "mvp16", "", "viewportW", "viewportH", "zoom", "bearing", ResponseFields.PITCH, "timeSec", "anchorLat", "cameraMoving", "nativeStop", "releaseHost", "RENDER_OK", "RENDER_SKIPPED", "RENDER_FAILED", "RENDER_FREE", "nativeReleaseOwner", "nativePrepareBoot", "nextSceneOwner", "Ljava/util/concurrent/atomic/AtomicLong;", "newSceneOwner", "nativeInstallPinRasterizer", "rasterizer", "nativeInjectTap", "fx", "fy", "nativeInstallTapReporter", "reporter", "nativeInstallSurfaceConfig", "nativeSetAssetRoot", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeIndoorApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeIndoorApp.kt\ncom/amazon/leapfrogmapgl/indoor/NativeIndoorApp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
/* loaded from: classes5.dex */
public final class NativeIndoorApp {
    public static final int RENDER_FAILED = 2;
    public static final int RENDER_FREE = 3;
    public static final int RENDER_OK = 0;
    public static final int RENDER_SKIPPED = 1;
    private static final int REQUIRED_GL_ES_VERSION = 196608;

    @NotNull
    private static final String TAG = "FTV_NativeIndoor";

    @Nullable
    private static volatile Integer glEsVersion;
    private static volatile boolean loaded;

    @NotNull
    public static final NativeIndoorApp INSTANCE = new NativeIndoorApp();

    @NotNull
    private static final AtomicLong nextSceneOwner = new AtomicLong(0);

    private NativeIndoorApp() {
    }

    private final int readGlEsVersion(Context context) {
        ConfigurationInfo deviceConfigurationInfo;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return 0;
        }
        return deviceConfigurationInfo.reqGlEsVersion;
    }

    @JvmStatic
    public static final boolean supportsRequiredGlEs(@NotNull Context context) {
        context.getClass();
        return INSTANCE.supportsRequiredGlEs$LeapfrogMapGLAndroid_release(new NativeIndoorApp$$ExternalSyntheticLambda0(context, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int supportsRequiredGlEs$lambda$0(Context context) {
        return INSTANCE.readGlEsVersion(context);
    }

    public final synchronized boolean ensureLoaded() {
        boolean z = true;
        if (loaded) {
            return true;
        }
        try {
            System.loadLibrary("leapfrogindoorrenderer");
            loaded = true;
            Log.i(TAG, "libleapfrogindoorrenderer loaded");
            File root = SceneAssets.INSTANCE.getRoot();
            if (root != null) {
                NativeIndoorApp nativeIndoorApp = INSTANCE;
                String path = root.getPath();
                path.getClass();
                nativeIndoorApp.nativeSetAssetRoot(path);
            }
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "libleapfrogindoorrenderer missing", e);
            z = false;
        }
        return z;
    }

    public final boolean getLoaded$LeapfrogMapGLAndroid_release() {
        return loaded;
    }

    public final boolean meetsRequiredGlEs$LeapfrogMapGLAndroid_release(int version) {
        return version >= 196608;
    }

    public final native void nativeEnableLogFile(@NotNull String path);

    public final native void nativeInjectTap(float fx, float fy);

    public final native void nativeInstallPinRasterizer(long owner, @NotNull Object rasterizer);

    public final native void nativeInstallSurfaceConfig(@NotNull String json);

    public final native void nativeInstallTapReporter(long owner, @NotNull Object reporter);

    public final native void nativePrepareBoot(long owner);

    public final native void nativeReleaseOwner(long owner);

    public final native int nativeRender(long owner, @NotNull double[] mvp16, int viewportW, int viewportH, double zoom, double bearing, double pitch, float timeSec, double anchorLat, boolean cameraMoving);

    public final native void nativeSetAssetRoot(@NotNull String path);

    public final native void nativeSetBench(boolean enabled, boolean gpuSync);

    public final native void nativeSetDemoActors(@NotNull String mode);

    public final native void nativeSetDeviceGroups(@NotNull String json);

    public final native void nativeSetEndpoints(@NotNull String json);

    public final native void nativeSetFitZooms(double fitZoomFar, double fitZoomNear, double fitZoom);

    public final native void nativeSetGlTrace(@NotNull String path);

    public final native void nativeSetLayout(@NotNull String json);

    public final native void nativeSetMapNavigation(@NotNull String json);

    public final native void nativeSetMotionActiveCameras(@NotNull String json);

    public final native void nativeSetSceneUpdate(@NotNull String json);

    public final native void nativeSetTimeOfDay(@NotNull String tod);

    public final native void nativeSetUserPreferences(@NotNull String json);

    public final native boolean nativeStart(long owner, @NotNull AssetManager assetManager, @NotNull String entry, int drawingWidth, int drawingHeight, float pixelRatio);

    public final native void nativeStop(long owner, boolean releaseHost);

    public final long newSceneOwner() {
        return nextSceneOwner.incrementAndGet();
    }

    public final void resetGlEsVersionForTest$LeapfrogMapGLAndroid_release() {
        glEsVersion = null;
    }

    public final boolean supportsRequiredGlEs$LeapfrogMapGLAndroid_release(@NotNull Function0<Integer> readVersion) {
        int intValue;
        readVersion.getClass();
        Integer num = glEsVersion;
        if (num != null) {
            intValue = num.intValue();
        } else {
            Integer invoke = readVersion.invoke();
            int intValue2 = invoke.intValue();
            if (intValue2 != 0) {
                glEsVersion = Integer.valueOf(intValue2);
            }
            Log.i(TAG, String.format("FTV_GL_ES_VERSION 0x%08x (need 0x%08x)", Arrays.copyOf(new Object[]{Integer.valueOf(intValue2), 196608}, 2)));
            intValue = invoke.intValue();
        }
        return meetsRequiredGlEs$LeapfrogMapGLAndroid_release(intValue);
    }
}
