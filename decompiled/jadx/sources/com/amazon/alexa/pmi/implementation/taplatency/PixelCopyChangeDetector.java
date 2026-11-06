package com.amazon.alexa.pmi.implementation.taplatency;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.photos.metrics.MetricsValidator$$ExternalSyntheticLambda0;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.dee.app.elements.bridges.ScreenSnapshotModule$$ExternalSyntheticLambda22;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003+,-B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\fH\u0016J \u0010\u001c\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\"\u0010#\u001a\u0004\u0018\u00010\u00152\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\"\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010$\u001a\u00020\r2\u0006\u0010)\u001a\u00020*2\u0006\u0010\"\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector;", "Lcom/amazon/alexa/pmi/implementation/taplatency/FrameChangeDetector;", "frameHandler", "Landroid/os/Handler;", "scaleDivisor", "", "copier", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$PixelCopier;", "<init>", "(Landroid/os/Handler;ILcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$PixelCopier;)V", "windows", "Ljava/util/IdentityHashMap;", "Landroid/view/Window;", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$WindowPixels;", "generation", "", "requestCopy", "", "window", "onResult", "Lkotlin/Function1;", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelChange;", "Lkotlin/ParameterName;", "name", "change", "", "reset", "forget", "pixelsFor", "width", "height", "onCopied", "look", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$Look;", "result", "changedRegion", "pixels", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "", "current", "diff", "bitmap", "Landroid/graphics/Bitmap;", "PixelCopier", "WindowPixels", "Look", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPixelCopyChangeDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PixelCopyChangeDetector.kt\ncom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1#2:215\n1869#3,2:216\n*S KotlinDebug\n*F\n+ 1 PixelCopyChangeDetector.kt\ncom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector\n*L\n98#1:216,2\n*E\n"})
/* loaded from: classes18.dex */
public final class PixelCopyChangeDetector implements FrameChangeDetector {

    @NotNull
    private final PixelCopier copier;

    @NotNull
    private final Handler frameHandler;
    private long generation;
    private final int scaleDivisor;

