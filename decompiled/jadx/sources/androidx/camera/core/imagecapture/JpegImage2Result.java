package androidx.camera.core.imagecapture;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImmutableImageInfo;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class JpegImage2Result implements Operation<Packet<ImageProxy>, ImageProxy> {
    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public ImageProxy apply(@NonNull Packet<ImageProxy> packet) throws ImageCaptureException {
        ImageProxy data = packet.getData();
        SettableImageProxy settableImageProxy = new SettableImageProxy(data, packet.getSize(), ImmutableImageInfo.create(data.getImageInfo().getTagBundle(), data.getImageInfo().getTimestamp(), packet.getRotationDegrees(), packet.getSensorToBufferTransform()));
        settableImageProxy.setCropRect(packet.getCropRect());
        return settableImageProxy;
    }
}
