package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes14.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.mUsage = versionedParcel.readInt(audioAttributesImplBase.mUsage, 1);
        audioAttributesImplBase.mContentType = versionedParcel.readInt(audioAttributesImplBase.mContentType, 2);
        audioAttributesImplBase.mFlags = versionedParcel.readInt(audioAttributesImplBase.mFlags, 3);
        audioAttributesImplBase.mLegacyStream = versionedParcel.readInt(audioAttributesImplBase.mLegacyStream, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        versionedParcel.writeInt(audioAttributesImplBase.mUsage, 1);
        versionedParcel.writeInt(audioAttributesImplBase.mContentType, 2);
        versionedParcel.writeInt(audioAttributesImplBase.mFlags, 3);
        versionedParcel.writeInt(audioAttributesImplBase.mLegacyStream, 4);
    }
}
