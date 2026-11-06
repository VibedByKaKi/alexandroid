package com.mapbox.maps.extension.style.types;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.expressions.dsl.generated.ExpressionDslKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@LayersDsl
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/extension/style/types/Formatted;", "Ljava/util/ArrayList;", "Lcom/mapbox/maps/extension/style/types/FormattedSection;", "()V", "formattedSection", "", "section", "text", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "getTextAsString", "toValue", "Lcom/mapbox/bindgen/Value;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class Formatted extends ArrayList<FormattedSection> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FormattedSection) {
            return contains((FormattedSection) obj);
        }
        return false;
    }

    public final void formattedSection(@NotNull String text, @NotNull Function1<? super FormattedSection, Unit> block) {
        text.getClass();
        block.getClass();
        FormattedSection formattedSection = new FormattedSection(text, null, null, null, 14, null);
        block.invoke(formattedSection);
        add(formattedSection);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @NotNull
    public final String getTextAsString() {
        StringBuilder sb = new StringBuilder();
        Iterator<FormattedSection> it2 = iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getText());
        }
        return sb.toString();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof FormattedSection) {
            return indexOf((FormattedSection) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof FormattedSection) {
            return lastIndexOf((FormattedSection) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FormattedSection) {
            return remove((FormattedSection) obj);
        }
        return false;
    }

    public /* bridge */ FormattedSection removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public final Value toValue() {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        Iterator<FormattedSection> it2 = iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toValue$extension_style_release());
        }
        return new Value((List<Value>) arrayList);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/style/types/Formatted$Companion;", "", "()V", "fromExpression", "Lcom/mapbox/maps/extension/style/types/Formatted;", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fromProperty", "list", "Ljava/util/ArrayList;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Formatted fromExpression(@NotNull Expression expression) {
            expression.getClass();
            return fromProperty((ArrayList) TypeUtilsKt.unwrapToTyped(expression, ArrayList.class));
        }

        @NotNull
        public final Formatted fromProperty(@NotNull ArrayList<?> list) {
            list.getClass();
            Formatted formatted = new Formatted();
            if (Intrinsics.areEqual(list.remove(0), "format")) {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (obj instanceof String) {
                        FormattedSection formattedSection = new FormattedSection((String) obj, null, null, null, 14, null);
                        Object obj2 = list.get(i2);
                        obj2.getClass();
                        HashMap hashMap = (HashMap) obj2;
                        Set keySet = hashMap.keySet();
                        keySet.getClass();
                        for (Object obj3 : keySet) {
                            if (Intrinsics.areEqual(obj3, PointAnnotationOptions.PROPERTY_TEXT_COLOR)) {
                                obj3.getClass();
                                Object obj4 = hashMap.get(obj3);
                                obj4.getClass();
                                final ArrayList arrayList = (ArrayList) obj4;
                                if (Intrinsics.areEqual(arrayList.remove(0), "rgba")) {
                                    formattedSection.setTextColor(ColorUtils.INSTANCE.rgbaExpressionToColorString(ExpressionDslKt.rgba(new Function1<Expression.ExpressionBuilder, Unit>() { // from class: com.mapbox.maps.extension.style.types.Formatted$Companion$fromProperty$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull Expression.ExpressionBuilder expressionBuilder) {
                                            expressionBuilder.getClass();
                                            Object obj5 = arrayList.get(0);
                                            obj5.getClass();
                                            expressionBuilder.literal(((Double) obj5).doubleValue());
                                            Object obj6 = arrayList.get(1);
                                            obj6.getClass();
                                            expressionBuilder.literal(((Double) obj6).doubleValue());
                                            Object obj7 = arrayList.get(2);
                                            obj7.getClass();
                                            expressionBuilder.literal(((Double) obj7).doubleValue());
                                            Object obj8 = arrayList.get(3);
                                            obj8.getClass();
                                            expressionBuilder.literal(((Double) obj8).doubleValue());
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                                            invoke2(expressionBuilder);
                                            return Unit.INSTANCE;
                                        }
                                    })));
                                }
                            } else if (Intrinsics.areEqual(obj3, "font-scale")) {
                                obj3.getClass();
                                Object obj5 = hashMap.get(obj3);
                                obj5.getClass();
                                formattedSection.setFontScale((Double) obj5);
                            } else if (Intrinsics.areEqual(obj3, "text-font")) {
                                obj3.getClass();
                                Object obj6 = hashMap.get(obj3);
                                obj6.getClass();
                                ArrayList arrayList2 = (ArrayList) obj6;
                                if (Intrinsics.areEqual(arrayList2.remove(0), "literal")) {
                                    Object last = CollectionsKt.last((List<? extends Object>) arrayList2);
                                    last.getClass();
                                    formattedSection.setFontStack((ArrayList) last);
                                }
                            }
                        }
                        formatted.add(formattedSection);
                    }
                    i = i2;
                }
            }
            return formatted;
        }

        private Companion() {
        }
    }

    public /* bridge */ boolean contains(FormattedSection formattedSection) {
        return super.contains((Object) formattedSection);
    }

    public /* bridge */ int indexOf(FormattedSection formattedSection) {
        return super.indexOf((Object) formattedSection);
    }

    public /* bridge */ int lastIndexOf(FormattedSection formattedSection) {
        return super.lastIndexOf((Object) formattedSection);
    }

    public /* bridge */ boolean remove(FormattedSection formattedSection) {
        return super.remove((Object) formattedSection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FormattedSection remove(int i) {
        return removeAt(i);
    }

    public final void formattedSection(@NotNull FormattedSection section) {
        section.getClass();
        add(section);
    }
}
