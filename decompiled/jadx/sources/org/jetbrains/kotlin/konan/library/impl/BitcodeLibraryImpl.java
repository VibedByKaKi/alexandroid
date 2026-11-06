package org.jetbrains.kotlin.konan.library.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.konan.library.BitcodeKotlinLibraryLayout;
import org.jetbrains.kotlin.konan.library.BitcodeLibrary;
import org.jetbrains.kotlin.konan.library.TargetedLibrary;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/konan/library/impl/BitcodeLibraryImpl;", "Lorg/jetbrains/kotlin/konan/library/BitcodeLibrary;", "Lorg/jetbrains/kotlin/konan/library/TargetedLibrary;", "access", "Lorg/jetbrains/kotlin/konan/library/impl/BitcodeLibraryAccess;", "Lorg/jetbrains/kotlin/konan/library/BitcodeKotlinLibraryLayout;", "targeted", "(Lorg/jetbrains/kotlin/konan/library/impl/BitcodeLibraryAccess;Lorg/jetbrains/kotlin/konan/library/TargetedLibrary;)V", "bitcodePaths", "", "", "getBitcodePaths", "()Ljava/util/List;", "includedPaths", "getIncludedPaths", "targetList", "getTargetList", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class BitcodeLibraryImpl implements BitcodeLibrary, TargetedLibrary {
    private final /* synthetic */ TargetedLibrary $$delegate_0;

    @NotNull
    private final BitcodeLibraryAccess<BitcodeKotlinLibraryLayout> access;

    public BitcodeLibraryImpl(@NotNull BitcodeLibraryAccess<BitcodeKotlinLibraryLayout> bitcodeLibraryAccess, @NotNull TargetedLibrary targetedLibrary) {
        bitcodeLibraryAccess.getClass();
        targetedLibrary.getClass();
        this.access = bitcodeLibraryAccess;
        this.$$delegate_0 = targetedLibrary;
    }

    @Override // org.jetbrains.kotlin.konan.library.BitcodeLibrary
    @NotNull
    public List<String> getBitcodePaths() {
        return (List) this.access.realFiles(new Function1<BitcodeKotlinLibraryLayout, List<? extends String>>() { // from class: org.jetbrains.kotlin.konan.library.impl.BitcodeLibraryImpl$bitcodePaths$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<String> invoke(@NotNull BitcodeKotlinLibraryLayout bitcodeKotlinLibraryLayout) {
                bitcodeKotlinLibraryLayout.getClass();
                List plus = CollectionsKt.plus((Collection) bitcodeKotlinLibraryLayout.getKotlinDir().getListFilesOrEmpty(), (Iterable) bitcodeKotlinLibraryLayout.getNativeDir().getListFilesOrEmpty());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
                Iterator it2 = plus.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((File) it2.next()).getAbsolutePath());
                }
                return arrayList;
            }
        });
    }

    @Override // org.jetbrains.kotlin.konan.library.TargetedLibrary
    @NotNull
    public List<String> getIncludedPaths() {
        return this.$$delegate_0.getIncludedPaths();
    }

    @Override // org.jetbrains.kotlin.konan.library.TargetedLibrary
    @NotNull
    public List<String> getTargetList() {
        return this.$$delegate_0.getTargetList();
    }
}
