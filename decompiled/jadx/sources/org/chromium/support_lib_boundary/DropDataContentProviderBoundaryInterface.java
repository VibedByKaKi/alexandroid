package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import org.jspecify.annotations.NullMarked;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NullMarked
/* loaded from: classes11.dex */
public interface DropDataContentProviderBoundaryInterface {
    Uri cache(byte[] bArr, String str, String str2);

    Bundle call(String str, String str2, Bundle bundle);

    String[] getStreamTypes(Uri uri, String str);

    String getType(Uri uri);

    boolean onCreate();

    void onDragEnd(boolean z);

    ParcelFileDescriptor openFile(ContentProvider contentProvider, Uri uri) throws FileNotFoundException;

    Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    void setClearCachedDataIntervalMs(int i);
}
