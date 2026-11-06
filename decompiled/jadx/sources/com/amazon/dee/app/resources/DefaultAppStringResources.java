package com.amazon.dee.app.resources;

import android.content.Context;
import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.amazon.dee.app.core.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/resources/DefaultAppStringResources;", "Lcom/amazon/dee/app/resources/AppStringResources;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "amazonDriveFolderName", "", "getAmazonDriveFolderName", "()Ljava/lang/String;", SettingsStorageModule.FILTER_SETTINGS_APP_ID_KEY, "getAppId", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultAppStringResources implements AppStringResources {

    @NotNull
    private final Context context;

    public DefaultAppStringResources(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // com.amazon.dee.app.resources.AppStringResources
    @NotNull
    public String getAmazonDriveFolderName() {
        String string = this.context.getString(R.string.amazon_drive_folder_name);
        string.getClass();
        return string;
    }

    @Override // com.amazon.dee.app.resources.AppStringResources
    @NotNull
    public String getAppId() {
        String string = this.context.getString(R.string.APP_ID);
        string.getClass();
        return string;
    }
}
