package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001\"\u0019\u0010\b\u001a\u00060\u0001j\u0002`\t*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\r"}, d2 = {"NativeCanvas", "Landroid/graphics/Canvas;", "ActualCanvas", "Landroidx/compose/ui/graphics/Canvas;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "Canvas", "c", "nativeCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "EmptyCanvas", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
/* loaded from: classes13.dex */
public final class AndroidCanvas_androidKt {

    @NotNull
    private static final android.graphics.Canvas EmptyCanvas = new android.graphics.Canvas();

    @NotNull
    public static final Canvas ActualCanvas(@NotNull ImageBitmap imageBitmap) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new android.graphics.Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap)));
        return androidCanvas;
    }

    @NotNull
    public static final Canvas Canvas(@NotNull android.graphics.Canvas canvas) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(canvas);
        return androidCanvas;
    }

    @NotNull
    public static final android.graphics.Canvas getNativeCanvas(@NotNull Canvas canvas) {
        canvas.getClass();
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
