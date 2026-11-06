package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.extensions.internal.VendorExtender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
interface VendorExtenderFactory {
    @NonNull
    VendorExtender createVendorExtender(int i);
}
