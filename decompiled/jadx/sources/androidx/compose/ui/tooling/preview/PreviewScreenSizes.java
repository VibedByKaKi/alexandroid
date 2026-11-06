package androidx.compose.ui.tooling.preview;

import androidx.compose.ui.tooling.preview.Preview;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/preview/PreviewScreenSizes;", "", "ui-tooling-preview"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Preview.Container({@Preview(device = Devices.PHONE, name = "Phone", showSystemUi = true), @Preview(device = "spec:width=411dp,height=891dp,orientation=landscape,dpi=420", name = "Phone - Landscape", showSystemUi = true), @Preview(device = Devices.FOLDABLE, name = "Unfolded Foldable", showSystemUi = true), @Preview(device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait", name = "Tablet", showSystemUi = true), @Preview(device = Devices.TABLET, name = "Tablet - Landscape", showSystemUi = true), @Preview(device = Devices.DESKTOP, name = "Desktop", showSystemUi = true)})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes13.dex */
public @interface PreviewScreenSizes {
}
