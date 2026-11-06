package com.amazon.alexa.ra.core.ui.markdown.renderer.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.model.AstContentSection;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"rendersSameAs", "", "Lcom/amazon/alexa/ra/core/ui/markdown/parser/model/AstContentSection;", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CachedSectionKt {
    public static final boolean rendersSameAs(@NotNull AstContentSection astContentSection, @NotNull AstContentSection astContentSection2) {
        astContentSection.getClass();
        astContentSection2.getClass();
        return (astContentSection.getContentKey().length() == 0 || astContentSection2.getContentKey().length() == 0) ? astContentSection.getAstNode() == astContentSection2.getAstNode() : Intrinsics.areEqual(astContentSection.getContentKey(), astContentSection2.getContentKey()) && astContentSection.getContentType() == astContentSection2.getContentType() && Intrinsics.areEqual(astContentSection.getGroupId(), astContentSection2.getGroupId()) && Intrinsics.areEqual(astContentSection.getCitationRefIds(), astContentSection2.getCitationRefIds());
    }
}
