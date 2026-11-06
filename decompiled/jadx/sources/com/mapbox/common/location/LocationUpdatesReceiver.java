package com.mapbox.common.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.startup.AppInitializer;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricsConstants;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommonInitializer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "CircularArray", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class LocationUpdatesReceiver extends BroadcastReceiver {

    @NotNull
    public static final String ACTION_PROCESS_LOCATION_UPDATES = "com.mapbox.common.location.action.PROCESS_LOCATION_UPDATES";

    @NotNull
    public static final String LOCATION_PROVIDER_ID_KEY = "com.mapbox.common.location.DeviceLocationProvider.ID";

    @NotNull
    private static final String TAG = "LUReceiver";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final ExecutorService backgroundExecutor = Executors.newSingleThreadExecutor();

    @NotNull
    private static final ConcurrentHashMap<Integer, CircularArray<Intent>> pendingIntents = new ConcurrentHashMap<>();

    @NotNull
    private static final ConcurrentHashMap<Integer, WeakReference<BaseDeviceLocationProvider>> backgroundDeviceLocationProviders = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$2(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        CircularArray<Intent> putIfAbsent;
        try {
            if (!intent.hasExtra(LOCATION_PROVIDER_ID_KEY)) {
                INSTANCE.logWarning("Missing location provider persistent id");
                return;
            }
            int intExtra = intent.getIntExtra(LOCATION_PROVIDER_ID_KEY, 0);
            WeakReference<BaseDeviceLocationProvider> weakReference = backgroundDeviceLocationProviders.get(Integer.valueOf(intExtra));
            if (weakReference == null) {
                ConcurrentHashMap<Integer, CircularArray<Intent>> concurrentHashMap = pendingIntents;
                Integer valueOf = Integer.valueOf(intExtra);
                CircularArray<Intent> circularArray = concurrentHashMap.get(valueOf);
                if (circularArray == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (circularArray = new CircularArray<>(5)))) != null) {
                    circularArray = putIfAbsent;
                }
                circularArray.add(intent);
                INSTANCE.logError("DeviceLocationProvider with id " + intExtra + " not found.");
            } else {
                BaseDeviceLocationProvider baseDeviceLocationProvider = weakReference.get();
                if (baseDeviceLocationProvider != null) {
                    List<Location> extractResult = baseDeviceLocationProvider.extractResult(intent);
                    if (!extractResult.isEmpty()) {
                        baseDeviceLocationProvider.notifyLocationUpdate(extractResult);
                    }
                }
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        context.getClass();
        if (intent == null || !Intrinsics.areEqual(intent.getAction(), ACTION_PROCESS_LOCATION_UPDATES)) {
            return;
        }
        AppInitializer.getInstance(context).initializeComponent(MapboxSDKCommonInitializer.class);
        backgroundExecutor.execute(new BaseLocationProvider$$ExternalSyntheticLambda0(intent, goAsync(), 1));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;", "", "()V", "ACTION_PROCESS_LOCATION_UPDATES", "", "LOCATION_PROVIDER_ID_KEY", Constants.LOG_TAG, "backgroundDeviceLocationProviders", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "backgroundExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "pendingIntents", "Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;", "Landroid/content/Intent;", "addDeviceLocationProvider", "", "persistentId", "locationProvider", "addDeviceLocationProvider$common_release", "logError", "message", "logWarning", "removeDeviceLocationProvider", "removeDeviceLocationProvider$common_release", "resetForTest", "resetForTest$common_release", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logError(String message) {
            try {
                MapboxCommonLogger.INSTANCE.logE$common_release(LocationUpdatesReceiver.TAG, message);
            } catch (Throwable unused) {
                Log.e(LocationUpdatesReceiver.TAG, message);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logWarning(String message) {
            try {
                MapboxCommonLogger.INSTANCE.logW$common_release(LocationUpdatesReceiver.TAG, message);
            } catch (Throwable unused) {
                Log.w(LocationUpdatesReceiver.TAG, message);
            }
        }

        public final void addDeviceLocationProvider$common_release(int persistentId, @NotNull BaseDeviceLocationProvider locationProvider) {
            locationProvider.getClass();
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.put(Integer.valueOf(persistentId), new WeakReference(locationProvider));
            CircularArray circularArray = (CircularArray) LocationUpdatesReceiver.pendingIntents.remove(Integer.valueOf(persistentId));
            if (circularArray != null) {
                Iterator it2 = circularArray.toList().iterator();
                while (it2.hasNext()) {
                    List<Location> extractResult = locationProvider.extractResult((Intent) it2.next());
                    if (!extractResult.isEmpty()) {
                        locationProvider.notifyLocationUpdate(extractResult);
                    }
                }
            }
        }

        public final void removeDeviceLocationProvider$common_release(int persistentId) {
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.remove(Integer.valueOf(persistentId));
        }

        @VisibleForTesting(otherwise = 2)
        public final void resetForTest$common_release() {
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.clear();
            LocationUpdatesReceiver.pendingIntents.clear();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010 \n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "capacity", "", "(I)V", "arr", "", "getArr$annotations", "()V", "[Ljava/lang/Object;", "currentSize", "head", "getHead", "()I", "size", "getSize", "tail", BulkOperationType.add, "", "item", "(Ljava/lang/Object;)V", MetricsConstants.Method.CACHE_GET, "index", "(I)Ljava/lang/Object;", "iterator", "", "toList", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @VisibleForTesting(otherwise = 2)
    public static final class CircularArray<T> implements Iterable<T>, KMappedMarker {

        @NotNull
        private final T[] arr;
        private int currentSize;
        private int tail = -1;

        public CircularArray(int i) {
            this.arr = (T[]) new Object[i];
        }

        private final int getHead() {
            int i = this.currentSize;
            if (i == this.arr.length) {
                return (this.tail + 1) % i;
            }
            return 0;
        }

        public final void add(@NotNull T item) {
            item.getClass();
            int i = this.tail + 1;
            T[] tArr = this.arr;
            int length = i % tArr.length;
            this.tail = length;
            tArr[length] = item;
            int i2 = this.currentSize;
            if (i2 < tArr.length) {
                this.currentSize = i2 + 1;
            }
        }

        @NotNull
        public final T get(int index) {
            int i = this.currentSize;
            if (i == 0 || index >= i || index < 0) {
                XML$$ExternalSyntheticBUOutline0.m(String.valueOf(index));
                return null;
            }
            T[] tArr = this.arr;
            T t = i == tArr.length ? tArr[(getHead() + index) % this.arr.length] : tArr[index];
            t.getClass();
            return t;
        }

        /* renamed from: getSize, reason: from getter */
        public final int getCurrentSize() {
            return this.currentSize;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new LocationUpdatesReceiver$CircularArray$iterator$1(this);
        }

        @NotNull
        public final List<T> toList() {
            return SequencesKt.toList(SequencesKt.asSequence(iterator()));
        }

        private static /* synthetic */ void getArr$annotations() {
        }
    }
}
