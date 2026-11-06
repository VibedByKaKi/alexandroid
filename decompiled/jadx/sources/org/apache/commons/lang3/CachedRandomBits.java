package org.apache.commons.lang3;

import java.util.Objects;
import java.util.Random;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class CachedRandomBits {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BITS_PER_BYTE = 8;
    private static final int BIT_INDEX_MASK = 7;
    private static final int MAX_BITS = 32;
    private static final int MAX_CACHE_SIZE = 268435455;
    private int bitIndex;
    private final byte[] cache;
    private final Random random;

    public CachedRandomBits(int i, Random random) {
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("cacheSize must be positive");
            throw null;
        }
        byte[] bArr = i <= MAX_CACHE_SIZE ? new byte[i] : new byte[MAX_CACHE_SIZE];
        this.cache = bArr;
        Objects.requireNonNull(random, "random");
        this.random = random;
        random.nextBytes(bArr);
        this.bitIndex = 0;
    }

    public int nextBits(int i) {
        if (i > 32 || i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("number of bits must be between 1 and 32");
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = this.bitIndex >> 3;
            byte[] bArr = this.cache;
            if (i4 >= bArr.length) {
                this.random.nextBytes(bArr);
                this.bitIndex = 0;
            }
            int min = Math.min(8 - (this.bitIndex & 7), i - i2);
            byte[] bArr2 = this.cache;
            int i5 = this.bitIndex;
            i3 = (i3 << min) | ((bArr2[i5 >> 3] >> (i5 & 7)) & ((1 << min) - 1));
            i2 += min;
            this.bitIndex = i5 + min;
        }
        return i3;
    }
}
