package expo.modules.filesystem.unifiedfile;

import androidx.documentfile.provider.DocumentFile;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"deleteRecursively", "", "Landroidx/documentfile/provider/DocumentFile;", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSAFDocumentFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFileKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n13472#2,2:106\n*S KotlinDebug\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFileKt\n*L\n101#1:106,2\n*E\n"})
/* loaded from: classes9.dex */
public final class SAFDocumentFileKt {
    public static final boolean deleteRecursively(@NotNull DocumentFile documentFile) {
        documentFile.getClass();
        if (documentFile.isDirectory()) {
            DocumentFile[] listFiles = documentFile.listFiles();
            listFiles.getClass();
            for (DocumentFile documentFile2 : listFiles) {
                documentFile2.getClass();
                deleteRecursively(documentFile2);
            }
        }
        return documentFile.delete();
    }
}
