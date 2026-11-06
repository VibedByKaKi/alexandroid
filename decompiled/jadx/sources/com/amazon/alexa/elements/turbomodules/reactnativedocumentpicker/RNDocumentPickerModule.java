package com.amazon.alexa.elements.turbomodules.reactnativedocumentpicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeDocumentPickerSpec;
import com.amazon.alexa.elements.turbomodules.reactnativedocumentpicker.RNDocumentPickerModule;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "RNDocumentPicker")
/* loaded from: classes17.dex */
public class RNDocumentPickerModule extends NativeDocumentPickerSpec {
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "ACTIVITY_DOES_NOT_EXIST";
    private static final String E_DOCUMENT_PICKER_CANCELED = "DOCUMENT_PICKER_CANCELED";
    private static final String E_FAILED_TO_SHOW_PICKER = "FAILED_TO_SHOW_PICKER";
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";
    private static final String E_UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";
    private static final String E_UNEXPECTED_EXCEPTION = "UNEXPECTED_EXCEPTION";
    private static final String E_UNKNOWN_ACTIVITY_RESULT = "UNKNOWN_ACTIVITY_RESULT";
    private static final String FIELD_COPY_ERROR = "copyError";
    private static final String FIELD_FILE_COPY_URI = "fileCopyUri";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_URI = "uri";
    public static final String NAME = "RNDocumentPicker";
    private static final String OPTION_COPY_TO = "copyTo";
    private static final String OPTION_MULTIPLE = "allowMultiSelection";
    private static final String OPTION_TYPE = "type";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int READ_REQUEST_CODE = 41;
    private final ActivityEventListener activityEventListener;
    private String copyTo;
    private final ExecutorService executor;
    private final Handler mainHandler;
    private Promise promise;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ProcessDataTask {
        private final String copyTo;
        private final ExecutorService executor;
        private final Handler mainHandler;
        private final Promise promise;
        private final List<Uri> uris;
        private final WeakReference<Context> weakContext;

        public ProcessDataTask(ReactContext reactContext, List<Uri> list, String str, Promise promise, ExecutorService executorService, Handler handler) {
            this.weakContext = new WeakReference<>(reactContext.getApplicationContext());
            this.uris = list;
            this.copyTo = str;
            this.promise = promise;
            this.executor = executorService;
            this.mainHandler = handler;
        }

        public static Uri copyFile(Context context, Uri uri, File file) throws IOException {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            Uri fromFile = Uri.fromFile(file);
                            fileOutputStream.close();
                            openInputStream.close();
                            return fromFile;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        private void copyFileToLocalStorage(Context context, WritableMap writableMap, Uri uri) {
            File cacheDir = context.getCacheDir();
            if (this.copyTo.equals("documentDirectory")) {
                cacheDir = context.getFilesDir();
            }
            File file = new File(cacheDir, UUID.randomUUID().toString());
            try {
                if (!file.mkdir()) {
                    throw new IOException("failed to create directory at " + file.getAbsolutePath());
                }
                String string = writableMap.getString("name");
                if (string == null) {
                    string = String.valueOf(System.currentTimeMillis());
                }
                writableMap.putString(RNDocumentPickerModule.FIELD_FILE_COPY_URI, copyFile(context, uri, safeGetDestination(new File(file, string), file.getCanonicalPath())).toString());
            } catch (Exception e) {
                e.printStackTrace();
                writableMap.putNull(RNDocumentPickerModule.FIELD_FILE_COPY_URI);
                writableMap.putString(RNDocumentPickerModule.FIELD_COPY_ERROR, e.getLocalizedMessage());
            }
        }

        private WritableMap getMetadata(Uri uri) {
            Context context = this.weakContext.get();
            if (context == null) {
                return Arguments.createMap();
            }
            ContentResolver contentResolver = context.getContentResolver();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("uri", uri.toString());
            createMap.putString("type", contentResolver.getType(uri));
            Cursor query = contentResolver.query(uri, null, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_display_name");
                        if (query.isNull(columnIndex)) {
                            createMap.putNull("name");
                        } else {
                            createMap.putString("name", query.getString(columnIndex));
                        }
                        int columnIndex2 = query.getColumnIndex("mime_type");
                        if (!query.isNull(columnIndex2)) {
                            createMap.putString("type", query.getString(columnIndex2));
                        }
                        if (query.isNull(query.getColumnIndex("_size"))) {
                            createMap.putNull("size");
                        } else {
                            createMap.putDouble("size", query.getLong(r1));
                        }
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
            prepareFileUri(context, createMap, uri);
            return createMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$executeAsync$0(WritableArray writableArray) {
            this.promise.resolve(writableArray);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$executeAsync$1(Exception exc) {
            this.promise.reject(RNDocumentPickerModule.E_UNEXPECTED_EXCEPTION, exc.getLocalizedMessage(), exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$executeAsync$2() {
            try {
                final WritableArray createArray = Arguments.createArray();
                Iterator<Uri> it2 = this.uris.iterator();
                while (it2.hasNext()) {
                    createArray.pushMap(getMetadata(it2.next()));
                }
                final int i = 0;
                this.mainHandler.post(new Runnable(this) { // from class: com.amazon.alexa.elements.turbomodules.reactnativedocumentpicker.RNDocumentPickerModule$ProcessDataTask$$ExternalSyntheticLambda0
                    public final /* synthetic */ RNDocumentPickerModule.ProcessDataTask f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$executeAsync$0((WritableArray) createArray);
                                break;
                            default:
                                this.f$0.lambda$executeAsync$1((Exception) createArray);
                                break;
                        }
                    }
                });
            } catch (Exception e) {
                final int i2 = 1;
                this.mainHandler.post(new Runnable(this) { // from class: com.amazon.alexa.elements.turbomodules.reactnativedocumentpicker.RNDocumentPickerModule$ProcessDataTask$$ExternalSyntheticLambda0
                    public final /* synthetic */ RNDocumentPickerModule.ProcessDataTask f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$executeAsync$0((WritableArray) e);
                                break;
                            default:
                                this.f$0.lambda$executeAsync$1((Exception) e);
                                break;
                        }
                    }
                });
            }
        }

        private void prepareFileUri(Context context, WritableMap writableMap, Uri uri) {
            if (this.copyTo == null) {
                writableMap.putNull(RNDocumentPickerModule.FIELD_FILE_COPY_URI);
            } else {
                copyFileToLocalStorage(context, writableMap, uri);
            }
        }

        public void executeAsync() {
            this.executor.execute(new Runnable() { // from class: com.amazon.alexa.elements.turbomodules.reactnativedocumentpicker.RNDocumentPickerModule$ProcessDataTask$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    RNDocumentPickerModule.ProcessDataTask.this.lambda$executeAsync$2();
                }
            });
        }

        public File safeGetDestination(File file, String str) throws IllegalArgumentException, IOException {
            if (file.getCanonicalPath().startsWith(str)) {
                return file;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("The copied file is attempting to write outside of the target directory.");
            return null;
        }
    }

    public RNDocumentPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newSingleThreadExecutor();
        this.mainHandler = new Handler(Looper.getMainLooper());
        BaseActivityEventListener baseActivityEventListener = new BaseActivityEventListener() { // from class: com.amazon.alexa.elements.turbomodules.reactnativedocumentpicker.RNDocumentPickerModule.1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                if (i == 41 || i == 42) {
                    Promise promise = RNDocumentPickerModule.this.promise;
                    if (promise == null) {
                        Log.e("RNDocumentPicker", "promise was null in onActivityResult");
                        return;
                    }
                    RNDocumentPickerModule rNDocumentPickerModule = RNDocumentPickerModule.this;
                    if (i2 == 0) {
                        rNDocumentPickerModule.sendError(RNDocumentPickerModule.E_DOCUMENT_PICKER_CANCELED, "User canceled directory picker");
                    } else if (i == 41) {
                        rNDocumentPickerModule.onShowActivityResult(i2, intent, promise);
                    } else {
                        rNDocumentPickerModule.onPickDirectoryResult(i2, intent);
                    }
                }
            }
        };
        this.activityEventListener = baseActivityEventListener;
        reactApplicationContext.addActivityEventListener(baseActivityEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPickDirectoryResult(int i, Intent intent) {
        if (i != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, a$$ExternalSyntheticOutline0.m(i, "Unknown activity result: "));
            return;
        }
        if (intent == null || intent.getData() == null) {
            sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
            return;
        }
        Uri data = intent.getData();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", data.toString());
        this.promise.resolve(createMap);
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = readableArray.getString(i);
        }
        return strArr;
    }

    private void sendError(String str, String str2, Exception exc) {
        Promise promise = this.promise;
        if (promise != null) {
            this.promise = null;
            promise.reject(str, str2, exc);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDocumentPickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNDocumentPicker";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.executor.shutdownNow();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        super.invalidate();
    }

    public void onShowActivityResult(int i, Intent intent, Promise promise) {
        Uri uri;
        ClipData clipData;
        if (i != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, a$$ExternalSyntheticOutline0.m(i, "Unknown activity result: "));
            return;
        }
        if (intent != null) {
            uri = intent.getData();
            clipData = intent.getClipData();
        } else {
            uri = null;
            clipData = null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (clipData != null && clipData.getItemCount() > 0) {
                int itemCount = clipData.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    arrayList.add(clipData.getItemAt(i2).getUri());
                }
            } else {
                if (uri == null) {
                    sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
                    return;
                }
                arrayList.add(uri);
            }
            new ProcessDataTask(getReactApplicationContext(), arrayList, this.copyTo, promise, this.executor, this.mainHandler).executeAsync();
        } catch (Exception e) {
            sendError(E_UNEXPECTED_EXCEPTION, e.getLocalizedMessage(), e);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDocumentPickerSpec
    @ReactMethod
    public void pick(ReadableMap readableMap, Promise promise) {
        ReadableArray array;
        Activity currentActivity = getCurrentActivity();
        this.promise = promise;
        this.copyTo = readableMap.hasKey(OPTION_COPY_TO) ? readableMap.getString(OPTION_COPY_TO) : null;
        if (currentActivity == null) {
            sendError(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            boolean z = false;
            if (!readableMap.isNull("type") && (array = readableMap.getArray("type")) != null) {
                if (array.size() > 1) {
                    String[] readableArrayToStringArray = readableArrayToStringArray(array);
                    intent.putExtra("android.intent.extra.MIME_TYPES", readableArrayToStringArray);
                    intent.setType(String.join("|", readableArrayToStringArray));
                } else if (array.size() == 1) {
                    intent.setType(array.getString(0));
                }
            }
            if (!readableMap.isNull(OPTION_MULTIPLE) && readableMap.getBoolean(OPTION_MULTIPLE)) {
                z = true;
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
            currentActivity.startActivityForResult(intent, 41, Bundle.EMPTY);
        } catch (ActivityNotFoundException e) {
            sendError(E_UNABLE_TO_OPEN_FILE_TYPE, e.getLocalizedMessage());
        } catch (Exception e2) {
            e2.printStackTrace();
            sendError(E_FAILED_TO_SHOW_PICKER, e2.getLocalizedMessage());
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDocumentPickerSpec
    @ReactMethod
    public void pickDirectory(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        this.promise = promise;
        try {
            currentActivity.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 42, null);
        } catch (Exception e) {
            sendError(E_FAILED_TO_SHOW_PICKER, "Failed to create directory picker", e);
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDocumentPickerSpec
    public void releaseSecureAccess(ReadableArray readableArray, Promise promise) {
        promise.reject("RNDocumentPicker:releaseSecureAccess", "releaseSecureAccess is not supported on Android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendError(String str, String str2) {
        sendError(str, str2, null);
    }
}
