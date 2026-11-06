package org.jetbrains.kotlin.library;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/MetadataKotlinLibraryLayout;", "Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "metadataDir", "Lorg/jetbrains/kotlin/konan/file/File;", "getMetadataDir", "()Lorg/jetbrains/kotlin/konan/file/File;", "moduleHeaderFile", "getModuleHeaderFile", "packageFragmentFile", "packageFqName", "", "partName", "packageFragmentsDir", "packageName", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface MetadataKotlinLibraryLayout extends KotlinLibraryLayout {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static File getComponentDir(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout) {
            return MetadataKotlinLibraryLayout.super.getComponentDir();
        }

        @Deprecated
        @NotNull
        public static String getLibraryName(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout) {
            return MetadataKotlinLibraryLayout.super.getLibraryName();
        }

        @Deprecated
        @NotNull
        public static File getManifestFile(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout) {
            return MetadataKotlinLibraryLayout.super.getManifestFile();
        }

        @Deprecated
        @NotNull
        public static File getMetadataDir(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout) {
            return MetadataKotlinLibraryLayout.super.getMetadataDir();
        }

        @Deprecated
        @NotNull
        public static File getModuleHeaderFile(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout) {
            return MetadataKotlinLibraryLayout.super.getModuleHeaderFile();
        }

        @Deprecated
        @NotNull
        public static File getPre_1_4_manifest(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout) {
            return MetadataKotlinLibraryLayout.super.getPre_1_4_manifest();
        }

        @Deprecated
        @NotNull
        public static File getResourcesDir(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout) {
            return MetadataKotlinLibraryLayout.super.getResourcesDir();
        }

        @Deprecated
        @NotNull
        public static File packageFragmentFile(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout, @NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return MetadataKotlinLibraryLayout.super.packageFragmentFile(str, str2);
        }

        @Deprecated
        @NotNull
        public static File packageFragmentsDir(@NotNull MetadataKotlinLibraryLayout metadataKotlinLibraryLayout, @NotNull String str) {
            str.getClass();
            return MetadataKotlinLibraryLayout.super.packageFragmentsDir(str);
        }
    }

    @NotNull
    default File getMetadataDir() {
        return new File(getComponentDir(), "linkdata");
    }

    @NotNull
    default File getModuleHeaderFile() {
        return new File(getMetadataDir(), "module");
    }

    @NotNull
    default File packageFragmentFile(@NotNull String packageFqName, @NotNull String partName) {
        packageFqName.getClass();
        partName.getClass();
        return new File(packageFragmentsDir(packageFqName), BitVector$$ExternalSyntheticOutline0.m(partName, KotlinLibraryUtilsKt.KLIB_METADATA_FILE_EXTENSION_WITH_DOT));
    }

    @NotNull
    default File packageFragmentsDir(@NotNull String packageName) {
        packageName.getClass();
        return new File(getMetadataDir(), Intrinsics.areEqual(packageName, "") ? "root_package" : a$$ExternalSyntheticOutline0.m("package_", packageName));
    }
}
