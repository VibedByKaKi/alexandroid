package expo.modules.filesystem;

import android.content.Context;
import android.net.Uri;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import expo.modules.filesystem.unifiedfile.AssetFile;
import expo.modules.filesystem.unifiedfile.JavaFile;
import expo.modules.filesystem.unifiedfile.SAFDocumentFile;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.interfaces.filesystem.Permission;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H&J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0000J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0000J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006+"}, d2 = {"Lexpo/modules/filesystem/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "setUri", "fileAdapter", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "file", "getFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "javaFile", "Ljava/io/File;", "getJavaFile", "()Ljava/io/File;", "delete", "", "validateType", "getMoveOrCopyPath", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, "validatePermission", "permission", "Lexpo/modules/interfaces/filesystem/Permission;", "checkPermission", "", "validateCanCreate", "options", "Lexpo/modules/filesystem/CreateOptions;", "copy", TypedValues.TransitionType.S_TO, "move", "rename", "newName", "", "modificationTime", "", "getModificationTime", "()Ljava/lang/Long;", "creationTime", "getCreationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileSystemPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystemPath.kt\nexpo/modules/filesystem/FileSystemPath\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,179:1\n36#2:180\n36#2:181\n36#2:182\n36#2:183\n*S KotlinDebug\n*F\n+ 1 FileSystemPath.kt\nexpo/modules/filesystem/FileSystemPath\n*L\n148#1:180\n152#1:181\n162#1:182\n166#1:183\n*E\n"})
/* loaded from: classes9.dex */
public abstract class FileSystemPath extends SharedObject {

    @Nullable
    private UnifiedFileInterface fileAdapter;

