package com.mapbox.common.location;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/location/IncompatibleGooglePlayServicesActivityRecognitionVersion;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/Exception;)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class IncompatibleGooglePlayServicesActivityRecognitionVersion extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompatibleGooglePlayServicesActivityRecognitionVersion(@NotNull Exception exc) {
        super("Incompatible Google Play Services activity recognition version found. Please check https://docs.mapbox.com/android/maps/guides/user-location/ for more details.", exc);
        exc.getClass();
    }
}
