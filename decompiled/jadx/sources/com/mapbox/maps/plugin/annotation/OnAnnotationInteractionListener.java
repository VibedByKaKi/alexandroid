package com.mapbox.maps.plugin.annotation;

import androidx.exifinterface.media.ExifInterface;
import com.mapbox.maps.plugin.annotation.Annotation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mapbox/maps/plugin/annotation/Annotation;", "", "onDeselectAnnotation", "", "annotation", "(Lcom/mapbox/maps/plugin/annotation/Annotation;)V", "onSelectAnnotation", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface OnAnnotationInteractionListener<T extends Annotation<?>> {
    void onDeselectAnnotation(@NotNull T annotation);

    void onSelectAnnotation(@NotNull T annotation);
}
