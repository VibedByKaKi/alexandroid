package androidx.camera.core.internal.compat;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(26)
/* loaded from: classes.dex */
final class ImageWriterCompatApi26Impl {
    private static final String TAG = "ImageWriterCompatApi26";
    private static Method sNewInstanceMethod;

    static {
        try {
            Class cls = Integer.TYPE;
            sNewInstanceMethod = ImageWriter.class.getMethod(SmartFragmentEventProcessor.NEW_INSTANCE, Surface.class, cls, cls);
        } catch (NoSuchMethodException e) {
            Log.i(TAG, "Unable to initialize via reflection.", e);
        }
    }

    private ImageWriterCompatApi26Impl() {
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i, int i2) {
        try {
            return (ImageWriter) Preconditions.checkNotNull(sNewInstanceMethod.invoke(null, surface, Integer.valueOf(i), Integer.valueOf(i2)));
        } catch (IllegalAccessException | InvocationTargetException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Unable to invoke newInstance(Surface, int, int) via reflection.", e);
            return null;
        }
    }
}
