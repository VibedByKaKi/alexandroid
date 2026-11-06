package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionItem {

    @Nullable
    private final PendingIntent mAction;

    @DrawableRes
    private int mIconId;

    @Nullable
    private Uri mIconUri;

    @Nullable
    private Runnable mRunnableAction;
    private final String mTitle;

    public BrowserActionItem(@NonNull String str, @NonNull Runnable runnable) {
        this.mTitle = str;
        this.mAction = null;
        this.mRunnableAction = runnable;
    }

    @NonNull
    public PendingIntent getAction() {
        PendingIntent pendingIntent = this.mAction;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Can't call getAction on BrowserActionItem with null action.");
        return null;
    }

    public int getIconId() {
        return this.mIconId;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Uri getIconUri() {
        return this.mIconUri;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Runnable getRunnableAction() {
        return this.mRunnableAction;
    }

    @NonNull
    public String getTitle() {
        return this.mTitle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent, @NonNull Uri uri) {
        this.mTitle = str;
        this.mAction = pendingIntent;
        this.mIconUri = uri;
    }

    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent, @DrawableRes int i) {
        this.mTitle = str;
        this.mAction = pendingIntent;
        this.mIconId = i;
    }

    public BrowserActionItem(@NonNull String str, @NonNull PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
