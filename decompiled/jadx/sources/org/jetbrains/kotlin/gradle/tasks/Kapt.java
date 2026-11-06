package org.jetbrains.kotlin.gradle.tasks;

import kotlin.Metadata;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Classpath;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.tasks.BaseKapt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/Kapt;", "Lorg/jetbrains/kotlin/gradle/tasks/BaseKapt;", "addJdkClassesToClasspath", "Lorg/gradle/api/provider/Property;", "", "getAddJdkClassesToClasspath", "()Lorg/gradle/api/provider/Property;", "kaptJars", "Lorg/gradle/api/file/ConfigurableFileCollection;", "getKaptJars", "()Lorg/gradle/api/file/ConfigurableFileCollection;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface Kapt extends BaseKapt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Internal
        @NotNull
        public static KotlinJavaToolchain getKotlinJavaToolchain(@NotNull Kapt kapt) {
            return BaseKapt.DefaultImpls.getKotlinJavaToolchain(kapt);
        }
    }

    @Input
    @NotNull
    Property<Boolean> getAddJdkClassesToClasspath();

    @Classpath
    @NotNull
    ConfigurableFileCollection getKaptJars();
}
