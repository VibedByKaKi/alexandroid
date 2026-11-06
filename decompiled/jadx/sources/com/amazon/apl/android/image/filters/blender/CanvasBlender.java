package com.amazon.apl.android.image.filters.blender;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.RequiresApi;
import com.amazon.apl.enums.BlendMode;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 29)
/* loaded from: classes20.dex */
public class CanvasBlender extends Blender {
    static Map<BlendMode, android.graphics.BlendMode> blendModeMap;
    private final Paint mPaint;

    static {
        HashMap hashMap = new HashMap();
        blendModeMap = hashMap;
        hashMap.put(BlendMode.kBlendModeScreen, android.graphics.BlendMode.SCREEN);
        blendModeMap.put(BlendMode.kBlendModeOverlay, android.graphics.BlendMode.OVERLAY);
        blendModeMap.put(BlendMode.kBlendModeDarken, android.graphics.BlendMode.DARKEN);
        blendModeMap.put(BlendMode.kBlendModeLighten, android.graphics.BlendMode.LIGHTEN);
        blendModeMap.put(BlendMode.kBlendModeColorDodge, android.graphics.BlendMode.COLOR_DODGE);
        blendModeMap.put(BlendMode.kBlendModeColorBurn, android.graphics.BlendMode.COLOR_BURN);
        blendModeMap.put(BlendMode.kBlendModeHardLight, android.graphics.BlendMode.HARD_LIGHT);
        blendModeMap.put(BlendMode.kBlendModeSoftLight, android.graphics.BlendMode.SOFT_LIGHT);
        blendModeMap.put(BlendMode.kBlendModeDifference, android.graphics.BlendMode.DIFFERENCE);
        blendModeMap.put(BlendMode.kBlendModeExclusion, android.graphics.BlendMode.EXCLUSION);
        blendModeMap.put(BlendMode.kBlendModeHue, android.graphics.BlendMode.HUE);
        blendModeMap.put(BlendMode.kBlendModeSaturation, android.graphics.BlendMode.SATURATION);
        blendModeMap.put(BlendMode.kBlendModeColor, android.graphics.BlendMode.COLOR);
        blendModeMap.put(BlendMode.kBlendModeLuminosity, android.graphics.BlendMode.LUMINOSITY);
    }

    public CanvasBlender(BlendMode blendMode) {
        super(blendMode);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setBlendMode(blendModeMap.get(this.mBlendMode));
    }

    @Override // com.amazon.apl.android.image.filters.blender.Blender
    public int blendPixels(int i, int i2) {
        return 0;
    }

    @Override // com.amazon.apl.android.image.filters.blender.Blender
    public Bitmap performBlending(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        Canvas canvas = new Canvas(bitmap3);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.mPaint);
        return bitmap3;
    }
}
