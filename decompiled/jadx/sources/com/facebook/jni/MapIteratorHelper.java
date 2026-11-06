package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
/* loaded from: classes6.dex */
public class MapIteratorHelper {

    @DoNotStrip
    private final Iterator<Map.Entry> mIterator;

    @DoNotStrip
    @Nullable
    private Object mKey;

    @DoNotStrip
    @Nullable
    private Object mValue;

    @DoNotStrip
    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    @DoNotStrip
    public boolean hasNext() {
        if (!this.mIterator.hasNext()) {
            this.mKey = null;
            this.mValue = null;
            return false;
        }
        Map.Entry next = this.mIterator.next();
        this.mKey = next.getKey();
        this.mValue = next.getValue();
        return true;
    }
}
