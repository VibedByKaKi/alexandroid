package com.amazon.alexa.assistant.ui.conversation.model;

import com.amazon.alexa.ra.core.data.model.ActionBarItemType;
import com.amazon.alexa.ra.core.data.model.ActionBarUiConfig;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toUiConfig", "Lcom/amazon/alexa/ra/core/data/model/ActionBarUiConfig;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ActionBarConfiguration;", "toItemType", "Lcom/amazon/alexa/ra/core/data/model/ActionBarItemType;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ActionBarItem;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActionBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionBarConfiguration.kt\ncom/amazon/alexa/assistant/ui/conversation/model/ActionBarConfigurationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1634#2,3:71\n*S KotlinDebug\n*F\n+ 1 ActionBarConfiguration.kt\ncom/amazon/alexa/assistant/ui/conversation/model/ActionBarConfigurationKt\n*L\n60#1:71,3\n*E\n"})
/* loaded from: classes17.dex */
public final class ActionBarConfigurationKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionBarItem.values().length];
            try {
                iArr[ActionBarItem.Regenerate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionBarItem.Share.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionBarItem.Copy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ActionBarItemType toItemType(@NotNull ActionBarItem actionBarItem) {
        actionBarItem.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[actionBarItem.ordinal()];
        if (i == 1) {
            return ActionBarItemType.REGENERATE;
        }
        if (i == 2) {
            return ActionBarItemType.SHARE;
        }
        if (i == 3) {
            return ActionBarItemType.COPY;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public static final ActionBarUiConfig toUiConfig(@NotNull ActionBarConfiguration actionBarConfiguration) {
        actionBarConfiguration.getClass();
        Set<ActionBarItem> responseIcons = actionBarConfiguration.getResponseIcons();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = responseIcons.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(toItemType((ActionBarItem) it2.next()));
        }
        return new ActionBarUiConfig(false, linkedHashSet, 1, null);
    }
}
