package org.jetbrains.kotlin.library;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.file.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "", JsonFields.COMPONENT, "", "getComponent", "()Ljava/lang/String;", "componentDir", "Lorg/jetbrains/kotlin/konan/file/File;", "getComponentDir", "()Lorg/jetbrains/kotlin/konan/file/File;", "libFile", "getLibFile", "libraryName", "getLibraryName", "manifestFile", "getManifestFile", "pre_1_4_manifest", "getPre_1_4_manifest", "resourcesDir", "getResourcesDir", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinLibraryLayout {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static File getComponentDir(@NotNull KotlinLibraryLayout kotlinLibraryLayout) {
            return KotlinLibraryLayout.super.getComponentDir();
        }

        @Deprecated
        @NotNull
        public static String getLibraryName(@NotNull KotlinLibraryLayout kotlinLibraryLayout) {
            return KotlinLibraryLayout.super.getLibraryName();
        }

        @Deprecated
        @NotNull
        public static File getManifestFile(@NotNull KotlinLibraryLayout kotlinLibraryLayout) {
            return KotlinLibraryLayout.super.getManifestFile();
        }

        @Deprecated
        @NotNull
        public static File getPre_1_4_manifest(@NotNull KotlinLibraryLayout kotlinLibraryLayout) {
            return KotlinLibraryLayout.super.getPre_1_4_manifest();
        }

        @Deprecated
        @NotNull
        public static File getResourcesDir(@NotNull KotlinLibraryLayout kotlinLibraryLayout) {
            return KotlinLibraryLayout.super.getResourcesDir();
        }
    }

    @Nullable
    String getComponent();

    @NotNull
    default File getComponentDir() {
        File libFile = getLibFile();
        String component = getComponent();
        component.getClass();
        return new File(libFile, component);
    }

    @NotNull
    File getLibFile();

    @NotNull
    default String getLibraryName() {
        return getLibFile().getPath();
    }

    @NotNull
    default File getManifestFile() {
        return new File(getComponentDir(), KotlinLibraryLayoutKt.KLIB_MANIFEST_FILE_NAME);
    }

    @NotNull
    default File getPre_1_4_manifest() {
        return new File(getLibFile(), KotlinLibraryLayoutKt.KLIB_MANIFEST_FILE_NAME);
    }

    @NotNull
    default File getResourcesDir() {
        return new File(getComponentDir(), "resources");
    }
}
