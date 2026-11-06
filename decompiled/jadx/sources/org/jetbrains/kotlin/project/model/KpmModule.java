package org.jetbrains.kotlin.project.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmModule;", "", "fragments", "", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "getFragments", "()Ljava/lang/Iterable;", "moduleIdentifier", "Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "getModuleIdentifier", "()Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "plugins", "Lorg/jetbrains/kotlin/project/model/KpmCompilerPlugin;", "getPlugins", "variants", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "getVariants", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KpmModule {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nKpmModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KpmModule.kt\norg/jetbrains/kotlin/project/model/KpmModule$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n800#2,11:33\n*S KotlinDebug\n*F\n+ 1 KpmModule.kt\norg/jetbrains/kotlin/project/model/KpmModule$DefaultImpls\n*L\n16#1:33,11\n*E\n"})
    public static final class DefaultImpls {
        @NotNull
        public static Iterable<KpmVariant> getVariants(@NotNull KpmModule kpmModule) {
            Iterable<KpmFragment> fragments = kpmModule.getFragments();
            ArrayList arrayList = new ArrayList();
            for (KpmFragment kpmFragment : fragments) {
                if (kpmFragment instanceof KpmVariant) {
                    arrayList.add(kpmFragment);
                }
            }
            return arrayList;
        }
    }

    @NotNull
    Iterable<KpmFragment> getFragments();

    @NotNull
    KpmModuleIdentifier getModuleIdentifier();

    @NotNull
    Iterable<KpmCompilerPlugin> getPlugins();

    @NotNull
    Iterable<KpmVariant> getVariants();
}
