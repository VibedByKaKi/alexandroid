package com.amazon.alexa.accessory.frames.media.utils;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportMetricsConstants;
import com.amazon.alexa.accessory.frames.metrics.media.VideoResolution;
import com.amazon.alexa.accessory.frames.utils.Log;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class VideoMetadataHelper {
    private static final long QUERY_FAILED = -2;
    private static final long ROW_NOT_FOUND = -1;
    private static final String TAG = "VideoMetadataHelper";

    private VideoMetadataHelper() {
    }

    @WorkerThread
    public static void emitVideoResolutionMetric(@NonNull Context context, @NonNull String str, @NonNull Uri uri) {
        if (Objects.equals(str, "video/mp4")) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(context, uri);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        if (extractMetadata != null && extractMetadata2 != null) {
                            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.videoResolution(VideoResolution.from(Integer.parseInt(extractMetadata), Integer.parseInt(extractMetadata2)).getBucket()));
                            mediaMetadataRetriever.release();
                            return;
                        }
                        Log.w(TAG, "Could not read video dimensions for resolution metric: " + uri);
                    } finally {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e) {
                            Log.e(TAG, "Failed to release retriever", e);
                        }
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Failed to emit video resolution metric for: " + uri, e2);
                    mediaMetadataRetriever.release();
                }
            } catch (Exception e3) {
                Log.e(TAG, "Failed to release retriever", e3);
            }
        }
    }

    @WorkerThread
    public static long getVideoDuration(Context context, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long parseLong = extractMetadata != null ? Long.parseLong(extractMetadata) : 0L;
                try {
                    return parseLong;
                } catch (Exception e) {
                    return parseLong;
                }
            } catch (Exception e2) {
                Log.e(TAG, "Failed to extract duration from: " + uri, e2);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e3) {
                    Log.e(TAG, "Failed to release retriever", e3);
                }
                return 0L;
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e4) {
                Log.e(TAG, "Failed to release retriever", e4);
            }
        }
    }

    @WorkerThread
    private static long getVideoDurationFromMediaStore(@NonNull Context context, @NonNull Uri uri) {
        Uri uri2;
        try {
            uri2 = uri;
            try {
                Cursor query = context.getContentResolver().query(uri2, new String[]{"duration"}, null, null, null);
                if (query == null) {
                    if (query == null) {
                        return -2L;
                    }
                    query.close();
                    return -2L;
                }
                try {
                    if (!query.moveToFirst()) {
                        query.close();
                        return -1L;
                    }
                    int columnIndex = query.getColumnIndex("duration");
                    if (columnIndex < 0 || query.isNull(columnIndex)) {
                        query.close();
                        return 0L;
                    }
                    long j = query.getLong(columnIndex);
                    query.close();
                    return j;
                } finally {
                }
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                Log.w(TAG, "getVideoDurationFromMediaStore - failed for " + uri2 + ": " + exc.getMessage());
                return -2L;
            }
        } catch (Exception e2) {
            e = e2;
            uri2 = uri;
        }
    }

    @WorkerThread
    public static int getVideoDurationInSeconds(@NonNull Context context, @NonNull String str, @NonNull Uri uri) {
        if (!Objects.equals(str, "video/mp4")) {
            return 0;
        }
        long videoDurationFromMediaStore = getVideoDurationFromMediaStore(context, uri);
        if (videoDurationFromMediaStore == -1) {
            return 0;
        }
        if (videoDurationFromMediaStore <= 0) {
            videoDurationFromMediaStore = getVideoDuration(context, uri);
        }
        return (int) (videoDurationFromMediaStore / 1000);
    }
}