    @NotNull
    private Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemPath(@NotNull Uri uri) {
        super(null, 1, null);
        uri.getClass();
        this.uri = uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean checkPermission(@org.jetbrains.annotations.NotNull expo.modules.interfaces.filesystem.Permission r3) {
        /*
            r2 = this;
            r3.getClass()
            android.net.Uri r0 = r2.uri
            boolean r0 = expo.modules.filesystem.FileSystemPathKt.isContentUri(r0)
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            android.net.Uri r0 = r2.uri
            boolean r0 = expo.modules.filesystem.FileSystemPathKt.isAssetUri(r0)
            if (r0 == 0) goto L16
            return r1
        L16:
            expo.modules.kotlin.AppContext r0 = r2.getAppContext()
            if (r0 == 0) goto L3c
            expo.modules.interfaces.filesystem.FilePermissionModuleInterface r0 = r0.getFilePermission()
            if (r0 == 0) goto L3c
            expo.modules.kotlin.AppContext r1 = r2.getAppContext()
            if (r1 == 0) goto L2d
            android.content.Context r1 = r1.getReactContext()
            goto L2e
        L2d:
            r1 = 0
        L2e:
            java.io.File r2 = r2.getJavaFile()
            java.lang.String r2 = r2.getPath()
            java.util.EnumSet r2 = r0.getPathPermissions(r1, r2)
            if (r2 != 0) goto L42
        L3c:
            java.lang.Class<expo.modules.interfaces.filesystem.Permission> r2 = expo.modules.interfaces.filesystem.Permission.class
            java.util.EnumSet r2 = java.util.EnumSet.noneOf(r2)
        L42:
            boolean r2 = r2.contains(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemPath.checkPermission(expo.modules.interfaces.filesystem.Permission):boolean");
    }

    public final void copy(@NotNull FileSystemPath to) {
        to.getClass();
        validateType();
        to.validateType();
        validatePermission(Permission.READ);
        to.validatePermission(Permission.WRITE);
        FilesKt__UtilsKt.copyRecursively$default(getJavaFile(), getMoveOrCopyPath(to), false, null, 6, null);
    }

    public final void delete() {
        if (!getFile().exists()) {
            throw new UnableToDeleteException(Automotive$$ExternalSyntheticOutline0.m(getFile().getUri(), "uri '", "' does not exist"));
        }
        if (getFile().isDirectory()) {
            if (!getFile().deleteRecursively()) {
                throw new UnableToDeleteException(Automotive$$ExternalSyntheticOutline0.m(getFile().getUri(), "failed to delete '", "'"));
            }
        } else if (!getFile().delete()) {
            throw new UnableToDeleteException(Automotive$$ExternalSyntheticOutline0.m(getFile().getUri(), "failed to delete '", "'"));
        }
    }

    @Nullable
    public final Long getCreationTime() {
        return getFile().getCreationTime();
    }

    @NotNull
    public final UnifiedFileInterface getFile() {
        UnifiedFileInterface javaFile;
        Context reactContext;
        Context reactContext2;
        UnifiedFileInterface unifiedFileInterface = this.fileAdapter;
        if (Intrinsics.areEqual(unifiedFileInterface != null ? unifiedFileInterface.getUri() : null, this.uri)) {
            return unifiedFileInterface;
        }
        if (FileSystemPathKt.isContentUri(this.uri)) {
            AppContext appContext = getAppContext();
            if (appContext == null || (reactContext2 = appContext.getReactContext()) == null) {
                throw new Exception("No context");
            }
            javaFile = new SAFDocumentFile(reactContext2, this.uri);
        } else if (FileSystemPathKt.isAssetUri(this.uri)) {
            AppContext appContext2 = getAppContext();
            if (appContext2 == null || (reactContext = appContext2.getReactContext()) == null) {
                throw new Exception("No context");
            }
            javaFile = new AssetFile(reactContext, this.uri);
        } else {
            javaFile = new JavaFile(this.uri);
        }
        this.fileAdapter = javaFile;
        return javaFile;
    }

    @NotNull
    public final File getJavaFile() {
        if (FileSystemPathKt.isContentUri(this.uri)) {
            throw new Exception(ErrorUtils$$ExternalSyntheticOutline0.m(this.uri, "This method cannot be used with content URIs: "));
        }
        Object file = getFile();
        file.getClass();
        return (File) file;
    }

    @Nullable
    public final Long getModificationTime() {
        validateType();
        return getFile().lastModified();
    }

    @NotNull
    public final File getMoveOrCopyPath(@NotNull FileSystemPath destination) {
        destination.getClass();
        if (!(destination instanceof FileSystemDirectory)) {
            if (!(this instanceof FileSystemFile)) {
                throw new CopyOrMoveDirectoryToFileException();
            }
            File parentFile = destination.getJavaFile().getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new DestinationDoesNotExistException();
            }
            return destination.getJavaFile();
        }
        if (this instanceof FileSystemFile) {
            if (((FileSystemDirectory) destination).getExists()) {
                return new File(destination.getJavaFile(), getJavaFile().getName());
            }
            throw new DestinationDoesNotExistException();
        }
        if (((FileSystemDirectory) destination).getExists()) {
            return new File(destination.getJavaFile(), getJavaFile().getName());
        }
        File parentFile2 = destination.getJavaFile().getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new DestinationDoesNotExistException();
        }
        return destination.getJavaFile();
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final void move(@NotNull FileSystemPath to) {
        to.getClass();
        validateType();
        to.validateType();
        Permission permission = Permission.WRITE;
        validatePermission(permission);
        to.validatePermission(permission);
        File moveOrCopyPath = getMoveOrCopyPath(to);
        Path path = getJavaFile().toPath();
        path.getClass();
        Path path2 = moveOrCopyPath.toPath();
        path2.getClass();
        Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)).getClass();
        this.uri = Uri.fromFile(moveOrCopyPath);
    }

    public final void rename(@NotNull String newName) {
        newName.getClass();
        validateType();
        validatePermission(Permission.WRITE);
        File file = new File(getJavaFile().getParent(), newName);
        Path path = getJavaFile().toPath();
        path.getClass();
        Path path2 = file.toPath();
        path2.getClass();
        Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)).getClass();
        this.uri = Uri.fromFile(file);
    }

    public final void setUri(@NotNull Uri uri) {
        uri.getClass();
        this.uri = uri;
    }

    public final void validateCanCreate(@NotNull CreateOptions options) {
        options.getClass();
        if (!options.getOverwrite() && getFile().exists()) {
            throw new UnableToCreateException("it already exists");
        }
    }

    public final void validatePermission(@NotNull Permission permission) {
        permission.getClass();
        if (!checkPermission(permission)) {
            throw new InvalidPermissionException(permission);
        }
    }

    public abstract void validateType();
}
