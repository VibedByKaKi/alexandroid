package expo.modules.filesystem.legacy;

import com.dee.app.contacts.common.constants.Constants;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "EXDownloadProgressEventName", "EXUploadProgressEventName", "MIN_EVENT_DT_MS", "", "DIR_PERMISSIONS_REQUEST_CODE", "", "slashifyFilePath", "path", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FileSystemLegacyModuleKt {
    private static final int DIR_PERMISSIONS_REQUEST_CODE = 5394;

    @NotNull
    private static final String EXDownloadProgressEventName = "expo-file-system.downloadProgress";

    @NotNull
    private static final String EXUploadProgressEventName = "expo-file-system.uploadProgress";
    private static final long MIN_EVENT_DT_MS = 100;
    private static final String TAG = "FileSystemLegacyModule";

    @Nullable
    public static final String slashifyFilePath(@Nullable String str) {
        boolean startsWith$default;
        if (str == null) {
            return null;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "file:///", false, 2, null);
        return startsWith$default ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
