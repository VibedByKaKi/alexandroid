package com.amazon.apl.android.bitmap;

import android.graphics.Bitmap;
import com.amazon.apl.android.Component;
import com.amazon.common.storage.WeakCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ShadowCache {
    private final WeakCache<BitmapKey, Bitmap> mCache = new WeakCache<>();
    private final List<WeakReference<Component>> mComponents = new ArrayList();

    public void clear() {
        this.mCache.clear();
        this.mComponents.clear();
    }

    public Iterator<WeakReference<Component>> getComponents() {
        return this.mComponents.iterator();
    }

    public Bitmap getShadow(BitmapKey bitmapKey) {
        return this.mCache.get(bitmapKey);
    }

    public void putShadow(BitmapKey bitmapKey, Component component) {
        this.mCache.put(bitmapKey, new WeakReference<>(component.getShadowBitmap()));
        this.mComponents.add(new WeakReference<>(component));
    }
}
