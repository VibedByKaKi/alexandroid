package com.facebook.imagepipeline.request;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.core.NativeCodeSetup;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class BasePostprocessor implements Postprocessor {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;
    private static Method sCopyBitmap;

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (!NativeCodeSetup.getUseNativeCode() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (sCopyBitmap == null) {
                int i = Bitmaps.$r8$clinit;
                sCopyBitmap = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            sCopyBitmap.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Wrong Native code setup, reflection failed.", e);
        } catch (IllegalAccessException e2) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Wrong Native code setup, reflection failed.", e2);
        } catch (NoSuchMethodException e3) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Wrong Native code setup, reflection failed.", e3);
        } catch (InvocationTargetException e4) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Wrong Native code setup, reflection failed.", e4);
        }
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    @Nullable
    public CacheKey getPostprocessorCacheKey() {
        return null;
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        CloseableReference<Bitmap> createBitmapInternal = platformBitmapFactory.createBitmapInternal(width, height, config);
        try {
            process(createBitmapInternal.get(), bitmap);
            return createBitmapInternal.mo23973clone();
        } finally {
            CloseableReference.closeSafely(createBitmapInternal);
        }
    }

    public void process(Bitmap bitmap) {
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }
}
