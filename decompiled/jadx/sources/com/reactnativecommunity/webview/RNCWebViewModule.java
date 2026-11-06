package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "RNCWebViewModule")
/* loaded from: classes9.dex */
public class RNCWebViewModule extends NativeRNCWebViewModuleSpec {
    private final RNCWebViewModuleImpl mRNCWebViewModuleImpl;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new RNCWebViewModuleImpl(reactApplicationContext);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.downloadFile(str);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNCWebViewModule";
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        return this.mRNCWebViewModuleImpl.grantFileDownloaderPermissions(str, str2);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.valueOf(this.mRNCWebViewModuleImpl.isFileUploadSupported()));
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.setDownloadRequest(request);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void shouldStartLoadWithLockIdentifier(boolean z, double d) {
        this.mRNCWebViewModuleImpl.shouldStartLoadWithLockIdentifier(z, d);
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z, boolean z2) {
        return this.mRNCWebViewModuleImpl.startPhotoPickerIntent(strArr, z, valueCallback, z2);
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.mRNCWebViewModuleImpl.startPhotoPickerIntent(str, valueCallback);
    }
}
