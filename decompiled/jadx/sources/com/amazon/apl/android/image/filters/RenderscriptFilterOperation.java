package com.amazon.apl.android.image.filters;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.ScriptIntrinsic;
import com.amazon.apl.android.bitmap.IBitmapFactory;
import com.amazon.apl.android.image.filters.FilterOperation;
import com.amazon.apl.android.image.filters.bitmap.BitmapFilterResult;
import com.amazon.apl.android.image.filters.bitmap.FilterResult;
import com.amazon.apl.android.primitive.Filters;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class RenderscriptFilterOperation<T extends ScriptIntrinsic> extends FilterOperation {
    private FilterOperation.FilterBitmaps mBitmaps;
    protected final RenderScriptWrapper mRenderscriptWrapper;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ScriptActor<T extends ScriptIntrinsic> {
        void act(T t, Allocation allocation, Allocation allocation2);
    }

    public RenderscriptFilterOperation(List<Future<FilterResult>> list, Filters.Filter filter, IBitmapFactory iBitmapFactory, RenderScriptWrapper renderScriptWrapper) {
        super(list, filter, iBitmapFactory);
        this.mRenderscriptWrapper = renderScriptWrapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public FilterResult call() throws Exception {
        Allocation allocation;
        Allocation allocation2;
        T t = (T) null;
        try {
            FilterOperation.FilterBitmaps createFilterBitmaps = createFilterBitmaps();
            this.mBitmaps = createFilterBitmaps;
            RenderScriptWrapper renderScriptWrapper = this.mRenderscriptWrapper;
            Bitmap source = createFilterBitmaps.source();
            Allocation.MipmapControl mipmapControl = Allocation.MipmapControl.MIPMAP_NONE;
            Allocation createFromBitmap = renderScriptWrapper.createFromBitmap(source, mipmapControl, 1);
            try {
                allocation2 = this.mRenderscriptWrapper.createFromBitmap(this.mBitmaps.destination(), mipmapControl, 1);
                try {
                    t = getScript(createFromBitmap.getElement());
                    getScriptActor().act(t, createFromBitmap, allocation2);
                    Bitmap result = this.mBitmaps.result();
                    allocation2.copyTo(result);
                    BitmapFilterResult bitmapFilterResult = new BitmapFilterResult(result, getBitmapFactory());
                    createFromBitmap.destroy();
                    allocation2.destroy();
                    if (t != null) {
                        t.destroy();
                    }
                    System.runFinalization();
                    System.gc();
                    return bitmapFilterResult;
                } catch (Throwable th) {
                    th = th;
                    allocation = t;
                    t = (T) createFromBitmap;
                    if (t != null) {
                        t.destroy();
                    }
                    if (allocation2 != null) {
                        allocation2.destroy();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    System.runFinalization();
                    System.gc();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                allocation2 = null;
                t = (T) createFromBitmap;
                allocation = null;
            }
        } catch (Throwable th3) {
            th = th3;
            allocation = null;
            allocation2 = null;
        }
    }

    public abstract T getScript(Element element);

    public abstract ScriptActor<T> getScriptActor();
}
