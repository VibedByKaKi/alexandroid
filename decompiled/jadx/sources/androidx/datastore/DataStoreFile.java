package androidx.datastore;

import android.content.Context;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"dataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", "fileName", "", "datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "DataStoreFile")
/* loaded from: classes13.dex */
public final class DataStoreFile {
    @NotNull
    public static final File dataStoreFile(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), a$$ExternalSyntheticOutline0.m("datastore/", str));
    }
}
