package com.amazon.tarazed.annotations;

import android.graphics.Point;
import android.view.View;
import com.amazon.tarazed.type.annotations.AnnotationPoint;
import com.amazon.tarazed.utility.DeviceInfoUtility;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"isValidForView", "", "Lcom/amazon/tarazed/type/annotations/AnnotationPoint;", "view", "Landroid/view/View;", "deviceInfo", "Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "transformForView", "transformForView1P", "transformForView3P", "TarazedAndroidLibrary_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnnotationPointKt {
    public static final boolean isValidForView(@NotNull AnnotationPoint annotationPoint, @NotNull View view, @NotNull DeviceInfoUtility deviceInfoUtility) {
        annotationPoint.getClass();
        view.getClass();
        deviceInfoUtility.getClass();
        if (deviceInfoUtility.is1PDevice()) {
            return true;
        }
        Point point = new Point();
        view.getDisplay().getRealSize(point);
        return annotationPoint.getX() >= 0.0f && annotationPoint.getX() <= ((float) point.x) && annotationPoint.getY() >= 0.0f && annotationPoint.getY() <= ((float) point.y);
    }

    @NotNull
    public static final AnnotationPoint transformForView(@NotNull AnnotationPoint annotationPoint, @NotNull View view, @NotNull DeviceInfoUtility deviceInfoUtility) {
        annotationPoint.getClass();
        view.getClass();
        deviceInfoUtility.getClass();
        return deviceInfoUtility.is1PDevice() ? transformForView1P(annotationPoint, view) : transformForView3P(annotationPoint, view);
    }

    private static final AnnotationPoint transformForView1P(AnnotationPoint annotationPoint, View view) {
        Point point = new Point();
        view.getDisplay().getRealSize(point);
        return new AnnotationPoint(annotationPoint.getX() * point.x, (annotationPoint.getY() * point.y) - (r0 - view.getHeight()));
    }

    private static final AnnotationPoint transformForView3P(AnnotationPoint annotationPoint, View view) {
        view.getDisplay().getRealSize(new Point());
        return AnnotationPointHelper.INSTANCE.compensateForViewOffset$TarazedAndroidLibrary_release(annotationPoint.getX() * r0.x, annotationPoint.getY() * r0.y, view);
    }
}
