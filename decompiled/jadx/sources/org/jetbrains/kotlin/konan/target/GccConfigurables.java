package org.jetbrains.kotlin.konan.target;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/GccConfigurables;", "Lorg/jetbrains/kotlin/konan/target/Configurables;", "Lorg/jetbrains/kotlin/konan/target/ClangFlags;", "abiSpecificLibraries", "", "", "getAbiSpecificLibraries", "()Ljava/util/List;", "absoluteGccToolchain", "getAbsoluteGccToolchain", "()Ljava/lang/String;", "absoluteLinker", "getAbsoluteLinker", "crtFilesLocation", "getCrtFilesLocation", "dynamicLinker", "getDynamicLinker", "gccToolchain", "getGccToolchain", "libGcc", "getLibGcc", "linker", "getLinker", "linkerGccFlags", "getLinkerGccFlags", "linkerHostSpecificFlags", "getLinkerHostSpecificFlags", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface GccConfigurables extends Configurables, ClangFlags {
    @NotNull
    default List<String> getAbiSpecificLibraries() {
        return targetList("abiSpecificLibraries");
    }

    @NotNull
    default String getAbsoluteGccToolchain() {
        return absolute(getGccToolchain());
    }

    @NotNull
    default String getAbsoluteLinker() {
        return absolute(getLinker());
    }

    @NotNull
    default String getCrtFilesLocation() {
        String targetString = targetString("crtFilesLocation");
        targetString.getClass();
        return targetString;
    }

    @NotNull
    default String getDynamicLinker() {
        String targetString = targetString("dynamicLinker");
        targetString.getClass();
        return targetString;
    }

    @Nullable
    default String getGccToolchain() {
        return targetString("gccToolchain");
    }

    @NotNull
    default String getLibGcc() {
        String targetString = targetString("libGcc");
        targetString.getClass();
        return targetString;
    }

    @Nullable
    default String getLinker() {
        return hostTargetString("linker");
    }

    @NotNull
    default List<String> getLinkerGccFlags() {
        return targetList("linkerGccFlags");
    }

    @NotNull
    default List<String> getLinkerHostSpecificFlags() {
        return hostTargetList("linkerHostSpecificFlags");
    }
}
