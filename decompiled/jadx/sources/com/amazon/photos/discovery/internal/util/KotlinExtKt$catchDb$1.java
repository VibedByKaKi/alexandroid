package com.amazon.photos.discovery.internal.util;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.discovery.metrics.DiscoveryMetricsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "getEventName"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nKotlinExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinExt.kt\ncom/amazon/photos/discovery/internal/util/KotlinExtKt$catchDb$1\n*L\n1#1,28:1\n*E\n"})
/* loaded from: classes5.dex */
public final class KotlinExtKt$catchDb$1 implements MetricName {
    final /* synthetic */ String $intent;

    public KotlinExtKt$catchDb$1(String str) {
        this.$intent = str;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    @NotNull
    public final String getEventName() {
        return DiscoveryMetricsKt.DB_ERROR_PREFIX + this.$intent;
    }
}
