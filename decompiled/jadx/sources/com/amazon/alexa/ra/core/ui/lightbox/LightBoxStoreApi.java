package com.amazon.alexa.ra.core.ui.lightbox;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.lightbox.LightBoxResult;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxStoreApi;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxResult;", "", MetricsConstants.Method.CACHE_GET, "()Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxResult;", MetricsConstants.Method.CACHE_CLEAR, "", "hasData", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface LightBoxStoreApi<T extends LightBoxResult> {
    void clear();

    @Nullable
    T get();

    boolean hasData();
}
