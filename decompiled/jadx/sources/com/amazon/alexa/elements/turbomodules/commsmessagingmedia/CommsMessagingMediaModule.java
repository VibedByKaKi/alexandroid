package com.amazon.alexa.elements.turbomodules.commsmessagingmedia;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsMessagingMediaModule")
/* loaded from: classes17.dex */
public class CommsMessagingMediaModule extends NativeCommsMessagingMediaSpec {
    public static final String NAME = "CommsMessagingMediaModule";
    private final CommsMessagingMediaAPI commsMessagingMediaAPI;

    public CommsMessagingMediaModule(ReactApplicationContext reactApplicationContext, CommsMessagingMediaAPI commsMessagingMediaAPI) {
        super(reactApplicationContext);
        this.commsMessagingMediaAPI = commsMessagingMediaAPI;
        commsMessagingMediaAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void downloadAudioFile(String str, String str2, String str3, Promise promise) {
        this.commsMessagingMediaAPI.downloadAudioFile(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void downloadFilesFromCDS(ReadableArray readableArray, Promise promise) {
        this.commsMessagingMediaAPI.downloadFilesFromCDS(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void getFilePathForFileName(String str, Promise promise) {
        this.commsMessagingMediaAPI.getFilePathForFileName(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void getMediaMetaData(String str, Promise promise) {
        this.commsMessagingMediaAPI.getMediaMetaData(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsMessagingMediaModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void getRecordPermissionStatus(Promise promise) {
        this.commsMessagingMediaAPI.getRecordPermissionStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void isRecording(Promise promise) {
        this.commsMessagingMediaAPI.isRecording(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void playAudioFile(String str, Promise promise) {
        this.commsMessagingMediaAPI.playAudioFile(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void removeFilesFromDisk(ReadableArray readableArray, Promise promise) {
        this.commsMessagingMediaAPI.removeFilesFromDisk(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void requestRecordPermission(Promise promise) {
        this.commsMessagingMediaAPI.requestRecordPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void setupRecorder(Promise promise) {
        this.commsMessagingMediaAPI.setupRecorder(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void startRecording(double d, Promise promise) {
        this.commsMessagingMediaAPI.startRecording(d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void stopAudioPlayer(Promise promise) {
        this.commsMessagingMediaAPI.stopAudioPlayer(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void stopRecording(boolean z, Promise promise) {
        this.commsMessagingMediaAPI.stopRecording(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void uploadAudioFile(ReadableMap readableMap, String str, Promise promise) {
        this.commsMessagingMediaAPI.uploadAudioFile(readableMap, str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMessagingMediaSpec
    @ReactMethod
    public void uploadFilesToCDS(ReadableArray readableArray, Promise promise) {
        this.commsMessagingMediaAPI.uploadFilesToCDS(readableArray, promise);
    }
}
