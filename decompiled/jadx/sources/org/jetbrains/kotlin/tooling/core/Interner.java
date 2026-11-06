package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001f\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\u0005H&¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/Interner;", "", MetricsConstants.Method.CACHE_CLEAR, "", "getOrPut", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface Interner {
    void clear();

    @NotNull
    <T> T getOrPut(@NotNull T value);
}
