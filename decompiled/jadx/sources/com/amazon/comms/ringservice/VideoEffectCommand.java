package com.amazon.comms.ringservice;

import androidx.camera.core.processing.util.GLUtils;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoEffectCommand {
    private static final String COMMAND_KEY = "name";
    private static final String COMMAND_KEY_VALUE_SEPARATOR = ":";
    private static final String COMMAND_PREFIX = "[{Format:1.0}, {";
    private static final String COMMAND_SUFFIX = "}]";
    private static final String COMMAND_TUPLE_SEPARATOR = ", ";
    private static final String ENABLE_KEY = "enable";
    private final String command;
    private final DecimalFormat decimalFormat;
    private final NumberFormat numberFormat;
    private final Map<String, String> parameters;

    public VideoEffectCommand(String str) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.numberFormat = numberInstance;
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        this.decimalFormat = decimalFormat;
        this.command = str;
        this.parameters = new TreeMap();
        decimalFormat.applyPattern(GLUtils.VERSION_UNKNOWN);
    }

    public VideoEffectCommand add(String str, String str2) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str));
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str2));
        this.parameters.put(str, str2);
        return this;
    }

    public String getCommand() {
        return this.command;
    }

    public DecimalFormat getDecimalFormat() {
        return this.decimalFormat;
    }

    public NumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public VideoEffectCommand remove(String str) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str));
        this.parameters.remove(str);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[{Format:1.0}, {name:");
        boolean isEmpty = this.parameters.isEmpty();
        sb.append(this.command);
        sb.append(", enable:");
        sb.append(!isEmpty);
        if (!isEmpty) {
            sb.append(COMMAND_TUPLE_SEPARATOR);
            sb.append(Joiner.on(COMMAND_TUPLE_SEPARATOR).withKeyValueSeparator(":").join(this.parameters));
        }
        sb.append(COMMAND_SUFFIX);
        return sb.toString();
    }

    public VideoEffectCommand add(String str, int i) {
        return add(str, Integer.toString(i));
    }

    public VideoEffectCommand add(String str, float f) {
        return add(str, this.decimalFormat.format(f));
    }
}
