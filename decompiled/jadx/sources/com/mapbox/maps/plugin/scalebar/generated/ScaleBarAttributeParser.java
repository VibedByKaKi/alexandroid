package com.mapbox.maps.plugin.scalebar.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import com.mapbox.maps.plugin.DistanceUnits;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import com.mapbox.maps.plugin.scalebar.R;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarAttributeParser;", "", "()V", "parseScaleBarSettings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ScaleBarAttributeParser {

    @NotNull
    public static final ScaleBarAttributeParser INSTANCE = new ScaleBarAttributeParser();

    private ScaleBarAttributeParser() {
    }

    public static /* synthetic */ ScaleBarSettings parseScaleBarSettings$default(ScaleBarAttributeParser scaleBarAttributeParser, Context context, AttributeSet attributeSet, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return scaleBarAttributeParser.parseScaleBarSettings(context, attributeSet, f);
    }

    @NotNull
    public final ScaleBarSettings parseScaleBarSettings(@NotNull Context context, @Nullable AttributeSet attrs, final float pixelRatio) {
        context.getClass();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        obtainStyledAttributes.getClass();
        try {
            return ScaleBarSettingsKt.ScaleBarSettings(new Function1<ScaleBarSettings.Builder, Unit>() { // from class: com.mapbox.maps.plugin.scalebar.generated.ScaleBarAttributeParser$parseScaleBarSettings$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ScaleBarSettings.Builder builder) {
                    builder.getClass();
                    builder.m24851setEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_scaleBarEnabled, true));
                    builder.m24857setPosition(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_scaleBarGravity, 8388659));
                    builder.m24854setMarginLeft(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginLeft, pixelRatio * 4.0f));
                    builder.m24856setMarginTop(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginTop, pixelRatio * 4.0f));
                    builder.m24855setMarginRight(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginRight, pixelRatio * 4.0f));
                    builder.m24853setMarginBottom(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarMarginBottom, pixelRatio * 4.0f));
                    builder.m24865setTextColor(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_scaleBarTextColor, ViewCompat.MEASURED_STATE_MASK));
                    builder.m24858setPrimaryColor(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_scaleBarPrimaryColor, ViewCompat.MEASURED_STATE_MASK));
                    builder.m24861setSecondaryColor(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_scaleBarSecondaryColor, -1));
                    builder.m24849setBorderWidth(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarBorderWidth, pixelRatio * 2.0f));
                    builder.m24852setHeight(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarHeight, pixelRatio * 2.0f));
                    builder.m24863setTextBarMargin(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarTextBarMargin, pixelRatio * 8.0f));
                    builder.m24864setTextBorderWidth(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarTextBorderWidth, pixelRatio * 2.0f));
                    builder.m24866setTextSize(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_scaleBarTextSize, pixelRatio * 8.0f));
                    TypedArray typedArray = obtainStyledAttributes;
                    int i = R.styleable.mapbox_MapView_mapbox_scaleBarIsMetricUnits;
                    LocaleUnitResolver localeUnitResolver = LocaleUnitResolver.INSTANCE;
                    builder.setMetricUnits(typedArray.getBoolean(i, localeUnitResolver.isMetricSystem()));
                    builder.m24850setDistanceUnits(DistanceUnits.INSTANCE.values().get(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_scaleBarDistanceUnits, localeUnitResolver.getDistanceUnits().getOrdinal())));
                    builder.m24860setRefreshInterval(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_scaleBarRefreshInterval, 15));
                    builder.m24862setShowTextBorder(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_scaleBarShowTextBorder, true));
                    builder.m24859setRatio(obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_scaleBarRatio, 0.5f));
                    builder.m24867setUseContinuousRendering(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_scaleBarUseContinuousRendering, false));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ScaleBarSettings.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }
            });
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
