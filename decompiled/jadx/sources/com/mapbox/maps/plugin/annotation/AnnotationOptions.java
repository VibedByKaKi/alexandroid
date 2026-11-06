package com.mapbox.maps.plugin.annotation;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.plugin.annotation.Annotation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005J=\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\b2&\u0010\t\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "G", "Lcom/mapbox/geojson/Geometry;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mapbox/maps/plugin/annotation/Annotation;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "id", "", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationManager;)Lcom/mapbox/maps/plugin/annotation/Annotation;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface AnnotationOptions<G extends Geometry, T extends Annotation<G>> {
    @NotNull
    T build(@NotNull String id, @NotNull AnnotationManager<G, T, ?, ?, ?, ?, ?> annotationManager);
}
