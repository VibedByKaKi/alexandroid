package com.amazon.alexa.redesign.entity.agentforward.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonSubTypes({@JsonSubTypes.Type(name = "openRouteUri", value = OpenRouteUri.class), @JsonSubTypes.Type(name = "openDeepLink", value = OpenDeepLink.class), @JsonSubTypes.Type(name = "openWebUrl", value = OpenWebUrl.class), @JsonSubTypes.Type(name = "sendEventBusMessage", value = SendEventBusMessage.class), @JsonSubTypes.Type(name = "expandExperience", value = ExpandExperience.class), @JsonSubTypes.Type(name = "collapseExperience", value = CollapseExperience.class), @JsonSubTypes.Type(name = "openHomeModes", value = OpenHomeModes.class)})
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface ContentAction {
}
