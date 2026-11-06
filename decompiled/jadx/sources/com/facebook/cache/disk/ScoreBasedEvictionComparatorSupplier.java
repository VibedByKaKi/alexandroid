package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class ScoreBasedEvictionComparatorSupplier implements EntryEvictionComparatorSupplier {
    private final float mAgeWeight;
    private final float mSizeWeight;

    public ScoreBasedEvictionComparatorSupplier(float f, float f2) {
        this.mAgeWeight = f;
        this.mSizeWeight = f2;
    }

    @VisibleForTesting
    public float calculateScore(DiskStorage.Entry entry, long j) {
        long timestamp = j - entry.getTimestamp();
        return (this.mSizeWeight * entry.getSize()) + (this.mAgeWeight * timestamp);
    }

    @Override // com.facebook.cache.disk.EntryEvictionComparatorSupplier
    public EntryEvictionComparator get() {
        return new EntryEvictionComparator() { // from class: com.facebook.cache.disk.ScoreBasedEvictionComparatorSupplier.1
            long now = System.currentTimeMillis();

            @Override // java.util.Comparator
            public int compare(DiskStorage.Entry entry, DiskStorage.Entry entry2) {
                float calculateScore = ScoreBasedEvictionComparatorSupplier.this.calculateScore(entry, this.now);
                float calculateScore2 = ScoreBasedEvictionComparatorSupplier.this.calculateScore(entry2, this.now);
                if (calculateScore < calculateScore2) {
                    return 1;
                }
                return calculateScore2 == calculateScore ? 0 : -1;
            }
        };
    }
}
