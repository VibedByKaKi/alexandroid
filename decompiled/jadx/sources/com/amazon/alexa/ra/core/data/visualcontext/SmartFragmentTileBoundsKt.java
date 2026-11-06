package com.amazon.alexa.ra.core.data.visualcontext;

import com.amazon.alexa.ra.core.data.model.Bounds;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"coveringBounds", "Lcom/amazon/alexa/ra/core/data/model/Bounds;", "left", "", "top", "right", "bottom", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SmartFragmentTileBoundsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bounds coveringBounds(float f, float f2, float f3, float f4) {
        int floor = (int) Math.floor(f);
        int floor2 = (int) Math.floor(f2);
        return new Bounds(Integer.valueOf(floor), Integer.valueOf(floor2), Integer.valueOf(((int) Math.ceil(f3)) - floor), Integer.valueOf(((int) Math.ceil(f4)) - floor2));
    }
}
