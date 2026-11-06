package org.jetbrains.kotlin.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"parseKotlinAbiVersion", "Lorg/jetbrains/kotlin/library/KotlinAbiVersion;", "", "kotlin-util-klib"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nKotlinAbiVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinAbiVersion.kt\norg/jetbrains/kotlin/library/KotlinAbiVersionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1549#2:82\n1620#2,3:83\n*S KotlinDebug\n*F\n+ 1 KotlinAbiVersion.kt\norg/jetbrains/kotlin/library/KotlinAbiVersionKt\n*L\n20#1:82\n20#1:83,3\n*E\n"})
/* loaded from: classes11.dex */
public final class KotlinAbiVersionKt {
    @NotNull
    public static final KotlinAbiVersion parseKotlinAbiVersion(@NotNull String str) {
        List split$default;
        str.getClass();
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, (Object) null);
        List list = split$default;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
        }
        int size = arrayList.size();
        if (size == 1) {
            return new KotlinAbiVersion(((Number) arrayList.get(0)).intValue());
        }
        if (size == 3) {
            return new KotlinAbiVersion(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList.get(2)).intValue());
        }
        throw new IllegalStateException("Could not parse abi version: ".concat(str).toString());
    }
}
