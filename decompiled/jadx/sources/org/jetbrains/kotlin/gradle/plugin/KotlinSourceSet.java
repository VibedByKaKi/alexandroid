package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.apl.payload.RenderDocumentPayload;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.api.Named;
import org.gradle.api.file.SourceDirectorySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.tooling.core.HasMutableExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001/J\u0016\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060)H\u0016J\u0010\u0010\u0012\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0000H&J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0,H&J!\u0010\u0019\u001a\u00020\u001a2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020'0-¢\u0006\u0002\b.H&J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0,H&J!\u0010\u001d\u001a\u00020\u001e2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020'0-¢\u0006\u0002\b.H&R\u001a\u0010\u0005\u001a\u00020\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\nR\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u00068&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\b\u001a\u0004\b%\u0010\n¨\u00060"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinSourceSet;", "Lorg/gradle/api/Named;", "Lorg/jetbrains/kotlin/gradle/plugin/HasProject;", "Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;", "Lorg/jetbrains/kotlin/gradle/plugin/HasKotlinDependencies;", "apiMetadataConfigurationName", "", "getApiMetadataConfigurationName$annotations", "()V", "getApiMetadataConfigurationName", "()Ljava/lang/String;", "compileOnlyMetadataConfigurationName", "getCompileOnlyMetadataConfigurationName$annotations", "getCompileOnlyMetadataConfigurationName", "customSourceFilesExtensions", "", "getCustomSourceFilesExtensions", "()Ljava/lang/Iterable;", "dependsOn", "", "getDependsOn", "()Ljava/util/Set;", "implementationMetadataConfigurationName", "getImplementationMetadataConfigurationName$annotations", "getImplementationMetadataConfigurationName", "kotlin", "Lorg/gradle/api/file/SourceDirectorySet;", "getKotlin", "()Lorg/gradle/api/file/SourceDirectorySet;", "languageSettings", "Lorg/jetbrains/kotlin/gradle/plugin/LanguageSettingsBuilder;", "getLanguageSettings", "()Lorg/jetbrains/kotlin/gradle/plugin/LanguageSettingsBuilder;", "resources", "getResources", "runtimeOnlyMetadataConfigurationName", "getRuntimeOnlyMetadataConfigurationName$annotations", "getRuntimeOnlyMetadataConfigurationName", "addCustomSourceFilesExtensions", "", RenderDocumentPayload.FIELD_EXTENSIONS, "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "configure", "Lorg/gradle/api/Action;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Companion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinSourceSet extends Named, HasProject, HasMutableExtras, HasKotlinDependencies {

    @NotNull
    public static final String COMMON_MAIN_SOURCE_SET_NAME = "commonMain";

    @NotNull
    public static final String COMMON_TEST_SOURCE_SET_NAME = "commonTest";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinSourceSet$Companion;", "", "()V", "COMMON_MAIN_SOURCE_SET_NAME", "", "COMMON_TEST_SOURCE_SET_NAME", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String COMMON_MAIN_SOURCE_SET_NAME = "commonMain";

        @NotNull
        public static final String COMMON_TEST_SOURCE_SET_NAME = "commonTest";

        private Companion() {
        }
    }

    void addCustomSourceFilesExtensions(@NotNull List<String> extensions);

    void dependsOn(@NotNull KotlinSourceSet other);

    @NotNull
    String getApiMetadataConfigurationName();

    @NotNull
    String getCompileOnlyMetadataConfigurationName();

    @NotNull
    Iterable<String> getCustomSourceFilesExtensions();

    @NotNull
    Set<KotlinSourceSet> getDependsOn();

    @NotNull
    String getImplementationMetadataConfigurationName();

    @NotNull
    SourceDirectorySet getKotlin();

    @NotNull
    LanguageSettingsBuilder getLanguageSettings();

    @NotNull
    SourceDirectorySet getResources();

    @NotNull
    String getRuntimeOnlyMetadataConfigurationName();

    @NotNull
    SourceDirectorySet kotlin(@NotNull Function1<? super SourceDirectorySet, Unit> configure);

    @NotNull
    SourceDirectorySet kotlin(@NotNull Action<SourceDirectorySet> configure);

    @NotNull
    LanguageSettingsBuilder languageSettings(@NotNull Function1<? super LanguageSettingsBuilder, Unit> configure);

    @NotNull
    LanguageSettingsBuilder languageSettings(@NotNull Action<LanguageSettingsBuilder> configure);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void addCustomSourceFilesExtensions(@NotNull KotlinSourceSet kotlinSourceSet, @NotNull List<String> list) {
            list.getClass();
        }

        @Deprecated(message = "KT-55312")
        public static /* synthetic */ void getApiMetadataConfigurationName$annotations() {
        }

        @Deprecated(message = "KT-55312")
        public static /* synthetic */ void getCompileOnlyMetadataConfigurationName$annotations() {
        }

        @Deprecated(message = "KT-55312")
        public static /* synthetic */ void getImplementationMetadataConfigurationName$annotations() {
        }

        @Deprecated(message = "KT-55230: RuntimeOnly scope is not supported for metadata dependency transformation")
        public static /* synthetic */ void getRuntimeOnlyMetadataConfigurationName$annotations() {
        }
    }
}
