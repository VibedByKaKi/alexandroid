package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.processing.Packet;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_Bitmap2JpegBytes_In extends Bitmap2JpegBytes.In {
    private final int jpegQuality;
    private final Packet<Bitmap> packet;

    public AutoValue_Bitmap2JpegBytes_In(Packet<Bitmap> packet, int i) {
        if (packet == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null packet");
            throw null;
        }
        this.packet = packet;
        this.jpegQuality = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bitmap2JpegBytes.In) {
            Bitmap2JpegBytes.In in = (Bitmap2JpegBytes.In) obj;
            if (this.packet.equals(in.getPacket()) && this.jpegQuality == in.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    public Packet<Bitmap> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return this.jpegQuality ^ ((this.packet.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.packet);
        sb.append(", jpegQuality=");
        return a$$ExternalSyntheticOutline0.m(sb, this.jpegQuality, StringSubstitutor.DEFAULT_VAR_END);
    }
}
