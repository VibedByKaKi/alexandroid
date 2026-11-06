package org.jetbrains.kotlin.gradle.plugin;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilationToRunnableFiles;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001 \u0000*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/CompilationExecutionSourceSupport;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilationToRunnableFiles;", "", "setExecutionSourceFrom", "", "compilation", "(Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilationToRunnableFiles;)V", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface CompilationExecutionSourceSupport<T extends KotlinCompilationToRunnableFiles<?>> {
    void setExecutionSourceFrom(@NotNull T compilation);
}
