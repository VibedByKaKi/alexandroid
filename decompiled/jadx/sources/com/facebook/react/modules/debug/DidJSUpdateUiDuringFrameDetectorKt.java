package com.facebook.react.modules.debug;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a0\u0010\b\u001a\u00020\u00042\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a(\u0010\t\u001a\u00020\n2\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"hasEventBetweenTimestamps", "", "eventArray", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "startTime", "endTime", "getLastEventBetweenTimestamps", "cleanUp", "", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDidJSUpdateUiDuringFrameDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DidJSUpdateUiDuringFrameDetector.kt\ncom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetectorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1761#2,3:152\n*S KotlinDebug\n*F\n+ 1 DidJSUpdateUiDuringFrameDetector.kt\ncom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetectorKt\n*L\n118#1:152,3\n*E\n"})
/* loaded from: classes6.dex */
public final class DidJSUpdateUiDuringFrameDetectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleanUp(ArrayList<Long> arrayList, long j) {
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.get(i2).longValue() < j) {
                i++;
            }
        }
        if (i > 0) {
            int i3 = size - i;
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.set(i4, arrayList.get(i4 + i));
            }
            CollectionsKt.dropLast(arrayList, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLastEventBetweenTimestamps(ArrayList<Long> arrayList, long j, long j2) {
        Iterator<Long> it2 = arrayList.iterator();
        it2.getClass();
        long j3 = -1;
        while (it2.hasNext()) {
            Long next = it2.next();
            next.getClass();
            long longValue = next.longValue();
            if (j <= longValue && longValue < j2) {
                j3 = longValue;
            } else if (longValue >= j2) {
                break;
            }
        }
        return j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasEventBetweenTimestamps(ArrayList<Long> arrayList, long j, long j2) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long longValue = ((Number) it2.next()).longValue();
            if (j <= longValue && longValue < j2) {
                return true;
            }
        }
        return false;
    }
}
