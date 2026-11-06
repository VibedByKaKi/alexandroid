package com.squareup.kotlinpoet;

import java.util.List;
import javax.lang.model.element.Element;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/kotlinpoet/OriginatingElements;", "Lcom/squareup/kotlinpoet/OriginatingElementsHolder;", "originatingElements", "", "Ljavax/lang/model/element/Element;", "(Ljava/util/List;)V", "getOriginatingElements", "()Ljava/util/List;", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OriginatingElements implements OriginatingElementsHolder {

    @NotNull
    private final List<Element> originatingElements;

    public OriginatingElements(@NotNull List<? extends Element> list) {
        list.getClass();
        this.originatingElements = list;
    }

    @Override // com.squareup.kotlinpoet.OriginatingElementsHolder
    @NotNull
    public List<Element> getOriginatingElements() {
        return this.originatingElements;
    }
}
