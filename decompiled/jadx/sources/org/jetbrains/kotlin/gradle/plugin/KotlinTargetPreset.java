package org.jetbrains.kotlin.gradle.plugin;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.gradle.api.Named;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.DeprecatedTargetPresetApi;
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DeprecatedTargetPresetApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetPreset;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "Lorg/gradle/api/Named;", "createTarget", "name", "", "(Ljava/lang/String;)Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTargetPreset<T extends KotlinTarget> extends Named {
    @Deprecated(level = DeprecationLevel.WARNING, message = "The KotlinTargetPreset.createTarget() API is deprecated and will be removed in future releases. Learn how to configure targets at: https://kotl.in/target-configuration")
    @NotNull
    T createTarget(@NotNull String name);
}
