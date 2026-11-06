package com.amazon.alexa.ra.rtvi;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.NotificationCompat;
import com.amazon.deecomms.common.network.AppUrl;
import com.dee.app.contacts.common.constants.Constants;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001b\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\"\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0016J\u0014\u0010%\u001a\u0004\u0018\u00010&2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J\u0018\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\"H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020 H\u0002J\u001a\u0010.\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0/H\u0002J\"\u00100\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0/2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u001eH\u0002J\b\u00104\u001a\u00020\u001eH\u0002J\b\u00105\u001a\u00020\u001eH\u0002J\b\u00106\u001a\u000207H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c¨\u00069"}, d2 = {"Lcom/amazon/alexa/ra/rtvi/ScreenCaptureService;", "Landroid/app/Service;", "<init>", "()V", "mediaProjection", "Landroid/media/projection/MediaProjection;", "virtualDisplay", "Landroid/hardware/display/VirtualDisplay;", "imageReader", "Landroid/media/ImageReader;", "reusableBitmap", "Landroid/graphics/Bitmap;", "reusableCroppedBitmap", "reusableJpegStream", "Ljava/io/ByteArrayOutputStream;", "captureThread", "Landroid/os/HandlerThread;", "captureHandler", "Landroid/os/Handler;", "lastFrameTime", "", "value", "Lcom/amazon/alexa/ra/rtvi/ScreenCaptureModule;", "activeModule", "getActiveModule", "()Lcom/amazon/alexa/ra/rtvi/ScreenCaptureModule;", "projectionCallback", "com/amazon/alexa/ra/rtvi/ScreenCaptureService$projectionCallback$1", "Lcom/amazon/alexa/ra/rtvi/ScreenCaptureService$projectionCallback$1;", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", AppUrl.ACMS.QueryParam.Keys.MESSAGE_START_ID, "onBind", "Landroid/os/IBinder;", "onDestroy", "startProjection", "resultCode", "data", "processImage", "reader", "width", "screenMetrics", "Lkotlin/Triple;", "metricsFrom", "windowContext", "Landroid/content/Context;", "releaseProjection", "startAsForeground", "createNotificationChannel", "buildNotification", "Landroid/app/Notification;", "Companion", "ui-rtvi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenCaptureService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenCaptureService.kt\ncom/amazon/alexa/ra/rtvi/ScreenCaptureService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n1#2:448\n*E\n"})
/* loaded from: classes18.dex */
public final class ScreenCaptureService extends Service {

    @NotNull
    private static final String CHANNEL_ID = "rtvi_screen_share_channel";
    private static final int DEFAULT_JPEG_BUFFER_BYTES = 524288;

    @NotNull
    public static final String EXTRA_RESULT_CODE = "com.amazon.alexa.ra.rtvi.extra.RESULT_CODE";

    @NotNull
    public static final String EXTRA_RESULT_DATA = "com.amazon.alexa.ra.rtvi.extra.RESULT_DATA";
    private static final long FRAME_THROTTLE_MS = 200;
    private static final int NOTIFICATION_ID = 3101;

    @NotNull
    private static final String TAG = "ScreenCaptureService";

    @Nullable
    private static volatile Function0<Unit> onExternalStop;

    @Nullable
    private static volatile ScreenCaptureService serviceInstance;
    private static volatile boolean stoppedByUser;

    @Nullable
    private volatile ScreenCaptureModule activeModule;

    @Nullable
    private Handler captureHandler;

    @Nullable
    private HandlerThread captureThread;

    @Nullable
    private ImageReader imageReader;
    private volatile long lastFrameTime;

    @Nullable
    private MediaProjection mediaProjection;

    @Nullable
    private Bitmap reusableBitmap;

    @Nullable
    private Bitmap reusableCroppedBitmap;

    @Nullable
    private VirtualDisplay virtualDisplay;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int JPEG_QUALITY = 80;

    @NotNull
    private static final PendingHandoff<ScreenCaptureModule> moduleHandoff = new PendingHandoff<>();

    @NotNull
    private final ByteArrayOutputStream reusableJpegStream = new ByteArrayOutputStream(524288);

    @NotNull
    private final ScreenCaptureService$projectionCallback$1 projectionCallback = new MediaProjection.Callback() { // from class: com.amazon.alexa.ra.rtvi.ScreenCaptureService$projectionCallback$1
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            boolean z;
            z = ScreenCaptureService.stoppedByUser;
            if (z) {
                Log.i("ScreenCaptureService", "MediaProjection stopped (app-initiated)");
            } else {
                Log.i("ScreenCaptureService", "MediaProjection stopped externally — notifying app");
                Function0<Unit> onExternalStop2 = ScreenCaptureService.INSTANCE.getOnExternalStop();
                if (onExternalStop2 != null) {
                    onExternalStop2.invoke();
                }
            }
            ScreenCaptureService.this.stopSelf();
        }
    };

    private final Notification buildNotification() {
        Notification build = new NotificationCompat.Builder(this, CHANNEL_ID).setContentTitle(getString(com.amazon.alexa.ra.core.R.string.ra_screen_share_notification_title)).setContentText(getString(com.amazon.alexa.ra.core.R.string.ra_screen_share_notification_text)).setSmallIcon(android.R.drawable.ic_menu_share).setContentIntent(PendingIntent.getActivity(this, 0, getPackageManager().getLaunchIntentForPackage(getPackageName()), 201326592)).setOngoing(true).setPriority(-1).build();
        build.getClass();
        return build;
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, getString(com.amazon.alexa.ra.core.R.string.ra_screen_share_channel_name), 2);
        notificationChannel.setDescription(getString(com.amazon.alexa.ra.core.R.string.ra_screen_share_channel_description));
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    private final Triple<Integer, Integer, Integer> metricsFrom(Context windowContext) {
        Rect bounds = ((WindowManager) windowContext.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new Triple<>(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()), Integer.valueOf(windowContext.getResources().getConfiguration().densityDpi));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void processImage(android.media.ImageReader r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "ScreenCaptureService"
            java.lang.String r1 = "Frame processing failed: "
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            android.media.Image r10 = r10.acquireLatestImage()     // Catch: java.lang.Exception -> Le
            goto L19
        Le:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r5 = "acquireLatestImage failed: "
            androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0.m(r5, r10, r0)
            r10 = r4
        L19:
            if (r10 != 0) goto L1d
            goto Le6
        L1d:
            long r5 = r9.lastFrameTime     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            long r5 = r2 - r5
            r7 = 200(0xc8, double:9.9E-322)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L2b
            r10.close()
            return
        L2b:
            r9.lastFrameTime = r2     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            android.media.Image$Plane[] r2 = r10.getPlanes()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r3 = r2.getPixelStride()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r5 = r2.getRowStride()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r6 = r3 * r11
            int r5 = r5 - r6
            int r5 = r5 / r3
            int r5 = r5 + r11
            android.graphics.Bitmap r3 = r9.reusableBitmap     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r3 == 0) goto L5f
            int r6 = r3.getWidth()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r6 != r5) goto L5c
            int r6 = r3.getHeight()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r7 = r10.getHeight()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r6 != r7) goto L5c
            goto L5d
        L56:
            r9 = move-exception
            goto Le7
        L59:
            r9 = move-exception
            goto Ld2
        L5c:
            r3 = r4
        L5d:
            if (r3 != 0) goto L6e
        L5f:
            int r3 = r10.getHeight()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r3, r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r9.reusableBitmap = r3     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3.getClass()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
        L6e:
            java.nio.ByteBuffer r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r2.rewind()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3.copyPixelsFromBuffer(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r5 == r11) goto Lac
            android.graphics.Bitmap r2 = r9.reusableCroppedBitmap     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r2 == 0) goto L93
            int r5 = r2.getWidth()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r5 != r11) goto L8f
            int r5 = r2.getHeight()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r6 = r10.getHeight()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r5 != r6) goto L8f
            goto L90
        L8f:
            r2 = r4
        L90:
            if (r2 == 0) goto L93
            goto La2
        L93:
            int r2 = r10.getHeight()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r11, r2, r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r9.reusableCroppedBitmap = r2     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r2.getClass()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
        La2:
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r6 = 0
            r5.drawBitmap(r3, r6, r6, r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3 = r2
        Lac:
            java.io.ByteArrayOutputStream r2 = r9.reusableJpegStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r2.reset()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r4 = com.amazon.alexa.ra.rtvi.ScreenCaptureService.JPEG_QUALITY     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.io.ByteArrayOutputStream r5 = r9.reusableJpegStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3.compress(r2, r4, r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.io.ByteArrayOutputStream r2 = r9.reusableJpegStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            com.amazon.alexa.ra.rtvi.ScreenCaptureModule r9 = r9.activeModule     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r9 == 0) goto Lce
            r2.getClass()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r3 = r10.getHeight()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r9.setLatestFrame(r2, r11, r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
        Lce:
            r10.close()
            goto Le6
        Ld2:
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L56
            r11.append(r9)     // Catch: java.lang.Throwable -> L56
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L56
            android.util.Log.w(r0, r9)     // Catch: java.lang.Throwable -> L56
            goto Lce
        Le6:
            return
        Le7:
            r10.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.rtvi.ScreenCaptureService.processImage(android.media.ImageReader, int):void");
    }

    private final void releaseProjection() {
        try {
            VirtualDisplay virtualDisplay = this.virtualDisplay;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
        } catch (Exception unused) {
        }
        this.virtualDisplay = null;
        try {
            ImageReader imageReader = this.imageReader;
            if (imageReader != null) {
                imageReader.close();
            }
        } catch (Exception unused2) {
        }
        this.imageReader = null;
        try {
            MediaProjection mediaProjection = this.mediaProjection;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this.projectionCallback);
            }
            MediaProjection mediaProjection2 = this.mediaProjection;
            if (mediaProjection2 != null) {
                mediaProjection2.stop();
            }
        } catch (Exception unused3) {
        }
        this.mediaProjection = null;
        HandlerThread handlerThread = this.captureThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.captureThread = null;
        this.captureHandler = null;
        Bitmap bitmap = this.reusableBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.reusableBitmap = null;
        Bitmap bitmap2 = this.reusableCroppedBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.reusableCroppedBitmap = null;
    }

    private final Triple<Integer, Integer, Integer> screenMetrics() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Context createWindowContext = createWindowContext(((DisplayManager) getSystemService(DisplayManager.class)).getDisplay(0), 2038, null);
            createWindowContext.getClass();
            return metricsFrom(createWindowContext);
        }
        if (i >= 30) {
            Context createWindowContext2 = createWindowContext(2038, null);
            createWindowContext2.getClass();
            return metricsFrom(createWindowContext2);
        }
        Object systemService = getSystemService("window");
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        return new Triple<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.densityDpi));
    }

    private final void startAsForeground() {
        startForeground(NOTIFICATION_ID, buildNotification(), 32);
    }

    private final void startProjection(int resultCode, Intent data) {
        if (this.mediaProjection != null) {
            Log.i(TAG, "Projection already running");
            return;
        }
        MediaProjection mediaProjection = ((MediaProjectionManager) getSystemService(MediaProjectionManager.class)).getMediaProjection(resultCode, data);
        if (mediaProjection == null) {
            Log.e(TAG, "Failed to obtain MediaProjection");
            stopSelf();
            return;
        }
        this.mediaProjection = mediaProjection;
        mediaProjection.registerCallback(this.projectionCallback, null);
        Triple<Integer, Integer, Integer> screenMetrics = screenMetrics();
        final int intValue = screenMetrics.getFirst().intValue();
        int intValue2 = screenMetrics.getSecond().intValue();
        int intValue3 = screenMetrics.getThird().intValue();
        HandlerThread m = DoubleList$$ExternalSyntheticOutline0.m("RTVIScreenCapture");
        this.captureThread = m;
        Handler handler = new Handler(m.getLooper());
        this.captureHandler = handler;
        ImageReader newInstance = ImageReader.newInstance(intValue, intValue2, 1, 2);
        newInstance.getClass();
        this.imageReader = newInstance;
        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: com.amazon.alexa.ra.rtvi.ScreenCaptureService$$ExternalSyntheticLambda0
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                ScreenCaptureService.startProjection$lambda$2(ScreenCaptureService.this, intValue, imageReader);
            }
        }, handler);
        this.virtualDisplay = mediaProjection.createVirtualDisplay("RTVIScreenCapture", intValue, intValue2, intValue3, 16, newInstance.getSurface(), null, null);
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(intValue, intValue2, "Screen projection started (", "x", " @");
        m29m.append(intValue3);
        m29m.append("dpi)");
        Log.i(TAG, m29m.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startProjection$lambda$2(ScreenCaptureService screenCaptureService, int i, ImageReader imageReader) {
        imageReader.getClass();
        screenCaptureService.processImage(imageReader, i);
    }

    @Nullable
    public final ScreenCaptureModule getActiveModule() {
        return this.activeModule;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        serviceInstance = this;
        ScreenCaptureModule screenCaptureModule = new ScreenCaptureModule(null, 1, 0 == true ? 1 : 0);
        this.activeModule = screenCaptureModule;
        INSTANCE.publishModule(screenCaptureModule);
        createNotificationChannel();
        startAsForeground();
        Log.i(TAG, "Service created (module ready)");
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i(TAG, "Service destroying — releasing projection");
        releaseProjection();
        ScreenCaptureModule screenCaptureModule = this.activeModule;
        if (screenCaptureModule != null) {
            screenCaptureModule.destroy();
        }
        this.activeModule = null;
        serviceInstance = null;
        INSTANCE.clearModule();
        onExternalStop = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        int intExtra = intent != null ? intent.getIntExtra(EXTRA_RESULT_CODE, 0) : 0;
        Intent intent2 = intent != null ? (Intent) intent.getParcelableExtra(EXTRA_RESULT_DATA) : null;
        if (intExtra != 0 && intent2 != null) {
            startProjection(intExtra, intent2);
            return 2;
        }
        Log.e(TAG, "Missing projection result — stopping");
        stopSelf();
        return 2;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010 \u001a\u00020\u00162\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00160\"J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\u0006\u0010&\u001a\u00020\u0016J\u001e\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/amazon/alexa/ra/rtvi/ScreenCaptureService$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", com.amazon.deecomms.common.Constants.NOTIFICATION_ID, "", "CHANNEL_ID", "EXTRA_RESULT_CODE", "EXTRA_RESULT_DATA", "JPEG_QUALITY", "FRAME_THROTTLE_MS", "", "DEFAULT_JPEG_BUFFER_BYTES", "value", "Lcom/amazon/alexa/ra/rtvi/ScreenCaptureService;", "serviceInstance", "getServiceInstance", "()Lcom/amazon/alexa/ra/rtvi/ScreenCaptureService;", "onExternalStop", "Lkotlin/Function0;", "", "getOnExternalStop", "()Lkotlin/jvm/functions/Function0;", "setOnExternalStop", "(Lkotlin/jvm/functions/Function0;)V", "stoppedByUser", "", "moduleHandoff", "Lcom/amazon/alexa/ra/rtvi/PendingHandoff;", "Lcom/amazon/alexa/ra/rtvi/ScreenCaptureModule;", "awaitModule", "onReady", "Lkotlin/Function1;", "publishModule", "module", "clearModule", "cancelAwait", "start", "context", "Landroid/content/Context;", "resultCode", "data", "Landroid/content/Intent;", "stop", "ui-rtvi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearModule() {
            ScreenCaptureService.moduleHandoff.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void publishModule(ScreenCaptureModule module) {
            ScreenCaptureService.moduleHandoff.publish(module);
        }

        public final void awaitModule(@NotNull Function1<? super ScreenCaptureModule, Unit> onReady) {
            onReady.getClass();
            ScreenCaptureService.moduleHandoff.await(onReady);
        }

        public final void cancelAwait() {
            ScreenCaptureService.moduleHandoff.cancelAwait();
        }

        @Nullable
        public final Function0<Unit> getOnExternalStop() {
            return ScreenCaptureService.onExternalStop;
        }

        @Nullable
        public final ScreenCaptureService getServiceInstance() {
            return ScreenCaptureService.serviceInstance;
        }

        public final void setOnExternalStop(@Nullable Function0<Unit> function0) {
            ScreenCaptureService.onExternalStop = function0;
        }

        public final void start(@NotNull Context context, int resultCode, @NotNull Intent data) {
            context.getClass();
            data.getClass();
            ScreenCaptureService.stoppedByUser = false;
            Intent intent = new Intent(context, (Class<?>) ScreenCaptureService.class);
            intent.putExtra(ScreenCaptureService.EXTRA_RESULT_CODE, resultCode);
            intent.putExtra(ScreenCaptureService.EXTRA_RESULT_DATA, data);
            context.startForegroundService(intent);
        }

        public final void stop(@NotNull Context context) {
            context.getClass();
            ScreenCaptureService.stoppedByUser = true;
            context.stopService(new Intent(context, (Class<?>) ScreenCaptureService.class));
        }

        private Companion() {
        }
    }
}
