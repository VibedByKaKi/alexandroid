package org.jetbrains.kotlin.gradle.plugin;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"4\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\f\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"runtimeDependencyConfigurationName", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptionsDeprecated;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "getRuntimeDependencyConfigurationName$annotations", "(Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;)V", "getRuntimeDependencyConfigurationName", "(Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;)Ljava/lang/String;", "kotlin-gradle-plugin-api_common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KotlinCompilationKt {
    @Nullable
    public static final <T extends KotlinCommonOptions> String getRuntimeDependencyConfigurationName(@NotNull KotlinCompilation<? extends T> kotlinCompilation) {
        kotlinCompilation.getClass();
        KotlinCompilationToRunnableFiles kotlinCompilationToRunnableFiles = kotlinCompilation instanceof KotlinCompilationToRunnableFiles ? (KotlinCompilationToRunnableFiles) kotlinCompilation : null;
        if (kotlinCompilationToRunnableFiles != null) {
            return kotlinCompilationToRunnableFiles.getRuntimeDependencyConfigurationName();
        }
        return null;
    }

    @Deprecated(message = "Scheduled for removal with Kotlin 2.0")
    public static /* synthetic */ void getRuntimeDependencyConfigurationName$annotations(KotlinCompilation kotlinCompilation) {
    }
}
