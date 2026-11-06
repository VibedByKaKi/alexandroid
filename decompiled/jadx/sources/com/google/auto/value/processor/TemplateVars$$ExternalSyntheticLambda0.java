package com.google.auto.value.processor;

import autovalue.shaded.com.google.escapevelocity.Template;
import java.io.Reader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class TemplateVars$$ExternalSyntheticLambda0 implements Template.ResourceOpener {
    @Override // autovalue.shaded.com.google.escapevelocity.Template.ResourceOpener
    public final Reader openResource(String str) {
        Reader readerFromUrl;
        readerFromUrl = TemplateVars.readerFromUrl(str);
        return readerFromUrl;
    }
}
