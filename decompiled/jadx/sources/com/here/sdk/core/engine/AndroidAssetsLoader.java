package com.here.sdk.core.engine;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class AndroidAssetsLoader implements AssetsLoader {
    private static final String LOG_TAG = "AndroidAssetsLoader";
    private final Context m_context;

    public AndroidAssetsLoader(Context context) {
        this.m_context = context;
    }

    private ByteArrayOutputStream loadAssetStream(@NonNull String str) {
        try {
            InputStream open = this.m_context.getAssets().open(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        open.close();
                        return byteArrayOutputStream;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to load asset stream " + str, e);
            return new ByteArrayOutputStream();
        }
    }

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public boolean checkAssetAvailability(@NonNull String str) {
        try {
            this.m_context.getAssets().open(str).close();
            return true;
        } catch (Exception e) {
            Log.i(LOG_TAG, "Asset with path - " + str + " could not been found", e);
            return false;
        }
    }

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public String getAssetsPath() {
        return this.m_context.getFilesDir().getAbsolutePath();
    }

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public List<String> getSubfolderNames(@NonNull String str) {
        String[] strArr = new String[0];
        try {
            strArr = this.m_context.getAssets().list(str);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Failed to list assets at " + str, e);
        }
        return Arrays.asList(strArr);
    }

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public String loadAsset(@NonNull String str) {
        try {
            return loadAssetStream(str).toString("UTF-8");
        } catch (Exception e) {
            a$$ExternalSyntheticOutline0.m("Failed to load ", str, LOG_TAG, e);
            return "";
        }
    }

    @Override // com.here.sdk.core.engine.AssetsLoader
    @NonNull
    public byte[] loadAssetBlob(@NonNull String str) {
        return loadAssetStream(str).toByteArray();
    }
}
