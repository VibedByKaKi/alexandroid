package androidx.media3.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.session.MediaLibraryService;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class LibraryResult<V> {
    public static final int RESULT_ERROR_BAD_VALUE = -3;
    public static final int RESULT_ERROR_INVALID_STATE = -2;
    public static final int RESULT_ERROR_IO = -5;
    public static final int RESULT_ERROR_NOT_SUPPORTED = -6;
    public static final int RESULT_ERROR_PERMISSION_DENIED = -4;
    public static final int RESULT_ERROR_SESSION_AUTHENTICATION_EXPIRED = -102;
    public static final int RESULT_ERROR_SESSION_CONCURRENT_STREAM_LIMIT = -104;
    public static final int RESULT_ERROR_SESSION_DISCONNECTED = -100;
    public static final int RESULT_ERROR_SESSION_NOT_AVAILABLE_IN_REGION = -106;
    public static final int RESULT_ERROR_SESSION_PARENTAL_CONTROL_RESTRICTED = -105;
    public static final int RESULT_ERROR_SESSION_PREMIUM_ACCOUNT_REQUIRED = -103;
    public static final int RESULT_ERROR_SESSION_SETUP_REQUIRED = -108;
    public static final int RESULT_ERROR_SESSION_SKIP_LIMIT_REACHED = -107;
    public static final int RESULT_ERROR_UNKNOWN = -1;
    public static final int RESULT_INFO_SKIPPED = 1;
    public static final int RESULT_SUCCESS = 0;
    private static final int VALUE_TYPE_ERROR = 4;
    private static final int VALUE_TYPE_ITEM = 2;
    private static final int VALUE_TYPE_ITEM_LIST = 3;
    private static final int VALUE_TYPE_VOID = 1;
    public final long completionTimeMs;

    @Nullable
    public final MediaLibraryService.LibraryParams params;
    public final int resultCode;

    @Nullable
    @UnstableApi
    public final SessionError sessionError;

    @Nullable
    public final V value;
    private final int valueType;
    private static final String FIELD_RESULT_CODE = Util.intToStringMaxRadix(0);
    private static final String FIELD_COMPLETION_TIME_MS = Util.intToStringMaxRadix(1);
    private static final String FIELD_PARAMS = Util.intToStringMaxRadix(2);
    private static final String FIELD_VALUE = Util.intToStringMaxRadix(3);
    private static final String FIELD_VALUE_TYPE = Util.intToStringMaxRadix(4);
    private static final String FIELD_SESSION_ERROR = Util.intToStringMaxRadix(5);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Code {
    }

    private LibraryResult(int i, long j, @Nullable MediaLibraryService.LibraryParams libraryParams, @Nullable SessionError sessionError, @Nullable V v, int i2) {
        this.resultCode = i;
        this.completionTimeMs = j;
        this.params = libraryParams;
        this.sessionError = sessionError;
        this.value = v;
        this.valueType = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.session.LibraryResult<?> fromBundle(android.os.Bundle r10, @androidx.annotation.Nullable java.lang.Integer r11) {
        /*
            java.lang.String r0 = androidx.media3.session.LibraryResult.FIELD_RESULT_CODE
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = androidx.media3.session.LibraryResult.FIELD_COMPLETION_TIME_MS
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = androidx.media3.session.LibraryResult.FIELD_PARAMS
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            androidx.media3.session.MediaLibraryService$LibraryParams r0 = androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(r0)
            r6 = r0
        L21:
            java.lang.String r0 = androidx.media3.session.LibraryResult.FIELD_SESSION_ERROR
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            androidx.media3.session.SessionError r0 = androidx.media3.session.SessionError.fromBundle(r0)
        L2d:
            r7 = r0
            goto L3a
        L2f:
            if (r3 == 0) goto L39
            androidx.media3.session.SessionError r0 = new androidx.media3.session.SessionError
            java.lang.String r7 = "no error message provided"
            r0.<init>(r3, r7)
            goto L2d
        L39:
            r7 = r2
        L3a:
            java.lang.String r0 = androidx.media3.session.LibraryResult.FIELD_VALUE_TYPE
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L75
            r8 = 2
            if (r9 == r8) goto L77
            r8 = 3
            if (r9 == r8) goto L52
            r10 = 4
            if (r9 != r10) goto L4d
            goto L75
        L4d:
            com.here.time.Duration$$ExternalSyntheticBUOutline0.m$1()
            r10 = 0
            return r10
        L52:
            if (r11 == 0) goto L5a
            int r11 = r11.intValue()
            if (r11 != r8) goto L5b
        L5a:
            r1 = r0
        L5b:
            androidx.media3.common.util.Assertions.checkState(r1)
            java.lang.String r11 = androidx.media3.session.LibraryResult.FIELD_VALUE
            android.os.IBinder r10 = androidx.core.app.BundleCompat.getBinder(r10, r11)
            if (r10 != 0) goto L67
            goto L75
        L67:
            androidx.media3.session.LibraryResult$$ExternalSyntheticLambda0 r11 = new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda0
            r0 = 2
            r11.<init>(r0)
            com.google.common.collect.ImmutableList r10 = androidx.media3.common.BundleListRetriever.getList(r10)
            com.google.common.collect.ImmutableList r2 = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(r11, r10)
        L75:
            r8 = r2
            goto L91
        L77:
            if (r11 == 0) goto L7f
            int r11 = r11.intValue()
            if (r11 != r8) goto L80
        L7f:
            r1 = r0
        L80:
            androidx.media3.common.util.Assertions.checkState(r1)
            java.lang.String r11 = androidx.media3.session.LibraryResult.FIELD_VALUE
            android.os.Bundle r10 = r10.getBundle(r11)
            if (r10 != 0) goto L8c
            goto L75
        L8c:
            androidx.media3.common.MediaItem r2 = androidx.media3.common.MediaItem.fromBundle(r10)
            goto L75
        L91:
            androidx.media3.session.LibraryResult r2 = new androidx.media3.session.LibraryResult
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.LibraryResult.fromBundle(android.os.Bundle, java.lang.Integer):androidx.media3.session.LibraryResult");
    }

    @UnstableApi
    public static LibraryResult<MediaItem> fromItemBundle(Bundle bundle) {
        return fromBundle(bundle, 2);
    }

    @UnstableApi
    public static LibraryResult<ImmutableList<MediaItem>> fromItemListBundle(Bundle bundle) {
        return fromBundle(bundle, 3);
    }

    @UnstableApi
    public static LibraryResult<?> fromUnknownBundle(Bundle bundle) {
        return fromBundle(bundle, null);
    }

    @UnstableApi
    public static LibraryResult<Void> fromVoidBundle(Bundle bundle) {
        return fromUnknownBundle(bundle);
    }

    public static <V> LibraryResult<V> ofError(int i, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        return new LibraryResult<>(i, SystemClock.elapsedRealtime(), libraryParams, new SessionError(i, "no error message provided", Bundle.EMPTY), null, 4);
    }

    public static LibraryResult<MediaItem> ofItem(MediaItem mediaItem, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        verifyMediaItem(mediaItem);
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), libraryParams, null, mediaItem, 2);
    }

    public static LibraryResult<ImmutableList<MediaItem>> ofItemList(List<MediaItem> list, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        Iterator<MediaItem> it2 = list.iterator();
        while (it2.hasNext()) {
            verifyMediaItem(it2.next());
        }
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), libraryParams, null, ImmutableList.copyOf((Collection) list), 3);
    }

    public static LibraryResult<Void> ofVoid() {
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), null, null, null, 1);
    }

    private static void verifyMediaItem(MediaItem mediaItem) {
        Assertions.checkNotEmpty(mediaItem.mediaId, "mediaId must not be empty");
        Assertions.checkArgument(mediaItem.mediaMetadata.isBrowsable != null, "mediaMetadata must specify isBrowsable");
        Assertions.checkArgument(mediaItem.mediaMetadata.isPlayable != null, "mediaMetadata must specify isPlayable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r2 != 4) goto L19;
     */
    @androidx.media3.common.util.UnstableApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle toBundle() {
        /*
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = androidx.media3.session.LibraryResult.FIELD_RESULT_CODE
            int r2 = r5.resultCode
            r0.putInt(r1, r2)
            java.lang.String r1 = androidx.media3.session.LibraryResult.FIELD_COMPLETION_TIME_MS
            long r2 = r5.completionTimeMs
            r0.putLong(r1, r2)
            androidx.media3.session.MediaLibraryService$LibraryParams r1 = r5.params
            if (r1 == 0) goto L20
            java.lang.String r2 = androidx.media3.session.LibraryResult.FIELD_PARAMS
            android.os.Bundle r1 = r1.toBundle()
            r0.putBundle(r2, r1)
        L20:
            androidx.media3.session.SessionError r1 = r5.sessionError
            if (r1 == 0) goto L2d
            java.lang.String r2 = androidx.media3.session.LibraryResult.FIELD_SESSION_ERROR
            android.os.Bundle r1 = r1.toBundle()
            r0.putBundle(r2, r1)
        L2d:
            java.lang.String r1 = androidx.media3.session.LibraryResult.FIELD_VALUE_TYPE
            int r2 = r5.valueType
            r0.putInt(r1, r2)
            V r1 = r5.value
            if (r1 != 0) goto L39
            goto L47
        L39:
            int r2 = r5.valueType
            r3 = 1
            if (r2 == r3) goto L6d
            r3 = 2
            if (r2 == r3) goto L61
            r1 = 3
            if (r2 == r1) goto L48
            r5 = 4
            if (r2 == r5) goto L6d
        L47:
            return r0
        L48:
            java.lang.String r1 = androidx.media3.session.LibraryResult.FIELD_VALUE
            androidx.media3.common.BundleListRetriever r2 = new androidx.media3.common.BundleListRetriever
            V r5 = r5.value
            com.google.common.collect.ImmutableList r5 = (com.google.common.collect.ImmutableList) r5
            androidx.media3.session.LibraryResult$$ExternalSyntheticLambda0 r3 = new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda0
            r4 = 0
            r3.<init>(r4)
            com.google.common.collect.ImmutableList r5 = androidx.media3.common.util.BundleCollectionUtil.toBundleList(r5, r3)
            r2.<init>(r5)
            androidx.core.app.BundleCompat.putBinder(r0, r1, r2)
            return r0
        L61:
            java.lang.String r5 = androidx.media3.session.LibraryResult.FIELD_VALUE
            androidx.media3.common.MediaItem r1 = (androidx.media3.common.MediaItem) r1
            android.os.Bundle r1 = r1.toBundle()
            r0.putBundle(r5, r1)
            return r0
        L6d:
            com.here.time.Duration$$ExternalSyntheticBUOutline0.m$1()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.LibraryResult.toBundle():android.os.Bundle");
    }

    public static LibraryResult<Void> ofVoid(@Nullable MediaLibraryService.LibraryParams libraryParams) {
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), libraryParams, null, null, 1);
    }

    public static <V> LibraryResult<V> ofError(int i) {
        return ofError(new SessionError(i, "no error message provided", Bundle.EMPTY));
    }

    @UnstableApi
    public static <V> LibraryResult<V> ofError(SessionError sessionError) {
        return new LibraryResult<>(sessionError.code, SystemClock.elapsedRealtime(), null, sessionError, null, 4);
    }

    @UnstableApi
    public static <V> LibraryResult<V> ofError(SessionError sessionError, MediaLibraryService.LibraryParams libraryParams) {
        return new LibraryResult<>(sessionError.code, SystemClock.elapsedRealtime(), libraryParams, sessionError, null, 4);
    }
}
