package com.mapbox.maps.plugin.gestures.generated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.gestures.R;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesAttributeParser;", "", "()V", "parseGesturesSettings", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class GesturesAttributeParser {

    @NotNull
    public static final GesturesAttributeParser INSTANCE = new GesturesAttributeParser();

    private GesturesAttributeParser() {
    }

    @NotNull
    public final GesturesSettings parseGesturesSettings(@NotNull Context context, @Nullable AttributeSet attrs) {
        context.getClass();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        obtainStyledAttributes.getClass();
        try {
            return GesturesSettingsKt.GesturesSettings(new Function1<GesturesSettings.Builder, Unit>() { // from class: com.mapbox.maps.plugin.gestures.generated.GesturesAttributeParser$parseGesturesSettings$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GesturesSettings.Builder builder) {
                    builder.getClass();
                    builder.m24810setRotateEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesRotateEnabled, true));
                    builder.m24806setPinchToZoomEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPinchToZoomEnabled, true));
                    builder.m24812setScrollEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesScrollEnabled, true));
                    builder.m24814setSimultaneousRotateAndPinchToZoomEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesSimultaneousRotateAndPinchToZoomEnabled, true));
                    builder.m24807setPitchEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPitchEnabled, true));
                    builder.m24813setScrollMode(ScrollMode.values()[obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_gesturesScrollMode, ScrollMode.HORIZONTAL_AND_VERTICAL.ordinal())]);
                    builder.m24799setDoubleTapToZoomInEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesDoubleTapToZoomInEnabled, true));
                    builder.m24800setDoubleTouchToZoomOutEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesDoubleTouchToZoomOutEnabled, true));
                    builder.m24808setQuickZoomEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesQuickZoomEnabled, true));
                    builder.m24801setFocalPoint((obtainStyledAttributes.hasValue(R.styleable.mapbox_MapView_mapbox_gesturesFocalPointX) && obtainStyledAttributes.hasValue(R.styleable.mapbox_MapView_mapbox_gesturesFocalPointY)) ? new ScreenCoordinate(obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_gesturesFocalPointX, 0.0f), obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_gesturesFocalPointY, 0.0f)) : null);
                    builder.m24805setPinchToZoomDecelerationEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPinchToZoomDecelerationEnabled, true));
                    builder.m24809setRotateDecelerationEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesRotateDecelerationEnabled, true));
                    builder.m24811setScrollDecelerationEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesScrollDecelerationEnabled, true));
                    builder.m24803setIncreaseRotateThresholdWhenPinchingToZoom(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesIncreaseRotateThresholdWhenPinchingToZoom, true));
                    builder.m24802setIncreasePinchToZoomThresholdWhenRotating(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesIncreasePinchToZoomThresholdWhenRotating, true));
                    builder.m24816setZoomAnimationAmount(obtainStyledAttributes.getFloat(R.styleable.mapbox_MapView_mapbox_gesturesZoomAnimationAmount, 1.0f));
                    builder.m24804setPinchScrollEnabled(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesPinchScrollEnabled, true));
                    builder.m24815setUseNativeFlingDeceleration(obtainStyledAttributes.getBoolean(R.styleable.mapbox_MapView_mapbox_gesturesUseNativeFlingDeceleration, false));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GesturesSettings.Builder builder) {
                    invoke2(builder);
                    return Unit.INSTANCE;
                }
            });
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
