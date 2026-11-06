package com.amazon.alexa.hho.imagepicker;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.FileProvider;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.elements.turbomodules.imagepicker.ImagePickerAPI;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.hho.imagepicker.PermissionHelper;
import com.amazon.alexa.voice.ui.onedesign.util.image.ImageType;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ImagePickerAPIImpl implements ImagePickerAPI, ActivityEventListener {
    private static final int REQUEST_CAMERA = 1;
    private static final int REQUEST_CROP = 3;
    private static final int REQUEST_GALLERY = 2;
    private static final String TAG = "ImagePickerAPIImpl";

    @VisibleForTesting
    Uri mImageUri;

    @VisibleForTesting
    ReadableMap mOptions;

    @VisibleForTesting
    Promise mPromise;
    private ReactApplicationContext mReactContext;

    /* JADX INFO: Access modifiers changed from: private */
    public void launchCamera() {
        try {
            Activity currentActivity = this.mReactContext.getCurrentActivity();
            if (currentActivity != null && this.mPromise != null) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File createImageFile = createImageFile(".jpg");
                Uri uriForFile = FileProvider.getUriForFile(this.mReactContext, this.mReactContext.getPackageName() + ".hho.imagepicker.fileprovider", createImageFile);
                this.mImageUri = uriForFile;
                intent.putExtra(ContactsModuleConstants.OUTPUT, uriForFile);
                currentActivity.startActivityForResult(intent, 1);
            }
        } catch (Exception e) {
            Promise promise = this.mPromise;
            if (promise != null) {
                promise.reject("E_FAILED_TO_SHOW_CAMERA", e.getMessage());
                this.mPromise = null;
                this.mOptions = null;
            }
        }
    }

    @VisibleForTesting
    public String calculateMD5(File file) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    @VisibleForTesting
    public File createImageFile(String str) throws IOException {
        return File.createTempFile("image_" + UUID.randomUUID().toString(), str, this.mReactContext.getCacheDir());
    }

    @VisibleForTesting
    public WritableMap createWritableMap() {
        return new WritableNativeMap();
    }

    @VisibleForTesting
    public Bitmap getBitmapFromUri() throws IOException {
        return MediaStore.Images.Media.getBitmap(this.mReactContext.getContentResolver(), this.mImageUri);
    }

    public void launchCropActivity() {
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity == null || this.mImageUri == null) {
            Promise promise = this.mPromise;
            if (promise != null) {
                promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist or image URI is null");
                this.mPromise = null;
                this.mOptions = null;
                return;
            }
            return;
        }
        try {
            Intent intent = new Intent(currentActivity, (Class<?>) ImageCropActivity.class);
            intent.putExtra(ImageCropActivity.EXTRA_IMAGE_URI, this.mImageUri);
            ReadableMap readableMap = this.mOptions;
            intent.putExtra(ImageCropActivity.EXTRA_QUALITY, (readableMap == null || !readableMap.hasKey(ImageCropActivity.EXTRA_QUALITY)) ? 80 : this.mOptions.getInt(ImageCropActivity.EXTRA_QUALITY));
            currentActivity.startActivityForResult(intent, 3);
        } catch (Exception e) {
            Promise promise2 = this.mPromise;
            if (promise2 != null) {
                promise2.reject("E_FAILED_TO_SHOW_CROPPER", e.getMessage());
                this.mPromise = null;
                this.mOptions = null;
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Promise promise = this.mPromise;
        if (promise == null) {
            return;
        }
        if (i2 != -1) {
            promise.resolve(null);
            this.mPromise = null;
            this.mOptions = null;
            return;
        }
        if (i == 2) {
            try {
                this.mImageUri = intent.getData();
            } catch (Exception e) {
                this.mPromise.reject("E_PROCESSING_ERROR", e.getMessage());
                this.mPromise = null;
                this.mOptions = null;
                return;
            }
        }
        if (i != 2 && i != 1) {
            if (i != 3 || intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra(ImageCropActivity.EXTRA_OUTPUT_PATH);
            if (stringExtra != null) {
                this.mImageUri = Uri.fromFile(new File(stringExtra));
                processImage();
                return;
            } else {
                this.mPromise.reject("E_CROP_ERROR", "Failed to get cropped image path");
                this.mPromise = null;
                this.mOptions = null;
                return;
            }
        }
        ReadableMap readableMap = this.mOptions;
        if (readableMap != null && readableMap.hasKey("showCropper") && this.mOptions.getBoolean("showCropper")) {
            launchCropActivity();
        } else {
            processImage();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionHelper.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.amazon.alexa.elements.turbomodules.imagepicker.ImagePickerAPI
    public void pick(ReadableMap readableMap, Promise promise) {
        if (readableMap == null || !readableMap.hasKey("source")) {
            promise.reject("E_INVALID_OPTIONS", "Source must be specified ('camera' or 'gallery')");
            return;
        }
        String string = readableMap.getString("source");
        if ("camera".equals(string)) {
            pickFromCamera(readableMap, promise);
        } else if ("gallery".equals(string)) {
            pickFromGallery(readableMap, promise);
        } else {
            promise.reject("E_INVALID_SOURCE", "Source must be 'camera' or 'gallery'");
        }
    }

    public void pickFromCamera(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
            return;
        }
        this.mOptions = readableMap;
        this.mPromise = promise;
        PermissionHelper.checkCameraPermission(currentActivity, new PermissionHelper.PermissionListener() { // from class: com.amazon.alexa.hho.imagepicker.ImagePickerAPIImpl.1
            @Override // com.amazon.alexa.hho.imagepicker.PermissionHelper.PermissionListener
            public void complete(boolean z, String str) {
                ImagePickerAPIImpl imagePickerAPIImpl = ImagePickerAPIImpl.this;
                if (z) {
                    imagePickerAPIImpl.launchCamera();
                    return;
                }
                Promise promise2 = imagePickerAPIImpl.mPromise;
                if (promise2 != null) {
                    if (str == null) {
                        str = "Camera permission was not granted";
                    }
                    promise2.reject("E_PERMISSION_DENIED", str);
                    ImagePickerAPIImpl imagePickerAPIImpl2 = ImagePickerAPIImpl.this;
                    imagePickerAPIImpl2.mPromise = null;
                    imagePickerAPIImpl2.mOptions = null;
                }
            }

            @Override // com.amazon.alexa.hho.imagepicker.PermissionHelper.PermissionListener
            public void complete(boolean z) {
                complete(z, null);
            }
        });
    }

    public void pickFromGallery(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
            return;
        }
        this.mOptions = readableMap;
        this.mPromise = promise;
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            currentActivity.startActivityForResult(intent, 2);
        } catch (Exception e) {
            this.mPromise.reject("E_FAILED_TO_SHOW_PICKER", e.getMessage());
            this.mPromise = null;
            this.mOptions = null;
        }
    }

    @VisibleForTesting
    public void processImage() throws IOException {
        String str;
        int i;
        Bitmap bitmapFromUri = getBitmapFromUri();
        ReadableMap readableMap = this.mOptions;
        if (readableMap != null && readableMap.hasKey("maxDimension") && (bitmapFromUri.getWidth() > (i = this.mOptions.getInt("maxDimension")) || bitmapFromUri.getHeight() > i)) {
            bitmapFromUri = resizeBitmap(bitmapFromUri, i);
        }
        ReadableMap readableMap2 = this.mOptions;
        int i2 = 80;
        if (readableMap2 != null) {
            str = readableMap2.hasKey("format") ? this.mOptions.getString("format") : ImageType.JPG;
            if (this.mOptions.hasKey(ImageCropActivity.EXTRA_QUALITY)) {
                i2 = this.mOptions.getInt(ImageCropActivity.EXTRA_QUALITY);
            }
        } else {
            str = ImageType.JPG;
        }
        File createImageFile = createImageFile(str.equals(ImageType.PNG) ? ".png" : ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(createImageFile);
        try {
            if (str.equals(ImageType.PNG)) {
                bitmapFromUri.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else {
                if (!str.equals(ImageType.JPG)) {
                    createImageFile.delete();
                    this.mPromise.reject("E_UNSUPPORTED_FORMAT", "Unsupported image format: " + str + ". Supported formats are 'jpg' and 'png'");
                    this.mPromise = null;
                    this.mOptions = null;
                    fileOutputStream.close();
                    return;
                }
                bitmapFromUri.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            WritableMap createWritableMap = createWritableMap();
            createWritableMap.putString("path", createImageFile.getAbsolutePath());
            createWritableMap.putInt("width", bitmapFromUri.getWidth());
            createWritableMap.putInt("height", bitmapFromUri.getHeight());
            createWritableMap.putInt(MetricsConstants.Type.FILE_SIZE, (int) createImageFile.length());
            createWritableMap.putString(SierraContentProviderContract.MD5_VALUE, calculateMD5(createImageFile));
            this.mPromise.resolve(createWritableMap);
            this.mPromise = null;
            this.mOptions = null;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @VisibleForTesting
    public Bitmap resizeBitmap(Bitmap bitmap, int i) {
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width / height;
        if (width > height) {
            i2 = (int) (i / f);
        } else {
            i = (int) (i * f);
            i2 = i;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, true);
    }

    @Override // com.amazon.alexa.elements.turbomodules.imagepicker.ImagePickerAPI
    public void setReactContext(@Nullable ReactApplicationContext reactApplicationContext) {
        ReactApplicationContext reactApplicationContext2 = this.mReactContext;
        if (reactApplicationContext2 != null) {
            reactApplicationContext2.removeActivityEventListener(this);
        }
        this.mReactContext = reactApplicationContext;
        if (reactApplicationContext != null) {
            reactApplicationContext.addActivityEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
