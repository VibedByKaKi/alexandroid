package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\n\u0010\u0006\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"computeFillMaxDimension", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillMaxDimension-iLBOSCw", "(JJ)F", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "computeFillHeight", "computeFillHeight-iLBOSCw", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,160:1\n156#1:161\n159#1:165\n156#1:169\n159#1:173\n57#2:162\n61#2:166\n57#2:170\n61#2:174\n57#2:177\n61#2:180\n60#3:163\n70#3:167\n60#3:171\n70#3:175\n60#3:178\n70#3:181\n22#4:164\n22#4:168\n22#4:172\n22#4:176\n22#4:179\n22#4:182\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n*L\n144#1:161\n145#1:165\n150#1:169\n151#1:173\n144#1:162\n145#1:166\n150#1:170\n151#1:174\n156#1:177\n159#1:180\n144#1:163\n145#1:167\n150#1:171\n151#1:175\n156#1:178\n159#1:181\n144#1:164\n145#1:168\n150#1:172\n151#1:176\n156#1:179\n159#1:182\n*E\n"})
/* loaded from: classes13.dex */
public final class ContentScaleKt {
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    private static final float m6067computeFillHeightiLBOSCw(long j, long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m6068computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m6069computeFillMinDimensioniLBOSCw(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    private static final float m6070computeFillWidthiLBOSCw(long j, long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
    }
}
