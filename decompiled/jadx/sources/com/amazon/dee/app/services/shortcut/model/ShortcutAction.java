package com.amazon.dee.app.services.shortcut.model;

import androidx.annotation.DrawableRes;
import chip.platform.ConfigurationManager;
import com.amazon.deecomms.common.Constants;
import com.google.gson.annotations.SerializedName;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR(\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u000e8G@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/amazon/dee/app/services/shortcut/model/ShortcutAction;", "", "<init>", "()V", ConfigurationManager.kConfigKey_UniqueId, "", "getUniqueId", "()Ljava/lang/String;", "setUniqueId", "(Ljava/lang/String;)V", "shortcutName", "getShortcutName", "setShortcutName", "value", "", "iconResourceId", "getIconResourceId", "()I", "setIconResourceId", "(I)V", Constants.BUNDLE_KEY_REACT_NATIVE_ROUTE_NAME, "getRouteName", "setRouteName", "targetClass", "getTargetClass", "setTargetClass", "intentAction", "getIntentAction", "setIntentAction", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShortcutAction {

    @SerializedName("resId")
    private int iconResourceId;

    @Nullable
    private String intentAction;

    @Nullable
    private String routeName;

    @Nullable
    private String shortcutName;

    @Nullable
    private String targetClass;

    @Nullable
    private String uniqueId;

    @DrawableRes
    public final int getIconResourceId() {
        return this.iconResourceId;
    }

    @Nullable
    public final String getIntentAction() {
        return this.intentAction;
    }

    @Nullable
    public final String getRouteName() {
        return this.routeName;
    }

    @Nullable
    public final String getShortcutName() {
        return this.shortcutName;
    }

    @Nullable
    public final String getTargetClass() {
        return this.targetClass;
    }

    @Nullable
    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final void setIconResourceId(@DrawableRes int i) {
        this.iconResourceId = i;
    }

    public final void setIntentAction(@Nullable String str) {
        this.intentAction = str;
    }

    public final void setRouteName(@Nullable String str) {
        this.routeName = str;
    }

    public final void setShortcutName(@Nullable String str) {
        this.shortcutName = str;
    }

    public final void setTargetClass(@Nullable String str) {
        this.targetClass = str;
    }

    public final void setUniqueId(@Nullable String str) {
        this.uniqueId = str;
    }
}