    @NotNull
    private final IdentityHashMap<Window, WindowPixels> windows;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR.\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$Look;", "", "window", "Landroid/view/Window;", "pixels", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$WindowPixels;", "bitmap", "Landroid/graphics/Bitmap;", "generation", "", "onResult", "Lkotlin/Function1;", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelChange;", "Lkotlin/ParameterName;", "name", "change", "", "<init>", "(Landroid/view/Window;Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$WindowPixels;Landroid/graphics/Bitmap;JLkotlin/jvm/functions/Function1;)V", "getWindow", "()Landroid/view/Window;", "getPixels", "()Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$WindowPixels;", "getBitmap", "()Landroid/graphics/Bitmap;", "getGeneration", "()J", "getOnResult", "()Lkotlin/jvm/functions/Function1;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Look {

        @NotNull
        private final Bitmap bitmap;
        private final long generation;

        @NotNull
        private final Function1<PixelChange, Unit> onResult;

        @NotNull
        private final WindowPixels pixels;

        @NotNull
        private final Window window;

        /* JADX WARN: Multi-variable type inference failed */
        public Look(@NotNull Window window, @NotNull WindowPixels windowPixels, @NotNull Bitmap bitmap, long j, @NotNull Function1<? super PixelChange, Unit> function1) {
            window.getClass();
            windowPixels.getClass();
            bitmap.getClass();
            function1.getClass();
            this.window = window;
            this.pixels = windowPixels;
            this.bitmap = bitmap;
            this.generation = j;
            this.onResult = function1;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final long getGeneration() {
            return this.generation;
        }

        @NotNull
        public final Function1<PixelChange, Unit> getOnResult() {
            return this.onResult;
        }

        @NotNull
        public final WindowPixels getPixels() {
            return this.pixels;
        }

        @NotNull
        public final Window getWindow() {
            return this.window;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$PixelCopier;", "", MissingTokenPull.TRIGGER_REQUEST, "", "window", "Landroid/view/Window;", "bitmap", "Landroid/graphics/Bitmap;", "onCopied", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "handler", "Landroid/os/Handler;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PixelCopier {
        void request(@NotNull Window window, @NotNull Bitmap bitmap, @NotNull Function1<? super Integer, Unit> onCopied, @NotNull Handler handler);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/PixelCopyChangeDetector$WindowPixels;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "spare", "Landroid/graphics/Bitmap;", "getSpare", "()Landroid/graphics/Bitmap;", "setSpare", "(Landroid/graphics/Bitmap;)V", "current", "", "getCurrent", "()[I", "setCurrent", "([I)V", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "getPrevious", "setPrevious", "tileColumns", "getTileColumns", "tileCounts", "getTileCounts", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WindowPixels {

        @NotNull
        private int[] current;
        private final int height;

        @Nullable
        private int[] previous;

        @Nullable
        private Bitmap spare;
        private final int tileColumns;

        @NotNull
        private final int[] tileCounts;
        private final int width;

        public WindowPixels(int i, int i2) {
            this.width = i;
            this.height = i2;
            this.current = new int[i * i2];
            int i3 = (i + 15) / 16;
            this.tileColumns = i3;
            this.tileCounts = new int[((i2 + 15) / 16) * i3];
        }

        @NotNull
        public final int[] getCurrent() {
            return this.current;
        }

        public final int getHeight() {
            return this.height;
        }

        @Nullable
        public final int[] getPrevious() {
            return this.previous;
        }

        @Nullable
        public final Bitmap getSpare() {
            return this.spare;
        }

        public final int getTileColumns() {
            return this.tileColumns;
        }

        @NotNull
        public final int[] getTileCounts() {
            return this.tileCounts;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setCurrent(@NotNull int[] iArr) {
            iArr.getClass();
            this.current = iArr;
        }

        public final void setPrevious(@Nullable int[] iArr) {
            this.previous = iArr;
        }

        public final void setSpare(@Nullable Bitmap bitmap) {
            this.spare = bitmap;
        }
    }

    public PixelCopyChangeDetector(@NotNull Handler handler, int i, @NotNull PixelCopier pixelCopier) {
        handler.getClass();
        pixelCopier.getClass();
        this.frameHandler = handler;
        this.scaleDivisor = i;
        this.copier = pixelCopier;
        this.windows = new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Window window, Bitmap bitmap, Function1 function1, Handler handler) {
        window.getClass();
        bitmap.getClass();
        function1.getClass();
        handler.getClass();
        PixelCopy.request(window, bitmap, new ScreenSnapshotModule$$ExternalSyntheticLambda22(function1, 1), handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1$lambda$0(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
    }

    private final PixelChange changedRegion(WindowPixels pixels, int[] previous, int[] current) {
        int width = pixels.getWidth();
        int[] tileCounts = pixels.getTileCounts();
        int length = current.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = -1;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (current[i6] != previous[i6]) {
                int i7 = i6 % width;
                int i8 = i6 / width;
                if (i7 < i2) {
                    i2 = i7;
                }
                if (i7 > i) {
                    i = i7;
                }
                if (i8 < i3) {
                    i3 = i8;
                }
                if (i8 > i4) {
                    i4 = i8;
                }
                i5++;
                int tileColumns = (i7 / 16) + ((i8 / 16) * pixels.getTileColumns());
                tileCounts[tileColumns] = tileCounts[tileColumns] + 1;
            }
        }
        if (i5 == 0) {
            return null;
        }
        int length2 = (tileCounts.length + 63) / 64;
        long[] jArr = new long[length2];
        long[] jArr2 = new long[length2];
        int length3 = tileCounts.length;
        for (int i9 = 0; i9 < length3; i9++) {
            int i10 = tileCounts[i9];
            if (i10 != 0) {
                long j = 1 << i9;
                int i11 = i9 / 64;
                jArr[i11] = jArr[i11] | j;
                if (i10 < 32) {
                    jArr2[i11] = jArr2[i11] | j;
                }
                tileCounts[i9] = 0;
            }
        }
        int tileColumns2 = pixels.getTileColumns();
        return new PixelChange(i5, i2, i3, i + 1, i4 + 1, new TileSet(jArr, tileColumns2), new TileSet(jArr2, tileColumns2));
    }

    private final PixelChange diff(WindowPixels pixels, Bitmap bitmap, int result) {
        try {
            if (result != 0) {
                return PixelChange.INSTANCE.getUNKNOWN();
            }
            int[] current = pixels.getCurrent();
            bitmap.getPixels(current, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            int[] previous = pixels.getPrevious();
            pixels.setPrevious(current);
            pixels.setCurrent(previous == null ? new int[current.length] : previous);
            return previous == null ? PixelChange.INSTANCE.getUNKNOWN() : changedRegion(pixels, previous, current);
        } catch (Throwable th) {
            Log.e(GlobalTapLatencyMonitorKt.TAP_LATENCY_TAG, "TTLR pixel diff threw; look not compared", th);
            return PixelChange.INSTANCE.getUNKNOWN();
        }
    }

    private final void onCopied(Look look, int result) {
        Bitmap bitmap = look.getBitmap();
        if (look.getGeneration() != this.generation) {
            bitmap.recycle();
            return;
        }
        WindowPixels pixels = look.getPixels();
        boolean z = this.windows.get(look.getWindow()) == pixels;
        PixelChange diff = z ? diff(pixels, bitmap, result) : PixelChange.INSTANCE.getUNKNOWN();
        if (z && pixels.getSpare() == null) {
            pixels.setSpare(bitmap);
        } else {
            bitmap.recycle();
        }
        look.getOnResult().invoke(diff);
    }

    private final WindowPixels pixelsFor(Window window, int width, int height) {
        Bitmap spare;
        WindowPixels windowPixels = this.windows.get(window);
        if (windowPixels != null && windowPixels.getWidth() == width && windowPixels.getHeight() == height) {
            return windowPixels;
        }
        if (windowPixels != null && (spare = windowPixels.getSpare()) != null) {
            spare.recycle();
        }
        WindowPixels windowPixels2 = new WindowPixels(width, height);
        this.windows.put(window, windowPixels2);
        return windowPixels2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCopy$lambda$3(PixelCopyChangeDetector pixelCopyChangeDetector, Look look, int i) {
        pixelCopyChangeDetector.onCopied(look, i);
        return Unit.INSTANCE;
    }

    @Override // com.amazon.alexa.pmi.implementation.taplatency.FrameChangeDetector
    public void forget(@NotNull Window window) {
        Bitmap spare;
        window.getClass();
        WindowPixels remove = this.windows.remove(window);
        if (remove == null || (spare = remove.getSpare()) == null) {
            return;
        }
        spare.recycle();
    }

    @Override // com.amazon.alexa.pmi.implementation.taplatency.FrameChangeDetector
    public boolean requestCopy(@NotNull Window window, @NotNull Function1<? super PixelChange, Unit> onResult) {
        Bitmap bitmap;
        Window window2;
        window.getClass();
        onResult.getClass();
        try {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null) {
                int width = peekDecorView.getWidth() / this.scaleDivisor;
                int height = peekDecorView.getHeight() / this.scaleDivisor;
                if (width > 0 && height > 0) {
                    long j = this.generation;
                    WindowPixels pixelsFor = pixelsFor(window, width, height);
                    Bitmap spare = pixelsFor.getSpare();
                    try {
                        try {
                            if (spare != null) {
                                if (spare.isRecycled()) {
                                    spare = null;
                                }
                                if (spare == null) {
                                }
                                bitmap = spare;
                                pixelsFor.setSpare(null);
                                window2 = window;
                                this.copier.request(window2, bitmap, new PixelCopyChangeDetector$$ExternalSyntheticLambda0(this, new Look(window2, pixelsFor, bitmap, j, onResult), 0), this.frameHandler);
                                return true;
                            }
                            this.copier.request(window2, bitmap, new PixelCopyChangeDetector$$ExternalSyntheticLambda0(this, new Look(window2, pixelsFor, bitmap, j, onResult), 0), this.frameHandler);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (this.windows.get(window2) == pixelsFor) {
                                pixelsFor.setSpare(bitmap);
                                throw th2;
                            }
                            bitmap.recycle();
                            throw th2;
                        }
                        window2 = window;
                    } catch (Throwable th3) {
                        th = th3;
                        window2 = window;
                    }
                    spare = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    spare.getClass();
                    bitmap = spare;
                    pixelsFor.setSpare(null);
                }
            }
            return false;
        } catch (Throwable th4) {
            Log.e(GlobalTapLatencyMonitorKt.TAP_LATENCY_TAG, "PixelCopy.request threw; look not compared", th4);
            return false;
        }
    }

    @Override // com.amazon.alexa.pmi.implementation.taplatency.FrameChangeDetector
    public void reset() {
        this.generation++;
        Collection<WindowPixels> values = this.windows.values();
        values.getClass();
        Iterator<T> it2 = values.iterator();
        while (it2.hasNext()) {
            Bitmap spare = ((WindowPixels) it2.next()).getSpare();
            if (spare != null) {
                spare.recycle();
            }
        }
        this.windows.clear();
    }

    public /* synthetic */ PixelCopyChangeDetector(Handler handler, int i, PixelCopier pixelCopier, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i2 & 2) != 0 ? 8 : i, (i2 & 4) != 0 ? new MetricsValidator$$ExternalSyntheticLambda0(20) : pixelCopier);
    }
}
