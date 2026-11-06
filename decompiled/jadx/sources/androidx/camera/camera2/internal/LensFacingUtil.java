package androidx.camera.camera2.internal;

import androidx.annotation.OptIn;
import androidx.camera.core.ExperimentalLensFacing;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getCameraSelectorLensFacing(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "The given lens facing integer: ", " can not be recognized."));
        return 0;
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getLensFacingInt(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "The given lens facing: ", " can not be recognized."));
        return 0;
    }
}
