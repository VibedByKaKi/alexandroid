package org.jetbrains.kotlin.konan.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/ConfigurablesWithEmulator;", "Lorg/jetbrains/kotlin/konan/target/Configurables;", "absoluteEmulatorExecutable", "", "getAbsoluteEmulatorExecutable", "()Ljava/lang/String;", "emulatorDependency", "getEmulatorDependency", "emulatorExecutable", "getEmulatorExecutable", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface ConfigurablesWithEmulator extends Configurables {
    @NotNull
    default String getAbsoluteEmulatorExecutable() {
        return absolute(getEmulatorExecutable());
    }

    @Nullable
    default String getEmulatorDependency() {
        return hostTargetString("emulatorDependency");
    }

    @Nullable
    default String getEmulatorExecutable() {
        return hostTargetString("emulatorExecutable");
    }
}
