package com.amazon.alexa.ra.apl.fragments.viewmodels;

import com.amazon.alexa.mosaic.apl.actions.RenderDocumentConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"PROPERTIES", "", "Lcom/amazon/alexa/mosaic/apl/actions/RenderDocumentConfig$Properties;", "", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class APLFragmentViewModelKt {

    @NotNull
    private static final Map<RenderDocumentConfig.Properties, Boolean> PROPERTIES;

    static {
        RenderDocumentConfig.Properties properties = RenderDocumentConfig.Properties.ALLOW_OPEN_URL;
        Boolean bool = Boolean.TRUE;
        PROPERTIES = MapsKt.mapOf(TuplesKt.to(properties, bool), TuplesKt.to(RenderDocumentConfig.Properties.DISALLOW_VIDEO, bool), TuplesKt.to(RenderDocumentConfig.Properties.DISALLOW_DIALOG, bool), TuplesKt.to(RenderDocumentConfig.Properties.DISALLOW_EDIT_TEXT, bool));
    }
}
