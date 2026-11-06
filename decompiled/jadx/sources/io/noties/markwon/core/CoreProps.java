package io.noties.markwon.core;

import io.noties.markwon.Prop;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class CoreProps {
    public static final Prop<ListItemType> LIST_ITEM_TYPE = Prop.of("list-item-type");
    public static final Prop<Integer> BULLET_LIST_ITEM_LEVEL = Prop.of("bullet-list-item-level");
    public static final Prop<Integer> ORDERED_LIST_ITEM_NUMBER = Prop.of("ordered-list-item-number");
    public static final Prop<Integer> HEADING_LEVEL = Prop.of("heading-level");
    public static final Prop<String> LINK_DESTINATION = Prop.of("link-destination");
    public static final Prop<Boolean> PARAGRAPH_IS_IN_TIGHT_LIST = Prop.of("paragraph-is-in-tight-list");
    public static final Prop<String> CODE_BLOCK_INFO = Prop.of("code-block-info");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ListItemType {
        BULLET,
        ORDERED
    }

    private CoreProps() {
    }
}
