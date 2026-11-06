package org.jetbrains.kotlin.project.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.tooling.core.ClosureKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmFragment;", "", "containingModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "getContainingModule", "()Lorg/jetbrains/kotlin/project/model/KpmModule;", "declaredModuleDependencies", "", "Lorg/jetbrains/kotlin/project/model/KpmModuleDependency;", "getDeclaredModuleDependencies", "()Ljava/lang/Iterable;", "declaredRefinesDependencies", "getDeclaredRefinesDependencies", "fragmentName", "", "getFragmentName", "()Ljava/lang/String;", "kotlinSourceRoots", "Ljava/io/File;", "getKotlinSourceRoots", "languageSettings", "Lorg/jetbrains/kotlin/project/model/LanguageSettings;", "getLanguageSettings", "()Lorg/jetbrains/kotlin/project/model/LanguageSettings;", "refinesClosure", "", "getRefinesClosure", "()Ljava/util/Set;", "withRefinesClosure", "getWithRefinesClosure", "Companion", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KpmFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmFragment$Companion;", "", "()V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nKpmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KpmFragment.kt\norg/jetbrains/kotlin/project/model/KpmFragment$DefaultImpls\n+ 2 closure.kt\norg/jetbrains/kotlin/tooling/core/ClosureKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n19#2,5:65\n151#2,2:70\n24#2:72\n157#2:73\n144#2,3:74\n158#2:77\n159#2:80\n26#2,9:81\n42#2,5:90\n151#2,2:95\n47#2:97\n157#2:98\n144#2,3:99\n158#2:102\n159#2:105\n49#2,10:106\n1855#3,2:78\n1855#3,2:103\n*S KotlinDebug\n*F\n+ 1 KpmFragment.kt\norg/jetbrains/kotlin/project/model/KpmFragment$DefaultImpls\n*L\n29#1:65,5\n29#1:70,2\n29#1:72\n29#1:73\n29#1:74,3\n29#1:77\n29#1:80\n29#1:81,9\n32#1:90,5\n32#1:95,2\n32#1:97\n32#1:98\n32#1:99,3\n32#1:102\n32#1:105\n32#1:106,10\n29#1:78,2\n32#1:103,2\n*E\n"})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static Set<KpmFragment> getRefinesClosure(@NotNull KpmFragment kpmFragment) {
            List arrayDeque;
            Iterable<KpmFragment> declaredRefinesDependencies = kpmFragment.getDeclaredRefinesDependencies();
            if (declaredRefinesDependencies instanceof Collection) {
                Collection collection = (Collection) declaredRefinesDependencies;
                if (collection.isEmpty()) {
                    return SetsKt.emptySet();
                }
                arrayDeque = KotlinVersion.CURRENT.isAtLeast(1, 4) ? new ArrayDeque(collection) : new ArrayList(collection);
            } else {
                arrayDeque = KotlinVersion.CURRENT.isAtLeast(1, 4) ? new ArrayDeque(16) : new ArrayList(16);
                Iterator<KpmFragment> it2 = declaredRefinesDependencies.iterator();
                while (it2.hasNext()) {
                    arrayDeque.add(it2.next());
                }
            }
            Set<KpmFragment> createResultSet = ClosureKt.createResultSet(arrayDeque.size());
            while (!arrayDeque.isEmpty()) {
                Object remove = arrayDeque.remove(0);
                if (!Intrinsics.areEqual(remove, kpmFragment) && createResultSet.add(remove)) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayDeque, ((KpmFragment) remove).getDeclaredRefinesDependencies());
                }
            }
            return createResultSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static Set<KpmFragment> getWithRefinesClosure(@NotNull KpmFragment kpmFragment) {
            List arrayDeque;
            Iterable<KpmFragment> declaredRefinesDependencies = kpmFragment.getDeclaredRefinesDependencies();
            if (declaredRefinesDependencies instanceof Collection) {
                Collection collection = (Collection) declaredRefinesDependencies;
                if (collection.isEmpty()) {
                    return SetsKt.setOf(kpmFragment);
                }
                arrayDeque = KotlinVersion.CURRENT.isAtLeast(1, 4) ? new ArrayDeque(collection) : new ArrayList(collection);
            } else {
                arrayDeque = KotlinVersion.CURRENT.isAtLeast(1, 4) ? new ArrayDeque(16) : new ArrayList(16);
                Iterator<KpmFragment> it2 = declaredRefinesDependencies.iterator();
                while (it2.hasNext()) {
                    arrayDeque.add(it2.next());
                }
            }
            Set<KpmFragment> createResultSet = ClosureKt.createResultSet(arrayDeque.size());
            createResultSet.add(kpmFragment);
            while (!arrayDeque.isEmpty()) {
                Object remove = arrayDeque.remove(0);
                if (createResultSet.add(remove)) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayDeque, ((KpmFragment) remove).getDeclaredRefinesDependencies());
                }
            }
            return createResultSet;
        }
    }

    @NotNull
    KpmModule getContainingModule();

    @NotNull
    Iterable<KpmModuleDependency> getDeclaredModuleDependencies();

    @NotNull
    Iterable<KpmFragment> getDeclaredRefinesDependencies();

    @NotNull
    String getFragmentName();

    @NotNull
    Iterable<File> getKotlinSourceRoots();

    @Nullable
    LanguageSettings getLanguageSettings();

    @NotNull
    Set<KpmFragment> getRefinesClosure();

    @NotNull
    Set<KpmFragment> getWithRefinesClosure();
}
