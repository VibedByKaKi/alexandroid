package com.amazon.tarazed.annotations;

import android.view.View;
import com.amazon.tarazed.type.annotations.AnnotationPoint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/tarazed/annotations/AnnotationPointHelper;", "", "()V", "compensateForViewOffset", "Lcom/amazon/tarazed/type/annotations/AnnotationPoint;", "xInPixels", "", "yInPixels", "view", "Landroid/view/View;", "compensateForViewOffset$TarazedAndroidLibrary_release", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnnotationPointHelper {

    @NotNull
    public static final AnnotationPointHelper INSTANCE = new AnnotationPointHelper();

    private AnnotationPointHelper() {
    }

    @NotNull
    public final AnnotationPoint compensateForViewOffset$TarazedAndroidLibrary_release(float xInPixels, float yInPixels, @NotNull View view) {
        view.getClass();
        view.getLocationOnScreen(new int[2]);
        return new AnnotationPoint(xInPixels - r1[0], yInPixels - r1[1]);
    }
}
