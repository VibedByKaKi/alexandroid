package com.amazon.apl.android.image.filters;

import android.graphics.Paint;
import android.graphics.Rect;
import com.amazon.apl.android.bitmap.IBitmapFactory;
import com.amazon.apl.android.image.filters.bitmap.FilterResult;
import com.amazon.apl.android.image.filters.bitmap.PaintFilterResult;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SolidFilterOperation extends FilterOperation {
    private final PaintProvider mPaintProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PaintProvider {
        Paint getPaint(Rect rect);
    }

    public SolidFilterOperation(PaintProvider paintProvider, IBitmapFactory iBitmapFactory) {
        super(Collections.EMPTY_LIST, null, iBitmapFactory);
        this.mPaintProvider = paintProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public FilterResult call() {
        return new PaintFilterResult(this.mPaintProvider, getBitmapFactory());
    }
}
