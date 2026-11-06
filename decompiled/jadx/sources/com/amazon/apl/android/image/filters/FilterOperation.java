package com.amazon.apl.android.image.filters;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.apl.android.bitmap.BitmapCreationException;
import com.amazon.apl.android.bitmap.IBitmapFactory;
import com.amazon.apl.android.image.filters.bitmap.ColorFilterResult;
import com.amazon.apl.android.image.filters.bitmap.FilterResult;
import com.amazon.apl.android.primitive.Filters;
import com.amazon.apl.android.utils.ConcurrencyUtils;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class FilterOperation implements Callable<FilterResult> {
    private static final String TAG = "FilterOperation";
    private final IBitmapFactory mBitmapFactory;
    private final Filters.Filter mFilter;
    private final List<Future<FilterResult>> mSourceFutures;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class FilterBitmaps {
        public static FilterBitmaps create(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
            return new AutoValue_FilterOperation_FilterBitmaps(bitmap, bitmap2, bitmap3);
        }

        @Nullable
        public abstract Bitmap destination();

        @Nullable
        public abstract Bitmap result();

        @Nullable
        public abstract Bitmap source();
    }

    public FilterOperation(List<Future<FilterResult>> list, Filters.Filter filter, IBitmapFactory iBitmapFactory) {
        this.mSourceFutures = list;
        this.mFilter = filter;
        this.mBitmapFactory = iBitmapFactory;
    }

    public FilterBitmaps createFilterBitmaps() throws BitmapCreationException {
        return FilterBitmaps.create(null, null, null);
    }

    public IBitmapFactory getBitmapFactory() {
        return this.mBitmapFactory;
    }

    @Nullable
    public FilterResult getDestination() {
        if (this.mSourceFutures.size() != 2) {
            return null;
        }
        try {
            return this.mSourceFutures.get(1).get(ConcurrencyUtils.LARGE_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(TAG, "Exception retrieving destination.", e);
            return new ColorFilterResult(0, this.mBitmapFactory);
        }
    }

    public Filters.Filter getFilter() {
        return this.mFilter;
    }

    @Nullable
    public FilterResult getSource() {
        if (this.mSourceFutures.size() == 0) {
            return null;
        }
        try {
            return this.mSourceFutures.get(0).get(ConcurrencyUtils.LARGE_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(TAG, "Exception retrieving source.", e);
            return new ColorFilterResult(0, this.mBitmapFactory);
        }
    }
}
