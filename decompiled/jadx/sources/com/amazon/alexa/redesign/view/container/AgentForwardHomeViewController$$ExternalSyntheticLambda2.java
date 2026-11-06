package com.amazon.alexa.redesign.view.container;

import com.dee.app.cachemanager.AppDataCacheEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AgentForwardHomeViewController$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AgentForwardHomeViewController f$0;

    public /* synthetic */ AgentForwardHomeViewController$$ExternalSyntheticLambda2(AgentForwardHomeViewController agentForwardHomeViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = agentForwardHomeViewController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onCreate$lambda$7$lambda$6;
        Unit invoke$lambda$21$lambda$20;
        Unit invoke$lambda$31$lambda$30;
        Unit initRnContainer$lambda$25;
        Unit onCreate$lambda$7;
        Unit initComposeView$lambda$13;
        Unit initHomeModesIntegration$lambda$84;
        Unit defaultConvoCxOpener$lambda$0;
        Unit initErrorPage$lambda$11;
        Unit initHomeNameIntegration$lambda$101;
        Unit initHomeNameIntegration$lambda$107$lambda$106$lambda$104;
        Unit initHomeModesIntegration$lambda$93$lambda$89$lambda$87;
        Unit swipeUpAgentCard$lambda$2;
        Unit swipeUpAgentCard$lambda$0;
        Unit swipeUpAgentCard$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                onCreate$lambda$7$lambda$6 = AgentForwardHomeViewController.onCreate$lambda$7$lambda$6(this.f$0, ((Integer) obj).intValue());
                return onCreate$lambda$7$lambda$6;
            case 1:
                invoke$lambda$21$lambda$20 = AgentForwardHomeViewController$initComposeView$1$1.invoke$lambda$21$lambda$20(this.f$0, (List) obj);
                return invoke$lambda$21$lambda$20;
            case 2:
                invoke$lambda$31$lambda$30 = AgentForwardHomeViewController$initComposeView$1$1.invoke$lambda$31$lambda$30(this.f$0, ((Boolean) obj).booleanValue());
                return invoke$lambda$31$lambda$30;
            case 3:
                initRnContainer$lambda$25 = AgentForwardHomeViewController.initRnContainer$lambda$25(this.f$0, (Boolean) obj);
                return initRnContainer$lambda$25;
            case 4:
                onCreate$lambda$7 = AgentForwardHomeViewController.onCreate$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
                return onCreate$lambda$7;
            case 5:
                initComposeView$lambda$13 = AgentForwardHomeViewController.initComposeView$lambda$13(this.f$0, (Boolean) obj);
                return initComposeView$lambda$13;
            case 6:
                initHomeModesIntegration$lambda$84 = AgentForwardHomeViewController.initHomeModesIntegration$lambda$84(this.f$0, (AppDataCacheEntry) obj);
                return initHomeModesIntegration$lambda$84;
            case 7:
                defaultConvoCxOpener$lambda$0 = AgentForwardHomeViewController.defaultConvoCxOpener$lambda$0(this.f$0, ((Integer) obj).intValue());
                return defaultConvoCxOpener$lambda$0;
            case 8:
                initErrorPage$lambda$11 = AgentForwardHomeViewController.initErrorPage$lambda$11(this.f$0, (Boolean) obj);
                return initErrorPage$lambda$11;
            case 9:
                initHomeNameIntegration$lambda$101 = AgentForwardHomeViewController.initHomeNameIntegration$lambda$101(this.f$0, (AppDataCacheEntry) obj);
                return initHomeNameIntegration$lambda$101;
            case 10:
                initHomeNameIntegration$lambda$107$lambda$106$lambda$104 = AgentForwardHomeViewController.initHomeNameIntegration$lambda$107$lambda$106$lambda$104(this.f$0, (AppDataCacheEntry) obj);
                return initHomeNameIntegration$lambda$107$lambda$106$lambda$104;
            case 11:
                initHomeModesIntegration$lambda$93$lambda$89$lambda$87 = AgentForwardHomeViewController.initHomeModesIntegration$lambda$93$lambda$89$lambda$87(this.f$0, (AppDataCacheEntry) obj);
                return initHomeModesIntegration$lambda$93$lambda$89$lambda$87;
            case 12:
                swipeUpAgentCard$lambda$2 = AgentForwardHomeViewController$onCreate$2.swipeUpAgentCard$lambda$2(this.f$0, ((Integer) obj).intValue());
                return swipeUpAgentCard$lambda$2;
            case 13:
                swipeUpAgentCard$lambda$0 = AgentForwardHomeViewController$onCreate$2.swipeUpAgentCard$lambda$0(this.f$0, ((Integer) obj).intValue());
                return swipeUpAgentCard$lambda$0;
            default:
                swipeUpAgentCard$lambda$4 = AgentForwardHomeViewController$onCreate$2.swipeUpAgentCard$lambda$4(this.f$0, ((Integer) obj).intValue());
                return swipeUpAgentCard$lambda$4;
        }
    }
}
