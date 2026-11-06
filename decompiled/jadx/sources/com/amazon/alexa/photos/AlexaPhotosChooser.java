package com.amazon.alexa.photos;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.alexa.photos.api.PhotosChooser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AlexaPhotosChooser implements PhotosChooser {
    @Override // com.amazon.alexa.photos.api.PhotosChooser
    public void choosePhotos(@NonNull Activity activity, int i) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.addCategory("android.intent.category.OPENABLE");
        intent.addFlags(536870912);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.addFlags(64);
        intent.addFlags(1);
        activity.startActivityForResult(Intent.createChooser(intent, null), i);
    }

    @Override // com.amazon.alexa.photos.api.PhotosChooser
    @NonNull
    public List<Uri> handleResponse(@NonNull Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                for (int i = 0; i < clipData.getItemCount(); i++) {
                    arrayList.add(clipData.getItemAt(i).getUri());
                }
            }
        } else if (intent.getData() != null) {
            arrayList.add(intent.getData());
        }
        return arrayList;
    }
}
