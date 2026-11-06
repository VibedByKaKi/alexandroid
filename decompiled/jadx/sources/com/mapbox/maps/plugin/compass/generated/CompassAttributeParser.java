package com.mapbox.maps.plugin.compass.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.compass.R;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassAttributeParser;", "", "()V", "parseCompassSettings", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-compass_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CompassAttributeParser {

    @NotNull
    public static final CompassAttributeParser INSTANCE = new CompassAttributeParser();

    private CompassAttributeParser() {
    }

    public static /* synthetic */ CompassSettings parseCompassSettings$default(CompassAttributeParser compassAttributeParser, Context context, AttributeSet attributeSet, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return compassAttributeParser.parseCompassSettings(context, attributeSet, f);
    }

    @NotNull
    public final CompassSettings parseCompassSettings(@NotNull Context context, @Nullable AttributeSet attrs, final float pixelRatio) {
        context.getClass();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        obtainStyledAttributes.getClass();
        try {
            return CompassSettingsKt.CompassSettings(new Function1<CompassSettings.Builder, Unit>() { // from class: com.mapbox.maps.plugin.compass.generated.CompassAttributeParser$parseCompassSettings$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CompassSettings.Builder builder) {
                    builder.getClass();
                    builder.m24786setEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_compassEnabled, true));
                    builder.m24794setPosition(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_compassGravity, 8388661));
                    builder.m24790setMarginLeft(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginLeft, pixelRatio * 4.0f));
                    builder.m24792setMarginTop(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginTop, pixelRatio * 4.0f));
                    builder.m24791setMarginRight(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginRight, pixelRatio * 4.0f));
                    builder.m24789setMarginBottom(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_compassMarginBottom, pixelRatio * 4.0f));
                    builder.m24793setOpacity(obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_compassOpacity, 1.0f));
                    builder.m24795setRotation(obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_compassRotation, 0.0f));
                    builder.m24796setVisibility(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_compassVisibility, true));
                    builder.m24787setFadeWhenFacingNorth(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_compassFadeWhenFacingNorth, true));
                    builder.m24785setClickable(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_compassClickable, true));
                    builder.m24788setImage(ImageHolder.INSTANCE.from(obtainStyledAttributes.getResourceId(R.styleable.mapbox_MapView_mapbox_compassImage, -1)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CompassSettings.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }
            });
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
