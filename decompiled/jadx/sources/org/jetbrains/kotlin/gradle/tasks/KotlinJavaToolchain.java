package org.jetbrains.kotlin.gradle.tasks;

import java.io.File;
import kotlin.Metadata;
import org.gradle.api.JavaVersion;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.jvm.toolchain.JavaLauncher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain;", "", "javaVersion", "Lorg/gradle/api/provider/Provider;", "Lorg/gradle/api/JavaVersion;", "getJavaVersion", "()Lorg/gradle/api/provider/Provider;", "jdk", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain$JdkSetter;", "getJdk", "()Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain$JdkSetter;", "toolchain", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain$JavaToolchainSetter;", "getToolchain", "()Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain$JavaToolchainSetter;", "JavaToolchainSetter", "JdkSetter", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinJavaToolchain {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain$JavaToolchainSetter;", "", "use", "", "javaLauncher", "Lorg/gradle/api/provider/Provider;", "Lorg/gradle/jvm/toolchain/JavaLauncher;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface JavaToolchainSetter {
        void use(@NotNull Provider<JavaLauncher> javaLauncher);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/KotlinJavaToolchain$JdkSetter;", "", "use", "", "jdkHomeLocation", "Ljava/io/File;", "jdkVersion", "Lorg/gradle/api/JavaVersion;", "", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface JdkSetter {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class DefaultImpls {
            public static void use(@NotNull JdkSetter jdkSetter, @NotNull String str, @NotNull Object obj) {
                str.getClass();
                obj.getClass();
                File file = new File(str);
                JavaVersion version = JavaVersion.toVersion(obj);
                version.getClass();
                jdkSetter.use(file, version);
            }
        }

        void use(@NotNull File jdkHomeLocation, @NotNull JavaVersion jdkVersion);

        void use(@NotNull String jdkHomeLocation, @NotNull Object jdkVersion);
    }

    @Input
    @NotNull
    Provider<JavaVersion> getJavaVersion();

    @Internal
    @NotNull
    JdkSetter getJdk();

    @Internal
    @NotNull
    JavaToolchainSetter getToolchain();
}
