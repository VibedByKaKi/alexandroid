package org.jetbrains.kotlin.gradle.dsl;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0006R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0006R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006¨\u0006("}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinJsCompilerOptions;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonCompilerOptions;", "friendModulesDisabled", "Lorg/gradle/api/provider/Property;", "", "getFriendModulesDisabled", "()Lorg/gradle/api/provider/Property;", "main", "Lorg/jetbrains/kotlin/gradle/dsl/JsMainFunctionExecutionMode;", "getMain", "metaInfo", "getMetaInfo", "moduleKind", "Lorg/jetbrains/kotlin/gradle/dsl/JsModuleKind;", "getModuleKind", "moduleName", "", "getModuleName", "noStdlib", "getNoStdlib", "outputFile", "getOutputFile$annotations", "()V", "getOutputFile", "sourceMap", "getSourceMap", "sourceMapEmbedSources", "Lorg/jetbrains/kotlin/gradle/dsl/JsSourceMapEmbedMode;", "getSourceMapEmbedSources", "sourceMapNamesPolicy", "Lorg/jetbrains/kotlin/gradle/dsl/JsSourceMapNamesPolicy;", "getSourceMapNamesPolicy", "sourceMapPrefix", "getSourceMapPrefix", "target", "getTarget", "typedArrays", "getTypedArrays", "useEsClasses", "getUseEsClasses", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinJsCompilerOptions extends KotlinCommonCompilerOptions {
    @Input
    @NotNull
    Property<Boolean> getFriendModulesDisabled();

    @Input
    @NotNull
    Property<JsMainFunctionExecutionMode> getMain();

    @Input
    @NotNull
    Property<Boolean> getMetaInfo();

    @Input
    @NotNull
    Property<JsModuleKind> getModuleKind();

    @Input
    @Optional
    @NotNull
    Property<String> getModuleName();

    @Input
    @NotNull
    Property<Boolean> getNoStdlib();

    @Internal
    @NotNull
    Property<String> getOutputFile();

    @Input
    @NotNull
    Property<Boolean> getSourceMap();

    @Input
    @Optional
    @NotNull
    Property<JsSourceMapEmbedMode> getSourceMapEmbedSources();

    @Input
    @Optional
    @NotNull
    Property<JsSourceMapNamesPolicy> getSourceMapNamesPolicy();

    @Input
    @Optional
    @NotNull
    Property<String> getSourceMapPrefix();

    @Input
    @NotNull
    Property<String> getTarget();

    @Input
    @NotNull
    Property<Boolean> getTypedArrays();

    @Input
    @NotNull
    Property<Boolean> getUseEsClasses();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.WARNING, message = "Only for legacy backend. For IR backend please use task.destinationDirectory and moduleName")
        public static /* synthetic */ void getOutputFile$annotations() {
        }
    }
}
