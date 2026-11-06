package com.amazon.alexa.ra.cards.utils;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\b"}, d2 = {"shouldShowSmallDot", "", "position", "", "pageIndex", "totalViews", "getIndexForPosition", "currentIndex", "AVSMobileFramework-ra-cards-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PaginationDotsUtilsKt {
    public static final int getIndexForPosition(int i, int i2, int i3) {
        if (i2 > 2) {
            i += i2 >= i3 + (-3) ? i3 - 5 : i2 - 2;
        }
        return RangesKt.coerceIn(i, 0, i3 - 1);
    }

    public static final boolean shouldShowSmallDot(int i, int i2, int i3) {
        if (i == 0) {
            return i2 > 0;
        }
        int i4 = i3 - 1;
        return i == Math.min(4, i4) && i2 < i4;
    }
}
