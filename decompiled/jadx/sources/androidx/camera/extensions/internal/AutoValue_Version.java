package androidx.camera.extensions.internal;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_Version extends Version {
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public AutoValue_Version(int i, int i2, int i3, String str) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        if (str != null) {
            this.description = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null description");
            throw null;
        }
    }

    @Override // androidx.camera.extensions.internal.Version
    public String getDescription() {
        return this.description;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMajor() {
        return this.major;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMinor() {
        return this.minor;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getPatch() {
        return this.patch;
    }
}
