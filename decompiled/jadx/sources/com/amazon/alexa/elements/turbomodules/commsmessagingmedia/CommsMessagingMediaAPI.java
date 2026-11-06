package com.amazon.alexa.elements.turbomodules.commsmessagingmedia;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsMessagingMediaAPI {
    void downloadAudioFile(String str, String str2, String str3, Promise promise);

    void downloadFilesFromCDS(ReadableArray readableArray, Promise promise);

    void getFilePathForFileName(String str, Promise promise);

    void getMediaMetaData(String str, Promise promise);

    void getRecordPermissionStatus(Promise promise);

    void isRecording(Promise promise);

    void playAudioFile(String str, Promise promise);

    void removeFilesFromDisk(ReadableArray readableArray, Promise promise);

    void requestRecordPermission(Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void setupRecorder(Promise promise);

    void startRecording(double d, Promise promise);

    void stopAudioPlayer(Promise promise);

    void stopRecording(boolean z, Promise promise);

    void uploadAudioFile(ReadableMap readableMap, String str, Promise promise);

    void uploadFilesToCDS(ReadableArray readableArray, Promise promise);
}
