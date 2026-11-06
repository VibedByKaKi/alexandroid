package com.amazon.alexa.accessory.frames.amazonphotos;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.photos.discovery.FolderPathsToScanProvider;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FramesFolderPathsToScanProvider implements FolderPathsToScanProvider {
    private static final String TAG = "FramesFolderPathsToScanProvider";

    @Override // com.amazon.photos.discovery.FolderPathsToScanProvider
    @NonNull
    public List<String> folderPathPrefixToScan() {
        Log.d(TAG, "get frames folder path to scan");
        return Collections.singletonList(AmazonPhotosConstants.ALBUM_LOCAL_PATH);
    }
}
