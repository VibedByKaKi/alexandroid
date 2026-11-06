package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.NoOpCacheErrorLogger;
import com.facebook.cache.common.NoOpCacheEventListener;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.common.disk.NoOpDiskTrimmableRegistry;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.infer.annotation.Nullsafe;
import java.io.File;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class DiskCacheConfig {
    private final String mBaseDirectoryName;
    private final Supplier<File> mBaseDirectoryPathSupplier;
    private final CacheErrorLogger mCacheErrorLogger;

    @Nullable
    private final CacheEventListener mCacheEventListener;

    @Nullable
    private final Context mContext;
    private final long mDefaultSizeLimit;
    private final DiskTrimmableRegistry mDiskTrimmableRegistry;
    private final EntryEvictionComparatorSupplier mEntryEvictionComparatorSupplier;
    private final boolean mIndexPopulateAtStartupEnabled;
    private final long mLowDiskSpaceSizeLimit;
    private final long mMinimumSizeLimit;
    private final int mVersion;

    public DiskCacheConfig(Builder builder) {
        Context context = builder.mContext;
        this.mContext = context;
        Preconditions.checkState((builder.mBaseDirectoryPathSupplier == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (builder.mBaseDirectoryPathSupplier == null && context != null) {
            builder.mBaseDirectoryPathSupplier = new Supplier<File>() { // from class: com.facebook.cache.disk.DiskCacheConfig.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.facebook.common.internal.Supplier
                public File get() {
                    Preconditions.checkNotNull(DiskCacheConfig.this.mContext);
                    return DiskCacheConfig.this.mContext.getApplicationContext().getCacheDir();
                }
            };
        }
        this.mVersion = builder.mVersion;
        this.mBaseDirectoryName = (String) Preconditions.checkNotNull(builder.mBaseDirectoryName);
        this.mBaseDirectoryPathSupplier = (Supplier) Preconditions.checkNotNull(builder.mBaseDirectoryPathSupplier);
        this.mDefaultSizeLimit = builder.mMaxCacheSize;
        this.mLowDiskSpaceSizeLimit = builder.mMaxCacheSizeOnLowDiskSpace;
        this.mMinimumSizeLimit = builder.mMaxCacheSizeOnVeryLowDiskSpace;
        this.mEntryEvictionComparatorSupplier = (EntryEvictionComparatorSupplier) Preconditions.checkNotNull(builder.mEntryEvictionComparatorSupplier);
        this.mCacheErrorLogger = builder.mCacheErrorLogger == null ? NoOpCacheErrorLogger.getInstance() : builder.mCacheErrorLogger;
        this.mCacheEventListener = builder.mCacheEventListener == null ? NoOpCacheEventListener.getInstance() : builder.mCacheEventListener;
        this.mDiskTrimmableRegistry = builder.mDiskTrimmableRegistry == null ? NoOpDiskTrimmableRegistry.getInstance() : builder.mDiskTrimmableRegistry;
        this.mIndexPopulateAtStartupEnabled = builder.mIndexPopulateAtStartupEnabled;
    }

    public static Builder newBuilder(@Nullable Context context) {
        return new Builder(context, 0);
    }

    public String getBaseDirectoryName() {
        return this.mBaseDirectoryName;
    }

    public Supplier<File> getBaseDirectoryPathSupplier() {
        return this.mBaseDirectoryPathSupplier;
    }

    public CacheErrorLogger getCacheErrorLogger() {
        return this.mCacheErrorLogger;
    }

    @Nullable
    public CacheEventListener getCacheEventListener() {
        return this.mCacheEventListener;
    }

    @Nullable
    public Context getContext() {
        return this.mContext;
    }

    public long getDefaultSizeLimit() {
        return this.mDefaultSizeLimit;
    }

    public DiskTrimmableRegistry getDiskTrimmableRegistry() {
        return this.mDiskTrimmableRegistry;
    }

    public EntryEvictionComparatorSupplier getEntryEvictionComparatorSupplier() {
        return this.mEntryEvictionComparatorSupplier;
    }

    public boolean getIndexPopulateAtStartupEnabled() {
        return this.mIndexPopulateAtStartupEnabled;
    }

    public long getLowDiskSpaceSizeLimit() {
        return this.mLowDiskSpaceSizeLimit;
    }

    public long getMinimumSizeLimit() {
        return this.mMinimumSizeLimit;
    }

    public int getVersion() {
        return this.mVersion;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String mBaseDirectoryName;

        @Nullable
        private Supplier<File> mBaseDirectoryPathSupplier;

        @Nullable
        private CacheErrorLogger mCacheErrorLogger;

        @Nullable
        private CacheEventListener mCacheEventListener;

        @Nullable
        private final Context mContext;

        @Nullable
        private DiskTrimmableRegistry mDiskTrimmableRegistry;
        private EntryEvictionComparatorSupplier mEntryEvictionComparatorSupplier;
        private boolean mIndexPopulateAtStartupEnabled;
        private long mMaxCacheSize;
        private long mMaxCacheSizeOnLowDiskSpace;
        private long mMaxCacheSizeOnVeryLowDiskSpace;
        private int mVersion;

        private Builder(@Nullable Context context) {
            this.mVersion = 1;
            this.mBaseDirectoryName = "image_cache";
            this.mMaxCacheSize = 41943040L;
            this.mMaxCacheSizeOnLowDiskSpace = 10485760L;
            this.mMaxCacheSizeOnVeryLowDiskSpace = 2097152L;
            this.mEntryEvictionComparatorSupplier = new DefaultEntryEvictionComparatorSupplier();
            this.mContext = context;
        }

        public DiskCacheConfig build() {
            return new DiskCacheConfig(this);
        }

        public Builder setBaseDirectoryName(String str) {
            this.mBaseDirectoryName = str;
            return this;
        }

        public Builder setBaseDirectoryPath(File file) {
            this.mBaseDirectoryPathSupplier = Suppliers.of(file);
            return this;
        }

        public Builder setBaseDirectoryPathSupplier(Supplier<File> supplier) {
            this.mBaseDirectoryPathSupplier = supplier;
            return this;
        }

        public Builder setCacheErrorLogger(CacheErrorLogger cacheErrorLogger) {
            this.mCacheErrorLogger = cacheErrorLogger;
            return this;
        }

        public Builder setCacheEventListener(CacheEventListener cacheEventListener) {
            this.mCacheEventListener = cacheEventListener;
            return this;
        }

        public Builder setDiskTrimmableRegistry(DiskTrimmableRegistry diskTrimmableRegistry) {
            this.mDiskTrimmableRegistry = diskTrimmableRegistry;
            return this;
        }

        public Builder setEntryEvictionComparatorSupplier(EntryEvictionComparatorSupplier entryEvictionComparatorSupplier) {
            this.mEntryEvictionComparatorSupplier = entryEvictionComparatorSupplier;
            return this;
        }

        public Builder setIndexPopulateAtStartupEnabled(boolean z) {
            this.mIndexPopulateAtStartupEnabled = z;
            return this;
        }

        public Builder setMaxCacheSize(long j) {
            this.mMaxCacheSize = j;
            return this;
        }

        public Builder setMaxCacheSizeOnLowDiskSpace(long j) {
            this.mMaxCacheSizeOnLowDiskSpace = j;
            return this;
        }

        public Builder setMaxCacheSizeOnVeryLowDiskSpace(long j) {
            this.mMaxCacheSizeOnVeryLowDiskSpace = j;
            return this;
        }

        public Builder setVersion(int i) {
            this.mVersion = i;
            return this;
        }

        public /* synthetic */ Builder(Context context, int i) {
            this(context);
        }
    }
}
