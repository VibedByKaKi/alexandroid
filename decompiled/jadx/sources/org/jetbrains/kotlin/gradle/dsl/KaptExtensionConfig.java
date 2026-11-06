package org.jetbrains.kotlin.gradle.dsl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\tH&J!\u0010.\u001a\u00020,2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0/\"\u00020\tH&¢\u0006\u0002\u00100J!\u00101\u001a\u00020,2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020,03¢\u0006\u0002\b5H&J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t07H&J!\u00108\u001a\u00020,2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020,03¢\u0006\u0002\b5H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0007R\u0018\u0010\u0019\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0007R\u0018\u0010\u001c\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0005\"\u0004\b\u001e\u0010\u0007R\u0018\u0010\u001f\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0005\"\u0004\b!\u0010\u0007R\u0018\u0010\"\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0005\"\u0004\b$\u0010\u0007R\u0018\u0010%\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0005\"\u0004\b'\u0010\u0007R\u0018\u0010(\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0005\"\u0004\b*\u0010\u0007¨\u0006:"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KaptExtensionConfig;", "", "correctErrorTypes", "", "getCorrectErrorTypes", "()Z", "setCorrectErrorTypes", "(Z)V", "detectMemoryLeaks", "", "getDetectMemoryLeaks", "()Ljava/lang/String;", "setDetectMemoryLeaks", "(Ljava/lang/String;)V", "dumpDefaultParameterValues", "getDumpDefaultParameterValues", "setDumpDefaultParameterValues", "includeCompileClasspath", "getIncludeCompileClasspath", "()Ljava/lang/Boolean;", "setIncludeCompileClasspath", "(Ljava/lang/Boolean;)V", "keepJavacAnnotationProcessors", "getKeepJavacAnnotationProcessors", "setKeepJavacAnnotationProcessors", "mapDiagnosticLocations", "getMapDiagnosticLocations", "setMapDiagnosticLocations", "showProcessorStats", "getShowProcessorStats", "setShowProcessorStats", "strictMode", "getStrictMode", "setStrictMode", "stripMetadata", "getStripMetadata", "setStripMetadata", "useBuildCache", "getUseBuildCache", "setUseBuildCache", "useLightAnalysis", "getUseLightAnalysis", "setUseLightAnalysis", "annotationProcessor", "", "fqName", "annotationProcessors", "", "([Ljava/lang/String;)V", "arguments", "action", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/gradle/dsl/KaptArguments;", "Lkotlin/ExtensionFunctionType;", "getJavacOptions", "", "javacOptions", "Lorg/jetbrains/kotlin/gradle/dsl/KaptJavacOption;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KaptExtensionConfig {
    void annotationProcessor(@NotNull String fqName);

    void annotationProcessors(@NotNull String... fqName);

    void arguments(@NotNull Function1<? super KaptArguments, Unit> action);

    boolean getCorrectErrorTypes();

    @NotNull
    String getDetectMemoryLeaks();

    boolean getDumpDefaultParameterValues();

    @Nullable
    Boolean getIncludeCompileClasspath();

    @NotNull
    Map<String, String> getJavacOptions();

    boolean getKeepJavacAnnotationProcessors();

    boolean getMapDiagnosticLocations();

    boolean getShowProcessorStats();

    boolean getStrictMode();

    boolean getStripMetadata();

    boolean getUseBuildCache();

    boolean getUseLightAnalysis();

    void javacOptions(@NotNull Function1<? super KaptJavacOption, Unit> action);

    void setCorrectErrorTypes(boolean z);

    void setDetectMemoryLeaks(@NotNull String str);

    void setDumpDefaultParameterValues(boolean z);

    void setIncludeCompileClasspath(@Nullable Boolean bool);

    void setKeepJavacAnnotationProcessors(boolean z);

    void setMapDiagnosticLocations(boolean z);

    void setShowProcessorStats(boolean z);

    void setStrictMode(boolean z);

    void setStripMetadata(boolean z);

    void setUseBuildCache(boolean z);

    void setUseLightAnalysis(boolean z);
}
