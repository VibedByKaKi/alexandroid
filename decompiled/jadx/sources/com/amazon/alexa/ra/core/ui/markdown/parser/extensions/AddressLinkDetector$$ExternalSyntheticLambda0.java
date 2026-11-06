package com.amazon.alexa.ra.core.ui.markdown.parser.extensions;

import android.text.util.Linkify;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AddressLinkDetector$$ExternalSyntheticLambda0 implements Linkify.TransformFilter {
    @Override // android.text.util.Linkify.TransformFilter
    public final String transformUrl(Matcher matcher, String str) {
        String _init_$lambda$0;
        _init_$lambda$0 = AddressLinkDetector._init_$lambda$0(matcher, str);
        return _init_$lambda$0;
    }
}
