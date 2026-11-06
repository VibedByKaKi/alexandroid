package com.amazon.leapfrogmapgl.quickjs;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"appendJsonNumber", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "(Ljava/lang/StringBuilder;Ljava/lang/Double;)Ljava/lang/StringBuilder;", "LeapfrogMapGLAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSurfaceConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurfaceConfig.kt\ncom/amazon/leapfrogmapgl/quickjs/SurfaceConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,703:1\n1#2:704\n*E\n"})
/* loaded from: classes5.dex */
public final class SurfaceConfigKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final StringBuilder appendJsonNumber(StringBuilder sb, Double d) {
        if (d == null) {
            sb.append("null");
            return sb;
        }
        if (Math.abs(d.doubleValue()) <= Double.MAX_VALUE) {
            sb.append(d.doubleValue());
            return sb;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("SurfaceConfig runtime JSON cannot contain non-finite numbers");
        return null;
    }
}
