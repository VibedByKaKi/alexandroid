package org.jetbrains.kotlin.project.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.project.model.KpmModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmBasicModule;", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "moduleIdentifier", "Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "(Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;)V", "fragments", "", "Lorg/jetbrains/kotlin/project/model/KpmBasicFragment;", "getFragments", "()Ljava/util/List;", "getModuleIdentifier", "()Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "plugins", "Lorg/jetbrains/kotlin/project/model/KpmCompilerPlugin;", "getPlugins", "toString", "", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class KpmBasicModule implements KpmModule {

    @NotNull
    private final List<KpmBasicFragment> fragments;

    @NotNull
    private final KpmModuleIdentifier moduleIdentifier;

    @NotNull
    private final List<KpmCompilerPlugin> plugins;

    public KpmBasicModule(@NotNull KpmModuleIdentifier kpmModuleIdentifier) {
        kpmModuleIdentifier.getClass();
        this.moduleIdentifier = kpmModuleIdentifier;
        this.fragments = new ArrayList();
        this.plugins = new ArrayList();
    }

    @Override // org.jetbrains.kotlin.project.model.KpmModule
    @NotNull
    public KpmModuleIdentifier getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmModule
    @NotNull
    public Iterable<KpmVariant> getVariants() {
        return KpmModule.DefaultImpls.getVariants(this);
    }

    @NotNull
    public String toString() {
        return "module " + getModuleIdentifier();
    }

    @Override // org.jetbrains.kotlin.project.model.KpmModule
    @NotNull
    public List<KpmBasicFragment> getFragments() {
        return this.fragments;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmModule
    @NotNull
    public List<KpmCompilerPlugin> getPlugins() {
        return this.plugins;
    }
}
