package org.jetbrains.kotlin.library;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.file.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/IrKotlinLibraryLayout;", "Lorg/jetbrains/kotlin/library/KotlinLibraryLayout;", "dataFlowGraphFile", "Lorg/jetbrains/kotlin/konan/file/File;", "getDataFlowGraphFile", "()Lorg/jetbrains/kotlin/konan/file/File;", "irBodies", "getIrBodies", "irDebugInfo", "getIrDebugInfo", "irDeclarations", "getIrDeclarations", "irDir", "getIrDir", "irFiles", "getIrFiles", "irSignatures", "getIrSignatures", "irStrings", "getIrStrings", "irTypes", "getIrTypes", "file", "irFile", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface IrKotlinLibraryLayout extends KotlinLibraryLayout {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static File getComponentDir(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getComponentDir();
        }

        @Deprecated
        @NotNull
        public static File getDataFlowGraphFile(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getDataFlowGraphFile();
        }

        @Deprecated
        @NotNull
        public static File getIrBodies(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrBodies();
        }

        @Deprecated
        @NotNull
        public static File getIrDebugInfo(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrDebugInfo();
        }

        @Deprecated
        @NotNull
        public static File getIrDeclarations(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrDeclarations();
        }

        @Deprecated
        @NotNull
        public static File getIrDir(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrDir();
        }

        @Deprecated
        @NotNull
        public static File getIrFiles(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrFiles();
        }

        @Deprecated
        @NotNull
        public static File getIrSignatures(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrSignatures();
        }

        @Deprecated
        @NotNull
        public static File getIrStrings(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrStrings();
        }

        @Deprecated
        @NotNull
        public static File getIrTypes(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getIrTypes();
        }

        @Deprecated
        @NotNull
        public static String getLibraryName(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getLibraryName();
        }

        @Deprecated
        @NotNull
        public static File getManifestFile(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getManifestFile();
        }

        @Deprecated
        @NotNull
        public static File getPre_1_4_manifest(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getPre_1_4_manifest();
        }

        @Deprecated
        @NotNull
        public static File getResourcesDir(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
            return IrKotlinLibraryLayout.super.getResourcesDir();
        }

        @Deprecated
        @NotNull
        public static File irBodies(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout, @NotNull File file) {
            file.getClass();
            return IrKotlinLibraryLayout.super.irBodies(file);
        }

        @Deprecated
        @NotNull
        public static File irDebugInfo(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout, @NotNull File file) {
            file.getClass();
            return IrKotlinLibraryLayout.super.irDebugInfo(file);
        }

        @Deprecated
        @NotNull
        public static File irDeclarations(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout, @NotNull File file) {
            file.getClass();
            return IrKotlinLibraryLayout.super.irDeclarations(file);
        }

        @Deprecated
        @NotNull
        public static File irFile(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout, @NotNull File file) {
            file.getClass();
            return IrKotlinLibraryLayout.super.irFile(file);
        }

        @Deprecated
        @NotNull
        public static File irSignatures(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout, @NotNull File file) {
            file.getClass();
            return IrKotlinLibraryLayout.super.irSignatures(file);
        }

        @Deprecated
        @NotNull
        public static File irStrings(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout, @NotNull File file) {
            file.getClass();
            return IrKotlinLibraryLayout.super.irStrings(file);
        }

        @Deprecated
        @NotNull
        public static File irTypes(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout, @NotNull File file) {
            file.getClass();
            return IrKotlinLibraryLayout.super.irTypes(file);
        }
    }

    @NotNull
    default File getDataFlowGraphFile() {
        return new File(getIrDir(), "module_data_flow_graph");
    }

    @NotNull
    default File getIrBodies() {
        return new File(getIrDir(), "bodies.knb");
    }

    @NotNull
    default File getIrDebugInfo() {
        return new File(getIrDir(), "debugInfo.knd");
    }

    @NotNull
    default File getIrDeclarations() {
        return new File(getIrDir(), "irDeclarations.knd");
    }

    @NotNull
    default File getIrDir() {
        return new File(getComponentDir(), KotlinLibraryLayoutKt.KLIB_IR_FOLDER_NAME);
    }

    @NotNull
    default File getIrFiles() {
        return new File(getIrDir(), "files.knf");
    }

    @NotNull
    default File getIrSignatures() {
        return new File(getIrDir(), "signatures.knt");
    }

    @NotNull
    default File getIrStrings() {
        return new File(getIrDir(), "strings.knt");
    }

    @NotNull
    default File getIrTypes() {
        return new File(getIrDir(), "types.knt");
    }

    @NotNull
    default File irBodies(@NotNull File file) {
        file.getClass();
        return new File(file, "body.knb");
    }

    @NotNull
    default File irDebugInfo(@NotNull File file) {
        file.getClass();
        return new File(file, "debugInfo.knd");
    }

    @NotNull
    default File irDeclarations(@NotNull File file) {
        file.getClass();
        return new File(file, "irDeclarations.knd");
    }

    @NotNull
    default File irFile(@NotNull File file) {
        file.getClass();
        return new File(file, "file.knf");
    }

    @NotNull
    default File irSignatures(@NotNull File file) {
        file.getClass();
        return new File(file, "signatures.knt");
    }

    @NotNull
    default File irStrings(@NotNull File file) {
        file.getClass();
        return new File(file, "strings.knt");
    }

    @NotNull
    default File irTypes(@NotNull File file) {
        file.getClass();
        return new File(file, "types.knt");
    }
}
