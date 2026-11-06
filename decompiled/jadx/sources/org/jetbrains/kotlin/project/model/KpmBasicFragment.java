package org.jetbrains.kotlin.project.model;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.project.model.KpmFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmBasicFragment;", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "containingModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "fragmentName", "", "languageSettings", "Lorg/jetbrains/kotlin/project/model/LanguageSettings;", "(Lorg/jetbrains/kotlin/project/model/KpmModule;Ljava/lang/String;Lorg/jetbrains/kotlin/project/model/LanguageSettings;)V", "getContainingModule", "()Lorg/jetbrains/kotlin/project/model/KpmModule;", "declaredModuleDependencies", "", "Lorg/jetbrains/kotlin/project/model/KpmModuleDependency;", "getDeclaredModuleDependencies", "()Ljava/util/Set;", "declaredRefinesDependencies", "getDeclaredRefinesDependencies", "getFragmentName", "()Ljava/lang/String;", "kotlinSourceRoots", "", "Ljava/io/File;", "getKotlinSourceRoots", "()Ljava/lang/Iterable;", "setKotlinSourceRoots", "(Ljava/lang/Iterable;)V", "getLanguageSettings", "()Lorg/jetbrains/kotlin/project/model/LanguageSettings;", "toString", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class KpmBasicFragment implements KpmFragment {

    @NotNull
    private final KpmModule containingModule;

    @NotNull
    private final Set<KpmModuleDependency> declaredModuleDependencies;

    @NotNull
    private final Set<KpmBasicFragment> declaredRefinesDependencies;

    @NotNull
    private final String fragmentName;

    @NotNull
    private Iterable<? extends File> kotlinSourceRoots;

    @Nullable
    private final LanguageSettings languageSettings;

    public KpmBasicFragment(@NotNull KpmModule kpmModule, @NotNull String str, @Nullable LanguageSettings languageSettings) {
        kpmModule.getClass();
        str.getClass();
        this.containingModule = kpmModule;
        this.fragmentName = str;
        this.languageSettings = languageSettings;
        this.declaredRefinesDependencies = new LinkedHashSet();
        this.declaredModuleDependencies = new LinkedHashSet();
        this.kotlinSourceRoots = CollectionsKt.emptyList();
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @NotNull
    public KpmModule getContainingModule() {
        return this.containingModule;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @NotNull
    public String getFragmentName() {
        return this.fragmentName;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @NotNull
    public Iterable<File> getKotlinSourceRoots() {
        return this.kotlinSourceRoots;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @Nullable
    public LanguageSettings getLanguageSettings() {
        return this.languageSettings;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @NotNull
    public Set<KpmFragment> getRefinesClosure() {
        return KpmFragment.DefaultImpls.getRefinesClosure(this);
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @NotNull
    public Set<KpmFragment> getWithRefinesClosure() {
        return KpmFragment.DefaultImpls.getWithRefinesClosure(this);
    }

    public void setKotlinSourceRoots(@NotNull Iterable<? extends File> iterable) {
        iterable.getClass();
        this.kotlinSourceRoots = iterable;
    }

    @NotNull
    public String toString() {
        return "fragment " + getFragmentName();
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @NotNull
    public Set<KpmModuleDependency> getDeclaredModuleDependencies() {
        return this.declaredModuleDependencies;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmFragment
    @NotNull
    public Set<KpmBasicFragment> getDeclaredRefinesDependencies() {
        return this.declaredRefinesDependencies;
    }

    public /* synthetic */ KpmBasicFragment(KpmModule kpmModule, String str, LanguageSettings languageSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kpmModule, str, (i & 4) != 0 ? null : languageSettings);
    }
}
