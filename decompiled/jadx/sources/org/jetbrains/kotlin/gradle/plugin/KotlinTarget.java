package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.accessory.metrics.MetricsConstants;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.gradle.api.Action;
import org.gradle.api.Named;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.attributes.HasAttributes;
import org.gradle.api.component.SoftwareComponent;
import org.gradle.api.publish.maven.MavenPublication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.gradle.DeprecatedTargetPresetApiKt;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions;
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions;
import org.jetbrains.kotlin.tooling.core.HasMutableExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0016\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0016J!\u00103\u001a\u0002042\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020408¢\u0006\u0002\b9H\u0016J\u0016\u0010:\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00020;06H\u0017J!\u0010:\u001a\u0002042\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020408¢\u0006\u0002\b9H\u0017J\b\u0010<\u001a\u00020\u0006H\u0016J\u0016\u0010=\u001a\u0002042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?06H&J!\u0010=\u001a\u0002042\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020408¢\u0006\u0002\b9H\u0016J\u0012\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u00020'H&R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR$\u0010\u000b\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0\r0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\bR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R$\u0010!\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\"8&X§\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\bR\u0012\u0010,\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\bR\u0012\u0010.\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020'8&X§\u0004¢\u0006\f\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010)¨\u0006B"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTarget;", "Lorg/gradle/api/Named;", "Lorg/gradle/api/attributes/HasAttributes;", "Lorg/jetbrains/kotlin/gradle/plugin/HasProject;", "Lorg/jetbrains/kotlin/tooling/core/HasMutableExtras;", "apiElementsConfigurationName", "", "getApiElementsConfigurationName", "()Ljava/lang/String;", "artifactsTaskName", "getArtifactsTaskName", "compilations", "Lorg/gradle/api/NamedDomainObjectContainer;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptionsDeprecated;", "getCompilations", "()Lorg/gradle/api/NamedDomainObjectContainer;", "components", "", "Lorg/gradle/api/component/SoftwareComponent;", "getComponents", "()Ljava/util/Set;", "disambiguationClassifier", "getDisambiguationClassifier", "overrideDisambiguationClassifierOnIdeImport", "getOverrideDisambiguationClassifierOnIdeImport$annotations", "()V", "getOverrideDisambiguationClassifierOnIdeImport", "platformType", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "getPlatformType", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinPlatformType;", "preset", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetPreset;", "getPreset$annotations", "getPreset", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetPreset;", "publishable", "", "getPublishable", "()Z", "runtimeElementsConfigurationName", "getRuntimeElementsConfigurationName", "sourcesElementsConfigurationName", "getSourcesElementsConfigurationName", MetricsConstants.Firmware.TARGET_NAME, "getTargetName", "useDisambiguationClassifierAsSourceSetNamePrefix", "getUseDisambiguationClassifierAsSourceSetNamePrefix$annotations", "getUseDisambiguationClassifierAsSourceSetNamePrefix", "attributes", "", "configure", "Lorg/gradle/api/Action;", "Lorg/gradle/api/attributes/AttributeContainer;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "compilerOptions", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "getName", "mavenPublication", "action", "Lorg/gradle/api/publish/maven/MavenPublication;", "withSourcesJar", "publish", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTarget extends Named, HasAttributes, HasProject, HasMutableExtras {
    void attributes(@NotNull Function1<? super AttributeContainer, Unit> configure);

    void attributes(@NotNull Action<AttributeContainer> configure);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin target level compiler options DSL is not available in this release!")
    void compilerOptions(@NotNull Function1<? super KotlinCommonCompilerOptions, Unit> configure);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin target level compiler options DSL is not available in this release!")
    void compilerOptions(@NotNull Action<KotlinCommonCompilerOptions> configure);

    @NotNull
    String getApiElementsConfigurationName();

    @NotNull
    String getArtifactsTaskName();

    @NotNull
    NamedDomainObjectContainer<? extends KotlinCompilation<KotlinCommonOptions>> getCompilations();

    @NotNull
    Set<SoftwareComponent> getComponents();

    @Nullable
    String getDisambiguationClassifier();

    @NotNull
    String getName();

    @Nullable
    String getOverrideDisambiguationClassifierOnIdeImport();

    @NotNull
    KotlinPlatformType getPlatformType();

    @Nullable
    KotlinTargetPreset<? extends KotlinTarget> getPreset();

    boolean getPublishable();

    @NotNull
    String getRuntimeElementsConfigurationName();

    @NotNull
    String getSourcesElementsConfigurationName();

    @NotNull
    String getTargetName();

    boolean getUseDisambiguationClassifierAsSourceSetNamePrefix();

    void mavenPublication(@NotNull Function1<? super MavenPublication, Unit> action);

    void mavenPublication(@NotNull Action<MavenPublication> action);

    void withSourcesJar(boolean publish);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void attributes(@NotNull KotlinTarget kotlinTarget, @NotNull Function1<? super AttributeContainer, Unit> function1) {
            function1.getClass();
            AttributeContainer attributes = kotlinTarget.getAttributes();
            attributes.getClass();
            function1.invoke(attributes);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin target level compiler options DSL is not available in this release!")
        public static void compilerOptions(@NotNull KotlinTarget kotlinTarget, @NotNull Function1<? super KotlinCommonCompilerOptions, Unit> function1) {
            function1.getClass();
            throw new UnsupportedOperationException("Kotlin target level compiler options DSL is not available in this release!");
        }

        @Nullable
        public static String getDisambiguationClassifier(@NotNull KotlinTarget kotlinTarget) {
            return kotlinTarget.getTargetName();
        }

        @NotNull
        public static String getName(@NotNull KotlinTarget kotlinTarget) {
            return kotlinTarget.getTargetName();
        }

        public static void mavenPublication(@NotNull KotlinTarget kotlinTarget, @NotNull final Function1<? super MavenPublication, Unit> function1) {
            function1.getClass();
            kotlinTarget.mavenPublication(new Action() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinTarget$mavenPublication$1
                public final void execute(MavenPublication mavenPublication) {
                    Function1<MavenPublication, Unit> function12 = function1;
                    mavenPublication.getClass();
                    function12.invoke(mavenPublication);
                }
            });
        }

        public static /* synthetic */ void withSourcesJar$default(KotlinTarget kotlinTarget, boolean z, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: withSourcesJar");
                return;
            }
            if ((i & 1) != 0) {
                z = true;
            }
            kotlinTarget.withSourcesJar(z);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Kotlin target level compiler options DSL is not available in this release!")
        public static void compilerOptions(@NotNull KotlinTarget kotlinTarget, @NotNull Action<KotlinCommonCompilerOptions> action) {
            action.getClass();
            throw new UnsupportedOperationException("Kotlin target level compiler options DSL is not available in this release!");
        }

        public static void attributes(@NotNull KotlinTarget kotlinTarget, @NotNull final Action<AttributeContainer> action) {
            action.getClass();
            kotlinTarget.attributes((Function1<? super AttributeContainer, Unit>) new Function1<AttributeContainer, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinTarget$attributes$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AttributeContainer attributeContainer) {
                    attributeContainer.getClass();
                    action.execute(attributeContainer);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AttributeContainer attributeContainer) {
                    invoke2(attributeContainer);
                    return Unit.INSTANCE;
                }
            });
        }

        @Deprecated(message = "Scheduled for removal with Kotlin 2.2")
        public static /* synthetic */ void getOverrideDisambiguationClassifierOnIdeImport$annotations() {
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = DeprecatedTargetPresetApiKt.PRESETS_API_IS_DEPRECATED_MESSAGE)
        public static /* synthetic */ void getPreset$annotations() {
        }

        @Deprecated(message = "Scheduled for removal with Kotlin 2.2")
        public static /* synthetic */ void getUseDisambiguationClassifierAsSourceSetNamePrefix$annotations() {
        }
    }
}
