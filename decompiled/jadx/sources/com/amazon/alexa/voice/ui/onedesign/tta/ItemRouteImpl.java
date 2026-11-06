package com.amazon.alexa.voice.ui.onedesign.tta;

import com.amazon.alexa.voice.ui.tta.search.ActionType;
import com.amazon.alexa.voice.ui.tta.search.ItemRoute;
import com.google.auto.value.AutoValue;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class ItemRouteImpl implements ItemRoute {
    private static final String APP_PAGE = "app_page";
    private static final String EXTERNAL_LINK = "external_link";

    public static ItemRouteImpl create(String str, String str2) {
        return new AutoValue_ItemRouteImpl(str, mapRouteType(str2));
    }

    private static ActionType mapRouteType(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return !lowerCase.equals(EXTERNAL_LINK) ? !lowerCase.equals(APP_PAGE) ? ActionType.UNKNOWN : ActionType.IN_APP : ActionType.WEB;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.ItemRoute
    public abstract String getRouteLink();

    @Override // com.amazon.alexa.voice.ui.tta.search.ItemRoute
    public abstract ActionType getRouteType();

    public static ItemRouteImpl create(String str) {
        return new AutoValue_ItemRouteImpl(str, ActionType.IN_APP);
    }
}
