package com.amazon.alexa.redesign.entity.agentforward.domain;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"isEligibleForAgentSpace", "", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/WelcomeCardDrawerItemContent;", "hasEligibleAgentSpaceNudge", "proactiveContent", "", "AlexaMobileAndroidHomeChannel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAgentSpaceEligibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentSpaceEligibility.kt\ncom/amazon/alexa/redesign/entity/agentforward/domain/AgentSpaceEligibilityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1755#2,3:38\n*S KotlinDebug\n*F\n+ 1 AgentSpaceEligibility.kt\ncom/amazon/alexa/redesign/entity/agentforward/domain/AgentSpaceEligibilityKt\n*L\n36#1:38,3\n*E\n"})
/* loaded from: classes19.dex */
public final class AgentSpaceEligibilityKt {
    public static final boolean hasEligibleAgentSpaceNudge(@Nullable List<WelcomeCardDrawerItemContent> list) {
        if (list != null) {
            List<WelcomeCardDrawerItemContent> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (isEligibleForAgentSpace((WelcomeCardDrawerItemContent) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEligibleForAgentSpace(@NotNull WelcomeCardDrawerItemContent welcomeCardDrawerItemContent) {
        String agentSpaceText;
        welcomeCardDrawerItemContent.getClass();
        return (welcomeCardDrawerItemContent.getId() == null || Intrinsics.areEqual(welcomeCardDrawerItemContent.getId(), "RecentChats") || (agentSpaceText = welcomeCardDrawerItemContent.getAgentSpaceText()) == null || agentSpaceText.length() == 0) ? false : true;
    }
}
