package com.facebook.debug.tags;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.facebook.debug.debugoverlay.model.DebugOverlayTag;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/debug/tags/ReactDebugOverlayTags;", "", "<init>", "()V", "PERFORMANCE", "Lcom/facebook/debug/debugoverlay/model/DebugOverlayTag;", "NAVIGATION", "RN_CORE", "BRIDGE_CALLS", "NATIVE_MODULE", "UI_MANAGER", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReactDebugOverlayTags {

    @NotNull
    public static final ReactDebugOverlayTags INSTANCE = new ReactDebugOverlayTags();

    @JvmField
    @NotNull
    public static final DebugOverlayTag PERFORMANCE = new DebugOverlayTag("Performance", "Markers for Performance", -16711936);

    @JvmField
    @NotNull
    public static final DebugOverlayTag NAVIGATION = new DebugOverlayTag("Navigation", "Tag for navigation", Color.rgb(156, 39, 176));

    @JvmField
    @NotNull
    public static final DebugOverlayTag RN_CORE = new DebugOverlayTag("RN Core", "Tag for React Native Core", ViewCompat.MEASURED_STATE_MASK);

    @JvmField
    @NotNull
    public static final DebugOverlayTag BRIDGE_CALLS = new DebugOverlayTag("Bridge Calls", "JS to Java calls (warning: this is spammy)", -65281);

    @JvmField
    @NotNull
    public static final DebugOverlayTag NATIVE_MODULE = new DebugOverlayTag("Native Module", "Native Module init", Color.rgb(128, 0, 128));

    @JvmField
    @NotNull
    public static final DebugOverlayTag UI_MANAGER = new DebugOverlayTag("UI Manager", "UI Manager View Operations (requires restart\nwarning: this is spammy)", -16711681);

    private ReactDebugOverlayTags() {
    }
}
