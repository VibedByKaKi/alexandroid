package com.amazon.alexa.ra.ui;

import com.amazon.alexa.ra.apl.deepbrowse.routes.DeepBrowseRoute;
import com.amazon.alexa.ra.apl.fragments.routes.APLFullScreenFragmentRoute;
import com.amazon.alexa.ra.core.ui.navigation.RaRoute;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"FULL_SCREEN_ROUTES", "", "", "getFULL_SCREEN_ROUTES", "()Ljava/util/List;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RaViewFragmentKt {

    @NotNull
    private static final List<String> FULL_SCREEN_ROUTES = CollectionsKt.listOf((Object[]) new String[]{DeepBrowseRoute.DIALOG_ROUTE, APLFullScreenFragmentRoute.ROUTE, RaRoute.FULL_SCREEN_THUMBNAIL, RaRoute.WEBVIEW_BOTTOM_SHEET, RaRoute.LIGHTBOX_SCREEN});

    @NotNull
    public static final List<String> getFULL_SCREEN_ROUTES() {
        return FULL_SCREEN_ROUTES;
    }
}
