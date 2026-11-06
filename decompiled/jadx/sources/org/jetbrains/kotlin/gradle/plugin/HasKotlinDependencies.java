package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J!\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/HasKotlinDependencies;", "", "apiConfigurationName", "", "getApiConfigurationName", "()Ljava/lang/String;", "compileOnlyConfigurationName", "getCompileOnlyConfigurationName", "implementationConfigurationName", "getImplementationConfigurationName", "runtimeOnlyConfigurationName", "getRuntimeOnlyConfigurationName", SmartFragmentContent.DEPENDENCIES, "", "configure", "Lorg/gradle/api/Action;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinDependencyHandler;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface HasKotlinDependencies {
    void dependencies(@NotNull Function1<? super KotlinDependencyHandler, Unit> configure);

    void dependencies(@NotNull Action<KotlinDependencyHandler> configure);

    @NotNull
    String getApiConfigurationName();

    @NotNull
    String getCompileOnlyConfigurationName();

    @NotNull
    String getImplementationConfigurationName();

    @NotNull
    String getRuntimeOnlyConfigurationName();
}
