package com.amazon.alexa.photos.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.photos.autosave.UploadRequestMetadata;
import com.amazon.photos.autosave.UploadRequestMetadataProvider;
import com.amazon.photos.discovery.FolderPathsToScanProvider;
import com.amazon.photos.uploader.ResultMetadata;
import com.amazon.photos.uploader.UploadErrorCategory;
import com.amazon.photos.uploader.UploadRequest;
import com.amazon.photos.uploader.blockers.Blocker;
import com.amazon.photos.uploader.observables.AbandonedRequestInfo;
import com.amazon.photos.uploader.observables.UploadRequestObserver;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AccessoryDataProvider {
    private final FolderPathsToScanProvider folderPathsProvider;
    private final UploadRequestMetadataProvider metaDataProvider;
    private final UploadRequestObserver uploadRequestObserver;

    public AccessoryDataProvider(FolderPathsToScanProvider folderPathsToScanProvider, UploadRequestMetadataProvider uploadRequestMetadataProvider, UploadRequestObserver uploadRequestObserver) {
        this.folderPathsProvider = folderPathsToScanProvider;
        this.metaDataProvider = uploadRequestMetadataProvider;
        this.uploadRequestObserver = uploadRequestObserver;
    }

    public static AccessoryDataProvider getEmptyInstance() {
        return new AccessoryDataProvider(new FolderPathsToScanProvider() { // from class: com.amazon.alexa.photos.api.AccessoryDataProvider.1
            @Override // com.amazon.photos.discovery.FolderPathsToScanProvider
            @NonNull
            public List<String> folderPathPrefixToScan() {
                return Collections.EMPTY_LIST;
            }
        }, new UploadRequestMetadataProvider() { // from class: com.amazon.alexa.photos.api.AccessoryDataProvider.2
            @Override // com.amazon.photos.autosave.UploadRequestMetadataProvider
            @Nullable
            public UploadRequestMetadata getRequestMetadata(@NonNull String str) {
                return null;
            }

            @Override // com.amazon.photos.autosave.UploadRequestMetadataProvider
            @Nullable
            public String getVisualCollectionParentId(@NonNull String str) {
                return null;
            }
        }, new UploadRequestObserver() { // from class: com.amazon.alexa.photos.api.AccessoryDataProvider.3
            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onUploadBlocked(@NonNull UploadRequest uploadRequest, @NonNull Set<? extends Blocker> set) {
            }

            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onRequestAdded(@NonNull UploadRequest uploadRequest) {
            }

            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onRequestsAbandoned(@NonNull List<AbandonedRequestInfo> list) {
            }

            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onUploadStarted(@NonNull UploadRequest uploadRequest) {
            }

            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onUploadBlocked(@NonNull UploadRequest uploadRequest, @NonNull Blocker blocker) {
            }

            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onUploadSucceeded(@NonNull UploadRequest uploadRequest, @NonNull ResultMetadata resultMetadata) {
            }

            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onUploadFailed(@NonNull UploadRequest uploadRequest, @Nullable Throwable th, @NonNull UploadErrorCategory uploadErrorCategory) {
            }

            @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
            public void onUploadProgressUpdate(@NonNull UploadRequest uploadRequest, long j, long j2) {
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessoryDataProvider)) {
            return false;
        }
        AccessoryDataProvider accessoryDataProvider = (AccessoryDataProvider) obj;
        return Objects.equals(this.folderPathsProvider, accessoryDataProvider.folderPathsProvider) && Objects.equals(this.metaDataProvider, accessoryDataProvider.metaDataProvider) && Objects.equals(this.uploadRequestObserver, accessoryDataProvider.uploadRequestObserver);
    }

    public FolderPathsToScanProvider getFolderPathsProvider() {
        return this.folderPathsProvider;
    }

    public UploadRequestMetadataProvider getMetaDataProvider() {
        return this.metaDataProvider;
    }

    public UploadRequestObserver getUploadRequestObserver() {
        return this.uploadRequestObserver;
    }

    public int hashCode() {
        return Objects.hash(this.folderPathsProvider, this.metaDataProvider, this.uploadRequestObserver);
    }

    public String toString() {
        return "AccessoryDataProvider{folderPathsProvider=" + this.folderPathsProvider + ", metaDataProvider=" + this.metaDataProvider + ", uploadRequestObserver=" + this.uploadRequestObserver + AbstractJsonLexerKt.END_OBJ;
    }
}
