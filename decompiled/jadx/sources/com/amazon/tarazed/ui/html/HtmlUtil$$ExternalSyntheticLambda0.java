package com.amazon.tarazed.ui.html;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HtmlUtil$$ExternalSyntheticLambda0 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        HtmlUtil.getSpannableFromHtmlLegacy$lambda$1(z, str, editable, xMLReader);
    }
}
