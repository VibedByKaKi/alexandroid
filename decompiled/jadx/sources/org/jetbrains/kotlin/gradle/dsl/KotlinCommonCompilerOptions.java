package org.jetbrains.kotlin.gradle.dsl;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Optional;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerToolOptions;", "apiVersion", "Lorg/gradle/api/provider/Property;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinVersion;", "getApiVersion", "()Lorg/gradle/api/provider/Property;", "languageVersion", "getLanguageVersion", "optIn", "Lorg/gradle/api/provider/ListProperty;", "", "getOptIn", "()Lorg/gradle/api/provider/ListProperty;", "progressiveMode", "", "getProgressiveMode", "useK2", "getUseK2$annotations", "()V", "getUseK2", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinCommonCompilerOptions extends KotlinCommonCompilerToolOptions {
    @Input
    @Optional
    @NotNull
    Property<KotlinVersion> getApiVersion();

    @Input
    @Optional
    @NotNull
    Property<KotlinVersion> getLanguageVersion();

    @Input
    @NotNull
    ListProperty<String> getOptIn();

    @Input
    @NotNull
    Property<Boolean> getProgressiveMode();

    @Input
    @NotNull
    Property<Boolean> getUseK2();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.WARNING, message = "Compiler flag -Xuse-k2 is deprecated; please use language version 2.0 instead")
        public static /* synthetic */ void getUseK2$annotations() {
        }
    }
}
