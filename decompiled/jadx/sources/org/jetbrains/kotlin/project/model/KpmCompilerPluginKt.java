package org.jetbrains.kotlin.project.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0006¨\u0006\u0007"}, d2 = {"metadataCompilationPluginData", "", "Lorg/jetbrains/kotlin/project/model/PluginData;", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "nativeMetadataCompilationPluginData", "platformCompilationPluginData", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "kotlin-project-model"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nKpmCompilerPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KpmCompilerPlugin.kt\norg/jetbrains/kotlin/project/model/KpmCompilerPluginKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1603#2,9:128\n1855#2:137\n1856#2:139\n1612#2:140\n1603#2,9:141\n1855#2:150\n1856#2:152\n1612#2:153\n1603#2,9:154\n1855#2:163\n1856#2:165\n1612#2:166\n1#3:138\n1#3:151\n1#3:164\n*S KotlinDebug\n*F\n+ 1 KpmCompilerPlugin.kt\norg/jetbrains/kotlin/project/model/KpmCompilerPluginKt\n*L\n85#1:128,9\n85#1:137\n85#1:139\n85#1:140\n90#1:141,9\n90#1:150\n90#1:152\n90#1:153\n95#1:154,9\n95#1:163\n95#1:165\n95#1:166\n85#1:138\n90#1:151\n95#1:164\n*E\n"})
/* loaded from: classes11.dex */
public final class KpmCompilerPluginKt {
    @NotNull
    public static final List<PluginData> metadataCompilationPluginData(@NotNull KpmFragment kpmFragment) {
        kpmFragment.getClass();
        Iterable<KpmCompilerPlugin> plugins = kpmFragment.getContainingModule().getPlugins();
        ArrayList arrayList = new ArrayList();
        Iterator<KpmCompilerPlugin> it2 = plugins.iterator();
        while (it2.hasNext()) {
            PluginData forMetadataCompilation = it2.next().forMetadataCompilation(kpmFragment);
            if (forMetadataCompilation != null) {
                arrayList.add(forMetadataCompilation);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<PluginData> nativeMetadataCompilationPluginData(@NotNull KpmFragment kpmFragment) {
        kpmFragment.getClass();
        Iterable<KpmCompilerPlugin> plugins = kpmFragment.getContainingModule().getPlugins();
        ArrayList arrayList = new ArrayList();
        Iterator<KpmCompilerPlugin> it2 = plugins.iterator();
        while (it2.hasNext()) {
            PluginData forNativeMetadataCompilation = it2.next().forNativeMetadataCompilation(kpmFragment);
            if (forNativeMetadataCompilation != null) {
                arrayList.add(forNativeMetadataCompilation);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<PluginData> platformCompilationPluginData(@NotNull KpmVariant kpmVariant) {
        kpmVariant.getClass();
        Iterable<KpmCompilerPlugin> plugins = kpmVariant.getContainingModule().getPlugins();
        ArrayList arrayList = new ArrayList();
        Iterator<KpmCompilerPlugin> it2 = plugins.iterator();
        while (it2.hasNext()) {
            PluginData forPlatformCompilation = it2.next().forPlatformCompilation(kpmVariant);
            if (forPlatformCompilation != null) {
                arrayList.add(forPlatformCompilation);
            }
        }
        return arrayList;
    }
}
