package org.jetbrains.kotlin.gradle.plugin;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.project.model.LanguageSettings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0005\"\u0004\b\u000e\u0010\u0007R\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/LanguageSettingsBuilder;", "Lorg/jetbrains/kotlin/project/model/LanguageSettings;", "apiVersion", "", "getApiVersion", "()Ljava/lang/String;", "setApiVersion", "(Ljava/lang/String;)V", "enabledLanguageFeatures", "", "getEnabledLanguageFeatures", "()Ljava/util/Set;", "languageVersion", "getLanguageVersion", "setLanguageVersion", "progressiveMode", "", "getProgressiveMode", "()Z", "setProgressiveMode", "(Z)V", "enableLanguageFeature", "", "name", "optIn", "annotationName", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface LanguageSettingsBuilder extends LanguageSettings {
    void enableLanguageFeature(@NotNull String name);

    @Override // org.jetbrains.kotlin.project.model.LanguageSettings
    @Nullable
    String getApiVersion();

    @Override // org.jetbrains.kotlin.project.model.LanguageSettings
    @NotNull
    Set<String> getEnabledLanguageFeatures();

    @Override // org.jetbrains.kotlin.project.model.LanguageSettings
    @Nullable
    String getLanguageVersion();

    @Override // org.jetbrains.kotlin.project.model.LanguageSettings
    boolean getProgressiveMode();

    void optIn(@NotNull String annotationName);

    void setApiVersion(@Nullable String str);

    void setLanguageVersion(@Nullable String str);

    void setProgressiveMode(boolean z);
}
