package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.Condition;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NumericCondition extends Condition {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NumericComparisonType {
        NumericEquals,
        NumericGreaterThan,
        NumericGreaterThanEquals,
        NumericLessThan,
        NumericLessThanEquals,
        NumericNotEquals
    }

    public NumericCondition(NumericComparisonType numericComparisonType, String str, String str2) {
        this.type = numericComparisonType.toString();
        this.conditionKey = str;
        this.values = Arrays.asList(str2);
    }
}
