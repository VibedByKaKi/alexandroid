package com.squareup.kotlinpoet;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import javax.lang.model.element.Element;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/squareup/kotlinpoet/OriginatingElementsHolder;", "", "originatingElements", "", "Ljavax/lang/model/element/Element;", "getOriginatingElements", "()Ljava/util/List;", "Builder", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface OriginatingElementsHolder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0010\b\u0000\u0010\u0001 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\nR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/squareup/kotlinpoet/OriginatingElementsHolder$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "originatingElements", "", "Ljavax/lang/model/element/Element;", "getOriginatingElements", "()Ljava/util/List;", "addOriginatingElement", "originatingElement", "(Ljavax/lang/model/element/Element;)Lcom/squareup/kotlinpoet/OriginatingElementsHolder$Builder;", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Builder<T extends Builder<? extends T>> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @NotNull
            public static <T extends Builder<? extends T>> T addOriginatingElement(@NotNull Builder<? extends T> builder, @NotNull Element element) {
                builder.getClass();
                element.getClass();
                builder.getOriginatingElements().add(element);
                return builder;
            }
        }

        @NotNull
        T addOriginatingElement(@NotNull Element originatingElement);

        @NotNull
        List<Element> getOriginatingElements();
    }

    @NotNull
    List<Element> getOriginatingElements();
}
