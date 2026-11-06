package com.mapbox.maps.plugin.attribution.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.mapbox.maps.plugin.attribution.R;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/generated/AttributionAttributeParser;", "", "()V", "parseAttributionSettings", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "plugin-attribution_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributionAttributeParser {

    @NotNull
    public static final AttributionAttributeParser INSTANCE = new AttributionAttributeParser();

    private AttributionAttributeParser() {
    }

    public static /* synthetic */ AttributionSettings parseAttributionSettings$default(AttributionAttributeParser attributionAttributeParser, Context context, AttributeSet attributeSet, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return attributionAttributeParser.parseAttributionSettings(context, attributeSet, f);
    }

    @NotNull
    public final AttributionSettings parseAttributionSettings(@NotNull Context context, @Nullable AttributeSet attrs, final float pixelRatio) {
        context.getClass();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        obtainStyledAttributes.getClass();
        try {
            return AttributionSettingsKt.AttributionSettings(new Function1<AttributionSettings.Builder, Unit>() { // from class: com.mapbox.maps.plugin.attribution.generated.AttributionAttributeParser$parseAttributionSettings$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AttributionSettings.Builder builder) {
                    builder.getClass();
                    builder.m24778setEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_attributionEnabled, true));
                    builder.m24779setIconColor(obtainStyledAttributes.getColor(R.styleable.mapbox_MapView_mapbox_attributionIconColor, Color.parseColor("#FF1E8CAB")));
                    builder.m24784setPosition(obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_attributionGravity, 8388691));
                    builder.m24781setMarginLeft(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginLeft, pixelRatio * 92.0f));
                    builder.m24783setMarginTop(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginTop, pixelRatio * 4.0f));
                    builder.m24782setMarginRight(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginRight, pixelRatio * 4.0f));
                    builder.m24780setMarginBottom(obtainStyledAttributes.getDimension(R.styleable.mapbox_MapView_mapbox_attributionMarginBottom, pixelRatio * 4.0f));
                    builder.m24777setClickable(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_attributionClickable, true));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AttributionSettings.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }
            });
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
