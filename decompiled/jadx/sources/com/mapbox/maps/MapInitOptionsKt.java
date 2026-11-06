package com.mapbox.maps;

import android.content.Context;
import com.mapbox.maps.GlyphsRasterizationOptions;
import com.mapbox.maps.MapOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"applyDefaultParams", "Lcom/mapbox/maps/MapOptions$Builder;", "context", "Landroid/content/Context;", "pixelRatio", "", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapInitOptionsKt {
    @NotNull
    public static final MapOptions.Builder applyDefaultParams(@NotNull MapOptions.Builder builder, float f) {
        builder.getClass();
        builder.glyphsRasterizationOptions(new GlyphsRasterizationOptions.Builder().rasterizationMode(GlyphsRasterizationMode.IDEOGRAPHS_RASTERIZED_LOCALLY).fontFamily(FontUtils.INSTANCE.extractValidFont(null)).build());
        builder.pixelRatio(f);
        builder.constrainMode(ConstrainMode.HEIGHT_ONLY);
        builder.contextMode(ContextMode.UNIQUE);
        builder.orientation(NorthOrientation.UPWARDS);
        builder.viewportMode(ViewportMode.DEFAULT);
        builder.crossSourceCollisions(Boolean.TRUE);
        return builder;
    }

    @NotNull
    public static final MapOptions.Builder applyDefaultParams(@NotNull MapOptions.Builder builder, @NotNull Context context) {
        builder.getClass();
        context.getClass();
        return applyDefaultParams(builder, context.getResources().getDisplayMetrics().density);
    }
}
