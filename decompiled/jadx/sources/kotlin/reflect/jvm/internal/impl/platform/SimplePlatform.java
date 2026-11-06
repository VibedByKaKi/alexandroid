package kotlin.reflect.jvm.internal.impl.platform;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class SimplePlatform {

    @NotNull
    private final String platformName;

    @NotNull
    private final TargetPlatformVersion targetPlatformVersion;

    @NotNull
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }

    @NotNull
    public String toString() {
        String targetName = getTargetName();
        int length = targetName.length();
        String str = this.platformName;
        if (length <= 0) {
            return str;
        }
        return str + " (" + targetName + ')';
    }
}
