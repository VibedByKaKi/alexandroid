package com.amazon.imageutilities;

import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BacktrackingByteSearch {
    private int backTrackingAvailable;
    private byte[] backTrackingBytes;
    private final Object oSearchTerm;
    private final byte[] pattern;
    private final BoyerMooreHorspool searchEngine;

    public BacktrackingByteSearch(byte[] bArr) {
        this.pattern = Arrays.copyOf(bArr, bArr.length);
        BoyerMooreHorspool boyerMooreHorspool = new BoyerMooreHorspool();
        this.searchEngine = boyerMooreHorspool;
        this.oSearchTerm = boyerMooreHorspool.processBytes(bArr);
        this.backTrackingBytes = new byte[bArr.length];
        this.backTrackingAvailable = 0;
    }

    private void getBackTrackingBytes(ByteProvider byteProvider, int i) {
        byte[] bArr = this.backTrackingBytes;
        int length = i < bArr.length ? i : bArr.length;
        int retainBytes = retainBytes(length);
        for (int i2 = 0; i2 < retainBytes; i2++) {
            byte[] bArr2 = this.backTrackingBytes;
            bArr2[i2] = bArr2[(this.backTrackingAvailable - retainBytes) + i2];
        }
        for (int i3 = 0; i3 < length; i3++) {
            this.backTrackingBytes[i3 + retainBytes] = byteProvider.get((i - length) + i3);
        }
        this.backTrackingAvailable = retainBytes + length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte lambda$indexOfLastByteOfFirstOccurence$0(ByteProvider byteProvider, int i) {
        return searchByte(i, byteProvider).byteValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte lambda$indexOfLastByteOfLastOccurence$1(ByteProvider byteProvider, int i, int i2, int i3) {
        return byteProvider.get(Math.min(i + i3, i2 - 1));
    }

    private int retainBytes(int i) {
        byte[] bArr = this.backTrackingBytes;
        if (i >= bArr.length) {
            return 0;
        }
        int i2 = this.backTrackingAvailable;
        return i + i2 > bArr.length ? bArr.length - i : i2;
    }

    private Byte searchByte(int i, ByteProvider byteProvider) {
        int i2 = this.backTrackingAvailable;
        return i < i2 ? Byte.valueOf(this.backTrackingBytes[i]) : Byte.valueOf(byteProvider.get(i - i2));
    }

    public int indexOfLastByteOfFirstOccurence(final ByteProvider byteProvider, int i) {
        BoyerMooreHorspool boyerMooreHorspool = this.searchEngine;
        ByteProvider byteProvider2 = new ByteProvider() { // from class: com.amazon.imageutilities.BacktrackingByteSearch$$ExternalSyntheticLambda0
            @Override // com.amazon.imageutilities.ByteProvider
            public final byte get(int i2) {
                byte lambda$indexOfLastByteOfFirstOccurence$0;
                lambda$indexOfLastByteOfFirstOccurence$0 = BacktrackingByteSearch.this.lambda$indexOfLastByteOfFirstOccurence$0(byteProvider, i2);
                return lambda$indexOfLastByteOfFirstOccurence$0;
            }
        };
        int i2 = this.backTrackingAvailable + i;
        int searchBytes = boyerMooreHorspool.searchBytes(byteProvider2, i2, 0, i2, this.pattern, this.oSearchTerm);
        if (searchBytes < 0) {
            getBackTrackingBytes(byteProvider, i);
            return -1;
        }
        int length = ((searchBytes - this.backTrackingAvailable) + this.pattern.length) - 1;
        this.backTrackingAvailable = 0;
        return length;
    }

    public int indexOfLastByteOfLastOccurence(final ByteProvider byteProvider, final int i) {
        ByteProvider byteProvider2 = byteProvider;
        int i2 = -1;
        int i3 = 0;
        while (i3 >= 0) {
            i3 = indexOfLastByteOfFirstOccurence(byteProvider2, i - Math.max(0, i2));
            i2 = (i2 == -1 ? 0 : 1) + Math.max(0, i2) + i3;
            final int i4 = i2 + 1;
            ByteProvider byteProvider3 = new ByteProvider() { // from class: com.amazon.imageutilities.BacktrackingByteSearch$$ExternalSyntheticLambda1
                @Override // com.amazon.imageutilities.ByteProvider
                public final byte get(int i5) {
                    byte lambda$indexOfLastByteOfLastOccurence$1;
                    lambda$indexOfLastByteOfLastOccurence$1 = BacktrackingByteSearch.lambda$indexOfLastByteOfLastOccurence$1(ByteProvider.this, i4, i, i5);
                    return lambda$indexOfLastByteOfLastOccurence$1;
                }
            };
            if (i2 >= i - 1) {
                return i2;
            }
            byteProvider2 = byteProvider3;
        }
        return i2;
    }
}
