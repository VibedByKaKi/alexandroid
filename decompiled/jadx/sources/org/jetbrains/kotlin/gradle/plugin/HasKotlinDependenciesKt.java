package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Deprecated;
import kotlin.Metadata;
import org.gradle.api.logging.Logger;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"warnNpmGenerateExternals", "", "logger", "Lorg/gradle/api/logging/Logger;", "kotlin-gradle-plugin-api_common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class HasKotlinDependenciesKt {
    @Deprecated(message = "Do not use in your build script")
    public static final void warnNpmGenerateExternals(@NotNull Logger logger) {
        logger.getClass();
        logger.warn("\n==========\nPlease note, Dukat integration in Gradle plugin does not work now.\nIt is in redesigning process.\n==========\n");
    }
}
