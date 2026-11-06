package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.Condition;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IpAddressCondition extends Condition {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum IpAddressComparisonType {
        IpAddress,
        NotIpAddress
    }

    public IpAddressCondition(IpAddressComparisonType ipAddressComparisonType, String str) {
        this.type = ipAddressComparisonType.toString();
        this.conditionKey = ConditionFactory.SOURCE_IP_CONDITION_KEY;
        this.values = Arrays.asList(str);
    }

    public IpAddressCondition(String str) {
        this(IpAddressComparisonType.IpAddress, str);
    }
}
