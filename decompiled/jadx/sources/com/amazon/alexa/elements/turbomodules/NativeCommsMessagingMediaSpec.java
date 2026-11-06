package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeCommsMessagingMediaSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CommsMessagingMediaModule";

    public NativeCommsMessagingMediaSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void downloadAudioFile(String str, String str2, String str3, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void downloadFilesFromCDS(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getFilePathForFileName(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getMediaMetaData(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "CommsMessagingMediaModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getRecordPermissionStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void isRecording(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void playAudioFile(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeFilesFromDisk(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestRecordPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setupRecorder(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void startRecording(double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void stopAudioPlayer(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void stopRecording(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void uploadAudioFile(ReadableMap readableMap, String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void uploadFilesToCDS(ReadableArray readableArray, Promise promise);
}
