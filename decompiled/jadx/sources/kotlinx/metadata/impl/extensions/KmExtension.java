package kotlinx.metadata.impl.extensions;

import androidx.exifinterface.media.ExifInterface;
import com.mapbox.common.HttpHeaders;
import kotlin.Metadata;
import kotlinx.metadata.KmExtensionVisitor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/metadata/impl/extensions/KmExtension;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/metadata/KmExtensionVisitor;", HttpHeaders.ACCEPT, "", "visitor", "(Lkotlinx/metadata/KmExtensionVisitor;)V", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public interface KmExtension<V extends KmExtensionVisitor> extends KmExtensionVisitor {
    void accept(@NotNull V visitor);
}
