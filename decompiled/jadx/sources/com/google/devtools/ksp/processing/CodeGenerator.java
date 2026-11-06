package com.google.devtools.ksp.processing;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.google.devtools.ksp.symbol.KSClassDeclaration;
import com.google.devtools.ksp.symbol.KSFile;
import java.io.File;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH&J0\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH&J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/google/devtools/ksp/processing/CodeGenerator;", "", "generatedFile", "", "Ljava/io/File;", "getGeneratedFile", "()Ljava/util/Collection;", "associate", "", NativeLibraryConstantsKt.KONAN_DISTRIBUTION_SOURCES_DIR, "", "Lcom/google/devtools/ksp/symbol/KSFile;", "packageName", "", "fileName", "extensionName", "associateWithClasses", "classes", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "createNewFile", "Ljava/io/OutputStream;", SmartFragmentContent.DEPENDENCIES, "Lcom/google/devtools/ksp/processing/Dependencies;", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface CodeGenerator {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void associate$default(CodeGenerator codeGenerator, List list, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: associate");
            return;
        }
        if ((i & 8) != 0) {
            str3 = "kt";
        }
        codeGenerator.associate(list, str, str2, str3);
    }

    static /* synthetic */ void associateWithClasses$default(CodeGenerator codeGenerator, List list, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: associateWithClasses");
            return;
        }
        if ((i & 8) != 0) {
            str3 = "kt";
        }
        codeGenerator.associateWithClasses(list, str, str2, str3);
    }

    static /* synthetic */ OutputStream createNewFile$default(CodeGenerator codeGenerator, Dependencies dependencies, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: createNewFile");
            return null;
        }
        if ((i & 8) != 0) {
            str3 = "kt";
        }
        return codeGenerator.createNewFile(dependencies, str, str2, str3);
    }

    void associate(@NotNull List<? extends KSFile> sources, @NotNull String packageName, @NotNull String fileName, @NotNull String extensionName);

    void associateWithClasses(@NotNull List<? extends KSClassDeclaration> classes, @NotNull String packageName, @NotNull String fileName, @NotNull String extensionName);

    @NotNull
    OutputStream createNewFile(@NotNull Dependencies dependencies, @NotNull String packageName, @NotNull String fileName, @NotNull String extensionName);

    @NotNull
    Collection<File> getGeneratedFile();
}
