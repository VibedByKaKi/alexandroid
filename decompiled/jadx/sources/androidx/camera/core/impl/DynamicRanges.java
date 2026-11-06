package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¨\u0006\u0010"}, d2 = {"Landroidx/camera/core/impl/DynamicRanges;", "", "()V", "canMatchBitDepth", "", "dynamicRangeToTest", "Landroidx/camera/core/DynamicRange;", "fullySpecifiedDynamicRange", "canMatchEncoding", "canResolve", "fullySpecifiedDynamicRanges", "", "canResolveUnderSpecifiedTo", "underSpecifiedDynamicRange", "findAllPossibleMatches", "dynamicRangesToTest", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDynamicRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicRanges.kt\nandroidx/camera/core/impl/DynamicRanges\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n288#2,2:131\n1855#2:133\n1855#2,2:134\n1856#2:136\n*S KotlinDebug\n*F\n+ 1 DynamicRanges.kt\nandroidx/camera/core/impl/DynamicRanges\n*L\n40#1:131,2\n65#1:133\n74#1:134,2\n65#1:136\n*E\n"})
/* loaded from: classes.dex */
public final class DynamicRanges {

    @NotNull
    public static final DynamicRanges INSTANCE = new DynamicRanges();

    private DynamicRanges() {
    }

    private final boolean canMatchBitDepth(DynamicRange dynamicRangeToTest, DynamicRange fullySpecifiedDynamicRange) {
        Preconditions.checkState(fullySpecifiedDynamicRange.isFullySpecified(), "Fully specified range is not actually fully specified.");
        return dynamicRangeToTest.getBitDepth() == 0 || dynamicRangeToTest.getBitDepth() == fullySpecifiedDynamicRange.getBitDepth();
    }

    private final boolean canMatchEncoding(DynamicRange dynamicRangeToTest, DynamicRange fullySpecifiedDynamicRange) {
        Preconditions.checkState(fullySpecifiedDynamicRange.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = dynamicRangeToTest.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = fullySpecifiedDynamicRange.getEncoding();
        return (encoding == 2 && encoding2 != 1) || encoding == encoding2;
    }

    @JvmStatic
    public static final boolean canResolve(@NotNull DynamicRange dynamicRangeToTest, @NotNull Set<DynamicRange> fullySpecifiedDynamicRanges) {
        Object obj;
        dynamicRangeToTest.getClass();
        fullySpecifiedDynamicRanges.getClass();
        if (dynamicRangeToTest.isFullySpecified()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        Iterator<T> it2 = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRangeToTest, (DynamicRange) obj)) {
                break;
            }
        }
        return obj != null;
    }

    private final boolean canResolveUnderSpecifiedTo(DynamicRange underSpecifiedDynamicRange, DynamicRange fullySpecifiedDynamicRange) {
        return canMatchBitDepth(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && canMatchEncoding(underSpecifiedDynamicRange, fullySpecifiedDynamicRange);
    }

    @JvmStatic
    @NotNull
    public static final Set<DynamicRange> findAllPossibleMatches(@NotNull Set<DynamicRange> dynamicRangesToTest, @NotNull Set<DynamicRange> fullySpecifiedDynamicRanges) {
        dynamicRangesToTest.getClass();
        fullySpecifiedDynamicRanges.getClass();
        if (dynamicRangesToTest.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
            return null;
        }
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (DynamicRange dynamicRange : dynamicRangesToTest) {
            if (!dynamicRange.isFullySpecified()) {
                for (DynamicRange dynamicRange2 : fullySpecifiedDynamicRanges) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        createSetBuilder.add(dynamicRange2);
                    }
                }
            } else if (fullySpecifiedDynamicRanges.contains(dynamicRange)) {
                createSetBuilder.add(dynamicRange);
            }
        }
        return SetsKt.build(createSetBuilder);
    }
}
