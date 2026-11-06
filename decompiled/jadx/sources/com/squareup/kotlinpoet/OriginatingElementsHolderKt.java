package com.squareup.kotlinpoet;

import com.squareup.kotlinpoet.OriginatingElementsHolder;
import java.util.List;
import javax.lang.model.element.Element;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0005"}, d2 = {"buildOriginatingElements", "Lcom/squareup/kotlinpoet/OriginatingElements;", "Lcom/squareup/kotlinpoet/OriginatingElementsHolder$Builder;", "", "Ljavax/lang/model/element/Element;", "kotlinpoet"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OriginatingElementsHolderKt {
    @NotNull
    public static final OriginatingElements buildOriginatingElements(@NotNull OriginatingElementsHolder.Builder<?> builder) {
        builder.getClass();
        return new OriginatingElements(UtilKt.toImmutableList(builder.getOriginatingElements()));
    }

    @NotNull
    public static final OriginatingElements buildOriginatingElements(@NotNull List<? extends Element> list) {
        list.getClass();
        return new OriginatingElements(UtilKt.toImmutableList(list));
    }
}
