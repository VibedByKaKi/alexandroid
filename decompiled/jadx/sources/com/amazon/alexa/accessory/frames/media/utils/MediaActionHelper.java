package com.amazon.alexa.accessory.frames.media.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.dee.app.contacts.common.constants.Constants;
import com.mapbox.bindgen.Cleaner$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007J\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/utils/MediaActionHelper;", "", "<init>", "()V", Constants.LOG_TAG, "", "showDeleteDialog", "", "activity", "Landroid/app/Activity;", "itemCount", "", "onConfirmed", "Ljava/lang/Runnable;", "onCancelled", "buildShareIntent", "Landroid/content/Intent;", "uris", "", "Landroid/net/Uri;", "mimeType", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaActionHelper {

    @NotNull
    public static final MediaActionHelper INSTANCE = new MediaActionHelper();

    @NotNull
    private static final String TAG = "MediaActionHelper";

    private MediaActionHelper() {
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Intent buildShareIntent(@NotNull List<? extends Uri> uris, @NotNull String mimeType) {
        Intent intent;
        uris.getClass();
        mimeType.getClass();
        if (uris.isEmpty()) {
            Log.w(TAG, "buildShareIntent - called with empty URI list, returning null");
            return null;
        }
        if (uris.size() == 1) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType(mimeType);
            intent.putExtra("android.intent.extra.STREAM", uris.get(0));
        } else {
            intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.setType(mimeType);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(uris));
        }
        ClipData newRawUri = ClipData.newRawUri(null, uris.get(0));
        int size = uris.size();
        for (int i = 1; i < size; i++) {
            newRawUri.addItem(new ClipData.Item(uris.get(i)));
        }
        intent.setClipData(newRawUri);
        intent.addFlags(1);
        return Intent.createChooser(intent, null);
    }

    public static /* synthetic */ Intent buildShareIntent$default(List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return buildShareIntent(list, str);
    }

    @JvmStatic
    @JvmOverloads
    public static final void showDeleteDialog(@NotNull Activity activity, int itemCount, @NotNull final Runnable onConfirmed, @NotNull final Runnable onCancelled) {
        activity.getClass();
        onConfirmed.getClass();
        onCancelled.getClass();
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_delete_confirmation, (ViewGroup) null);
        final AlertDialog create = new AlertDialog.Builder(activity).setView(inflate).create();
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        final int i = 0;
        inflate.findViewById(R.id.dialog_cancel_button).setOnClickListener(new View.OnClickListener() { // from class: com.amazon.alexa.accessory.frames.media.utils.MediaActionHelper$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        MediaActionHelper.showDeleteDialog$lambda$1(create, onCancelled, view);
                        break;
                    default:
                        MediaActionHelper.showDeleteDialog$lambda$2(create, onCancelled, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        inflate.findViewById(R.id.dialog_delete_button).setOnClickListener(new View.OnClickListener() { // from class: com.amazon.alexa.accessory.frames.media.utils.MediaActionHelper$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        MediaActionHelper.showDeleteDialog$lambda$1(create, onConfirmed, view);
                        break;
                    default:
                        MediaActionHelper.showDeleteDialog$lambda$2(create, onConfirmed, view);
                        break;
                }
            }
        });
        create.show();
    }

    public static /* synthetic */ void showDeleteDialog$default(Activity activity, int i, Runnable runnable, Runnable runnable2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            runnable2 = new Cleaner$$ExternalSyntheticLambda0(6);
        }
        showDeleteDialog(activity, i, runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeleteDialog$lambda$1(AlertDialog alertDialog, Runnable runnable, View view) {
        Log.d(TAG, "showDeleteDialog - cancelled");
        alertDialog.dismiss();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeleteDialog$lambda$2(AlertDialog alertDialog, Runnable runnable, View view) {
        Log.d(TAG, "showDeleteDialog - confirmed");
        alertDialog.dismiss();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeleteDialog$lambda$0() {
    }

    @JvmStatic
    @JvmOverloads
    public static final void showDeleteDialog(@NotNull Activity activity, int i, @NotNull Runnable runnable) {
        activity.getClass();
        runnable.getClass();
        showDeleteDialog$default(activity, i, runnable, null, 8, null);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Intent buildShareIntent(@NotNull List<? extends Uri> list) {
        list.getClass();
        return buildShareIntent$default(list, null, 2, null);
    }
}
